package F2_���ڿ�2_������Ʈ;

import java.util.Arrays;
import java.util.Scanner;

public class ���ڿ�2_������Ʈ_�ܾü_���� {
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
		
		
		for(int i = 0; i <= text.length()-word.length(); i++) {
			String temp = "";
			boolean check = false;
			int count = 0;
			int x = 0;
			int y = 0;
			for(int j = 0; j < word.length(); j++) {
				System.out.println("����: " + text.charAt(i+j) + "��" + word.charAt(j));
				if(text.charAt(i+j) == word.charAt(j)) {
					count++;
					if(count == word.length()) {
						x = i;
						y = i+j;
						check = true;
						break;
					}
				}
			}
			if(check == true) {
				System.out.println("ã�Ҵ�: " + x + " " + y);
				for(int j = 0; j < x; j++) {
					temp += text.charAt(j);
				}
				for(int j = 0; j < change.length(); j++) {
					temp += change.charAt(j);
				}
				for(int j = y+1; j < text.length(); j++) {
					temp += text.charAt(j);
				}
				System.out.println("temp: " + temp);
				text ="";
				for(int j = 0; j < temp.length(); j++) {
					text += temp.charAt(j);
				}
				System.out.println("text: " + text);
			}
		}
		System.out.println(text);
	}
}
