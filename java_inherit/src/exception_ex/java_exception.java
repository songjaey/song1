package exception_ex;

import java.util.Scanner;

public class java_exception {
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		String name=null;
		int score = 0;
		int[] num = {};
		try {
			score = scan.nextInt();
			System.out.println("이름 : "+name.concat("님"));
			System.out.println(score/num.length);
		}catch(java.lang.NullPointerException e) {
			System.out.println("이름을 입력하세요");
		}catch(java.lang.ArithmeticException a){
			System.out.println("성적을 입력하세요");
		}catch(Exception n) {
			n.printStackTrace();	
		}
		
		
		
		
//		String name;
//		try {
//			name = scan.nextLine();
//			System.out.println(name.charAt(0));
//		}catch(Exception e) { // 부모타입 Exception으로 모든 타입을 다 받을 수 있다.
//			System.out.println("이름을 입력하세요");
//		}
		
		
//		try {
//			int num = 10;
//			System.out.println(num/0);
//			
//		}catch(java.lang.ArithmeticException e) {
//			
//			System.out.println(e.getMessage());
//			//e.printStackTrace();
//			System.out.println("0으로 나누기 할 수 없습니다.");
//		}
		//System.out.println("예외 처리");
	}

}
