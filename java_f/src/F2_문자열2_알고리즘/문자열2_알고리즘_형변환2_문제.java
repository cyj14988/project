package F2_���ڿ�2_�˰���;

import java.util.Arrays;

public class ���ڿ�2_�˰���_����ȯ2_���� {
	public static void main(String[] args) {

		// ����) �̸��� name�迭�� ������ score�迭�� ���� ���� �� ���
		
		String str = "��ö��/87,�̸���/42,�̿���/95";
		
		String[] name = new String[3]; // ��ö��,�̸���,�̿���
		int[] score = new int[3];      // 87,42,95
		
		String info[] = str.split(",");
		
		for(int i = 0; i < info.length; i++) {
			System.out.println(info[i]);
			String info2[] = info[i].split("/");
			System.out.println(Arrays.toString(info2));
			
			name[i] = info2[0];
			score[i] = Integer.parseInt(info2[1]);
		}
		
		System.out.println(Arrays.toString(name));
		System.out.println(Arrays.toString(score));
		
	}
}
