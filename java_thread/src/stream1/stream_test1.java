package stream1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class stream_test1 {

	public static void main(String[] args) {
	
		//배열 스트림
		String[] arr = new String[] {"desk", "table", "orange"};
		Stream<String> stream = Arrays.stream(arr);
		
// 		stream.forEach(System.out::println);
// 		Arrays.stream(arr).forEach(System.out::println);
 		
 		stream = Arrays.stream(arr,1,3); // arr에 1번 인덱스만 포함해라, 3번 인덱스 제외
 		stream.forEach(System.out::println);
		
 		//컬렉션 스트림
 		List<String> list = Arrays.asList(arr);
 		Stream<String> stream2 = list.stream();
 		System.out.println(stream2.count());
 		
 		//스트림 빌더
 		Stream<String> stream3 = Stream.<String>builder().add("a").add("b").add("c").build();
 		
 		Stream<Integer> stream4 = Stream.iterate(1, n-> n+1).limit(10);
 		stream4.forEach(System.out::println);
 		
 		// 기본 데이터 타입형 스트림
 		IntStream intStream = IntStream.range(1, 11);
 		LongStream longStream = LongStream.range(1, 101);
 		DoubleStream floatStream = new Random().doubles(5);
 		
 		IntStream charStream = "banana".chars();
 		
 		List<String> names = new ArrayList<>();
 		names.add("이성계"); names.add("정약용"); names.add("정도전");
 		names.add("이만기"); names.add("김유신"); names.add("김신");
 		names.add("박문수"); names.add("문익점"); names.add("박만용");
 		
 		// filter - 참과 거짓에 따라 동작, if문의 조건식과 비슷한 식을 구사하면 된다.
 		
 		Stream<String> 박 = names.stream().filter(name -> name.contains("박"));
 		박.forEach(System.out::println);
 		
 		Stream<String> 문 = names.stream().filter(name -> name.contains("문"));
 		문.forEach(System.out::println);
 		
 		Stream<String> temp = names.stream().filter(name -> name.length() ==2 );
 		temp.forEach(System.out::println);
 		
 	// map - 값들을 특정값으로 변환 해주는 작업
 		Stream<String> 이름 = names.stream().map(name -> name.substring(1));
 		이름.forEach(System.out::println);
 		
//		ArrayList<String> list = new ArrayList<>();
//		list.add("a");list.add("b");list.add("c");
//		list.add("d");
//		
//		list.stream().filter("b"::equals).forEach(System.out::println);
		
//		for( String val : list ) {
//			if(val.equals("b"))
//				System.out.println("값 있다.  "+val);
//		}
		
		//Iterator 사용
//		Iterator<String> it = list.iterator();
//		while(it.hasNext()) {
//			String val = it.next();
//			if(val.equals("b"))
//				System.out.println("값 있다.  "+val);
//		}
		
	}
}
