package F3_���ڿ�3_������Ʈ;

import java.util.Arrays;
import java.util.Scanner;

public class ���ڿ�3_������Ʈ_��ٱ��ϰ˻�_���� {
	public static void main(String[] args) {
		String itemData = "1001/����,1002/�����,1003/ĭ��";
		String userData = "3001/�̸���,3002/��ö��,3003/�̿���";
		
		String cartData = "";
		cartData += "3001/1001\n";
		cartData += "3001/1001\n";
		cartData += "3003/1002\n";
		cartData += "3001/1001\n";
		cartData += "3001/1003\n";
		cartData += "3003/1002\n";
		cartData += "3003/1001\n";
		cartData += "3002/1001";
		
		//����1) ȸ���� ������ ���Ÿ�� ��� 
		//��) �̸���==> ����3,ĭ��1 / ��ö�� ==> ����1 / �̿��� ==> ����2,�����1
		
		Scanner scan = new Scanner(System.in);
		
		String[] item = itemData.split(","); // item[0] => 1001/����;
		String[] user = userData.split(","); // user[0] => 3001/�̸���;
		String[] cart = cartData.split("\n"); // cart[0] => 3001/1001;
		
		System.out.print("[�˻�] �̸�: ");
		String me = scan.nextLine();
		String userNum = "";
		String[][] soldList = new String[item.length][2];
		String[][] itemList = new String[item.length][2];
		
		
		for(int i = 0; i < soldList.length; i++) {
			String[] item2 = item[i].split("/");
			soldList[i][0] = item2[1];		
		//	System.out.println(soldList[i][0]);
		}
		
		boolean check = false;
		System.out.print("���� ���: \n");
		for(int i = 0; i < user.length; i++) {
			String[] user2 = user[i].split("/");
			if(user2[1].equals(me)) {
				userNum = user2[0]; // ���� �Է��� �̸��� ȸ����ȣ ã��
				check = true;
				break;
			}
		}
		for(int j = 0; j < cart.length; j++) {
			String[] cart2 = cart[j].split("/");
			if(cart2[0].equals(userNum)) { // ȸ����ȣ�� ������,
				
				for(int d = 0; d < item.length; d++) {
					String[] item2 = item[d].split("/"); //ȸ����ȣ�� ���� ��ǰ��ȣ�� �̸��� ã�´�.
					if(cart2[1].equals(item2[0])) {//��ǰ��ȣ�� ������,
							
						for(int r = 0; r < soldList.length; r++) { //���� ���� �迭�� ���� ���ϴ� �ݺ���
							System.out.println(soldList[r][0] +" " + item2[1]);
							if(soldList[r][0].equals(item2[1])) { //�ش� ��ǰ��ȣ�� �̸��� �� ��ٱ��� �迭�� �̸��� ������
								if(soldList[r][1] == null) {//�ѹ��� ���� ���� ������
									soldList[r][1] = 1 +""; // 1 �־��ֱ�
								}else {
									int num = Integer.parseInt(soldList[r][1]);
									num += 1;
									soldList[r][1] = num +"";
								}
							}
						}
					}
				}
			}
		}
		if(check == false) {
			System.out.println("[�ش� ȸ�������� �����ϴ�.]");
		}else {
			for(int i = 0; i < soldList.length; i++) {
					System.out.print(soldList[i][0] + ": ");
					if(soldList[i][1] == null) {
						System.out.println("����X");
					}else {
						System.out.print(soldList[i][1] +"��\n");
					}
			}
			
		}
		//����2) �����ۺ��� ������ ȸ���̸� ��� 
		//��) ����==> �̸���,��ö��,�̿��� / �����==> �̿��� / ĭ��==> �̸���
		
	/*	String itemData = "1001/����,1002/�����,1003/ĭ��";
		String userData = "3001/�̸���,3002/��ö��,3003/�̿���";
		
		String cartData = "";
		cartData += "3001/1001\n";
		cartData += "3001/1001\n";
		cartData += "3003/1002\n";
		cartData += "3001/1001\n";
		cartData += "3001/1003\n";
		cartData += "3003/1002\n";
		cartData += "3003/1001\n";
		cartData += "3002/1001";
	*/	
		System.out.println("====================================");
		String itemNum = "";
		String str = "";
		for(int i = 0; i < item.length; i++) {
			String[] item2 = item[i].split("/");
			itemList[i][0] = item2[1];
			itemList[i][1] = "";
		}
		
		for(int i = 0; i < itemList.length; i++) {
			str = "";
			String[] item2 = item[i].split("/");
			if(item2[1].equals(itemList[i][0])) {//�����۸���Ʈ(��ǰ �̸�)�� ���� ��ǰ������ ��ǰ�̸��� ���ٸ�,
				itemNum = item2[0]; // �ش� ��ǰ �̸��� ��ȣ�� ����
			}
			
			for(int j = 0; j < cart.length; j++) {
				String[] cart2 = cart[j].split("/");
				if(cart2[1].equals(itemNum)) { // īƮ�� ��ǰ��ȣ�� �� ��ǰ��ȣ�� ���ٸ�,
					
					for(int d = 0; d < user.length; d++) {
						String[] user2 = user[d].split("/"); 
						if(cart2[0].equals(user2[0])) {// �ش� īƮ�� ������ȣ�� �����迭�� ���� ��ȣ�� ���ٸ�,
							check = false;
							if(user2[1].equals(str)) {
								
							}else {
								itemList[i][1] += user2[1];
								str = user2[1];
							}
						}
					}
				}
			}
		}
		
		for(int i = 0; i < itemList.length; i++) {
			System.out.println(Arrays.toString(itemList[i]));
		}
		
		
		
		
		
	}
}
