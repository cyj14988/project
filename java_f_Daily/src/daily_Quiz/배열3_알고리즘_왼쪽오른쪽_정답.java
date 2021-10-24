package daily_Quiz;

import java.util.Arrays;
import java.util.Scanner;

public class 배열3_알고리즘_왼쪽오른쪽_정답 {
	/*
	 * [왼쪽오른쪽]
	 * 
	 *   아래 번호를 입력받고 각방향 으로 0 이아닌숫자를 모으시요.
		 1)left 2)right 	
		 예) 1) left ==> arr = {2,3,4,5,0,0,0,0,0};
		 예) 1) right ==> arr = {0,0,0,0,0,2,3,4,5};
	 */
	public static void main(String[] args) {
		int arr[] = {2,0,0,3,4,0,0,5,1};	
		Scanner scan = new Scanner(System.in);
		
		int sel = scan.nextInt();
		int temp = 0;
		
		if(sel == 1) {
			int index1 = 0;
			int index2 = 0;
			for(int i = 0; i < arr.length; i++) {
				if(arr[index1] != 0) {
					temp = arr[index2];
					arr[index2] = arr[index1];
					arr[index1] = temp;
					index2++;
				}
				index1++;
			}
		}else {
			int index1 = arr.length-1;
			int index2 = arr.length-1;
			for(int i = 0; i < arr.length; i++) {
				if(arr[index1] != 0) {
					temp = arr[index2];
					arr[index2] = arr[index1];
					arr[index1] = temp;
					index2--;
				}
				index1--;
			}
		}
		System.out.println(Arrays.toString(arr));
	}
}