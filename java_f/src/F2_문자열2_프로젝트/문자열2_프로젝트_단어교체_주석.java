package F2_���ڿ�2_������Ʈ;

import java.util.Arrays;
import java.util.Scanner;

public class ���ڿ�2_������Ʈ_�ܾü_�ּ� {
	/*
	 * # �ܾ� ��ü�ϱ�(replace)
	 * 1. text���� ���� �ӿ��� �����ϰ� ���� �ܾ �Է¹޾�,
	 * 2. ��ü���ִ� ����� �����Ѵ�.
	 * ��)
	 * 		Life is too short.
	 * 		�����ϰ� ���� �ܾ��Է� : Life
	 * 		�ٲ� �ܾ��Է� : Time
	 * 
	 * 		Time is too short.
	 * 

	 */
	//1. ũ�Ⱑ �ٸ� �ܾ ��ȯ ����
	//2. ������ �������� ��� �ٲ���� ��


	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		String text = "Life is too short.";
		System.out.println(text);
		
		System.out.print("�����ϰ� ���� �ܾ �Է��ϼ��� : ");
		String word = scan.nextLine();
		System.out.print("�ٲ� �ܾ �Է��ϼ��� : ");
		String change = scan.nextLine();
		
		int gap = change.length() - word.length();
		
		//�ݺ���, 0���� (���� ���� - �ٲ� �ܾ� ����)���� ex)  mus'ic'  ��������(5)-�ٲܴܾ����(2) = 3���� --> 0123
		for(int i = 0; i <= text.length()-word.length(); i++) {
			//�ٲ�� ������ �ӽ÷� ������ �� String temp ���� ����
			String temp = "";
			//�ٲ� �ܾ �ִ��� Ȯ���� boolean check ����
			boolean check = false;
			//�ܾ ã�� ������ ������ �� count ����
			int count = 0;
			//�ٲ� �ܾ��� ��ġ�� ������ �ε��� 2�� ����
			int x = 0; //���� ��ġ ex) 3 -- i
			int y = 0; //�� ��ġ  ex) 4 -- c
			//�ݺ���, �ٲ� �ܾ� ���� ��ŭ
			for(int j = 0; j < word.length(); j++) {
				//���~
				System.out.println(i+1 + "��°: ����: " + text.charAt(i+j) + "��" + word.charAt(j));
				//���� ������ i(�ϳ��� Ŀ��) + j(�ϳ��� Ŀ����, �ٲ� �ܾ� ���̸�ŭ����) == �ٲܴܾ��� ���� ������, 
					//ex)  ù��° : [m -- i, u -- c] �� ��°: [u -- i, s -- c]
				if(text.charAt(i+j) == word.charAt(j)) {
					//count++;
					count++;
					//����. �ܾ ã�� Ƚ�� == �ٲ� �ܾ��� ���̰� ������, 
						//��) [i -- i, c -- c] 2��
					if(count == word.length()) {
						// x = i(���� �ε���) , y = i + j(�� �ε���), check = true �ְ� break;
						x = i;
						y = i+j;
						check = true;
						break;
					}
				}
			}
			//����. check == true��,
			if(check == true) {
				//���.
				System.out.println("ã�Ҵ�: " + x + " " + y);
				//�ݺ���. ���� �ε��� ������ ���� ���� �ӽ� temp�� �־���
				for(int j = 0; j < x; j++) {
					temp += text.charAt(j);
				}
				//�ݺ���. ������ �ܾ� �־���
				for(int j = 0; j < change.length(); j++) {
					temp += change.charAt(j);
				}
				//�ݺ���. �� �ε������� ���� ���������� �־���
					//** ���� ������ �ܾ ���� �ܾ��� ���̿� �ٸ���, ��������� text�� ���̴� ��� �ٲ��� ��
				for(int j = y+1; j < text.length(); j++) {
					temp += text.charAt(j);
				}
				//������ ���� ��� Ȯ��
				System.out.println("temp: " + temp);
				//text �ʱ�ȭ �� ,
				text ="";
				//temp�� ������ text�� �ٽ� �־��� 
					//���� ��Ȳ 1) ��������: too �ٲ� �ܾ�: o ������ �ܾ�: er 
						//o�� ã�� er�� �־��ָ� --> tero (���� ���� ���̰� �ٲ�)
							//���� ��Ȳ 2) �ܾ ��ġ�� ���� �ݺ� ���µ�...�� --> gap ��ŭ �����ָ� ��...
				for(int j = 0; j < temp.length(); j++) {
					text += temp.charAt(j);
				}
				System.out.println("text: " + text);
				//�ܾ� ���̰� ���� �ٸ� ���(�� �� ��츸), i += gap��ŭ ���ؼ� �˻����� ���ϵ��� ��
				if(gap > 0) {
					i += gap;
				}
			}
			System.out.println("===================================================================");
		}
		System.out.println(text);
	}
}
