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
		
		System.out.println("�ִ�: " + num[maxd][0] + "����: " + num[maxd][1] + "��");
		System.out.println("�ּ�: " + num[mind][0] + "����: " + num[mind][1] + "��");
		System.out.println("��: " + (num[mind][1] + num[maxd][1]) + "��");
		
		
	}
}