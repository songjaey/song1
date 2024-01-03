package ArrayList_test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class test_main {

	public static void main(String[] args) {

		ArrayList<food> fd = new ArrayList<food>();
		
		try(BufferedReader bf = new BufferedReader(new FileReader("c:/test/food.txt"))) {
			int i=0;
			while(true) {
				String line = bf.readLine();
				if(line == null) break;
				String[] temp = line.split("-");
				fd.add( new food(temp[0],Integer.parseInt(temp[1]),temp[2]));
				System.out.println(fd.get(i++));
			}
		}catch(Exception e){
			System.out.println("파일로드 실패");
			e.printStackTrace();
		}
				
	}

}
