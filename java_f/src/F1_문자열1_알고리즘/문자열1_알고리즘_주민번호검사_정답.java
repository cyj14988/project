package F1_���ڿ�1_�˰���;

public class ���ڿ�1_�˰���_�ֹι�ȣ�˻�_���� {
	public static void main(String[] args) {

		String jumin = "890101-2012932";
		
		// ���� 1) ���� ���
		// ���� 1) ����
		
		// ���� 2) ���� ���
		// ���� 2) 30��
		
		System.out.print("���� ���: ");
		System.out.println(jumin.charAt(7));
		if(jumin.charAt(7) == '2') {
			System.out.println("����");
		}else {
			System.out.println("����");
		}
		int year = 2021;
		
		System.out.print("���� ���: ");
		System.out.println(jumin.substring(0, 2));
		String age = jumin.substring(0, 2);
		int a = Integer.parseInt(age);
		if(a <= (year - 2000)) {
			a += 2000;
		}else {
			a += 1900;
		}
		a = year - a;
		System.out.println(a + "��");
	}
}
