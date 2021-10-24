package F2_문자열2_프로젝트;

import java.util.Scanner;

public class 문자열2_프로젝트_숫자검사_정답 {
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
		int numcheck = 0;
		int allnum = 0;
		int count = 0;
		boolean check = false;
		
		for(int i = 0; i < text.length(); i++) {
			check = false;
			for(int j = 0; j < number.length(); j++) {
				if(text.charAt(i) == number.charAt(j)) {
					check = true;
					break;
				}
			}
			if(check == true) { //현재 검사한 값이 숫자다.
				count++; //모두 숫자다.
				numcheck = 1;//숫자가 한번이라도 나왔다.
			}
		}
		if(count == text.length()) {
			allnum = 1; //모두 숫자다. 
		}
		
		if(numcheck == 1) {
			if(allnum == 1) {
				System.out.println("숫자만 있다");
			}else {
				System.out.println("숫자와 문자가 같이 있다.");
			}
		}else {
			System.out.println("문자만 있다.");
		}
	}
}
