package F2_���ڿ�2_�˰���;

public class ���ڿ�2_�˰���_����ȯ4_���� {
	public static void main(String[] args) {
		
		String str = "��ö��/87,�̸���/42,�̿���/95";
		
		// �� �����Ϳ��� �õ��� ������ �ٽ� ���ڿ��� ����
		
		//1) ���ڿ��� �߶� �迭�� �����Ѵ�.
		//2) �迭���� �õ��� �����Ѵ�
		//3) �����ѹ迭�� �ٽ� ���ڿ��� �����.
		
		// str = "��ö��/87,�̿���/95";
		
		String arr[] = str.split(",");
		str = "";
		int count = 0;
		for(int i = 0; i < arr.length - 1; i++) {
			str += arr[i];
			count++;
			if(count == 1) {
				str += ", ";
			}
		}
		System.out.println(str);
	}
}
