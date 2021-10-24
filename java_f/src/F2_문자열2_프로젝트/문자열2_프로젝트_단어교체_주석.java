package F2_문자열2_프로젝트;

import java.util.Arrays;
import java.util.Scanner;

public class 문자열2_프로젝트_단어교체_주석 {
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
		
		int gap = change.length() - word.length();
		
		//반복문, 0부터 (기존 길이 - 바꿀 단어 길이)까지 ex)  mus'ic'  기존길이(5)-바꿀단어길이(2) = 3까지 --> 0123
		for(int i = 0; i <= text.length()-word.length(); i++) {
			//바뀌는 문장을 임시로 저장해 줄 String temp 변수 선언
			String temp = "";
			//바꿀 단어가 있는지 확인할 boolean check 변수
			boolean check = false;
			//단어를 찾을 때마다 개수를 셀 count 변수
			int count = 0;
			//바꿀 단어의 위치를 저장할 인덱스 2개 변수
			int x = 0; //시작 위치 ex) 3 -- i
			int y = 0; //끝 위치  ex) 4 -- c
			//반복문, 바꿀 단어 길이 만큼
			for(int j = 0; j < word.length(); j++) {
				//출력~
				System.out.println(i+1 + "번째: 돈다: " + text.charAt(i+j) + "비교" + word.charAt(j));
				//기존 문장의 i(하나씩 커짐) + j(하나씩 커지고, 바꿀 단어 길이만큼까지) == 바꿀단어의 값이 같으면, 
					//ex)  첫번째 : [m -- i, u -- c] 두 번째: [u -- i, s -- c]
				if(text.charAt(i+j) == word.charAt(j)) {
					//count++;
					count++;
					//조건. 단어를 찾은 횟수 == 바꿀 단어의 길이가 같으면, 
						//예) [i -- i, c -- c] 2번
					if(count == word.length()) {
						// x = i(시작 인덱스) , y = i + j(끝 인덱스), check = true 주고 break;
						x = i;
						y = i+j;
						check = true;
						break;
					}
				}
			}
			//조건. check == true면,
			if(check == true) {
				//출력.
				System.out.println("찾았다: " + x + " " + y);
				//반복문. 시작 인덱스 전까지 기존 문장 임시 temp에 넣어줌
				for(int j = 0; j < x; j++) {
					temp += text.charAt(j);
				}
				//반복문. 수정된 단어 넣어줌
				for(int j = 0; j < change.length(); j++) {
					temp += change.charAt(j);
				}
				//반복문. 끝 인덱스부터 문장 마지막까지 넣어줌
					//** 만약 수정할 단어가 기존 단어의 길이와 다르고, 여러개라면 text의 길이는 계속 바뀌어야 함
				for(int j = y+1; j < text.length(); j++) {
					temp += text.charAt(j);
				}
				//수정된 문장 출력 확인
				System.out.println("temp: " + temp);
				//text 초기화 후 ,
				text ="";
				//temp의 문장을 text에 다시 넣어줌 
					//문제 상황 1) 기존문장: too 바꿀 단어: o 수정된 단어: er 
						//o를 찾고 er을 넣어주면 --> tero (기존 문장 길이가 바뀜)
							//문제 상황 2) 단어가 겹치면 무한 반복 도는데...ㅎ --> gap 만큼 더해주면 됨...
				for(int j = 0; j < temp.length(); j++) {
					text += temp.charAt(j);
				}
				System.out.println("text: " + text);
				//단어 길이가 서로 다를 경우(더 길 경우만), i += gap만큼 더해서 검사하지 못하도록 함
				if(gap > 0) {
					i += gap;
				}
			}
			System.out.println("===================================================================");
		}
		System.out.println(text);
	}
}
