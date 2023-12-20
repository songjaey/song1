package study122001;

public class member {
	
	static String company; // 클래스변수
	
	int num;
	String name;
	int age;
	
	static{
		company="LG";
	}
	{//인스턴스 초기화 블럭
	 	num = 50;
		name = "김유신";
	}
	public String toString() {
		return "번호: " +num+" 이름: "+name+" 나이 : "+age;
	}
}

//지역변수 : 생성 - 메서드나 제어문이 시작할 때 생성
//		   소멸 - 메서드나 제어문이 종료되면 소멸
// 인스턴스 변수 : 생성 - 클래스의 객체생성 시 생성
//(인스턴스 메소드) 소멸 - 객체가 소멸되면 소멸(객체는 운영체제나 jvm에 의해 정리될 때)
// 클래스 변수  : 생성 - 프로그램이 실행되면서 클래스 정의 부분을 jvm이 로드 할 때 생성
//(클래스 메소드)	소멸 - 프로그램 종료				