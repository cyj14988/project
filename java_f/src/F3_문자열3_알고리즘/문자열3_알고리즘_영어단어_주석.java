package F3_���ڿ�3_�˰���;

import java.util.Random;
import java.util.Scanner;

public class ���ڿ�3_�˰���_����ܾ�_�ּ� {
	public static void main(String[] args) {
		// ����) ����ܾ� ���߱�
		// ����ܾ ���� * �� ǥ�õȴ�.
		// ����ܾ �Է¹ް� Ʋ�������� �������� �ѱ��ھ� ��������. (������ 5���� ����)
		// (����) ���࿡ ���� ö�ڰ� �������� �ѹ��� ��������.
		// ���� �������ų� ���߸� ����
		Random ran = new Random();
		Scanner scan = new Scanner(System.in);
		int score = 100;
		String word = "performance";
		String meaning = "����";
		
		//word�� ���� ����
		int size = word.length();
		//�� �ε������� �̹� ���� ������ �� �� �ִ� üũ ����
		int check[] = new int[size]; // ��Ʈ üũ�� ���ؼ� Ȯ���Ҽ��ִ�.
		//������ 
		int num = ran.nextInt(size);
		int count = 0;
		boolean win = false;
		
		//���ѹݺ���
		while (true) {
			System.out.println("=====================================");
			System.out.println("�� : " + meaning);
			System.out.print("���� : ");
			//����. count != 0 �̶��(ù ������ �ƴ϶��)
			if(count != 0) {
				//win = false; 
				win = false;
				//�ݺ���. �ܾ��� ���̸�ŭ 
				for(int i = 0; i < word.length(); i++) {
					//���� �ε����� ���� ������
					if(word.charAt(num) == word.charAt(i)) {
						//check[�ε���] = 1�� ��
						check[i] = 1;
					}
					//����. check[�ε���]�� 1�� �ƴ϶��(== ���� ��Ʈ�� ���� �� ���Դٸ�)
					if(check[i] != 1) {
						//win = true�� ��
						win = true;
					}
				}
			}
			//�׿�, win == true; (ù ��°�� ������ win = true, �ѹ��� ��Ʈ�� �� ���� �����ϱ�)
			else {
				win = true;
			}
			//�ݺ���. 0���� size ����
			for (int i = 0; i < size; i++) {
				//����. check[�ε���]�� 1�̸�
				if(check[i] == 1) {
					//���� ���
					System.out.print(word.charAt(i));
				}
				//�ƴ϶�� * ���
				else {
					System.out.print("*");
				}
			}
			//win == false��(��Ʈ�� ���� ����), ���� �� break;
			if(win == false) {
				System.out.println("\n����");
				break;
			}
			//���ܾ� �Է� �ޱ�
			System.out.println();
			System.out.println("����ܾ �Է��ϼ��� >>> ");
			String me = scan.next();
			//����. �����̸� ����! �ϰ� break;
		    if(word.equals(me)) {
		    	System.out.println("����!");
		    	break;
		    }
		    //�׿�(�����̸�)
		    else {
		    	//���ѹݺ���
			    while(true) {
				    //������ ����
			    	num = ran.nextInt(size);
				    //����. check[num] != 1(1�̸� �̹� ��Ʈ�� ������ ���̶�� ��)�̸�, break;
			    	if(check[num] != 1) {
				    	break;
				    }
			    }
			    //���� --> score -= 5;
			    score -= 5;
			    count++;
			    System.out.println("Ʋ��, ����: " + score + "��\n����: " + num);
		    }
		}
	}
}
