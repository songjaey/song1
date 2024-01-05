package cafe;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

import customer.member;

public class Order_Counter {
	
	static Scanner scan = new Scanner(System.in);
	static HashMap<String, menu> Menu = null;
	static List<member> buyer = null;
	
	static member user =null;
	public static void main(String[] args) {
		Menu = file.menu_load();
		buyer = file.member_load();
		
		user = login();
		
//		System.out.println(Menu.get(4).getMenu_name());
//		System.out.println(buyer.get(0).getId());

	}
	public static HashMap<Category, Set> classTask(){
		Set<menu> 커피 = new HashSet<>();
		Set<menu> 음료 = new HashSet<>();
		Set<menu> 빽스치노 = new HashSet<>();
		
		
		
		
		return null;
	}
	
	public static member login() {
		System.out.println("========로그인========\n");
		System.out.println("아이디 : ");
		String id = scan.nextLine();
		System.out.println("비밀번호 : ");
		String pw = scan.nextLine();
		
		member tmp = new member(id,pw);
		int idx=0;
		if( (idx=buyer.indexOf( tmp )) != -1 ) {
			System.out.println("로그인 성공");
			return buyer.get(idx);
		}
		System.out.println("로그인 실패");
		return login();
		//ArrayList에 저장되어있는 객체들과 비교를 하기 위해서는
	}
}
