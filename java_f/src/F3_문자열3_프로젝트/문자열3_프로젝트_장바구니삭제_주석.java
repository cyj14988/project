package F3_���ڿ�3_������Ʈ;

import java.util.Arrays;

public class ���ڿ�3_������Ʈ_��ٱ��ϻ���_�ּ� {
	public static void main(String[] args) {
		
		String item = "ĭ��/�����/����/�ݶ�/���̴�";
		String id = "qwer/abcd/java";
		
		
		String cart = "";
		cart += "qwer/����\n";
		cart += "qwer/�����\n";
		cart += "abcd/�ݶ�\n";
		cart += "java/ĭ��\n";
		cart += "qwer/ĭ��\n";
		cart += "java/����\n";
		cart += "abcd/���̴�";
		
		 String input[][] = {
				 {"qwer" , "3"}, 
				 {"abcd" , "1"}};
		// cart�����ʹ� ���� ��ٱ��� ��Ȳ�̴�.
		// input�����ʹ� ������ ��û�ѵ������̴�.
		
		// qwer�� ���̵��̰�  3 �� ������ȣ�̴�.
		// qwer ���忡���� ���ξ������� 3���ۿ� ������ ĭ�ݸ� ��������� 3�� 
		// ���������� ���� ��ü �����Ϳ����� 5��° �������̴�. 
		
		// ���������� abcd �� �ݶ�� ���̴� �� �����߰� ,
		// �ݶ� ��������� 1���� �����Ѱ��̰� �����δ�3���������� �����Ǿ���Ѵ�.
		
		 int count = 0;
		 int index = -1;
		 
		 //�ݺ���, ��ǲ �迭�� �������� 
		 for(int i = 0; i < input.length; i++) {
			 String[] cart1 = cart.split("\n");
			 int cartlimit = cart1.length;
			 count = 0;
			 index = -1;
			 boolean check = false;
			 //�ݺ���, īƮ �迭��ŭ
			 for(int j = 0; j < cart1.length; j++) {
				 String[] cart2 = cart1[j].split("/"); // 0�� {qwer, ����};
				 //input[][1] ���� ������ ������
				 int limit = Integer.parseInt(input[i][1]);
				 //����. input[i][0] == cart[0] �̸�, (���� ���̵�� īƮ ���̵� ������)
				 if(input[i][0].equals(cart2[0])) {
					 //check = true �ְ�, count++;
					 check = true;
					 count++;
					 //����. count == input[][1] �̸�, �ε��� ���� �� break;
					 if(count == limit) {
						index = j;
						 break;
					 }
				 }
			 }
			 // ����. check == false(�ѹ��� ���� ���̵� �ȳ��԰ų� index == -1 �̸�)
			 if(check == false || index == -1) {
				 //�ش� ������ �����ϴ� ���
				 System.out.println("�ش� ������ �����ϴ�.");
				 continue;
			 }
			 cart = "";
			 for(int j = 0; j < cart1.length; j++) {
				if(j != index) {
					 cart += cart1[j] +"\n";
				}
			 }
			 System.out.println(cart);
		 }
		 
		/*
		 [ ���� ]
		    cart += "qwer/����\n";
			cart += "qwer/�����\n";
			cart += "java/ĭ��\n";
			cart += "java/����\n";
			cart += "abcd/���̴�";
		 */
	}
}
