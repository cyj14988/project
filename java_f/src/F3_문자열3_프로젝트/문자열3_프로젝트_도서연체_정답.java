package F3_���ڿ�3_������Ʈ;

public class ���ڿ�3_������Ʈ_������ü_���� {

	public static void main(String[] args) {
		String rentalData = "";		
		rentalData += "å��ȣ/å����/�뿩��¥/ȸ����ȣ\n";
		rentalData += "20122/���ʷξ���/2020-11-25/1001\n";
		rentalData += "40143/�ܱ��� ������ ����/2020-11-27/1003\n";
		rentalData += "54321/��ǻ��Ȱ��ɷ�/2020-11-27/1041\n";
		rentalData += "26543/�ƹ�ư,�ܱ���/2020-12-01/1034";
		
		
		String userData = "";
		userData += "ȸ����ȣ/å��ȣ/�뿩�ϼ�(day)\n";
		userData += "1001/20122/10\n";
		userData += "1003/40143/8\n";
		userData += "1041/54321/5\n";
		userData += "1034/26543/2";
		
		//���� ��¥ �迭
		int[] today = {2020, 12, 4};
		//�� �ϼ� �迭 
		int[] monthList = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		//�� �����ʹ� ������ å �뿩 �������̴�.
		// ������ 12��4�� �̶�������� ��ü�� ȸ����ȣ ���
		
		//���� ��¥���� �� ��ĥ���� ����
		int total = 0;
		total += today[0] * 365;
		for(int i = 0; i < today[1]-1; i++) {
			total += monthList[i];
		}
		total += today[2];
		System.out.println("����: " + total);
		
		int rTotal = 0;
		
		//rentalData, userData �߶� �־���
		String[] rental = rentalData.split("\n");
		String[] user = userData.split("\n");
		
		//�ݺ���( 1 ~ rental.���̱���) --> 1������ ������ ù�� °���� ���� �ƴϱ� ����
			//ù ��°���� ��¥ �� �� ���ְ�, 
				//ȸ�� ��ȣ�� ������, �뿩 �ϼ� ++; 
					//�Ѱ��� ���� ��¥���� ������ ��ü
		for(int i = 1; i < rental.length; i++) {
			rTotal = 0;
			String[] rentalList = rental[i].split("/");
			String idNum = rentalList[3];
			String[] temp = rentalList[2].split("-");
			rTotal += Integer.parseInt(temp[0])*365;
			for(int r = 0; r < Integer.parseInt(temp[1])-1; r++) {			
				rTotal += monthList[r];
			}
			rTotal += Integer.parseInt(temp[2]);
			System.out.println("����(�հ� ��): " + rTotal);
			
			for(int j = 1; j < user.length; j++) {
				String[] userList = user[j].split("/");
				if(idNum.equals(userList[0])) {
				 rTotal += Integer.parseInt(userList[2]);
				}
			}
			System.out.println("����(�հ� ��): " + rTotal);
			if(rTotal < total) {
				System.out.println("��ü: " + idNum);
			}
		}
		
		
	}
}
