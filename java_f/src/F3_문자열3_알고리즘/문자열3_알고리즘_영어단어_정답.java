package F3_���ڿ�3_�˰���;

import java.util.Random;
import java.util.Scanner;

public class ���ڿ�3_�˰���_����ܾ�_���� {
	public static void main(String[] args) {
		// ����) ����ܾ� ���߱�
		// ����ܾ ���� * �� ǥ�õȴ�.
		// ����ܾ �Է¹ް� Ʋ�������� �������� �ѱ��ھ� ��������. (������ 5���� ����)
		// (����) ���࿡ ���� ö�ڰ� �������� �ѹ��� ��������.
		// ���� �������ų� ���߸� ����
		Random ran = new Random();
		Scanner scan = new Scanner(System.in);
		int score = 100;
		String word = "performance";
		String meaning = "����";
		int size = word.length();
		int check[] = new int[size]; // ��Ʈ üũ�� ���ؼ� Ȯ���Ҽ��ִ�.
		int num = ran.nextInt(size);
		int count = 0;  
		boolean win = false;
		while (true) {
			System.out.println("�� : " + meaning);
			System.out.print("���� : ");
			if(count != 0) {
				win = false;
				for(int i = 0; i < word.length(); i++) {
					if(word.charAt(num) == word.charAt(i)) {
						check[i] = 1;
					}
					if(check[i] != 1) {
						win = true;
					}
				}
			}else {
				win = true;
			}
			for (int i = 0; i < size; i++) {
				if(check[i] == 1) {
					System.out.print(word.charAt(i));
				}else {
					System.out.print("*");
				}
			}
			if(win == false) {
				System.out.println("\n����");
				break;
			}
			System.out.println();
			System.out.println("����ܾ �Է��ϼ��� >>> ");
			String me = scan.next();
		    scan.nextLine();
		    if(word.equals(me)) {
		    	System.out.println("����!");
		    	break;
		    }
		    
		    while(true) {
			    num = ran.nextInt(size);
			    if(check[num] != 1) {
			    	check[num] = 1;
			    	break;
			    }
		    }
		    System.out.println("Ʋ�� ����: " + num);
		    count++;
		}
	}
}
