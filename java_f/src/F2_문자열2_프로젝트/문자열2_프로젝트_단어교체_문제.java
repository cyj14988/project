package F2_문자열2_프로젝트;

import java.util.Arrays;
import java.util.Scanner;

public class 문자열2_프로젝트_단어교체_문제 {
	/*
	 * # 단어 교체하기(replace)
	 * 1. text변수 문장 속에서 변경하고 싶은 단어를 입력받아,
	 * 2. 교체해주는 기능을 구현한다.
	 * 예)
	 * 		Life is too short.
	 * 		변경하고 싶은 단어입력 : Life
	 * 		바꿀 단어입력 : Time
	 * 
	 * 		Time is too short.
	 * 

	 */
	//1. 크기가 다른 단어도 교환 가능
	//2. 같은게 여러개면 모두 바꿔줘야 함


	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		String text = "Life is too short.";
		System.out.println(text);
		
		System.out.print("변경하고 싶은 단어를 입력하세요 : ");
		String word = scan.nextLine();
		System.out.print("바꿀 단어를 입력하세요 : ");
		String change = scan.nextLine();
		
		
		for(int i = 0; i <= text.length()-word.length(); i++) {
			String temp = "";
			boolean check = false;
			int count = 0;
			int x = 0;
			int y = 0;
			for(int j = 0; j < word.length(); j++) {
				System.out.println("돈다: " + text.charAt(i+j) + "비교" + word.charAt(j));
				if(text.charAt(i+j) == word.charAt(j)) {
					count++;
					if(count == word.length()) {
						x = i;
						y = i+j;
						check = true;
						break;
					}
				}
			}
			if(check == true) {
				System.out.println("찾았다: " + x + " " + y);
				for(int j = 0; j < x; j++) {
					temp += text.charAt(j);
				}
				for(int j = 0; j < change.length(); j++) {
					temp += change.charAt(j);
				}
				for(int j = y+1; j < text.length(); j++) {
					temp += text.charAt(j);
				}
				System.out.println("temp: " + temp);
				text ="";
				for(int j = 0; j < temp.length(); j++) {
					text += temp.charAt(j);
				}
				System.out.println("text: " + text);
			}
		}
		System.out.println(text);
	}
}
