package customer;

public class Order_History {

	private int num;
	private String customer;
	private String menu;
	private int price;
	public int getNum() {
		return num;
	}
	
	public Order_History(int num,String customer, String menu, int price) {
		this.num = num;
		this.customer = customer;
		this.menu = menu;
		this.price = price;
	}
	@Override
	public String toString() {
		return "고객 : "+customer+" 메뉴 : "+menu+" 금액 : "+price;
	}
	
	
	
	public void setNum(int num) {
		this.num = num;
	}
	public String getCustomer() {
		return customer;
	}
	public void setCustomer(String customer) {
		this.customer = customer;
	}
	public String getMenu() {
		return menu;
	}
	public void setMenu(String menu) {
		this.menu = menu;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	
	
}
