package F1_���ڿ�1_������Ʈ;

import java.util.Scanner;

public class ���ڿ�1_������Ʈ_��ҹ���_���� {
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
		
		String db = "a1b2C";
		String id = "A1B2c";
		
		String db2 = "a1b2C";
		String pw = "A1B2c";
		
		System.out.println("A : " + (int)'A');
		System.out.println("Z : " + (int)'Z');
		System.out.println("a : " + (int)'a');
		System.out.println("z : " + (int)'z');

		//�Է°��� ���ذ��� ��ġ ���θ� ������ �� boolean ����
		boolean check = true;
		//��������ŭ �˻��ϴ� �ݺ���
		for(int i = 0; i < db.length(); i++) {
			//�˻��� �ε��� �� ���� (�Է°�, ���ذ� ���)
			char a = db.charAt(i);
			char b = id.charAt(i);			
			//����. �� ���� �ٸ���,(������ ���� �ٸ� ���� ���� or ��ҹ��� ������ ���� ����)
			if(a != b) {
				System.out.println(db.charAt(i) + " " + id.charAt(i));
				//���ذ��� int�� ��ȯ�Ͽ� ����
				int aa = (int)a;
				//����1. �� ���� 65 ~ 90 (�ҹ���) ���,
				if(aa >= 65 && aa <= 90) {
					//�빮�ڷ� ��ȯ����
					char bb = ��Ʈ1.charAt(aa-65);
					//����1-1. ���ذ��� �빮�ڷ� ��ȯ���� ��, �Է°��� ���ٸ�
					if(b != bb) {
						//check = false��
						check = false;
					}
					System.out.println(a + " " + b + " "+ bb);
				}
				//����2. �� ���� 97 ~ 122 (�빮��) ���, 
				else if(aa >= 97 && aa <= 122) {
					//���ذ��� �ҹ��ڷ� ��ȯ����
					char bb = ��Ʈ2.charAt(aa-97);
					//����2-1. ���ذ��� �ҹ��ڷ� ��ȯ���� ��, �Է°��� ���ٸ� 
					if(b != bb) {
						//check = false�� �� 
						check = false;
					}
					System.out.println(a + " " + b + " "+ bb);
				}
				//�׿ܶ��(���ڰ� �ƴ϶��), check = false;
				else {
					check = false;
				}
			}
		}
		System.out.println("���̵�: " + check);
		
		boolean check2 = true;		
		for(int i = 0; i < db2.length(); i++) {
			//�˻��� �ε��� �� ���� (�Է°�, ���ذ� ���)
			char a = db2.charAt(i);
			char b = pw.charAt(i);			
			//����. �� ���� �ٸ���,(������ ���� �ٸ� ���� ���� or ��ҹ��� ������ ���� ����)
			if(a != b) {
				System.out.println(db2.charAt(i) + " " + pw.charAt(i));
				//���ذ��� int�� ��ȯ�Ͽ� ����
				int aa = (int)a;
				//����1. �� ���� 65 ~ 90 (�ҹ���) ���,
				if(aa >= 65 && aa <= 90) {
					//�빮�ڷ� ��ȯ����
					char bb = ��Ʈ1.charAt(aa-65);
					//����1-1. ���ذ��� �빮�ڷ� ��ȯ���� ��, �Է°��� ���ٸ�
					if(b != bb) {
						//check = false��
						check2 = false;
					}
					System.out.println(a + " " + b + " "+ bb);
				}
				//����2. �� ���� 97 ~ 122 (�빮��) ���, 
				else if(aa >= 97 && aa <= 122) {
					//���ذ��� �ҹ��ڷ� ��ȯ����
					char bb = ��Ʈ2.charAt(aa-97);
					//����2-1. ���ذ��� �ҹ��ڷ� ��ȯ���� ��, �Է°��� ���ٸ� 
					if(b != bb) {
						//check2 = false�� �� 
						check2 = false;
					}
					System.out.println(a + " " + b + " "+ bb);
				}
				//�׿ܶ��(���ڰ� �ƴ϶��), check = false;
				else {
					check2 = false;
				}
			}
		}
		System.out.println("��й�ȣ: " + check2);
		
		if(check == true && check2 == true) {
			System.out.println("[�α��� ����]");
		}
	}
}
