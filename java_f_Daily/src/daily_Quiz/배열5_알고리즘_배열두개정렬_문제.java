package daily_Quiz;

import java.util.Arrays;

public class 배열5_알고리즘_배열두개정렬_문제 {
	/*
	 * [정렬]
	     두 배열을 한나로 합치고 오름차순으로정렬하시오.	
		 예) 1,2,3,5,7,8,9,10,12,15,19,20
	 */
	
	public static void main(String[] args) {
		int[] arr1 = {9,10,3,2,20,19};
		int[] arr2 = {15,12,1,5,7,10};
		int[] temp = new int[arr1.length+arr2.length];
		
		
		for(int i = 0; i < arr1.length; i++) {
			for(int j = i; j < arr1.length; j++) {
				if(arr1[i] > arr1[j]) {
					int temp2 = arr1[i];
					arr1[i] = arr1[j];
					arr1[j] = temp2;
				}
				
				if(arr2[i] > arr2[j]) {
					int temp2 = arr2[i];
					arr2[i] = arr2[j];
					arr2[j] = temp2;
				}
			}
		}
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
		
		int in1 = 0;
		int in2 = 0;
		for(int i = 0; i < temp.length; i++) {
			if(in1 == arr1.length) {
				temp[i] = arr2[in2];
				in2++;
			}else if(in2 == arr2.length) {
				temp[i] = arr1[in1];
				in1++;
			}else {
				if(arr1[in1] > arr2[in2]) {
					temp[i] = arr2[in2];
					in2++;
				}else if(arr1[in1] < arr2[in2]) {
					temp[i] = arr1[in1];
					in1++;
				}else {
					temp[i] = arr1[in1];
					in1++;
				}
			}
		}
		System.out.println(Arrays.toString(temp));
	}
}
