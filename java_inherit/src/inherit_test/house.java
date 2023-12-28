package inherit_test;

public class house {
	
	public static int makedate=20231209;
	
	public boolean onoff;
	String brand;
	public int sn=10000; //시리얼 넘버
	
	protected house(){
		onoff=false;
		System.out.println("나는 부모 house 클래스는 생성자");
	}
	
	protected house(String brand){
		this.brand = brand;
	}
	
//	public abstract void power();
	
	
}
