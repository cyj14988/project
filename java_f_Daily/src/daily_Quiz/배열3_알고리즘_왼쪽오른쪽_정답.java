package daily_Quiz;

import java.util.Arrays;
import java.util.Scanner;

public class �迭3_�˰���_���ʿ�����_���� {
	/*
	 * [���ʿ�����]
	 * 
	 *   �Ʒ� ��ȣ�� �Է¹ް� ������ ���� 0 �̾ƴѼ��ڸ� �����ÿ�.
		 1)left 2)right 	
		 ��) 1) left ==> arr = {2,3,4,5,0,0,0,0,0};
		 ��) 1) right ==> arr = {0,0,0,0,0,2,3,4,5};
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