package F3_���ڿ�3_�˰���;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ���ڿ�3_�˰���_����Ÿ��_���� {
	
	/*
	 * # Ÿ�ڿ��� ����[2�ܰ�]
	 * 1. ������ ���´�.(shuffle)
	 * 2. ������� ������ �����ϰ�, ������ �� ���߸� ���� ����
	 * 3. �� ������ ������ ��, �ܾ��� ������ ��ġ �� ���� *�� ���
	 * ��)
	 * ���� : mys*l
	 * �Է� : mysql	<--- ������ ���߸�, ���� ���� ����
	 * ���� : *sp
	 * �Է� : jsp
	 * ...
	 */

	public static void main(String[] args) {

		String[] words = {"java", "mysql", "jsp", "spring"};
		
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		
		for(int i = 0; i < 50; i++) {
			int num1 = ran.nextInt(words.length);
			int num2 = ran.nextInt(words.length);
			
			String temp = words[num1];
			words[num1] = words[num2];
			words[num2] = temp;
			
		}
		System.out.println(Arrays.toString(words));
		
		for(int i = 0; i < words.length; ) {
			int num = ran.nextInt(words[i].length());
			for(int j = 0; j < words[i].length(); j++) {
				if(num == j) {
					System.out.print("*");
				}else{
					System.out.print(words[i].charAt(j));
				}
			}
			
			System.out.print("\n�Է�: ");
			String me = scan.nextLine();
			
			if(words[i].equals(me)) {
				System.out.println("����");
				i++;
			}else {
				System.out.println("��");
			}
		}
	}
}