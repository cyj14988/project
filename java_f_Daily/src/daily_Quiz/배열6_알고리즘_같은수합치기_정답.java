package daily_Quiz;

import java.util.Arrays;

public class �迭6_�˰���_��������ġ��_���� {
	/*
	  	input = {8,4,2,2,4,4,8};	
	  
		 [1] input �� �����͸� ���������� a�� �����Ѵ�.
		 [2] �����ҷ��� ���� �׾��� ���� ���ΰ����� ��ģ��. (��� ��ø����)
		 input = {8,4,2,2,4,4,8}	
		 8  ==> a[] =  {8}
		 4  ==> a[] =  {8,4}
		 2  ==> a[] =  {8,4,2}
		 2  ==> a[] =  {8,4,2,2} ==> {8,4,4} ==> {8,8} ==> {16}
		 4 ==>  a[] =  {16,4} 
		 4  ==> a[] =  {16,4,4} ==> {16,8}
		 8  ==> a[] =  {16,8,8} ==> {16,16} ==> {32}	
	 */	
	public static void main(String[] args) {		
		int [] input = {8,4,2,2,4,4,8};	
		int a[] = new int[input.length];	
		int count = 0;
		
		//�ݺ���
		for(int i = 0; i < input.length; i++) {
			//a[] = input[i] ����
			a[count] = input[i];
			//���ѹݺ���
			while(true) {
				System.out.println(Arrays.toString(a));
				//count = 0, break; (���̻� ���� �� �����Ƿ�)
				if(count == 0) {
					break;
				}
				//a[count] == a[count-1] �̸�, 
				if(a[count] == a[count-1]) {
					//a[count] = 0, �ι�, count -= 1;
					a[count] = 0;
					a[count-1] *= 2;
					count -= 1;
				}
				//�׿�, break;
				else {
					break;
				}		
			}
			//a �迭 �ε��� ++;
			count += 1;
		}	
	}
}