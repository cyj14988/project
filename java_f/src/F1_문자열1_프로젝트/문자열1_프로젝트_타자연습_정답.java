package F1_���ڿ�1_������Ʈ;

import java.util.Random;
import java.util.Scanner;

public class ���ڿ�1_������Ʈ_Ÿ�ڿ���_���� {
	
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
		}
		
		System.out.println("=========================");
		
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
		
		for(int i = 0; i < words.length; i++) {
			
			while(true) {
				System.out.println("����: " + words[i]);
				System.out.print("�Է�: ");
				String me = scan.next();
				if(me.equals(words[i])) {
					System.out.println("����");
					break;
				}
			}
		}
		
	}
}
