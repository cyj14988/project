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
		int arr[] = {1,1,0,5,3,1,2,3,5};
		int count = 0;
		int Ncount = 0;
		int sameCount = 0;
		//�ݺ���. arr[i] != 0 && arr[i] != 1 ���� ����
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] != 0 && arr[i] != 1) {
				Ncount++;
			}
		}
		//������ �ε��� ����(�� ������ Ȯ�� �ؾ��ϴϱ�)
		int last = arr.length-1;
		//�ݺ���. �������� X(���� ���� �� ���缭 �˻��ؾ� ��)
		for(int i = 0; i < arr.length; ) {
			System.out.println(i + " " + last);
			//����. arr[i] == 0 �̰ų� == 1�̸�, 
			if(arr[i] == 0 || arr[i] == 1) {
				//i++;  �׸��� continue;
				i++;
				continue;
			}
			//����. arr[last] == 0 �̰ų� == 1�̸�, 
			if(arr[last] == 0 || arr[last] == 1) {
				//last--;  �׸��� continue;
				last--;
				continue;
			}
			//����. arr[i] == arr[last] �̸�, 
			if(arr[i] == arr[last]) {
				//sameCount++;
				System.out.println("����: " + i + " " + last);
				sameCount++;
			}
			//�⺻ ������
				//���� �ٸ���, count++ i++ last-- (count�� �˻� Ƚ��)
			count++;
			i++;
			last--;
			//����. �˻� Ƚ���� Ncount/2 �� ������ break;
			if(count == Ncount/2) {
				break;
			}
		}
		//System.out.println(count);
		
		//����. sameCount == Ncount/2 �̸�, �Ӹ����
		if(sameCount == Ncount/2) {
			System.out.println("�縰����Դϴ�.");
		}else {
			System.out.println("�縰����� �ƴմϴ�.");
		}
	}
}