package arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class main {

	public static void main(String[] args) {
		
		ArrayList<member> mbr = new ArrayList<member>();
		mbr.add( new member("이순신","lee@naver.com","남성",1012345678));
		mbr.add( new member("김유신","kim@naver.com","남성",1044558899));
		mbr.add( new member("사임당","sa@naver.com","여성",1044558899));
		mbr.add( new member("강감찬","kang@naver.com","남성",1044558800));
		mbr.add( new member("소서노","seo@naver.com","여성",1088339540));
		System.out.println(mbr.get(2));
		System.out.println(mbr.size());
		System.out.println(mbr.subList(1, 4) );
		
		member tmp = new member("사임당","sa@naver.com","여성",1044558899);
		System.out.println();
//		ArrayList<Integer> arr = new ArrayList<Integer>();
//		
//		arr.add(10);
//		arr.add(20);
//		arr.add(50);
//		arr.add(1,100);
////		arr.add("이순신");
////		arr.add(3.14);
//		
//		for(int i=0; i<arr.size(); i++) {
//			if( arr.get(i) >  20 )
//				System.out.println( arr.get(i) );
//		}
//		System.out.println("arraylist에 값 존재여부 contains "+ arr.contains(20));
//		System.out.println("50값이 몇번째 인덱스 indexOf  "+ arr.indexOf(50));
//		System.out.println("arraylist에 값이 몇 개 있나 size  "+ arr.size());
//		arr.remove(2);
//		System.out.println("arraylist 비어있나 isEmpty "+arr.isEmpty());
//		System.out.println("범위 내 값 출력  subList  "+arr.subList(1, 3));
//		arr.set(1, 200);
//		System.out.println("값 변경 set "+ arr);
//		
//		ArrayList<String> name = new ArrayList<String>();
//		name.add("이순신"); name.add("강감찬"); name.add("김유신"); name.add("장영실");
//		String[] names = new String[name.size()];
//		name.toArray(names);
//		System.out.println(Arrays.toString(names));
//		//정렬
//		
//		arr.sort(Comparator.naturalOrder());
//		arr.sort(Comparator.reverseOrder());
//		System.out.println(arr);
//		
//		Collections.sort( name );
//		System.out.println( name );
//		
		
	}
}

// ArrayList
// 기존의 배열을 동적으로 사용하기 위한 클래스
// 기존의 배열과 다른점은 여러 타입으로 지정해서 사용할 수 있다.(제네릭)
// ArrayList에 기본 데이터 타입은 Object 라는 자바 최상위 클래스 타입이다.
// Object 타입으로 저장되기 때문에 사용하고자 하는 타입을 지정해서 사용해야한다.
// ArrayList처럼 collection 모든 클래스들은 타입을 지정해서 사용해야 한다.
//
// ArrayList<클래스> -> ArrayList(동적배열)에 저장할 데이터(객체) 타입을
// <> 안에 작성하여 사용해야 한다.
// <> 안에 클래스를 넣어주면 해당 타입으로 동작 되도록 하는 방법은 제네릭이다.
// 제네릭은 사용자가 지정한 타입에 맞추어 사용할 수 있도록 자바에서 제시하는 방법
// 제네릭을 사용하면 여러 타입을 처리하기 위한 코드의 복잡성이 줄어 들고
// 타입의 안정화를 모도할 수 있다.




// 자바 컬렉션 -> 자바 컬렉션의 배열은 동적 배열이다.
// 다수의 데이터 또는 다수의 객체를 저장 관리, 가공 하기 위한 자료구조(저장 관리) 및 알고리즘(가공)을
// 개발자가 쉽게 사용할 수 있도록 만들어 놓은 인터페이스 및 클래스이다.

// Collection, Map 

// Collection - List => ArrayList
//					 => Vector
//					 => LinkedList
//					 => Stack

//			  - Set	 => HashSet
//					 => TreeSet

// Map - Hashtable
//	   - HashMap
//	   - TreeMap