package study121801;

import java.util.Arrays;
import java.util.Scanner;

public class main_array {
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		
		//16개의 정수를 중복 없이 배열에 저장하기
		int[] number = new int[16];
		for(int i=0; i<number.length; i++) {
			number[i] = (int)(Math.random()*50)+1;
			for(int k=0; k<i; k++) {
				if(number[k] == number[i]) {
					i--;
					break;
				}
			}
		}
		System.out.println(Arrays.toString(number));
		
		//number 배열을 한줄에 4개씩 4줄로 출력
		System.out.println("┌────┐────┐────┐────┐");
		for(int i=0; i<number.length; i++) {
			if(i%4 == 0)
				System.out.printf("│\n│────│────│────│────│\n");
			System.out.printf("│ %2d ", number[i]);	
		}
		System.out.printf("│\n└────┘────┘────┘────┘");
		
		int[][] arr2 = new int[3][2];
		arr2[0][0] = 100;
		arr2[0][1] = 30;
		
		arr2[1][0] = 50;
		arr2[1][1] = 10;
		System.out.println();
		//int[][] bingo = { {1,2,3,4},{1,2,3,4},{1,2,3,4,},{1,2,3,4} };
		int[][] bingo = new int[][] {
			{24,12,45,11}, {9,4,12,31}, {5,41,39,17}, {1,50,43,22}
		};
//		for(int i=0; i<bingo.length;i++) {
//			for(int k=0; k<bingo[i].length; k++) {
//				System.out.printf(" %2d ", bingo[i][k]);
//			}
//			System.out.println();
//		}
		
		//bingo 배열에서 25이하는 숫자대신 ★을 출력하세요.
//		for(int i=0; i<bingo.length;i++) {
//			for(int k=0; k<bingo[i].length; k++) {
//				if(bingo[i][k] > 25)
//					System.out.printf(" %2d ", bingo[i][k]);
//				else
//					System.out.printf(" %2s ","★");
//			}
//			System.out.println();
//		}
		//int[] a,b,c;
		int[][] arr5 = new int[3][];
		int[] a = new int[] {1,2,3,4,5};
		int[] b = {10,20,30};
		int[] c = {11,22,33,44,55,66,77};
		
//		arr5[0] = a;
//		arr5[1] = b;
//		arr5[2] = c;
//		
//		for(int i=0; i<arr5.length; i++) {
//			for(int k=0; k<arr5[i].length; k++) {
//				System.out.print(arr5[i][k]+ " ");
//			}
//			System.out.println();
//		}
		
		int num11 = scan.nextInt();
		scan.nextLine();
		String word = scan.nextLine();
		System.out.println(num11 + word);
		
		String[][] info = new String[3][3];
		for(int i=0; i<info.length; i++) {
			System.out.print("이름: ");
			info[i][0] = scan.nextLine();
			System.out.print("나이: ");
			int age = scan.nextInt();
			info[i][1] = Integer.toString(age);
			scan.nextLine();
			System.out.print("직업: ");
			info[i][2] = scan.nextLine();
		}
		for(int i=0; i<info.length; i++) {
			for(int k=0; k<info[i].length; k++) {
				System.out.printf("이름: %s 나이: %s 직업: %s \n", info[i][k], info[i][k],info[i][k]);
			}
		}
	}
}
