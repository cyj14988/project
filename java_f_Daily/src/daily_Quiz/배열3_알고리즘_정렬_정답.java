package daily_Quiz;

import java.util.Arrays;

public class �迭3_�˰���_����_���� {
	/*
	 * [����]
	 * 
	 * 1. �ε��� 0���� �������� �˻��Ѵ�.
	 * 2. ���� ū ���� ã�� ��ȯ�Ѵ�.
	 * 3. �ε��� 1�����Ѵ�.
	 * 4. [1~3]�� ������ �ݺ��Ѵ�.
	 * ��)
	 * 10, 50, 30, 40, 80, 19   ==> 80�� ã�Ƴ��� ��ȯ�Ѵ�.
	 * 80, 50, 30, 40, 10, 19   ==> 50�� �������� �̹� ����ũ��.
	 * 80, 50, 30, 40, 10, 19   ==> 40�� ã�Ƴ��� ��ȯ�Ѵ�.
	 * 80, 50, 40, 30, 10, 19   ==> 30�� �������� �̹� ����ũ��.
	 * 80, 50, 40, 30, 10, 19   ==> 19�� ã�Ƴ��� ��ȯ�Ѵ�.
	 * 80, 50, 40, 30, 19, 10
	 */
	public static void main(String[] args) {
		int[] score = {10, 50, 30, 40, 80, 19};
		
		for(int i = 0; i < score.length; i++) {		
			for(int j = i + 1; j < score.length; j++) {
				if(score[i] < score[j]) {
					int temp = score[i];
					score[i] = score[j];
					score[j] = temp;
				}
			}
			System.out.println(Arrays.toString(score));			
		}
	}

}