package F2_���ڿ�2_������Ʈ;

import java.util.Scanner;

public class ���ڿ�2_������Ʈ_���ڰ˻�_�ּ� {
	/*
	 * # ���ڿ� �� ���ڰ˻�
	 * ��) adklajsiod
	 * 	     ���ڸ� �ִ�.
	 * ��) 123123
	 *    ���ڸ� �ִ�.
	 * ��) dasd12312asd
	 *    ���ڿ� ���ڰ� �����ִ�.
	 */

	public static void main(String[] args) {

		String number = "123456789";
		Scanner scan = new Scanner(System.in);
		System.out.print("�Է� : ");
		String text = scan.next();
		int charcheck = 0; // 1-> ��������(���ڸ� �ִ�, �ƴ� ���ڵ� ������)
		int allnum = 0; // 1 -> ��������(���ڸ� �ִ�, �ƴ� ���ڵ� ������)
		int count = 0;
		boolean check = false; // ���ڰ� �ϳ��� ������ true�� üũ���� ����
		
		//�ݺ���, �Է°���ŭ ���ƿ�
		for(int i = 0; i < text.length(); i++) {
			//�ݺ���, �ѹ���ŭ ���ƿ� 
			for(int j = 0; j < number.length(); j++) {
				//����. �Է°� == �����ϰ� ������,
				if(text.charAt(i) == number.charAt(j)) {
					//count++, check = true, charcheck = 1;(���ڰ� �ϳ��� ����)
					count++;
					check = true;
					charcheck = 1;
				}
			}
		}
		//����. ���� �˻��� �� �߿� ���ڰ� �ְ�, �� ������ ��ü ���̿� ���� �ʴٸ�(==���ڰ� ��������)
		if(check == true && count != text.length()) { 
			//allnum = 1; ��
			allnum = 1;
		}
		if(allnum == 0 && check == true) {
			System.out.println("���ڸ� �ִ�");
		}else if(charcheck == 0) {
			System.out.println("���ڸ� �ִ�.");
		}else {
			System.out.println("���� ���� �Ѵ� �ִ�.");
		}
	}
}
