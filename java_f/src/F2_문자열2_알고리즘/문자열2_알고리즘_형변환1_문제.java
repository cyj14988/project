package F2_���ڿ�2_�˰���;

import java.util.Arrays;

public class ���ڿ�2_�˰���_����ȯ1_���� {
	public static void main(String[] args) {

		// ���ڿ� �Լ��� ����ؼ� Ǯ���
		
		String str = "11/100/89";
		// ���� 1) arr �迭�� �� ������ �����ϰ�, ���� ���
		// ���� 1) 200
		int[] arr = new int[3];
		int total = 0;
		
		String darr[] = str.split("/");
		System.out.println(Arrays.toString(darr));
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(darr[i]);
			total += arr[i];
		}
		System.out.println(Arrays.toString(arr));
		System.out.println(total + "��");
		
		
		// ���� 2) scores �迭�� �� ������ �����ø� �����ڷ� �ϳ��� ���ڿ��� ����
		// ���� 2) 11/100/89
		int[] scores = {11, 100, 89};
		String text = "";
		
		for(int i = 0; i < scores.length; i++) {
			text += scores[i]+ "";
			if(i != scores.length-1) {
				text += "/";
			}
		}
		System.out.println(text);
		
		
		
	}
}
