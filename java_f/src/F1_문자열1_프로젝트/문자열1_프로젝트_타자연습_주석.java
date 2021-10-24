package F1_문자열1_프로젝트;

import java.util.Random;
import java.util.Scanner;

public class 문자열1_프로젝트_타자연습_주석 {
	
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
		}//이거 이해가 안 된다.. 저 길이만큼만 돌겠다는건가???? 하나씩 하나씩 입력된 후에 도는건가????
		
		System.out.println("=========================");
		
		//반복문: 셔플~
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
		//반복문, word 만큼 돌아요~
		for(int i = 0; i < words.length; i++) {
			//문제 출력
			System.out.println("문제: " + words[i]);
			//정답 입력
			System.out.print("입력: ");
			String me = scan.next();
			//조건. 정답이면, 정답~
			if(me.equals(words[i])) {
				System.out.println("정답");
			}
			//그외. 틀리면 i-- (똑같은 문제 또 나와요~)
			else {
				i--;
			}
		}
	}
}
