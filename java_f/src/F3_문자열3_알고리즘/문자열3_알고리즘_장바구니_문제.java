package F3_���ڿ�3_�˰���;
import java.util.Scanner;
public class ���ڿ�3_�˰���_��ٱ���_���� {
	/*
	 *  # ���θ� [��ٱ���]
	 * 1. �α��� �� ���� �޴��� �����ϸ�, ������ ���� ��ǰ����� �����ش�.
	 * 	 (1) ��� (2) �ٳ��� (3) ���� 
	 * 2. ��ȣ�� ������ ��ǰ�� ��ٱ��Ͽ� ���� �� �ִ�.
	 * 3. �α��� ȸ�����̵� �� �� ���� ù��° ���� �����Ѵ�.
	 * 4. �ش� ȸ���� ������ ��ǰ��  �� ���� �ι�° ���� �����Ѵ�.
	 * ��)
	 * {
	 * 		{qwer, ���},				
	 * 		{javaking, �ٳ���},				
	 * 		{abcd, ���},				
	 * 		{qwer, ����},		
	 * 		{qwer, ���},			
	 * 		...
	 * }
	 * 5. ��ٱ��� �޴��� �����ϸ� �ڱⰡ �� ��ǰ�� ���̵����Ѵ�.
	 * ��)  qwer ==> ��� , ���� , ���
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] idList = {"qwer", "javaking", "abcd"};
		String[] pwList = {"1111", "2222", "3333"};
		
		int MAX_SIZE = 100;
		String[][] cartList = new String[MAX_SIZE][2];
		boolean check = false;
		
		int count = 0;
		
		String[] items = {"���", "�ٳ���", "����"};
		
		int log = -1;
		
		while(true) {
			
			System.out.println("\n[MEGA MART]");
			System.out.println("[1]�� �� ��");
			System.out.println("[2]�α׾ƿ�");
			System.out.println("[3]��     ��");
			System.out.println("[4]��ٱ���");
			System.out.println("[0]��     ��");
			
			System.out.print("�޴� ���� : ");
			int sel = scan.nextInt();
			if(sel == 1) {
				if(log != -1) {
					System.out.println("[�α׾ƿ��� ���� ���ּ���]");
					continue;
				}
				System.out.print("[�α���] ���̵�: ");
				scan.nextLine();
				String id = scan.nextLine();
				System.out.print("\n[�α���] ��й�ȣ: ");
				String pw = scan.next();
				check = false;
				int idindex  = -1;
				for(int i = 0; i < idList.length; i++) {
					if(id.equals(idList[i]) && pw.equals(pwList[i])) {
							check = true;
							idindex = i;
							break;
					}
				}
				if(check == false) {
					System.out.println("[�α��� ����]");
					continue;
				}
				log = idindex;
				System.out.println(idList[log] + "�� �ȳ��ϼ���!");
			}
			else if(sel == 2) {
				if(log == -1) {
					System.out.println("[�α����� ���� ���ּ���]");
					continue;
				}
				System.out.println(idList[log] + "�� �α׾ƿ� �Ϸ�!");
				log = -1;
			}
			else if(sel == 3) {
				if(log == -1) {
					System.out.println("[�α��� �� �̿� �����մϴ�.]");
					continue;
				}
				System.out.println("=====MEGA MART=====");
				for(int i = 0; i < items.length; i++) {
					System.out.print("[" + (i+1) +"��] " + items[i] + " ");
				}
				System.out.print("\n[��ٱ���] ��ȣ: ");
				int me = scan.nextInt();
				if(me < 1 || me > items.length) {
					System.out.println("��ȣ ����");
					continue;
				}
				cartList[count][0] = idList[log];
				cartList[count][1] = items[me-1];
				count++;
				System.out.println("[��ٱ��� �߰� �Ϸ�]");
			}
			else if(sel == 4) {
				if(log == -1) {
					System.out.println("[�α��� �� �̿밡���մϴ�.]");
					continue;
				}
				System.out.println("===" + idList[log] + "���� ��ٱ��� ���===");
				for(int i = 0; i < count; i++) {
					if(cartList[i][0].equals(idList[log])) {
						System.out.print(cartList[i][1] + " ");
					}
				}
				System.out.println();
				System.out.println("============================");
			}
			else if(sel == 0) {
				System.out.println("���α׷� ����");
				break;
			}		
		}
	}
}