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
			if (sel == 0) {
				break;
			} else if (sel == 1) {
				if(size == max) {
					System.out.println("[ȸ������ �Ұ�]");
					continue;
				}
				System.out.print("[ȸ������] ���̵�: ");
				String id = scan.next();
				System.out.print("[ȸ������] ��й�ȣ: ");
				scan.nextLine();
				String pw = scan.nextLine();
				System.out.print("[ȸ������] �̸�:  ");
				String name = scan.next();
				System.out.print("[ȸ������] ����: ");
				String age = scan.next();
				
				check = false;
				for(int i = 0; i < size; i++) {
					if(dataList[i][1].equals(id)) {
						check = true;
						break;
					}
				}
				if(check == true) {
					System.out.println("[�ߺ� ���̵�]");
					continue;
				}
				int num = size + 1000;
				
				dataList[size][0] = num +"";
				dataList[size][1] = id;
				dataList[size][2] = pw;
				dataList[size][3] = name;
				dataList[size][4] = age;
				size++;
				
			}else if(sel == 2) {
				if(size == 0) {
					System.out.println("[Ż�� �Ұ���]");
					continue;
				}
				System.out.print("[Ż��] ���̵�: ");
				String id = scan.next();
				System.out.print("[Ż��] ��й�ȣ: ");
				scan.nextLine();
				String pw = scan.nextLine();
				int index = -1;
				check = false;
				for(int i = 0; i < size; i++) {
					if(dataList[i][1].equals(id) && dataList[i][2].equals(pw)) {
						index = i;
						check = true;
						break;
					}
				}
				if(check == true) {
					for(int i = index; i < size-1; i++) {
						for(int j = 0; j < dataList[0].length; j++) {
							dataList[i][j] = dataList[i+1][j];
						}
					}
					size-=1;
					System.out.println("[Ż�� �Ϸ�]");
				}
			}else if(sel == 3) {
				if(size == 0) {
					System.out.println("[���� �Ұ���]");
					continue;
				}
				System.out.print("[����] ���̵�: ");
				String id = scan.next();
				scan.nextLine();
				System.out.print("[����] ��й�ȣ: ");
				String pw = scan.nextLine();
				int index = -1;
				check = false;
				for(int i = 0; i < size; i++) {
					if(dataList[i][1].equals(id) && dataList[i][2].equals(pw)) {
						index = i;
						check = true;
						break;
					}
				}
				if(check == false) {
					System.out.println("���̵�� ��й�ȣ�� Ȯ���ϼ���");
					continue;
				}
				System.out.println("[����] ��й�ȣ: " + dataList[index][2]);
				System.out.print("[����] ��й�ȣ: ");
				String newPw = scan.nextLine();
				System.out.println("[����] �̸�: " + dataList[index][3]);
				System.out.print("[����] �̸�: ");
				String newName = scan.next();
				System.out.println("[����] ����: " + dataList[index][4]);
				System.out.print("[����] ����: ");
				String newAge = scan.next();
				
				dataList[index][2] = newPw;
				dataList[index][3] = newName;
				dataList[index][4] = newAge;
				
			}else if(sel == 4) {
				System.out.println("[�˻�] ���̵� �̸����� �˻��ϼ���. ");
				System.out.print("Ű����: ");
				String search = scan.next();
				check = false;
				int index = -1;
				for(int i = 0; i < size; i++) {
					if(dataList[i][1].equals(search) || dataList[i][3].equals(search)) {
						check = true;
						index = i;
						break;
					}
				}
				if(check == false) {
					System.out.println("[�˻� ��� �����ϴ�.]");
					continue;
				}
				System.out.println(Arrays.toString(dataList[index]));
				
			}else if (sel == 5) {
				for (int i = 0; i < size; i++) {
					for (int j = 0; j < dataList[i].length; j++) {
						System.out.print(dataList[i][j]+ " ");
					}
					System.out.println();
				}
			}
		}
	}
}
