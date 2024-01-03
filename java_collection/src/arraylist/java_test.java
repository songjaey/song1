package arraylist;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class java_test {

	public static void main(String[] args) {
		
		ArrayList<book> list = load();
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		book temp = new book("난항상물음표","노재홍",2024);
		System.out.println(list.indexOf("난항상물음표"));
		
		//정렬 - 두개의 데이터를 비교하여 크고 작다를 따져서 위치를 변경하는 방법
		Collections.sort((List<book>) list);
		Iterator<book> it = list.iterator();
		while(it.hasNext()) {
			book data = it.next();
			System.out.println(data);
		}
		//list.sort(Comparator.naturalOrder());
	}
	
	public static ArrayList<book> load() {
		ArrayList<book> list = new ArrayList<book>();
		try(BufferedReader bf = new BufferedReader(new FileReader("c:/test/book.txt")))
		{
			while(true) {
				String line = bf.readLine();
				if(line == null) break;
				String[] tmp = line.split(",");
				book data = new book(tmp[0],tmp[1],Integer.parseInt(tmp[2]));
				list.add(data);
			}
		}
		catch(Exception e) {
			System.out.println("파일 로드 및  반환 실패");
			e.printStackTrace();
		}
		
		return list;
	}
}
