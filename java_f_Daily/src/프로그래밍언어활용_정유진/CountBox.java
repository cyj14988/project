package ���α׷��־��Ȱ��_������;

import java.util.Scanner;

public class CountBox {
	public static void main(String[] args) {
		
		/*
		 ����� ���� �ٱ����� ������ ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
		 ����� ������ 123�̰�, �ϳ��� �ٱ��Ͽ� 10���� ����� ���� �� �ִٸ�, 
		 13���� �ٱ��ϰ� �ʿ��� ���̴�.	
		 */
			
		 Scanner scan = new Scanner(System.in);
		 int limit = 10;
		 int basket = 0;
		 
		 System.out.print("���: ");
		 int apple = scan.nextInt();
		 
		 basket = apple / limit;
		 if(apple % limit != 0) {
			 basket += 1;
		 }
		 
		 System.out.println("�ʿ��� �ٱ���: " + basket +"��");
		 
	}
}
