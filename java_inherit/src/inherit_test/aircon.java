package inherit_test;

public class aircon extends house{
	int temp=22;
	int speed=1; //풍속
	
	aircon(){}
	aircon(String brand){
		super(brand);
	}
	
	void power() {
		onoff = !onoff; 
		System.out.println("Aircon전원 : "+onoff);
	}
	
	@Override
	public String toString() {
		return super.brand+" , 전원 : "+super.onoff+" 온도:"+temp+"℃ 바람:"+speed;
	}
}
