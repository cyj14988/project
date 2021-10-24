package F2_문자열2_프로젝트;

import java.util.Scanner;

public class 문자열2_프로젝트_숫자검사_주석 {
	/*
	 * # 문자열 속 숫자검사
	 * 예) adklajsiod
	 * 	     문자만 있다.
	 * 예) 123123
	 *    숫자만 있다.
	 * 예) dasd12312asd
	 *    문자와 숫자가 섞여있다.
	 */

	public static void main(String[] args) {

		String number = "123456789";
		Scanner scan = new Scanner(System.in);
		System.out.print("입력 : ");
		String text = scan.next();
		int charcheck = 0; // 1-> 숫자있음(문자만 있니, 아님 숫자도 섞였니)
		int allnum = 0; // 1 -> 문자있음(숫자만 있니, 아님 문자도 섞였니)
		int count = 0;
		boolean check = false; // 숫자가 하나라도 있으면 true를 체크해줄 변수
		
		//반복문, 입력값만큼 돌아요
		for(int i = 0; i < text.length(); i++) {
			//반복문, 넘버만큼 돌아요 
			for(int j = 0; j < number.length(); j++) {
				//조건. 입력값 == 숫자하고 같으면,
				if(text.charAt(i) == number.charAt(j)) {
					//count++, check = true, charcheck = 1;(숫자가 하나라도 있음)
					count++;
					check = true;
					charcheck = 1;
				}
			}
		}
		//조건. 현재 검사한 값 중에 숫자가 있고, 그 갯수가 전체 길이와 같지 않다면(==문자가 섞여있음)
		if(check == true && count != text.length()) { 
			//allnum = 1; 줌
			allnum = 1;
		}
		if(allnum == 0 && check == true) {
			System.out.println("숫자만 있다");
		}else if(charcheck == 0) {
			System.out.println("문자만 있다.");
		}else {
			System.out.println("숫자 문자 둘다 있다.");
		}
	}
}
