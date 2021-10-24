package daily_Quiz;

import java.util.Arrays;

public class 배열4_알고리즘_개수찾기_정답 {
	/*
	 * [개수찾기]
	 
	  	 가장많이 들어있는 숫자개수와
		 가장 적개 들어있는 숫자의 개수의 합을 구하시요.	
		 100 : 1개
		 3   : 5개 	
		 답 : 6		
	 */
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 3, 100, 1, 3, 3, 2, 3, 2 };	
		int[][] num = new int[arr.length][2];
		int count = 0;
		int a = 0;
		
		for(int i = 0; i < arr.length; i++) {
			boolean check = false;
			count = 0;
			for(int j = 0; j < num.length; j++) {
				if(arr[i] == num[j][0]) {
					check = true;
				}
				if(arr[i] == arr[j]) { 
					count++;
				}
			}
			if(check == false) {
				num[a][0] = arr[i];
				num[a][1] = count;
				a++;
			}
		}
		for(int i = 0; i < num.length; i++) {
			System.out.println(Arrays.toString(num[i]));
		}
		int mind = 0;
		int maxd = 0;
		int max = 0;
		int min = arr.length-1;
		for(int j = 0; j < num.length; j++) {
			if(max < num[j][1]) {
				max = num[j][1];
				maxd = j;
			}
			if(min > num[j][1] && num[j][1] != 0) {
				min = num[j][1];
				mind = j;
			}
		}
		
		System.out.println("최대: " + num[maxd][0] + "개수: " + num[maxd][1] + "개");
		System.out.println("최소: " + num[mind][0] + "개수: " + num[mind][1] + "개");
		System.out.println("합: " + (num[mind][1] + num[maxd][1]) + "개");
		
		
	}
}