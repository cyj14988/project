package F1_문자열1_프로젝트;

import java.util.Scanner;

public class 문자열1_프로젝트_대소문자_주석 {
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
		
		String db = "a1b2C";
		String id = "A1B2c";
		
		String db2 = "a1b2C";
		String pw = "A1B2c";
		
		System.out.println("A : " + (int)'A');
		System.out.println("Z : " + (int)'Z');
		System.out.println("a : " + (int)'a');
		System.out.println("z : " + (int)'z');

		//입력값과 기준값의 일치 여부를 저장해 줄 boolean 변수
		boolean check = true;
		//기존값만큼 검사하는 반복문
		for(int i = 0; i < db.length(); i++) {
			//검사할 인덱스 값 저장 (입력값, 기준값 모두)
			char a = db.charAt(i);
			char b = id.charAt(i);			
			//조건. 두 값이 다르면,(실제로 값이 다른 것일 수도 or 대소문자 차이일 수도 있음)
			if(a != b) {
				System.out.println(db.charAt(i) + " " + id.charAt(i));
				//기준값을 int로 변환하여 저장
				int aa = (int)a;
				//조건1. 그 값이 65 ~ 90 (소문자) 라면,
				if(aa >= 65 && aa <= 90) {
					//대문자로 변환해줌
					char bb = 힌트1.charAt(aa-65);
					//조건1-1. 기준값을 대문자로 변환했을 때, 입력값과 같다면
					if(b != bb) {
						//check = false줌
						check = false;
					}
					System.out.println(a + " " + b + " "+ bb);
				}
				//조건2. 그 값이 97 ~ 122 (대문자) 라면, 
				else if(aa >= 97 && aa <= 122) {
					//기준값을 소문자로 변환해줌
					char bb = 힌트2.charAt(aa-97);
					//조건2-1. 기준값을 소문자로 변환했을 때, 입력값과 같다면 
					if(b != bb) {
						//check = false를 줌 
						check = false;
					}
					System.out.println(a + " " + b + " "+ bb);
				}
				//그외라면(문자가 아니라면), check = false;
				else {
					check = false;
				}
			}
		}
		System.out.println("아이디: " + check);
		
		boolean check2 = true;		
		for(int i = 0; i < db2.length(); i++) {
			//검사할 인덱스 값 저장 (입력값, 기준값 모두)
			char a = db2.charAt(i);
			char b = pw.charAt(i);			
			//조건. 두 값이 다르면,(실제로 값이 다른 것일 수도 or 대소문자 차이일 수도 있음)
			if(a != b) {
				System.out.println(db2.charAt(i) + " " + pw.charAt(i));
				//기준값을 int로 변환하여 저장
				int aa = (int)a;
				//조건1. 그 값이 65 ~ 90 (소문자) 라면,
				if(aa >= 65 && aa <= 90) {
					//대문자로 변환해줌
					char bb = 힌트1.charAt(aa-65);
					//조건1-1. 기준값을 대문자로 변환했을 때, 입력값과 같다면
					if(b != bb) {
						//check = false줌
						check2 = false;
					}
					System.out.println(a + " " + b + " "+ bb);
				}
				//조건2. 그 값이 97 ~ 122 (대문자) 라면, 
				else if(aa >= 97 && aa <= 122) {
					//기준값을 소문자로 변환해줌
					char bb = 힌트2.charAt(aa-97);
					//조건2-1. 기준값을 소문자로 변환했을 때, 입력값과 같다면 
					if(b != bb) {
						//check2 = false를 줌 
						check2 = false;
					}
					System.out.println(a + " " + b + " "+ bb);
				}
				//그외라면(문자가 아니라면), check = false;
				else {
					check2 = false;
				}
			}
		}
		System.out.println("비밀번호: " + check2);
		
		if(check == true && check2 == true) {
			System.out.println("[로그인 성공]");
		}
	}
}
