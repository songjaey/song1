package javaMap;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.Enumeration;
import java.util.Properties;
import java.util.ResourceBundle;
import java.util.TreeMap;

public class map_sstudy2 {

	public static void main(String[] args) {
		TreeMap<Integer, String> tree = new TreeMap<>();
		tree.put(101, "서울특별실");
		tree.put(204, "인천광역시");
		tree.put(406, "대전광역시");
		tree.put(201, "광주광역시");
		tree.put(701, "대구광역시");
		tree.put(702, "울산광역시");
		tree.put(703, "부산광역시");
		System.out.println(tree);
		
		//검색
		System.out.println(tree.ceilingEntry(500)); 
		//입력한 key값보다 크거나 같은 값 중 가장 작은key,value 반환
		
		System.out.println( tree.ceilingKey(500));
		//입력한 key값보다 크거나 같은 값 중 가장 작은key 반환
		
		System.out.println( tree.floorEntry(300));
		//입력한 key값보다 작거나 같은 값중 가장 큰 key,value 반환
		
		System.out.println(tree.higherEntry(406));
		// 지정한 키값보다 큰 값 중에서 가장 가까운 key
		
		
		System.out.println(tree.firstEntry());
		// 현재 맵에서 가장 작은 키를 가진 엔트리 반환
		// firstKey() - 키만 반환
		System.out.println(tree.lastEntry());
		// 현재맵에서 가장 큰 키를 가진 엔트리 반환
		
		System.out.println(tree.pollLastEntry());
		System.out.println(tree);
		
		System.out.println(tree.headMap(500));
		
		System.out.println(tree.subMap(200, 600));
		
		Properties prop = new Properties();
		prop.put("월요일","101");
		prop.put("금요일","와 내일부터..쉬는날이 아니네");
		prop.put("수요일","수요일마다 야외 수업");
		prop.setProperty("화요일","아직2일 지났다");
		System.out.println(prop);
		
		System.out.println(prop.get("월요일"));
		System.out.println(prop.getProperty("화요일"));
		
		Enumeration em = prop.elements();
		while(em.hasMoreElements()) {
			System.out.println(em.nextElement());
		}
		
		//ResourceBundle rb = ResourceBundle.getBundle("router");
		
		String filename = "C:\\새 폴더 (2)\\java\\song1\\java_collection\\src\\javaMap\\router.properties";
		Properties router = new Properties();
		try(FileReader fs = new FileReader(filename)) 
		{
			router.load(fs);
		}catch(IOException e) {
			e.printStackTrace();
		}
		System.out.println(router);
		
		
		
	}

}
