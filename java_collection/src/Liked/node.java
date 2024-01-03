package Liked;

public class node {
	
	private String name;
	private node next=null;
	public int index;
	
	public node() {}
	public node(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return name;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public node getNext() {
		return next;
	}
	public void setNext(node next) {
		this.next = next;
	}
	
	
}
