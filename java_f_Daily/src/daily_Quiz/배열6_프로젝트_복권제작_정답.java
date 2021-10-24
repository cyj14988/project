package daily_Quiz;

import java.util.Arrays;
import java.util.Random;

public class �迭6_������Ʈ_��������_���� {
	/*
	 * [��������]
	 * 1. lottoSet �迭�� 5 * 7 ������ �迭�̴�. 
	 * 2. ����1���� 7���̰� , �� 5���� ������ ������� �Ѵ�.  
	 * 3. ���� 1���� ������ 1�Ǵ� 7�� ������ �����Ѵ�. 
	 * 4. ���� 1���� 7�� �������� 3���̻��̸� "��÷" �̰� �� �̸��� "��" �̴�.
	 * 5. 5�� �����߿� 1���� ��÷�̰� 4���� ���� ������ �������� �����غ���.
	 * 
	 * ��) �Ʒ��� ���� ���ٸ� "��÷" �̰� ������ 4���� "��"�̴�.
	 * 1177117 (��)
	 * 1117771 (��÷)
	 * 7171117 (��)
	 * 7711771 (��)
	 * 7171717 (��)
	 * 
	 */
	public static void main(String[] args) {
		//�ζ� �迭 5 * 7
		int[][] lottoSet = new int[5][7];
		Random ran = new Random();
		//��÷ ���� ����
		int winCount = 0;
		//���� �ݺ���
		for(int i = 0; i < 5; ) {
			//�ζ� �̴� ���� �ݺ���
			for(int j = 0; j < lottoSet[i].length; j++) {
				//���� 
				int r = ran.nextInt(2);
				//����1. ���� ���� 0�̸�, 1����
				if(r == 0) {
					lottoSet[i][j] = 1;
				}
				//����2. ���� ���� 1�̸�, 7����
				else if(r == 1) {
					lottoSet[i][j] = 7;
				}
			}
			//7���� ���� ī��Ʈ ����
			int count = 0;
			//�ζ� ��÷ �迭�� ���Դ��� Ȯ���ϴ� ����
			boolean check = false;
			//i���� �ζ� �ݺ���
			for(int j = 0; j < lottoSet[i].length; j++) {
				//����1. ���� 7�̸� count++;
				if(lottoSet[i][j] == 7) {
					count += 1;
					//����1-1. count == 3�̸�, check = true �ְ� break;
					if(count == 3) {
						check = true;
						break;
					}
				}
				//�׿�, count = 0; ó��
				else {
					count = 0;
				}
			}
			//check == true(�ش� �� �ζǿ��� ���� 7�� ����) �̰�, winCount == 0(���ݱ��� ��÷ �ζ� ���� ��X) �̸�,
			if(check == true && winCount == 0) {
				//winCount = 1(��÷ �ζ� ������), i+= 1;
				winCount = 1;
				i += 1;
			}
			//check == false(�ش� �� ��÷ �ζ� �ƴ�) �̰�, winCount == 1(������ ��÷ �ζ� ������)�̸�, i+=1
			else if(check == false && winCount == 1){
				i += 1;
			}			
		}	
		
		for(int i = 0; i < lottoSet.length; i++) {
			System.out.println(Arrays.toString(lottoSet[i]));
		}
		int r = ran.nextInt(lottoSet.length);
		
		int[] temp = lottoSet[0];
		lottoSet[0] = lottoSet[r];
		lottoSet[r] = temp;
		System.out.println("------------------");
		for(int i = 0; i < lottoSet.length; i++) {
			System.out.println(Arrays.toString(lottoSet[i]));
		}
		
	}
}