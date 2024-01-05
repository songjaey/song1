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
		return null;
	}
	
	public String getMenu_name() {
		return menu_name;
	}
}
