package study121801;

public class main_class {
	public static void main(String[] args) {
		//자바 배열 문제	
		//{30,4,50,60,14,80,45,72,94,25}
		// 10개의 정수가 저장된 배열의 값을 확인하고
		// 평균 구하기, 10개의 정수의 평균 이하인 숫자들은 F, 평균 이상인 숫자는 A 표기
		// 배열을 만들어 출력
		int[] arr1 = {30,4,50,60,14,80,45,72,94,25};
		String[] res  = new String[10];
		int tot = 0;
		for(int i=0; i<arr1.length; i++) {
			tot += arr1[i];
		}
		float avg = tot / arr1.length;
		for(int i=0; i<arr1.length; i++) {
			if(arr1[i]>avg) {
				res[i] = "A";
				System.out.printf("%s ", res[i]);
			}else {
				res[i] = "F";
				System.out.printf("%s ", res[i]);
			}
		}
	
	}
}
