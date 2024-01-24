package stream1;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.stream.IntStream;
import java.util.stream.Stream;

class member{
	private String name;
	private int age;
	private String tel;
	private String addr;
	
	public member(String name, int age, String tel, String addr) {
		this.name = name;
		this.age = age;
		this.tel = tel;
		this.addr = addr;
	}
	
	@Override
	public boolean equals(Object o) {
		member tmp = (member)o;
		return this.tel.equals( tmp.tel );
	}
	
	@Override
	public int hashCode() {
		return this.tel.hashCode();
	}
	
	
	@Override
	public String toString() {
		return name+" : "+age+"살 : "+ tel+" : "+addr;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}
	
}

public class stream_test2 {

	public static void main(String[] args) {
		List<member> list = new LinkedList<member>();
		list.add( new member("이순신",34,"01012349999","아산시 초산동"));
		list.add( new member("김유신",29,"01088883434","경주시 충효동"));
		list.add( new member("장보고",45,"01088226453","진도"));
		list.add( new member("장영실",37,"01088883434","대전광역시 중구"));
		list.add( new member("이장대",25,"01000118844","대전광역시 서구"));
		
		Stream<member> 나이 = list.stream().filter( m -> m.getAge() >= 30);
		Stream<member> 도시 = list.stream().filter( m -> m.getAddr().contains("대전광역시"));
		도시.forEach(System.out::println);
		
		Stream<Integer> 연령대 = list.stream().map( m -> m.getAge()/10);
		System.out.println(연령대.filter(n->n==3).count());
		
		// member 클래스 객체에서 연락처의 010을 제외한 값으로 변환된 객체들을 뽑아내고 싶다면
		// filter를 통해서는 member클래스 객체가 나왔는데 map도 가능한가?
		// map은 새로운 요소로 매핑하는 역할을 하기 때문에 반환타입이 반드시 존재해야한다.
		// member클래스 타입으로 반환되려면 member클래스 값이 나올 수 있도록 작업해야 하는데
		// 스트림의 각 요소의 객체 상태를 변경하려면 map이 아니라 forEach를 사용해야한다.
		// 즉 map에서는 객체를 상태변화를 할 수가 없다.
		list.stream().forEach(m -> m.setTel(m.getTel().substring(3)));
		list.forEach(System.out::println);
	
		List<score> std = Arrays.asList(new score(56,45,78), new score(23,87,99), new score(88,77,66));
		std.stream().flatMapToInt(student-> 
				IntStream.of(student.getEng(), student.getKor(),student.getMat()))
				.average().ifPresent( avg -> System.out.println(Math.round(avg*10)/10.0));
		
		// map - 일대일 매핑하여 새로운 스트림
		
		List<Integer> number = Arrays.asList(1,2,3,4,5,4,3,5,6,3);
		
		number.stream().distinct().forEach(System.out::println);
		
		list.stream().distinct().forEach(System.out::println);
		
		//총합 구하기
		System.out.println(IntStream.of(1,2,3,4,5).sum());
		
		int[] num = new int[] {23,45,6,7,12};
		int sum = Arrays.stream(num).sum();
		System.out.println(sum);
		OptionalDouble avg = Arrays.stream(num).average();
		System.out.println(avg.getAsDouble() );
		
		OptionalInt min = Arrays.stream(num).min();
		OptionalInt max = Arrays.stream(num).max();
		System.out.println(min+"  "+max);
		
		int minN=num[0];
		int maxN=num[0];
		for( int i=0; i<num.length;i++) {
			if(minN > num[i]) minN = num[i];
			if(maxN < num[i]) maxN = num[i];
			
		}
		System.out.println(minN+"  "+maxN);
		
		//reduce
		Arrays.stream(num).reduce( (a,b)-> a*b ).ifPresent(a->System.out.println(a));
		
		Arrays.stream(num).filter( n-> n<10).reduce((a,b) -> a*b )
		.ifPresent(r -> System.out.println(r));
		
		list.stream().map(member::getAge).reduce((a,b)->a+b).ifPresent( res-> System.out.println(res));
		
		//
		Optional<String> names = list.stream().map(member::getName).reduce( (a,b)-> a+"-"+b);
		System.out.println(names.get());
		
		// matching - 매칭의 방법 세가지가 있다.
		// 			  1. 하나라도 조건을 만족하는 값이 있는가? (anyMatch)
		//			  2. 모두 조건을 만족하는가? ( allMatch )
		//			  3. 모두 조건을 만족하지않는가? ( noneMatch )
		boolean any = Arrays.stream(num).anyMatch( n -> n>40 );
		System.out.println("40보다 큰값?" + any);
		boolean all = Arrays.stream(num).allMatch( n -> n>10);
		System.out.println("모든 숫자가 10보다 크냐 "+all);
		boolean none = Arrays.stream(num).noneMatch( n -> n>50);
		System.out.println("50보다 큰 숫자 없냐 ? " +none);
	}
}

class score{
	private int kor;
	private int mat;
	private int eng;
	
	public score(int kor, int mat, int eng) {
		this.kor=kor;
		this.mat=mat;
		this.eng=eng;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getMat() {
		return mat;
	}

	public void setMat(int mat) {
		this.mat = mat;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}
	
}

