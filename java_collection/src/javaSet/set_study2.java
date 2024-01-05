package javaSet;

import java.util.TreeSet;

public class set_study2 {

	public static void main(String[] args) {
		TreeSet<Integer> tree = new TreeSet<Integer>();
		do {
			int num = (int)(Math.random()*50)+1;
			tree.add(num);
			//System.out.println(num);
		}while(tree.size()<10);
		System.out.println(tree);
		
		//검색
		System.out.println( tree.floor(1) ); // n이하 가장 근접한 값
		System.out.println( tree.headSet(25)); // n미만 모든 값
		System.out.println( tree.tailSet(27)); // n초과 모든 값
		System.out.println( tree.higher(40)); // n초과 가장 근접한 값
		System.out.println( tree.lower(40)); // n미만 가장 근접한 값
		System.out.println( tree.subSet(10, 30)); //n1 이상 n2미만
	}

}
