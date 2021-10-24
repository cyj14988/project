package F2_문자열2_프로젝트;

import java.util.Arrays;
import java.util.Scanner;

public class 문자열2_프로젝트_단어검색_정답 {
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
		
		int count = 0;
		int index = 0;
		int tindex = 0;
		
		for(int i = 0; i < text.length; i++) {
			tindex = 0;
			boolean check = false;
			while(true) {
				index = 0;
				count = 0;
				for(int j = tindex; j < tindex + word.length(); j++) {
					//System.out.println("돈다~: " + text[i].charAt(j) +" " +  tindex + " " + (j+word.length()));
					if(text[i].charAt(j) == word.charAt(index)){
						count++;
						if(count == word.length()) {
						//	System.out.println("같다: " + text[i].charAt(j));
							check = true;
							break;
						}
					}else {
						count = 0;
					}
					index++;
				}
				tindex++;
				if(check == true) {
					System.out.println(text[i]);
					break;
				}
				if(tindex > text[i].length() - word.length()) {
					break;
				}
			}
		}
		
		
		
	}
}
