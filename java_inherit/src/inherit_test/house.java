package inherit_test;

public class house {
	boolean onoff;
	String brand;
	
	house(){
		onoff=false;
		System.out.println("나는 부모 house 클래스는 생성자");
	}
	
	house(String brand){
		this.brand = brand;
	}
	
	void power() {
		onoff = !onoff; 
	}
}
