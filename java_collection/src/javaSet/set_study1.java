package javaSet;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class set_study1 {

	public static void main(String[] args) {
//		HashSet<Integer> set = new HashSet<Integer>();
		
//		set.add(10);
//		set.add(15);
//		set.add(60);
//		set.add(11);
//		set.add(14);
//		set.add(43);
//		set.add(29);
//		set.add(10);
		HashSet<String> 안경쓴사람 = new HashSet<String>();
		HashSet<String> 팥붕어빵  = new HashSet<String>();
		HashSet<String>	슈붕어빵	= new HashSet<String>();

		안경쓴사람.add("남기현"); 안경쓴사람.add("이가림"); 안경쓴사람.add("김민수");
		안경쓴사람.add("노재홍"); 안경쓴사람.add("송재영"); 안경쓴사람.add("김정환");
		안경쓴사람.add("강동욱"); 안경쓴사람.add("김의찬"); 안경쓴사람.add("서종우");
		
		팥붕어빵.add("노재홍"); 팥붕어빵.add("서영배"); 팥붕어빵.add("김의찬");
		팥붕어빵.add("강동욱"); 팥붕어빵.add("김정환"); 팥붕어빵.add("박종권");
		
		슈붕어빵.add("남기현"); 슈붕어빵.add("이가림"); 슈붕어빵.add("이다희");
		슈붕어빵.add("김민수"); 슈붕어빵.add("여영근"); 슈붕어빵.add("송재영");
		슈붕어빵.add("인호성"); 슈붕어빵.add("서종우");
		
		HashSet<String> 팥X안경 = new HashSet<String>();
		Iterator<String> it = 안경쓴사람.iterator();
		while(it.hasNext()) {
			String name = it.next();
			if( 슈붕어빵.contains(name) ) {
				팥X안경.add(name);
			}
			
		}
		System.out.println(팥X안경);
		//차집합
		//팥을 좋아하는 사람들 중에서 안경쓰지 않은 사람
		HashSet<String> 안경X팥O = new HashSet<String>();
		it = 팥붕어빵.iterator();
		while(it.hasNext()) {
			String name = it.next();
			if(!안경쓴사람.contains(name)) {
				안경X팥O.add(name);
			}
		}
		System.out.println(안경X팥O);
		
		//합집합
		//안경O슈O
		HashSet<String> 안경O슈O = new HashSet<String>();
		it = 슈붕어빵.iterator();
		while(it.hasNext()) {
			안경O슈O.add(it.next());
		}
		it = 안경쓴사람.iterator();
		while(it.hasNext()) {
			안경O슈O.add(it.next());
		}
		System.out.println(안경O슈O);
		
		팥X안경.clear();
		팥X안경.addAll(안경쓴사람);
		팥X안경.retainAll(슈붕어빵);
		System.out.println(팥X안경);
		
		안경X팥O.clear();
		안경X팥O.addAll(팥붕어빵);
		안경X팥O.removeAll(안경쓴사람); //차집합 메서드
		System.out.println(안경X팥O);
		
		안경O슈O.clear();
		안경O슈O.addAll(안경쓴사람);
		안경O슈O.addAll(슈붕어빵);
		System.out.println(안경O슈O);
		
		System.out.println(안경쓴사람.containsAll(팥붕어빵));
		System.out.println(안경O슈O.containsAll(슈붕어빵));
		List<String> name = new ArrayList<String>(안경O슈O);
		System.out.println(name);
	}
// 교집합 - 
}

// Set - 입력한 데이터 순서 유지 안됨(힙이라는 메모리 공간을 사용하기 떄문에)
//	   - 			메모리 주소, 크기 등에 의해 순서가 변경이 된다.
//	   - 중복을 허용하지 않는다
//	   - 데이터들의 그룹화 목적으로 사용(수학 집합)
//	   - HashSet : 수학에서의 집합을 표현하기 위한 클래스
//	   - TreeSet : 검색,정렬의 목적으로 사용되는 클래스