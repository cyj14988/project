package F1_���ڿ�1_�˰���;

import java.util.Scanner;

public class ���ڿ�1_�˰���_�����ձ�_���� {
	public static void main(String[] args) {
		/*
		 * # �����ձ� ������ ��������.
		 * 
		 * ���þ� : ������
		 * �Է� : �Ź�
		 * ���þ� : �Ź�
		 * �Է� : �̼�
		 * ...
		 */
		
		Scanner scan = new Scanner(System.in);
		
		String start = "������";
		System.out.println("���þ� : " + start);
		char check = start.charAt(start.length()-1);
		
		while(true) {
			System.out.print("�Է�: ");
			start = scan.next();
			char ncheck = start.charAt(0);
			if(start.equals("�׸�")) {
				break;
			}
			if(ncheck != check) {
				System.out.println("�ٽ�~");
				continue;
			}
			System.out.println("���þ�: " + start);
			check = start.charAt(start.length()-1);
		}
		
	//������Ģ�� ��� ��������...�� ���� �� ���ھ��� ��� �ɰ���...	
	}
}
