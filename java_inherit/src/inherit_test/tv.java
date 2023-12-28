package inherit_test;

public class tv extends house{
		
	int ch; //채널
	int vol; //소리
	{
		ch=10;
		vol=12;
	}
	public tv(){ // 기본 생성자 메서드
		System.out.println("tv 클래스의 생성자입니다.");
	}
	public tv(String brand){// 매개변수가 있는 생성자메서드
		super(brand);
	}
	
	void channel_up() {
		this.ch++;
	}
	void channel_down() {
		this.ch--;
	}
	
	
	@Override
	void power() {
		onoff = !onoff; 
		System.out.println("TV전원 : "+onoff);
	}
	
	@Override
	public String toString() {
		return super.brand+ " , 전원 : "+super.onoff + " 현재 채널:"+ch+" 볼륨:"+vol;
	}
}
