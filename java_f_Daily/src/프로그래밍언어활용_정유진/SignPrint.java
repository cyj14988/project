package ���α׷��־��Ȱ��_������;

import java.util.Scanner;

public class SignPrint {
	public static void main(String[] args) {
		
		/*
		 ���� num�� ���� ���� '���', '����', '0'�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
		 ���� �����ڸ� �̿��Ͻÿ�. 
		 */
		
		
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		
		if(num < 0) {
			System.out.println("����");
		}else if(num > 0) {
			System.out.println("���");
		}else {
			System.out.println("0");
		}
		
	}
}
