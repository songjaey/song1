package prac;

import java.awt.event.KeyEvent;
import java.util.Scanner;
import java.awt.event.*;

import javax.swing.JFrame;
import javax.swing.JTextArea;
class MyKeyEvent extends JFrame implements KeyListener{

JTextArea area;  //창에 텍스트 영역을 만들기위한 변수 선언.

public MyKeyEvent() {
initData();
setInitLayout();
addEventListener();
}

private void initData() {
System.out.println("방향키 위:가속 방향키 아래: 브레이크");
System.out.println("방향키 왼쪽:왼쪽으로 방향키 오른쪽: 오른쪽으로");
setTitle("방향키를 누르시오");
setSize(500, 500);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
area = new JTextArea();  //텍스트 입력 변수의 객체 생성
}

private void setInitLayout() {
setVisible(true);
this.add(area);  //창에 텍스트 입력을 추가
}

private void addEventListener() {
area.addKeyListener(this);  //텍스트 입력 부분에 키보드의 입력을 감지하도록 함
}

//////////////////////////////////////////////////
@Override
public void keyTyped(KeyEvent e) {

}

@Override
public void keyPressed(KeyEvent e) {
int keycode = e.getKeyCode();  //각 키의 키코드를 변수에 대입
char keychar = e.getKeyChar();  //각 키의 문자 혹은 숫자를 변수에 대입
System.out.print("keycode : " + keycode + " => " + keychar);
switch(keycode) {
case 38: System.out.println("가속");
break;
case 40: System.out.println("브레이크");
break;
case 37: System.out.println("왼쪽으로");
break;
case 39: System.out.println("오른쪽으로");
break;
}

System.out.println();
}

@Override
public void keyReleased(KeyEvent e) {

}
}



public class main_class {

public static void main(String[] args) {
//boolean drive, brk, handle;
int selec = 0;
//int a,b;
//String s,t;

car c = new car();
Scanner scan = new Scanner(System.in);
System.out.println("배기량(cc) 입력");
c.cc =  scan.nextInt();
scan.nextLine();

System.out.println("차중량(kg) 입력");
c.weight = scan.nextInt();
scan.nextLine();

System.out.println("차색상(string) 입력");
c.color = scan.nextLine();

System.out.println("차브랜드 입력");
c.brand = scan.nextLine();



System.out.println("1.sedan 2.suv 3.supercar 4.truck");
selec = scan.nextInt();
scan.nextLine();
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

new MyKeyEvent();

}

}
