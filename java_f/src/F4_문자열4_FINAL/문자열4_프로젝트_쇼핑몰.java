package F4_���ڿ�4_FINAL;

import java.util.Arrays;

public class ���ڿ�4_������Ʈ_���θ� {
	public static void main(String[] args) {
		
		String[][] memberList = {
			{"1", "qwer", "1234", "ȫ�浿", "m",  "0", "2021-01-01 12:11:30"},
			{"2", "java", "1234", "������", "m",  "0", "2021-01-02 03:20:54"},
			{"3", "haha", "1234", "������", "w", "0", "2021-01-07 07:24:14"},
			{"4", "tiger", "1234", "����ȣ��", "w", "0", "2020-12-25 05:43:11"},
			{"5", "green", "1234", "���׸�", "m", "0", "2018-06-12 07:21:08"}
		};
		
		// �Ʒ� �����ʹ� �׳� ���ڿ��� ��°�� �����ѵ������̴�. �̹��ڿ��� �ٵ� bookList �迭�� �����Ѵ�. 
		String data = "INSERT INTO book VALUES(1001, '100', '���̾� ��ȭ���� ����', 15000, 10, '�����ó� ���̰�', '���빮��', '2019-01-11', 'nothing.jpg', '�Ϻ��� ��ǥ�ϴ� �Ҽ��� �����ó� ���̰��� ����', 10, '2019-01-15');\r\n"
				+ "INSERT INTO book VALUES(1002, '100', '���ʷ� ����', 18000, 80, '����', '���е���', '2018-02-14', 'nothing.jpg', '70���� ������ ���ʷ� �ڲ� ������ �깮�� ����', 5, '2018-02-25');\r\n"
				+ "INSERT INTO book VALUES(1003, '100', '�ΰ� �ǰ�', 20000, 50, '������ ���繫', '������', '2016-11-20', 'nothing.jpg', '2019 ��ݱ� ���� ����Ʈ����', 0, '2016-11-23');\r\n"
				+ "INSERT INTO book VALUES(1004, '100', '�⹦�� ��ȥ����', 12000, 30, '���¿�', '������ ����', '2017-04-20', 'nothing.jpg', '13���� �߸����� ���ۼ�', 20, '2017-04-21');\r\n"
				+ "INSERT INTO book VALUES(1005, '100', '�츮�� �λ��̶� �θ��� �͵�', 16000, 10, '������', '���÷翣��', '2020-02-25', 'nothing.jpg', '�ڱ� ���� �� ã�� ���� ���� �� ����', 0, '2020-02-27');\r\n"
				+ "INSERT INTO book VALUES(1006, '100', '������ ����', 18000, 80, '������ ������ũ', '���İ��ۼ�', '2014-02-05', 'nothing.jpg', 'Die Welt von Gestern', 20, '2014-02-08');\r\n"
				+ "INSERT INTO book VALUES(2001, '200', '�ܱ��� ������ ����', 15000, 10, '��Ű�߸� ������', '����', '2011-03-11', 'nothing.jpg', '���� ��� 10�� ��� ���ϰ� �Ǿ���?', 25, '2011-03-13');\r\n"
				+ "INSERT INTO book VALUES(2002, '200', 'EBS ���ɿϼ� ��� ��2�ܱ���', 28000, 20, 'EBS ������', 'EBS�������', '2014-08-14', 'nothing.jpg', '2014 �г⵵ ���� ���豳��', 10, '2014-08-17');\r\n"
				+ "INSERT INTO book VALUES(2003, '200', '�ܱ��� ���Ĵ�', 23000, 70, '�ι�Ʈ �Ŀ���', '��ȭ', '2012-10-03', 'nothing.jpg', '�ܱ���� ��𿡼� ����', 10, '2012-10-05');\r\n"
				+ "INSERT INTO book VALUES(2004, '200', '�ƹ�ư_ �ܱ���', 22000, 50, '������', '����', '2019-04-20', 'nothing.jpg', '��� ���󿡴� ö���� ���� �ִ�', 10, '2019-04-28');\r\n"
				+ "INSERT INTO book VALUES(2005, '200', '�������� ���� �ٸ� ���� ǥ��', 15000, 10, '����', '���in', '2021-01-04', 'nothing.jpg', '��Ʃ�� 24�� ������ �������� �˷� �ִ� ����ǥ��', 10, '2021-01-05');\r\n"
				+ "INSERT INTO book VALUES(2006, '200', '�ÿ����� ����Ƽ�� 5�� ����ȸȭ', 13500, 10, '������', '�ÿ��������', '2020-12-21', 'nothing.jpg', '�Ϸ� �� ���徿_ ���� ��� ���� ����', 0, '2020-12-24');\r\n"
				+ "INSERT INTO book VALUES(3001, '300', '��ǻ�� ������ ������', 35000, 70, '���𸵰��� ����������', '������', '2018-02-18', 'nothing.jpg', '�ټ��÷ο� �ɶ󽺸� ����� ���� ���̵�', 5, '2018-02-22');\r\n"
				+ "INSERT INTO book VALUES(3002, '300', '���� ���� ������ ���', 19000, 10, '�ڱ���', '�Ѻ���ī����', '2015-03-10', 'nothing.jpg', '������ ��Ű� ��ǻ�� ��Ʈ��ũ', 10, '2015-03-11');\r\n"
				+ "INSERT INTO book VALUES(3003, '300', '��ǻ��Ȱ��ɷ�', 38000, 20, '������', '���', '2012-09-24', 'nothing.jpg', '��ǻ�� �ڰ���', 20, '2012-09-26');\r\n"
				+ "INSERT INTO book VALUES(3004, '300', '�ʵ��л��� �˾ƾ��� ����', 22000, 0, '������ ���ӽ�', '����ڸ���', '2013-06-12', 'nothing.jpg', '��ǻ�Ϳ� �ڵ� 100����', 10, '2013-06-18');\r\n"
				+ "INSERT INTO book VALUES(3005, '300', 'Java�� ����', 27000, 0, '���ü�', '��������', '2016-01-27', 'nothing.jpg', '�ڹ��� ���ʺ��� ��ü���ⰳ���� �Ѿ� ����Ȱ�����', 30, '2016-01-29');\r\n"
				+ "INSERT INTO book VALUES(3006, '300', '������� JSP 2.3 �� ���α׷���', 38000, 0, '������', '���̵��', '2014-11-20', 'nothing.jpg', '���ʺ��� ��2 ����� MVC���ϱ���', 10, '2014-11-22');\r\n"
				+ "INSERT INTO book VALUES(3007, '300', 'ȥ�� �����ϴ� �ڹ�', 24000, 1, '�ſ��', '�Ѻ��̵��', '2019-06-10', 'nothing.jpg', 'Java8 & 11 ����/���� ������ ���� ����', 10, '2019-06-19');\r\n"
				+ "INSERT INTO book VALUES(3008, '300', 'ȥ�� �����ϴ� �ڹٽ�ũ��Ʈ', 24000, 0, '���μ�', '�Ѻ��̵��', '2021-01-04', 'nothing.jpg', '�ڹٽ�ũ��Ʈ�� źź�ϰ� �����ϰ� ���� ��', 10, '2021-01-09');\r\n"
				+ "INSERT INTO book VALUES(3009, '300', '��� �ڹ� �� �׼�', 34000, 5, '���', '�Ѻ��̵��', '2019-08-01', 'nothing.jpg', '�������� ���� �ڹ� 8_9_10 ��� ���̵�', 10, '2019-08-02');";
			
		//[1�ܰ�] �޸��忡���� �ٹٲ��� �Ҷ� \r\n ���� �Ѵ�. �޸��忡�� �����ϴ� "\r\n" ���� �߶��ش�.
		String data2[] = data.split("\r\n");
		
		//System.out.println(Arrays.toString(data2));
		
		String[][] bookList = new String[data2.length][];
		
		/*
		 * [2�ܰ�]  INSERT INTO book VALUES(  ==> ��������ʴ� �պκ� �� �����Ѵ�. 
		 * [3�ܰ�]  );  ==> ��������ʴ� �޺κ� �� �����Ѵ�. 	
		 * [4�ܰ�]  '' Ȭ����ǥ�� �����Ѵ� 	             					
		 */
		for(int i = 0; i < data2.length; i++) {
			// indexOf() ==> �Ұ�ȣ���� ������ �ε����� ������ش�.		
			int index = data2[i].indexOf('(');						
			if(index != -1) {
				//���ʿ��� �պκ� �޺κ������Ѵ�.
				data2[i] = data2[i].substring(index + 1, data2[i].length());
				//System.out.println("��: " +  data2[i]);
				data2[i] = data2[i].substring(0, data2[i].length()-2);
				//System.out.println("��: " +  data2[i]);
			}
			
			// replace() ==> �Ұ�ȣ ���� ���ڸ� ��ü���ش�. ������ \' �� "" �������� �ٲ۴�. 
			data2[i] = data2[i].replace("\'", "");
			
			
			String data3[] = data2[i].split(",");
			
			bookList[i] = new String[data3.length];
			
			for(int j = 0; j < data3.length; j++) {
				// trim() ==>  ���������� ������ ������ �����Ѵ�. 
				bookList[i][j] = data3[j].trim();
			}
			
			//System.out.println(Arrays.toString(data3));
		}
		for(int i = 0; i < bookList.length; i++) {
			System.out.println(Arrays.toString(bookList[i]));
		}
		
		
		String[][] cartList = {
				{"1", "qwer", "24300", "1", "3005", "Java�� ����", "nothing.jpg"},
				{"2", "tiger", "24300", "1", "3005", "Java�� ����", "nothing.jpg"},
				{"3", "haha", "19800", "1", "2004", "�ƹ�ư,�ܱ���", "nothing.jpg"},
				{"4", "tiger", "17000", "1", "1003", "�ΰ� �ǰ�", "nothing.jpg"},
				{"5", "haha", "34200", "1", "3006", "������� JSP 2.3 �� ���α׷���", "nothing.jpg"},
				{"6", "tiger", "13500", "1", "1001", "���̾� ��ȭ���� ����", "nothing.jpg"},
		
		};
	
				//# ����) member���̺��� ��ü ȸ�� �� ��������
					int count = 0;
					for(int i = 0; i < memberList.length; i++) {
						count++;
					}
					System.out.println(count+"��");
					
					System.out.println("--------------------------------------------");
				//# ����) member���̺��� ���� ȸ���� �� ��������
					count = 0;
					for(int i = 0; i < memberList.length; i++){
						String gender = memberList[i][4];
						if(gender.equals("m")) {
							count++;
						}
					}
					System.out.println("���� ȸ�� ��: " + count + "��");
					System.out.println("--------------------------------------------");
				//# ����) book���̺��� ��ü ���� ������ ���� ��������				
					int total = 0;
					for(int i = 0; i < bookList.length; i++) {
						total += Integer.parseInt(bookList[i][3]);
					}
					System.out.println("����: "+ total +"��");
					System.out.println("--------------------------------------------");
				//# ����) book���̺��� ��ü ���� ������ ��� ��������
				//# ����) �Ҽ��� ���� 2�������� ���	
					total = 0;
					double count1 = 0;
					for(int i = 0; i < bookList.length; i++) {
						total += Integer.parseInt(bookList[i][3]);
						count1++;
					}
					System.out.printf("���: %.2f ��\n", total/count1);
					System.out.println("--------------------------------------------");
				//# ����) book���̺��� ���� ������ 10%�� �λ����� ���� ���� ��������	
					total = 0;
					for(int i = 0; i < bookList.length; i++) {
						total += Integer.parseInt(bookList[i][3])*1.1;
					}
					System.out.println(total +"��");
					System.out.println("--------------------------------------------");
				//# ����) book���̺��� ���� ������ ���� ���� �������� ��������
					int max = 0;
					for(int i = 0; i < bookList.length; i++) {
						int temp = Integer.parseInt(bookList[i][3]);
						if(temp > max) {
							max = temp;
						}
					}
					System.out.println("���� ���� ����: " + max +"��");
					System.out.println("--------------------------------------------");
				//#--------------------------------------------------------------
	
				//# ����) member���̺��� ȸ���� ���� ������ ��������			
				int m = 0;
				int w = 0;
				for(int i = 0; i < memberList.length; i++) {
					String gender = memberList[i][4];
					if(gender.equals("m")) {
						m += 1;
					}else {
						w += 1;
					}
				}
				System.out.println("[m: " + m + "�� || w: " + w +"��]");
				System.out.println("--------------------------------------------");
				//# ����) book���̺��� ���� ������ ���� ���� ��������			
				String[] kind = new String[bookList.length];
				count = 0;
				for(int i = 0; i < bookList.length; i++) {
					String temp = bookList[i][1];
					boolean check = false;
					for(int j = 0; j < count; j++) {
						if(temp.equals(kind[j])) {
							check = true;
							break;
						}
					}
					if(check == false) {
						kind[count] = temp;
						count++;
					}
				}
				//System.out.println(Arrays.toString(kind));
				String[][] bookKind = new String[count][2];
				for(int i = 0; i < bookKind.length; i++) {
					bookKind[i][0] = kind[i];
				}
				for(int i = 0; i < bookKind.length; i++) {
					String temp = bookKind[i][0];
					int same = 0;
					for(int j = 0; j < bookList.length; j++) {
						if(temp.equals(bookList[j][1])) {
							same ++;
							bookKind[i][1] = same +""; 
						}
					}
				}
				for(int i = 0; i < bookKind.length; i++) {
					System.out.print(bookKind[i][0] + ": ");
					System.out.println(bookKind[i][1] +"��");
				}
				System.out.println("--------------------------------------------");
			
				//# ����) cart���̺��� ȸ������ ������ �� ���� ��������
				//#����) �������� �����ϱ�
				String id[] = new String[cartList.length];
				count = 0;
				for(int i = 0; i < cartList.length; i++) {
					boolean check = false;
					for(int j = 0; j < count; j++) {
						if(id[j].equals(cartList[i][1])) {
							check = true;
							break;
						}
					}
					if(check == false) {
						id[count] = cartList[i][1];
						count++;
					}
				}
				String[][] idCart = new String[count][2];
				
				for(int i = 0; i < idCart.length; i++) {
					idCart[i][0] = id[i];
				}
				
				for(int i = 0; i < idCart.length; i++) {
					String temp = idCart[i][0];
					int sum = 0;
					for(int j = 0; j < cartList.length; j++) {
						if(temp.equals(cartList[j][1])) {
							sum++;
							idCart[i][1] = sum +"";
						}
					}
				}
				
				for(int i = 0; i < idCart.length; i++) {
					int str = Integer.parseInt(idCart[i][1]);
					for(int j = 0; j < i; j ++) {
						int str2 = Integer.parseInt(idCart[j][1]);
						if(str > str2) {
							String[] temp = idCart[i];
							idCart[i] = idCart[j];
							idCart[j] = temp;
						}
					}
				}
				for(int i = 0; i < idCart.length; i++) {
					System.out.println(Arrays.toString(idCart[i]));
				}
				System.out.println("--------------------------------------------");
					
				//# ����) cart���̺��� ȸ���� ������ ������ ������ 2�� �̻��� ȸ���� id ��������				
				
				//�� �������� ���ϰ� ����, 
				for(int i = 0; i < idCart.length; i++) {
					int temp = Integer.parseInt(idCart[i][1]);
					if(temp >= 2) {
						System.out.println(idCart[i][0]);
					}
				}
				System.out.println("--------------------------------------------");
				//�̷��� �����ϰ� Ǫ�� �� �³�..��...
				//�� ��ȹ
				//(1) ��¥ ���ǿ� �°�, ���� ���ǿ� �´� ������ �����ϱ�. �� ������ ������ ������ ������ �迭�� �������� �˻��ؼ� ���� ����.
				//# ����) book���̺��� 2015�⿡�� 2019�� ���̿� �Ⱓ�� ���� �߿� ������ 3�� ������ ������ �������� ��������
				String[][] bbook = new String[bookList.length][2];
				count = 0;
				for(int i = 0; i < bookList.length; i++) {
					String[] date = bookList[i][bookList[i].length-1].split("-"); //date[0] �ش� �⵵
					int temp = Integer.parseInt(date[0]);
					boolean check = false;
					int index = -1;
					if(temp >= 2015 && temp <= 2019) {
						int bookCount = Integer.parseInt(bookList[i][4]);
						if(bookCount <= 3) {
							for(int j = 0; j < count; j++) {
								if(bbook[j][0].equals(bookList[i][1])) {
									index = j;
									check = true;
									break;
								}
							}
							if(check == false) {
								bbook[count][0] = bookList[i][1];
								bbook[count][1] = 1 + "";
								count++;
							}else {
								int sum = Integer.parseInt(bbook[index][1]);
								sum++;
								bbook[index][1] = sum +"";
								//System.out.println("sum: " + sum);
							}
						}
					}
				}
				for(int i = 0; i < count; i++) {
					System.out.println(Arrays.toString(bbook[i]));
				}
				System.out.println("--------------------------------------------");
						
				//# ����) cart���̺��� buyer�� �̸��� cart�� ���� ��������
				String buyerList[][] = new String[cartList.length][2];
				count = 0;
				
				for(int i = 0; i < cartList.length; i++) {
					boolean check = false;
					int index = -1;
					for(int j = 0; j < count; j ++) {
						if(buyerList[j][0].equals(cartList[i][1])) {
							check = true;
							index = j;
							break;
						}
					}
					if(check == false) {
						buyerList[count][0] = cartList[i][1];
						buyerList[count][1] = cartList[i][2];
						count++;
					}else {
						int temp = Integer.parseInt(buyerList[index][1]);
						temp += Integer.parseInt(cartList[i][2]);
						buyerList[index][1] = temp + "";
					}
				}
				for(int i = 0; i < count; i++) {
					System.out.println("���� ��: " + Arrays.toString(buyerList[i]));
				}
				
				for(int i = 0; i < count; i++) {
					for(int j = 0; j < memberList.length; j++) {
						if(buyerList[i][0].equals(memberList[j][1])) {
							buyerList[i][0] = memberList[j][3];
							break;
						
						}
					}
				}
				for(int i = 0; i < count; i++) {
					System.out.println("���� ��: " + Arrays.toString(buyerList[i]));
				}
				System.out.println("--------------------------------------------");
				//# ����) cart���̺��� ȸ���� ������ ������ ���εǱ� ���� ���ݰ� ������ ��������
				for(int i = 0; i < cartList.length; i++) {
					String idName = cartList[i][1];
					String book = cartList[i][5];
					for(int j = 0; j < bookList.length; j++) {
						if(cartList[i][5].equals(bookList[j][2])) {
							System.out.println(idName +": " + book +", " + bookList[j][3] +", " + bookList[j][10] +"%");
						}
					}
				}
				System.out.println("--------------------------------------------");	
				
				//# ����) cart���̺��� ȸ���� ������ ������ ���εǱ� ���� ������ 2���� �̻��� ���������� ������ ��������
				for(int i = 0; i < cartList.length; i++) {
					for(int j = 0; j < bookList.length; j++) {
						int cost = Integer.parseInt(bookList[j][3]);
						if(cartList[i][5].equals(bookList[j][2]) && cost >= 20000) {
							System.out.println(Arrays.toString(bookList[j]));
						}
					}
				}
				System.out.println("--------------------------------------------");	
				
				//# ����) cart���̺��� buyer�� �̸��� cart�� ���� ��������
				for(int i = 0; i < cartList.length; i++) {
					String idName = cartList[i][1];
					for(int j = 0; j < memberList.length; j++) {
						if(idName.equals(memberList[j][1])) {
							System.out.println(idName +"(" + memberList[j][3] +"): "  + cartList[i][2] +"��");
						}
					}
				}
				System.out.println("--------------------------------------------");	
				
				//# ����) cart���̺��� ȸ���� ������ ������ ���εǱ� ���� ���ݰ� ������ ��������
				for(int i = 0; i < cartList.length; i++) {
					for(int j = 0; j < bookList.length; j++) {
						if(cartList[i][4].equals(bookList[j][0])) {
							System.out.println(cartList[i][1] +": " + bookList[j][3] + ", " + bookList[j][bookList[0].length-2]);
						}
					}
				}
				System.out.println("--------------------------------------------");	
			
				// # ����) book���̺��� ��ü ��� ���ݺ��� �� ���� �������� ��������
				total = 0;
				for(int i = 0; i < bookList.length; i++) {
					total += Integer.parseInt(bookList[i][3]);
				}
				int avg = total / bookList.length;
				System.out.println("���: " + avg +"��");
				for(int i = 0; i < bookList.length; i++) {
					int cost = Integer.parseInt(bookList[i][3]);
					if(cost > avg) {
						System.out.println(Arrays.toString(bookList[i]));
					}
				}
				System.out.println("--------------------------------------------");	
				
				// memberList [��ȣ, ���̵�, ��й�ȣ, �̸�, ����, ���ż���?, ��������]
				// bookList [��ȣ, ����, å�̸�, ����, ����, ����, ���ǻ�, ������, �̹���, ����, ������, ������ ������?]
				// cartList [��ȣ, ���̵�, ����, ����, å��ȣ, å�̸�, �̹���]	
				//# book���̺��� ���� ������ ���� ���� ���� ��������
				max = 0;
				for(int i = 0; i < bookList.length; i++) {
					int cost = Integer.parseInt(bookList[i][3]);
					if(cost > max) {
						max = cost;
					}
				}
				for(int i = 0; i < bookList.length; i++) {
					if(bookList[i][3].equals(max+"")) {	
						System.out.println(Arrays.toString(bookList[i]));
					}
				}
	}
}
