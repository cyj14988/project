package F1_문자열1_알고리즘;

import java.util.Scanner;

public class 문자열1_알고리즘_끝말잇기_정답 {
	public static void main(String[] args) {
		/*
		 * # 끝말잇기 게임을 만들어보세요.
		 * 
		 * 제시어 : 자전거
		 * 입력 : 거미
		 * 제시어 : 거미
		 * 입력 : 미술
		 * ...
		 */
		
		Scanner scan = new Scanner(System.in);
		
		String start = "자전거";
		System.out.println("제시어 : " + start);
		char check = start.charAt(start.length()-1);
		
		while(true) {
			System.out.print("입력: ");
			start = scan.next();
			char ncheck = start.charAt(0);
			if(start.equals("그만")) {
				break;
			}
			if(ncheck != check) {
				System.out.println("다시~");
				continue;
			}
			System.out.println("제시어: " + start);
			check = start.charAt(start.length()-1);
		}
		
	//두음법칙은 어떻게 적용하지...한 글자 한 글자씩은 어떻게 쪼개나...	
	}
}
