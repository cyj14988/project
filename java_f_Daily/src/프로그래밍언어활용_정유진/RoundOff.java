package 프로그래밍언어활용_정유진;

import java.util.Scanner;

public class RoundOff {
	public static void main(String[] args) {
		
	/*
	 변수 num의 값은 456이다. 
	 변수 num의 십의 자리 이하를 버리는 코드를 작성하시오.
	 결과는 '400'이 출력된다.
	 */
	
	int num = 456;
	num = num - (num % 100);
	
	System.out.println(num);
		
	}
}
