package F3_문자열3_알고리즘;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class 문자열3_알고리즘_랜덤타자_주석 {
	
	/*
	 * # 타자연습 게임[2단계]
	 * 1. 문제를 섞는다.(shuffle)
	 * 2. 순서대로 문제를 출제하고, 문제를 다 맞추면 게임 종료
	 * 3. 단 문제를 출제할 때, 단어의 랜덤한 위치 한 곳만 *로 출력
	 * 예)
	 * 문제 : mys*l
	 * 입력 : mysql	<--- 정답을 맞추면, 다음 문제 제시
	 * 문제 : *sp
	 * 입력 : jsp
	 * ...
	 */

	public static void main(String[] args) {

		String[] words = {"java", "mysql", "jsp", "spring"};
		
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		
		//반복문. 문제 섞기 셔플~
		for(int i = 0; i < 50; i++) {
			int num1 = ran.nextInt(words.length);
			int num2 = ran.nextInt(words.length);
			
			String temp = words[num1];
			words[num1] = words[num2];
			words[num2] = temp;
			
		}
		System.out.println(Arrays.toString(words));
		
		//반복문. words.길이만큼 
		for(int i = 0; i < words.length; i++) {
			//해당 단어의 길이만큼 랜덤으로 돌려서 인덱스 값 하나 뽑음
			int num = ran.nextInt(words[i].length());
			//반복문. 해당 단어의 길이만큼
			for(int j = 0; j < words[i].length(); j++) {
				//조건. 랜덤값과 인덱스가 같으면 * 로 출력
				if(num == j) {
					System.out.print("*");
				}
				//그외. 걍 출력 
				else{
					System.out.print(words[i].charAt(j));
				}
			}
			//입력값 받음
			System.out.print("\n입력: ");
			String me = scan.nextLine();
			
			//조건. 정답이면 정답
			if(words[i].equals(me)) {
				System.out.println("정답");
			}
			//그외(틀렸으면), 땡 하고 i--;
			else {
				System.out.println("땡");
				i--;
			}
		}
	}
}