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
	}
}
