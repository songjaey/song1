package cafe;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Order {
	static Scanner scan = new Scanner(System.in);
	
	public static void kiosk( HashMap<Category, Set<menu>> cafeMenu) {
		System.out.println("\n=========주문=========\n");
		
		Category main = Category.커피;
		while(true) {
			System.out.println("1.커피  2.음료  3.빽스치노 ");
			//System.out.println(cafeMenu.get(main));
			Set<menu> list = cafeMenu.get(main);
			Iterator<menu> tmp = list.iterator();
			while( tmp.hasNext()) {
				System.out.println(tmp.next());
			}
			System.out.println("주문 메뉴 선택 및 항목 선택");
			
			String input = scan.nextLine(); // 메뉴를 입력했는가? 분류 번호를 입력했는가?
			if( isInteger(input)) {// 정수변환 가능 - 분류번호입력
				main = SelectCategory(file.i(input));
			}
			else { // 메뉴 입력
				progress(input);
				//progress(input,list);
				break;
			}
			//Iterator
		}
	}
	
	private static void progress(String orderMenu) {
		if( Order_Counter.Menu.containsKey(orderMenu) ) {
			menu select = Order_Counter.Menu.get(orderMenu);
			
			int price = 0;
			if( select.getCost1() !=0 && select.getCost2()!=0) {
				System.out.println("1.HOT 2.ICE : ");
				int HI =scan.nextInt();
				price = HI == 1? select.getCost1() : select.getCost2();
			}else {
				price = select.getCost1() != 0 ? select.getCost1() : select.getCost2();
			}
			DecimalFormat df = new DecimalFormat("\u20A9###, ###원");
			System.out.println("\n=====주문 내역====\n");
			System.out.println( select );
			System.out.printf("카페인 : %dmg, 칼로리 %dkcal, 용량 %dml \n"
								,select.getCaffeine(), select.getCalorie(), select.getM1());
			System.out.println(" 결제금액 : "+df.format(price));
			
			save_history(select.getMenu_name(), price);
		}
	}
	private static void save_history(String menu, int price) {
		String id = Order_Counter.user.getId();
		
		String url = "jdbc:mysql://localhost:3306/songjaey8237";
		String user = "songjaey8237@";
		String password = "123456";
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		}catch(ClassNotFoundException e){
			System.out.println("드라이버 로드실패");
		}
		
		Connection conn=null;
		ResultSet set=null;
		PreparedStatement pt=null; //mysql query문 전달
		try {
			conn = DriverManager.getConnection(url,user,password);
			System.out.println("접속 성공");
		}catch(SQLException e) {
			System.out.println("이상");
			e.printStackTrace();
		}
		
		//데어테베이스 데이터 저장 쿼리 만들어서 전달
		//insert into 테이블명(컬럼명, 컬럼명,....) values(?,?,?,?)
		//이상
		String sq1="insert into history (customer, menu, price) values(?,?,?)";
		
		try {
			pt = conn.prepareStatement( sq1 );
			pt.setString(1,id);
			pt.setString(2, menu);
			pt.setInt(3, price);
			pt.executeUpdate(); // 데이터베이스에 쿼리문 전달
			System.out.println("데이터 저장 성공");
		}catch(SQLException e) {
			System.out.println("데이터 삽입 실패");
			e.printStackTrace();
		}
	}
	
	private static Category SelectCategory(int num) {
		switch(num) {
			case 1: return Category.커피;
			case 2: return Category.음료;
			case 3: return Category.빽스치노;
		}
		return Category.커피;
	}
	// 전체 메뉴 보여주는 메서드
	private static boolean isInteger(String str) {
		try{
			Integer.parseInt(str);
			return true;
		}catch(NumberFormatException e) {
			return false;
		}
	}
}
