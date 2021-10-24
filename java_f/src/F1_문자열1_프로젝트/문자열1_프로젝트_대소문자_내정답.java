package F1_문자열1_프로젝트;

import java.util.Scanner;

public class 문자열1_프로젝트_대소문자_내정답 {
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
		
		
		boolean check = true;
		int state = 0;
		if(id.length() != dbid.length()) {
			check = false;
			state = 1;
		}else {
			for(int i = 0; i < dbid.length(); i++) {
				if(dbid.charAt(i) != id.charAt(i)) {
					check = false;
					int index = -1;
					for(int j = 0; j < 힌트1.length(); j++) {
						if(dbid.charAt(i) == 힌트1.charAt(j)) { 
							index = j;
						}else if(dbid.charAt(i) == 힌트2.charAt(j)) {
							index = j;
						}
					}
					if(index != -1) {
						if(id.charAt(i) == 힌트1.charAt(index) || id.charAt(i) == 힌트2.charAt(index)) {
							check = true;
						}
					}	
				}
				if(check == false) {
					state = 1;
				}
			}
		}
		System.out.println("state: " + state);
		System.out.print("[로그인] 비밀번호: ");
		String pw = scan.nextLine();
		
		int statepw = 0;
		check = true;
		if(pw.length() != dbpw.length()) {
			check = false;
			statepw = 1;
		}else {
			for(int i = 0; i < dbpw.length(); i++) {
				if(dbpw.charAt(i) != pw.charAt(i)) {
					check = false;
					int index = -1;
					for(int j = 0; j < 힌트1.length(); j++) {
						if(dbpw.charAt(i) == 힌트1.charAt(j)) { 
							index = j;
						}else if(dbpw.charAt(i) == 힌트2.charAt(j)) {
							index = j;
						}
					}
					if(index != -1) {
						if(pw.charAt(i) == 힌트1.charAt(index) || pw.charAt(i) == 힌트2.charAt(index)) {
							check = true;
						}
					}
				}
				if(check == false) {
					statepw = 1;
				}
			}
		}
		System.out.println("statepw: " + statepw);
		if(state == 1 || statepw == 1) {
			System.out.println("로그인 실패");
		}else {
			System.out.println("로그인 성공");
		}
		
		
		
		
	}
}
