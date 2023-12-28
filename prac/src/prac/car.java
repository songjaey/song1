package prac;

public class car {
	
	int cc;
	int weight;
	String color;
	String brand;
	
	void car() {}
	void car(int cc, int weight, String color, String brand) {
		this.cc = cc;
		this.weight = weight;
		this.color = color;
		this.brand = brand;
	}
	public String toString() {
		return "배기량:"+cc+" 중량:"+weight+" 색상:"+color+" 브랜드:"+brand;
	}
}
