package F1_문자열1_프로젝트;

import java.util.Scanner;

public class 문자열1_프로젝트_대소문자_문제 {
	/*
		아이디와 비밀번호 입력받고 로그인출력 		
		조건) 단, 아이디와 비밀번호는 
		1) 대문자로 입력하던 , 
		2) 소문자로 입력하던 , 
		3) 섞어서 입력하던 전부 인식되어야한다.		
	 */
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		String dbid = "q1w2e3r4";
		String dbpw = "r4e3w2q1";
		
		String 힌트1 = "abcdefghijklmnopqrstuvwxyz";
		String 힌트2 = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		
		System.out.print("[로그인] 아이디: ");
		String id = scan.nextLine();
		id = id.trim();

	}
}
