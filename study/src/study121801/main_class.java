package study121801;

import java.util.Arrays;

public class main_class {
	
		public static void main(String[] args) {
			int[] arr1 = {101,20};
			System.out.println(arr1[0]);
			
			int[] arr2 = new int[10];
			int[][] arr3 = new int[10][10];
			
			for(int i=0; i<arr2.length; i++) {
				arr2[i] = i * 10;
			}
			for(int i=0; i<arr2.length; i++)
				System.out.println( arr2[i]);
			
			// 10명의 학생 성적이 저장된 배열 만들기
			int[] score = new int[10];
			for(int i=0; i<score.length; i++) {
				score[i] = (int)(Math.random()* 51) +50;
			}
//			System.out.println(Arrays.toString(score));
//			Arrays.sort(score);
//			System.out.println(Arrays.toString(score));
			
			// 두개의 배열에 저장된 값을 하나의 배열로 합치기
			int[] a= {10,20,30,40};
			int[] b= new int[] {11,22,33,44};
			int[] c = new int[8];
//			for(int i=0; i<a.length;i++) {
//				c[i] = a[i];
//				c[i+4] = b[i];
//			}
			System.arraycopy(a, 0, c, 0, a.length);
			System.arraycopy(b,0,c,4,b.length);
			System.out.println( Arrays.toString(c));
			
			int[] data = {170,168,182,174,175,169,177};
			
			for(int i=0; i<data.length;i++) {
				if( data[i] >= 175)
					System.out.println(data[i]);
			}
		}
}
