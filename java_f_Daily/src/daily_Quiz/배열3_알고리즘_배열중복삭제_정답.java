package daily_Quiz;

import java.util.Arrays;
import java.util.Scanner;

public class �迭3_�˰���_�迭�ߺ�����_���� {
	/*
	 * 	 
	 * 
		 [����] ���� �Է¹ް� ���� 
		 [����] ���࿡ �������� ������ ������ ����ù��°�� ��  �Ѱ��� ���� �� b �� ���������� ���� 
		 
		 		  data[] = {5,2,6,8,5,6};
		 		  
		 [��] 2 ==>  b [] = {5,6,8,5,6,0};
		 [��] 6 ==>  b [] = {5,2,8,5,6,0};
	 */
	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		
		int data[] = {5,2,6,8,5,6};
		int b [] = {0,0,0,0,0,0};
		
		//������ ������ �˻�
//		int count = 0;
//		for(int i = 0; i < data.length; i++) {
//			if(count == 0) {
//				b[count] = data[i];
//				count++;
//			}else {
//				int index = -1;
//				for(int j = 0; j < count; j++) {
//					if(b[j] == data[i]) {
//						System.out.println("������: " + b[j] + "|| �Է°�: " + data[i]);
//						System.out.println("count: "+ count);
//						b[j] = 0;
//						index = j;
//						break;
//					}
//				}
//				if(index == -1) {
//					b[count] = data[i];
//					count++;
//				}else {
//					for(int j = index; j < count - 1; j++) {
//						b[j] = b[j+1];
//					}
//					b[count - 1] = data[i];
//				}
//			}
//			System.out.println(Arrays.toString(b));
//		}
		
		int index = -1;
		//��ü�ݺ�
		//�ϳ��� ���� �˻��ؼ� �ߺ����� ������ count++(*�ڱ� �ڽ��� �׻� ���Ե�)
		//���� count == 2 �ε��� ������(�ٷ� break;�ϸ� ù��° �ߺ����� ù��° �ε���)
		//data[index]�� 0�̰ų� index == -1 �̸� �ߺ��� ���� ��� �� break
		//index ���� ������ index == i �� ���� �� �����ϰ� b[]�� �Է�
		//** �� �� �� data[] = b[] ����� �� data[]���� ��� �Ȱ��� ������! �ƴ� �� data[]�θ� ��������
		while(true) {
			index = -1;
			for(int i = 0; i < data.length; i++){
				int count = 0;
				for(int j = 0; j < data.length; j++) {
					if(data[i] == data[j]) {
						count++;
					}
				}
				if(count == 2) {
					index = i;
					break;
				}
			}
			if(index == -1 || data[index] == 0) {
				System.out.println("[�ߺ��� ����]");
				break;
			}else {
				int bindex = 0;
				for(int i = 0; i < b.length; i++) {
					if(index != i) {
						b[bindex] = data[i];
						bindex++;
					}
				}
			}
			System.out.println(Arrays.toString(b));
			
			for(int i = 0; i < data.length; i++) {
				data[i] = b[i];
			}
		}
		
	}
}