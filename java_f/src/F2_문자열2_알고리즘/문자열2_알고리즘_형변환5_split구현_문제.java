package F2_���ڿ�2_�˰���;

import java.util.Arrays;

public class ���ڿ�2_�˰���_����ȯ5_split����_���� {
	
	
	public static void main(String[] args) {

		String str = "aaa/bbbb/ccc";
		//String[] temp = str.split("/");
		
		// split�� �ڵ����� ���ڿ��� �迭�� ������ش�.
		// split�� ��������ʰ� ���� �߶� �迭�� �־��.
		
		
		//����)   �����ڸ� �������� str �� ������ �߶󳻼� temp2 �迭�� ���� 
		int count = 0;
		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i) == '/') {
				count++;
			}
		}
		int[] ������ = new int[count];
		String[] temp = new String[count+1];
		int index = 0;
		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i) == '/') {
				������[index] = i;
				index++;
			}
		}
		
		for(int i =0; i < temp.length; i++) {
			temp[i] = "";
		}
		
		index = 0;
		int tindex = 0;
		for(int i = 0; i < str.length(); i++) {
			if(������[index] == i) {
				tindex++;
				index++;
				if(index >= ������.length) {
					index-=1;
				}
			}else {
				temp[tindex] += str.charAt(i);
				System.out.println(Arrays.toString(temp));
			}
		}
		System.out.println(Arrays.toString(temp));
		
		
	}
}
