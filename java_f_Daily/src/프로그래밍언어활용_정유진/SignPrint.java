package 프로그래밍언어활용_정유진;

import java.util.Scanner;

public class SignPrint {
	public static void main(String[] args) {
		
		/*
		 변수 num의 값에 따라 '양수', '음수', '0'을 출력하는 프로그램을 작성하시오.
		 삼항 연산자를 이용하시오. 
		 */
		
		
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		
		if(num < 0) {
			System.out.println("음수");
		}else if(num > 0) {
			System.out.println("양수");
		}else {
			System.out.println("0");
		}
		
	}
}
