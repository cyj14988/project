package ���α׷��־��Ȱ��_������;

import java.util.Scanner;

public class RoundOff {
	public static void main(String[] args) {
		
	/*
	 ���� num�� ���� 456�̴�. 
	 ���� num�� ���� �ڸ� ���ϸ� ������ �ڵ带 �ۼ��Ͻÿ�.
	 ����� '400'�� ��µȴ�.
	 */
	
	int num = 456;
	num = num - (num % 100);
	
	System.out.println(num);
		
	}
}
