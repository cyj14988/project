package F3_���ڿ�3_������Ʈ;

import java.util.Arrays;
import java.util.Scanner;

public class ���ڿ�3_������Ʈ_��ٱ��ϰ˻�_�ּ� {
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
		String search = scan.next();
		String[][] buy_item = {
				{"����", "0"},
				{"�����", "0"},
				{"ĭ��", "0"}
		};
		
		for(int i = 0; i < user.length; i++) {
			String[] userList = user[i].split("/");
			if(userList[1].equals(search)) {
				String idNum = userList[0];
				
				for(int j = 0; j < cart.length; j++) {
					String[] cartList = cart[j].split("/");
					if(idNum.equals(cartList[0])) { //(��������)���� ������ ���̵� ��ȣ�� īƮ�� ���̵� ��ȣ�� ������,
						String itemNum = cartList[1]; //īƮ�� �Ǹ� ��ǰ��ȣ�� �����ϰ�,
						
						for(int d = 0; d < item.length; d++) { //������ �迭�� �˻����� ��,
							String[] itemList = item[d].split("/"); 
							if(itemNum.equals(itemList[0])) { //īƮ�� ��ǰ��ȣ�� ������ �迭�� ��ǰ��ȣ�� ������,
								int num = Integer.parseInt(buy_item[d][1]); 
								num += 1;
								buy_item[d][1] = num +"";
							}
						}
					}
				}
			}
		}
		for(int i = 0; i < buy_item.length; i++) {
			System.out.println(buy_item[i][0] +": " + buy_item[i][1] +"��");
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
		
		String[][] buyItem = {
				{"����", ""},
				{"�����", ""},
				{"ĭ��", ""}
		};
		
		//�̷��� �����ϰ� Ǫ�°�...�³�...?
		for(int i = 0; i < item.length; i++) {
			String itemList[] = item[i].split("/"); // {1001, ����}
			int idindex = 0;
			String[] id = new String[3];
			for(int j = 0; j < cart.length; j++) {
				String cartList[] = cart[j].split("/"); // {3001, 1001}
				
				if(itemList[0].equals(cartList[1])) {
					
					for(int r = 0; r < user.length; r++) {
						String userList[] = user[r].split("/"); // {3001, �̸���}
						
						if(cartList[0].equals(userList[0])) {
							boolean duplicate = false;
							for(int d = 0; d < idindex; d++) {
								if(id[d].equals(userList[1])) {  // ������ �̹� ���� �̸��̸�
									duplicate = true;
									break;
								}
							}
							if(duplicate == false) { //�ѹ��� �� ���� �̸��̸�
								id[idindex] = userList[1]; //�߰�
								idindex++;
							}
						}
					}
				}
			}
			// ���� �̸��� buyItem �迭�� �־���
			for(int j = 0; j < idindex; j++) {
				buyItem[i][1] += id[j];
			}
		}
		for(int i = 0; i < buyItem.length; i++) {
			System.out.println(Arrays.toString(buyItem[i]));
		}
	}
}
