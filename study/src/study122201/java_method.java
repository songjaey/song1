package study122201;

import java.util.Scanner;

public class java_method {
	static Scanner scan = new Scanner(System.in);
	static mart[] mart_list;
	public static void main(String[] args) {
		
		mart_init();
		
		buyer 재영 = buyer_enroll(); // 구매자 등록
		
		buy(재영);
		
		
		//view();
	}
	static void buy(buyer 재영) {
		while(true) {
			view();
			System.out.print("물건의 번호를 입력하세요(0-구매중단) : ");
			int num = scan.nextInt();
			if(num == 0) break; // 
			if( !(num >= 1 && num <= mart_list.length) ) {
				continue;
			}
			재영.basket_sizeUp();
			재영.basket[재영.cnt] = mart_list[num-1];
			재영.cnt++;
			
			
		}
	}
	
	
	
	static buyer buyer_enroll() {
		int num = (int)(Math.random()*40000)+10000;
		System.out.print("구매자 성함을 입력하세요 : ");
		String name = scan.nextLine();
		
		buyer 송재영 = new buyer(num, name);
		송재영.basket = new mart[1];
		return 송재영;
	}
	
	
	static void view(){
		for(int i=0; i<mart_list.length; i++) {
			System.out.println((i+1)+". "+mart_list[i]);
		}
	}
	
	
	static void mart_init() {
		mart_list = new mart[] {
			new mart("고추참치",2890,"통조림", 2100),
			new mart("홈런볼",1300,"과자",4231),
			new mart("오이비누4묶음",5890,"비누",450 ),
			new mart("신라면",4300,"라면",5234),
			new mart("짜파게티1봉지",6430,"라면",5132),
			new mart("햇반(6개)",6700,"즉석밥",312),
			new mart("비비고육개장",1560,"즉석시품",1145),
			new mart("야채참치",2450,"통조림",3123),
			new mart("골뱅이",2710,"통조림",1365),
			new mart("먹태깡",1350,"과자",4615),
			new mart("샤토마니",30000,"와인",128),
			new mart("발비 소프라니",31000,"와인",128)
		};
	}
}
