package java_interface;


interface Request{
	String getOrder();
}
class Customer{
	protected String menu;
	public Customer(String menu) {this.menu = menu;}
}
//단골 손님
class CustomerA extends Customer implements Request{
	public CustomerA(String menu) {super(menu);}
	public String getOrder() {
		return " 손님 A에게 "+menu+"을 준다.";
	}
}
class CustomerB extends Customer implements Request{
	public CustomerB(String menu) {super(menu);}
	public String getOrder() {
		return " 손님 B에게 "+menu+"을 준다.";
	}
}

class Restaurant{
	public void giveFood(Request res) {
		System.out.println(res.getOrder());
	}
}



public class order2 {

	public static void main(String[] args) {
		
		Restaurant owner = new Restaurant();
		Request a = new CustomerA("청국장");
		Request b = new CustomerB("삼겹살");
		owner.giveFood(a);
		owner.giveFood(b);
	}

}
