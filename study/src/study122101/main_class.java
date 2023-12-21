package study122101;

import java.util.Scanner;

public class main_class {
	static void list_print(music[] mylist) {
		for( music obj : mylist) {
			System.out.println(obj);
		}
	}
	
	static void song_search(String keyword, music[] mylist) {
		for(int i=0; i<10; i++) {
			if(mylist[i].singer.equals(keyword)) {
				System.out.println("존재" );
			}
			else if(mylist[i].title.equals(keyword)) {
				System.out.println("존재" );
			}
			else
				continue;
		}
			
	}
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		
		music[] mylist = new music[] {
				new music("LE SSERAFIM", "Perfect Night", 328), new music("박재정", "헤어지자 말해요", 441),
				new music("IVE", "I AM", 332),
				new music("AKMU", "Love Lee", 445),
				new music("aespa", "Drama", 180),
				new music("NewJeans", "Ditto", 180),
				new music("IVE", "Baddie", 180),
				new music("정국", "Seven", 180),
				new music("NewJeans", "ETA", 180),
				new music("NewJeans", "Super Shy", 180)
		};
		list_print(mylist);
		
		String word = scan.nextLine();
		song_search(word, mylist);
	}
}
