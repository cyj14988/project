package F1_���ڿ�1_������Ʈ;

import java.util.Scanner;

public class ���ڿ�1_������Ʈ_��ҹ���_������ {
	/*
		���̵�� ��й�ȣ �Է¹ް� �α������ 		
		����) ��, ���̵�� ��й�ȣ�� 
		1) �빮�ڷ� �Է��ϴ� , 
		2) �ҹ��ڷ� �Է��ϴ� , 
		3) ��� �Է��ϴ� ���� �νĵǾ���Ѵ�.		
	 */
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		String dbid = "q1w2e3r4";
		String dbpw = "r4e3w2q1";
		
		String ��Ʈ1 = "abcdefghijklmnopqrstuvwxyz";
		String ��Ʈ2 = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		
		System.out.print("[�α���] ���̵�: ");
		String id = scan.nextLine();
		id = id.trim();
		
		
		boolean check = true;
		int state = 0;
		if(id.length() != dbid.length()) {
			check = false;
			state = 1;
		}else {
			for(int i = 0; i < dbid.length(); i++) {
				if(dbid.charAt(i) != id.charAt(i)) {
					check = false;
					int index = -1;
					for(int j = 0; j < ��Ʈ1.length(); j++) {
						if(dbid.charAt(i) == ��Ʈ1.charAt(j)) { 
							index = j;
						}else if(dbid.charAt(i) == ��Ʈ2.charAt(j)) {
							index = j;
						}
					}
					if(index != -1) {
						if(id.charAt(i) == ��Ʈ1.charAt(index) || id.charAt(i) == ��Ʈ2.charAt(index)) {
							check = true;
						}
					}	
				}
				if(check == false) {
					state = 1;
				}
			}
		}
		System.out.println("state: " + state);
		System.out.print("[�α���] ��й�ȣ: ");
		String pw = scan.nextLine();
		
		int statepw = 0;
		check = true;
		if(pw.length() != dbpw.length()) {
			check = false;
			statepw = 1;
		}else {
			for(int i = 0; i < dbpw.length(); i++) {
				if(dbpw.charAt(i) != pw.charAt(i)) {
					check = false;
					int index = -1;
					for(int j = 0; j < ��Ʈ1.length(); j++) {
						if(dbpw.charAt(i) == ��Ʈ1.charAt(j)) { 
							index = j;
						}else if(dbpw.charAt(i) == ��Ʈ2.charAt(j)) {
							index = j;
						}
					}
					if(index != -1) {
						if(pw.charAt(i) == ��Ʈ1.charAt(index) || pw.charAt(i) == ��Ʈ2.charAt(index)) {
							check = true;
						}
					}
				}
				if(check == false) {
					statepw = 1;
				}
			}
		}
		System.out.println("statepw: " + statepw);
		if(state == 1 || statepw == 1) {
			System.out.println("�α��� ����");
		}else {
			System.out.println("�α��� ����");
		}
		
		
		
		
	}
}
