package F1_���ڿ�1_������Ʈ;

import java.util.Random;
import java.util.Scanner;

public class ���ڿ�1_������Ʈ_Ÿ�ڿ���_�ּ� {
	
	/*
	 * # Ÿ�ڿ��� ����[1�ܰ�]
	 * 1. ������ ���´�.(shuffle)
	 * 2. ������� ������ �����ϰ�, ������ �� ���߸� ���� ����
	 * ��)
	 * ���� : mysql
	 * �Է� : mydb
	 * ���� : mysql
	 * �Է� : mysql	<--- ������ ���߸�, ���� ���� ����
	 * ���� : jsp
	 */

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		String[] words = {"java", "mysql", "jsp", "spring"};
		
		for(String str : words) {
			System.out.println(str);
		}//�̰� ���ذ� �� �ȴ�.. �� ���̸�ŭ�� ���ڴٴ°ǰ�???? �ϳ��� �ϳ��� �Էµ� �Ŀ� ���°ǰ�????
		
		System.out.println("=========================");
		
		//�ݺ���: ����~
		for(int i = 0; i < 10; i++) {
			int num1 = ran.nextInt(words.length);
			int num2 = ran.nextInt(words.length);
			
			String temp = words[num1];
			words[num1] = words[num2];
			words[num2] = temp;
 		}
		for(String str : words) {
			System.out.println(str);
		}
		//�ݺ���, word ��ŭ ���ƿ�~
		for(int i = 0; i < words.length; i++) {
			//���� ���
			System.out.println("����: " + words[i]);
			//���� �Է�
			System.out.print("�Է�: ");
			String me = scan.next();
			//����. �����̸�, ����~
			if(me.equals(words[i])) {
				System.out.println("����");
			}
			//�׿�. Ʋ���� i-- (�Ȱ��� ���� �� ���Ϳ�~)
			else {
				i--;
			}
		}
	}
}
