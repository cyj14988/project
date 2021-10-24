package F2_문자열2_프로젝트;

import java.util.Arrays;
import java.util.Scanner;

public class 문자열2_프로젝트_단어검색_주석 {
	/*
	 * # 단어 검색
	 * 1. 단어를 입력받아 text변수 문장 속에 해당 단어가 있는지 검색한다.
	 * 2. 단어가 존재하면 전부출력한다.
	 * 3. 부분검색도 되어야한다. 
	 * 	예) ch ==> school , teacher , child
	 */
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		String[] text = {"school" , "teacher" , "child" ,"father" , "love"};
		System.out.println(Arrays.toString(text));
		
		System.out.print("검색할 단어를 입력하세요 : ");
		String word = scan.nextLine();
		
		//검색 단어 찾을 때마다 갯수를 세는 count 변수
		int count = 0;
		
		//반복문, text.length 만큼 돌아줌 (5)
		for(int i = 0; i < text.length; i++) {
			System.out.println("==================================");
			//같은 단어를 찾으면 체크해 줄 check 변수
			boolean check = false;
			//반복문, (현재 검색할 단어의 길이 - 찾을 단어)까지   
			for(int j = 0; j <= text[i].length() - word.length(); j++) {
				//count 초기화(한번 검색할 때마다 count 초기화)
				count = 0;
				//반복문, 찾을 단어만큼
				for(int r = 0; r < word.length(); r++) {
					System.out.println(i+1 + "번째 단어 찾기: " + text[i].charAt(j+r) + " " + word.charAt(r));
					//조건. 현 단어의 각각 값과 검색 단어의 각 값이 같으면, 
					if(text[i].charAt(j+r) == word.charAt(r)) {
						//count++;
						count++;
						//count == 검색 단어의 길이와 같으면,
						if(count == word.length()) {
							//check = true 주고, break;(검색할 단어가 포함 돼 있다는 것만 알면 ㅇㅋㅇㅋ)
							check = true;
							break;
						}
					}
				}
				System.out.println("----------------------------");
				if(check == true) {
					break;
				}
			}
			//조건. check == true 면, 출력하세요~	
			if(check == true) {
				System.out.println(text[i]);
			}
		}
}
}
