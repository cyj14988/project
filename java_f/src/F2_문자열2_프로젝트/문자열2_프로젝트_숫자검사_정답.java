package F2_���ڿ�2_������Ʈ;

import java.util.Scanner;

public class ���ڿ�2_������Ʈ_���ڰ˻�_���� {
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
		int numcheck = 0;
		int allnum = 0;
		int count = 0;
		boolean check = false;
		
		for(int i = 0; i < text.length(); i++) {
			check = false;
			for(int j = 0; j < number.length(); j++) {
				if(text.charAt(i) == number.charAt(j)) {
					check = true;
					break;
				}
			}
			if(check == true) { //���� �˻��� ���� ���ڴ�.
				count++; //��� ���ڴ�.
				numcheck = 1;//���ڰ� �ѹ��̶� ���Դ�.
			}
		}
		if(count == text.length()) {
			allnum = 1; //��� ���ڴ�. 
		}
		
		if(numcheck == 1) {
			if(allnum == 1) {
				System.out.println("���ڸ� �ִ�");
			}else {
				System.out.println("���ڿ� ���ڰ� ���� �ִ�.");
			}
		}else {
			System.out.println("���ڸ� �ִ�.");
		}
	}
}
