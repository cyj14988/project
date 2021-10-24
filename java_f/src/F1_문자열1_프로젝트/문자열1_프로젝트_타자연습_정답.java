package F1_문자열1_프로젝트;

import java.util.Random;
import java.util.Scanner;

public class 문자열1_프로젝트_타자연습_정답 {
	
	/*
	 * # 타자연습 게임[1단계]
	 * 1. 문제를 섞는다.(shuffle)
	 * 2. 순서대로 문제를 출제하고, 문제를 다 맞추면 게임 종료
	 * 예)
	 * 문제 : mysql
	 * 입력 : mydb
	 * 문제 : mysql
	 * 입력 : mysql	<--- 정답을 맞추면, 다음 문제 제시
	 * 문제 : jsp
	 */

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		String[] words = {"java", "mysql", "jsp", "spring"};
		
		for(String str : words) {
			System.out.println(str);
		}
		
		System.out.println("=========================");
		
		for(int i = 0; i < 10; i++) {
			int num1 = ran.nextInt(words.length);
			int num2 = ran.nextInt(words.length);
			
			String temp = words[num1];
			words[num1] = words[num2];
			words[num2] = temp;
 		}
		for(String str : words) {
			System.out.println(str);
		}
		
		for(int i = 0; i < words.length; i++) {
			
			while(true) {
				System.out.println("문제: " + words[i]);
				System.out.print("입력: ");
				String me = scan.next();
				if(me.equals(words[i])) {
					System.out.println("정답");
					break;
				}
			}
		}
		
	}
}
