package study121901;

public class String_test {
	public static void main(String[] ar) {
		
//		String song = "나는 바나나 알러지 원숭이 그래도 나는 바나나 좋아해";
//		String temp = song.replaceAll("바나나","오렌지");
//		System.out.println(temp);
//		String[] allerg = song.split(" ");
//		System.out.println(allerg[1]);
//		temp = "상상만 해도 웃음이 나요 ";
//		String temp1 = temp.concat(song);
//		System.out.println(temp1);
		//1. 원본은 유지하고 모든 바나나를 오렌지로 변경하여 출력하세요
		//2. 과일 알러지있는 원숭이, 어떤 과일에 알러지 있는지 출력하세요
		//3. 문자열 앞에 "상상만 해도 웃음이 나요" 합쳐서 하나의 문자열로 출력
		//과제
		String song = "크리스마스에는 많을 것을 원하지 않아요 # 내가 원하는건 딱 하나에요"
					 	+"트리 아해의 선물 같은것도 신경쓰지 않아요 # 당신을 원해요 #"
					 	+"당신이 생각하는 것보다 더 #내 소원을 이뤄줘요 #"
					    +"내가 크리스마스에 원하는건 당신이에요";
		//System.out.println(song);
		String[] split = song.split("#");
		for(int i=0; i<split.length; i++)
			System.out.println(split[i]);
		// # 기준으로 한줄씩 출력
		// 2당신이라ㅣ는 단어 대신 "그대"라고 바꾸어서 출력
		String temp = song.replaceAll("당신","그대");
		System.out.println(temp);
		// 3. 크리스마스를 여어로 변경하여 출력하세요.
		temp = song.replaceAll("크리스마스","christmas");
		System.out.println(temp);
		// 4. 세번째#뒤의 가사가 무엇인지 출력하세요.
		System.out.println(split[3]); 
	}
}
