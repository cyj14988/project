package daily_Quiz;

import java.util.Arrays;

public class �迭5_�˰���_�迭�ΰ�����_���� {
	/*
	 * [����]
	     �� �迭�� �ѳ��� ��ġ�� �����������������Ͻÿ�.	
		 ��) 1,2,3,5,7,8,9,10,12,15,19,20
	 */
	
	public static void main(String[] args) {
		int[] arr1 = {9,10,3,2,20,19};
		int[] arr2 = {15,12,1,5,7,8};
		
		int[] temp = new int[arr1.length+arr2.length];
		
		int room1 = 0;
		for(int i = 0; i < (arr1.length+arr2.length); i++){ 
			if(i <= arr1.length - 1) {
				temp[i] = arr1[i];
			}else {
				temp[i] = arr2[room1];
				room1++;
			}
		}
		System.out.println(Arrays.toString(temp));
		
		
		
		for(int i = 0; i < temp.length; i++) {
			int min = temp[i];
			int index = i;
			for(int j = i; j < temp.length; j++) {
				if(temp[j] < min) {
					min = temp[j];
					index = j;
				}
			}
			int temp2 = temp[i];
			temp[i] = temp[index];
			temp[index] = temp2;
		}
		System.out.println(Arrays.toString(temp));
	
	}
}
