package F2_���ڿ�2_������Ʈ;

import java.util.Arrays;
import java.util.Scanner;

public class ���ڿ�2_������Ʈ_�ܾ�˻�_���� {
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
		
		int count = 0;
		int index = 0;
		int tindex = 0;
		
		for(int i = 0; i < text.length; i++) {
			tindex = 0;
			boolean check = false;
			while(true) {
				index = 0;
				count = 0;
				for(int j = tindex; j < tindex + word.length(); j++) {
					//System.out.println("����~: " + text[i].charAt(j) +" " +  tindex + " " + (j+word.length()));
					if(text[i].charAt(j) == word.charAt(index)){
						count++;
						if(count == word.length()) {
						//	System.out.println("����: " + text[i].charAt(j));
							check = true;
							break;
						}
					}else {
						count = 0;
					}
					index++;
				}
				tindex++;
				if(check == true) {
					System.out.println(text[i]);
					break;
				}
				if(tindex > text[i].length() - word.length()) {
					break;
				}
			}
		}
		
		
		
	}
}
