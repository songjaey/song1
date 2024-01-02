package inner;

import inner.computer.vga;

interface a{
	public void view();
	public void haha();
}
class b{
	public void show() {
		System.out.println("나는 클래스B의 메서드다.");
	}
}

public class java_inner {

	public static void main(String[] args) {
		
		a a1 = new a() {
			@Override
			public void view() {
				System.out.println("나는 인터페이스를 이용한 익명클래스");
			}
			public void haha() {
				System.out.println("추가적인 인터페이스 사용 가능");
			}
		};
		
		b b1 = new b() {
			@Override
			public void show() {
				System.out.println("나는 익명의 클래스입니다.");
			}
		};
		
		a1.view(); a1.haha();
		b1.show();
		
		computer com = new computer();
		
		com.print();
		
		computer.ram r = new computer().new ram();
		r.print();
		
		computer.vga v = new vga();
		
		com.OS_install();
	}
}

// 내부 클래스
// 클래스 내부에 인스턴스변수, 클래스변수 선언 하듯이 내부에 클래스를 정의하는 것
// 하나의 클래스가 여러 클래스와 관계(상속,포함)를 맺지 않고 하나의 특정 클래스와만
// 관계를 맺고 싶다면 외부에 클래스를 작성해서 관계를 맺는게 아니고 내부클래스로 만들면된다.

// 내부 클래스로 작성하면 클래스를 논리적으로 그룹화할 수 있다.

/*
	class car{
		class wheel{ 내부클래스는 다른 외부 클래스에서 사용불가
		
		}
		class glass{
		
		}
		class hood{
		
		}
	}

*/