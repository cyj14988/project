package ���α׷��־��Ȱ��_������;

public class SumAvg {
	public static void main(String[] args) {
		/*
		 1���� 100������ �հ� ����� �����ϴ� ���α׷��� �ۼ��Ͻÿ�.
		 */
		
		int sum = 0;
		double avg = 0;
		for(int i = 1; i <= 100; i++) {
			sum += i;
		}
		avg  = sum / 100.0;
		
		System.out.println("��: " + sum);
		System.out.printf("���: %.2f", avg);
		
	}
}
