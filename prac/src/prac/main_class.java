package prac;

import java.awt.event.KeyEvent;
import java.util.Scanner;
import java.awt.event.*;

class MyKeyListener extends KeyAdapter {
	public void keyPressed(KeyEvent e) {
		int keyCode = e.getKeyCode();
		switch (keyCode) {
		case KeyEvent.VK_UP: System.out.println("가속");
			break;
		case KeyEvent.VK_DOWN: System.out.println("브레이크");
			break;
		case KeyEvent.VK_LEFT: System.out.println("왼쪽으로 이동");
			break;
		case KeyEvent.VK_RIGHT: System.out.println("오른쪽으로 이동");
			break;
		}
	}
}


public class main_class {
	
	public static void main(String[] args) {
		boolean drive, brk, handle;
		int selec = 0;
		//int a,b;
		//String s,t;
		
		car c = new car();
		Scanner scan = new Scanner(System.in);
		System.out.println("배기량 입력");
		c.cc =  scan.nextInt();
		scan.nextLine();
		
		System.out.println("차중량 입력");
		c.weight = scan.nextInt();
		scan.nextLine();
		
		System.out.println("차색상 입력");
		c.color = scan.nextLine();
		
		System.out.println("차브랜드 입력");
		c.brand = scan.nextLine();
		
		
		
		System.out.println("1.sedan 2.suv 3.supercar 4.truck");
		selec = scan.nextInt();
		String carString = ""; sedan s = new sedan();
		suv u = new suv(); supercar ss = new supercar(); truck tr = new truck();
		switch (selec) {  
        	case 1:  System.out.println("기어입력 1~6");
        			 s.gear =  scan.nextInt();
        			 scan.nextLine();
        			 break;
        	case 2:  System.out.println("이륜? 사륜?(string)");
			 		 u.wheels =  scan.nextLine();
                 break;
        	case 3:  System.out.println("가솔린? 디젤? 하이브리드?(string)");
	 		 		 ss.engine =  scan.nextLine();
	 		 		 break;
        	case 4:  System.out.println("휠 사이즈(mm)?");
	 		 		 tr.wheel_size =  scan.nextInt();
	 		 		 break;
	 		default: System.out.println("잘못 입력");
		} 
		
		System.out.println(c);
		if(selec == 1) System.out.println(s);
		else if(selec == 2) System.out.println(u);
		else if(selec == 3) System.out.println(ss);
		else if(selec == 4) System.out.println(tr);
		
		System.out.println("상,하,좌,우 키 입력");
		MyKeyListener mykey = new MyKeyListener();
		
		
	}
	
}





