package Liked;

public class list_test {

	public static void main(String[] args) {
		linkedList list = new linkedList();
		
		list.add("이순신");
		list.add("김유신");
		list.add("장영실");
		list.add("이성계");
		list.add("문익점");
		//System.out.println(list.get(2));
		list.add(3,"강감찬");
		System.out.println(list);
	}

}
