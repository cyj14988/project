package F2_���ڿ�2_������Ʈ;

import java.util.Arrays;
import java.util.Scanner;

public class ���ڿ�2_������Ʈ_�ܾ�˻�_�ּ� {
	/*
	 * # �ܾ� �˻�
	 * 1. �ܾ �Է¹޾� text���� ���� �ӿ� �ش� �ܾ �ִ��� �˻��Ѵ�.
	 * 2. �ܾ �����ϸ� ��������Ѵ�.
	 * 3. �κа˻��� �Ǿ���Ѵ�. 
	 * 	��) ch ==> school , teacher , child
	 */
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		String[] text = {"school" , "teacher" , "child" ,"father" , "love"};
		System.out.println(Arrays.toString(text));
		
		System.out.print("�˻��� �ܾ �Է��ϼ��� : ");
		String word = scan.nextLine();
		
		//�˻� �ܾ� ã�� ������ ������ ���� count ����
		int count = 0;
		
		//�ݺ���, text.length ��ŭ ������ (5)
		for(int i = 0; i < text.length; i++) {
			System.out.println("==================================");
			//���� �ܾ ã���� üũ�� �� check ����
			boolean check = false;
			//�ݺ���, (���� �˻��� �ܾ��� ���� - ã�� �ܾ�)����   
			for(int j = 0; j <= text[i].length() - word.length(); j++) {
				//count �ʱ�ȭ(�ѹ� �˻��� ������ count �ʱ�ȭ)
				count = 0;
				//�ݺ���, ã�� �ܾŭ
				for(int r = 0; r < word.length(); r++) {
					System.out.println(i+1 + "��° �ܾ� ã��: " + text[i].charAt(j+r) + " " + word.charAt(r));
					//����. �� �ܾ��� ���� ���� �˻� �ܾ��� �� ���� ������, 
					if(text[i].charAt(j+r) == word.charAt(r)) {
						//count++;
						count++;
						//count == �˻� �ܾ��� ���̿� ������,
						if(count == word.length()) {
							//check = true �ְ�, break;(�˻��� �ܾ ���� �� �ִٴ� �͸� �˸� ��������)
							check = true;
							break;
						}
					}
				}
				System.out.println("----------------------------");
				if(check == true) {
					break;
				}
			}
			//����. check == true ��, ����ϼ���~	
			if(check == true) {
				System.out.println(text[i]);
			}
		}
}
}
