package daily_Quiz;

import java.util.Arrays;

public class �迭4_�˰���_����ã��_���� {
	/*
	 * [����ã��]
	 
	  	 ���帹�� ����ִ� ���ڰ�����
		 ���� ���� ����ִ� ������ ������ ���� ���Ͻÿ�.	
		 100 : 1��
		 3   : 5�� 	
		 �� : 6		
	 */
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 3, 100, 1, 3, 3, 2, 3, 2 };	
		int[] num = new int[arr.length];
		int[] duplicate = new int[arr.length];
		
		int n = 0;
		boolean check = false;
		for(int i = 0; i < arr.length; i++) {
			check = false;
			for(int j = 0; j < n; j++) {
				if(num[j] == arr[i]) {
					check = true;
					break;
				}
			}
			if(check == false) {
				num[n] = arr[i];
				n++;
			}
		}
		System.out.println(Arrays.toString(num));
		int d = 0;
		int count = 0;
		for(int i = 0; i < n; i++) {
			count = 0;
			for(int j = 0; j < arr.length; j++) {
				if(num[i] == arr[j]) {
					count++;
				}
			}
			duplicate[d] = count;
			d++;
		}
		System.out.println(Arrays.toString(duplicate));
		
		int max = 0;
		int mindex = -1;
		for(int i = 0; i < d; i++) {
			if(max < duplicate[i]) {
				max = duplicate[i];
				mindex = i;
			}
		}
		System.out.println("�ִ�: " + num[mindex] + " ����: " + max);
		
		int min = max;
		int mmindex = -1;
		for(int i = 0; i < d; i++) {
			if(min > duplicate[i]) {
				min = duplicate[i];
				mmindex = i;
			}
		}
		System.out.println("�ּ�: " + num[mmindex] + " ����: " + min);
	}
}