package study121901;

public class String_test {
	public static void main(String[] ar) {
		
		String song = "나는 바나나 알러지 원숭이 그래도 나는 바나나 좋아해";
		String temp = song.replaceAll("바나나","오렌지");
		System.out.println(temp);
		String[] allerg = song.split(" ");
		System.out.println(allerg[1]);
		temp = "상상만 해도 웃음이 나요 ";
		String temp1 = temp.concat(song);
		System.out.println(temp1);
		//1. 원본은 유지하고 모든 바나나를 오렌지로 변경하여 출력하세요
		//2. 과일 알러지있는 원숭이, 어떤 과일에 알러지 있는지 출력하세요
		//3. 문자열 앞에 "상상만 해도 웃음이 나요" 합쳐서 하나의 문자열로 출력
	}
}
