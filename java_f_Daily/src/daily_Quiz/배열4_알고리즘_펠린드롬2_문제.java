package daily_Quiz;

import java.util.Arrays;

public class �迭4_�˰���_�縰���2_���� {
	/*
	  
	    [�縲���]
	    
	     -�縲����̶� �տ��� �����ص� �ڿ��������ص� �Ȱ��� ���̴�.
	    
	  	�� �迭���� 0�̳� 1�� ������ ������ ������ �丰������� ����Ѵ�.
		[��] 1�� 0�� ���� �����ϸ� 3,2,2,3 �̹Ƿ� �縰����̴�.
	 */
	public static void main(String[] args) {
		int arr[] = {0,3,2,2,2,2,1,1,0};
		int b[] = new int[arr.length];
		
		int count = 0;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] != 0 && arr[i] != 1) {
				count++;
			}
		}
		
		b = new int[count];
		int index = 0;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] != 0 && arr[i] != 1) {
				b[index] = arr[i];
				index++;
			}
		}
		System.out.println(Arrays.toString(b));
		
		count = count / 2;
		int duplicate = 0;
		index = b.length - 1;
		for(int i = 0; i < count; i++) {
			if(b[i] == b[index]) {
				System.out.println("����: "  + i + " " + index);
				duplicate++;
				index--;
			}
		}
		if(duplicate == count) {
			System.out.println("�Ӹ����");
		}
		
		
	}
}