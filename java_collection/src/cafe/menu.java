package cafe;

public class menu {
	
	private String menu_name;
	private int caffeine;
	private int calorie;
	private int m1;
	private int cost1;
	private int cost2;
	private Category type;
	
	
	
	
	
	
	public menu() {}
	public menu(String menu_name, int cost1, int cost2, int caffeine,
				int calorie, int m1, Category type) {
		this.menu_name=menu_name;
		this.cost1=cost1;
		this.caffeine=caffeine;
		this.calorie=calorie;
		this.m1=m1;
		this.type=type;
	}
	@Override
	public String toString() {
		return menu_name;
	}
	
	public String getMenu_name() {
		return menu_name;
	}
	public int getCaffeine() {
		return caffeine;
	}
	public void setCaffeine(int caffeine) {
		this.caffeine = caffeine;
	}
	public int getCalorie() {
		return calorie;
	}
	public void setCalorie(int calorie) {
		this.calorie = calorie;
	}
	public int getM1() {
		return m1;
	}
	public void setM1(int m1) {
		this.m1 = m1;
	}
	public int getCost1() {
		return cost1;
	}
	public void setCost1(int cost1) {
		this.cost1 = cost1;
	}
	public int getCost2() {
		return cost2;
	}
	public void setCost2(int cost2) {
		this.cost2 = cost2;
	}
	
	public void setType(Category type) {
		this.type = type;
	}
	public void setMenu_name(String menu_name) {
		this.menu_name = menu_name;
	}
	public Category getType() {
		// TODO Auto-generated method stub
		return type;
	}
	
	
}

