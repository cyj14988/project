package F3_���ڿ�3_������Ʈ;

import java.util.Arrays;
import java.util.Scanner;

public class ���ڿ�3_������Ʈ_�л�����_���� {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int max = 100;
		String[][] dataList = new String[max][5];
		boolean check = false;
			
		String sample[][] = { 
				{ "1001", "qwer", "1234", "��ö��", "10" }, 
				{ "1002", "asdf", "2345", "�̿���", "30" }, };

		// ������ �迭�� �̿��ؼ� crud ����
		int size = 0;
		for (int i = 0; i < sample.length; i++) {
			for (int j = 0; j < sample[i].length; j++) {
				dataList[i][j] = sample[i][j];
			}
			size += 1;
		}

		while (true) {
			System.out.println(" [0]���� [1]���� [2]Ż�� [3]���� [4]�˻� [5] ��ü���");
			int sel = scan.nextInt();
		}
	}
}
