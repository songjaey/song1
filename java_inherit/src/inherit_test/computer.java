package inherit_test;

public class computer extends house{

	float cpu; // cpu
	int ram;   // 램 용량
	
	computer(){}
	computer(String brand, float cpu, int ram){
		super(brand);
		this.cpu=cpu;
		this.ram=ram;
	}
	
	@Override
	void power(){
		onoff = !onoff; 
		System.out.println("COmputer 전원 : "+onoff);
	}
	
	@Override
	public String toString(){
		return super.brand+" , cpu : "+cpu+"Gh  ram : "+ram+"Gb";
	}
}
