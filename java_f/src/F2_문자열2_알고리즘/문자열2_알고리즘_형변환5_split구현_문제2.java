package F2_문자열2_알고리즘;

import java.util.Arrays;

public class 문자열2_알고리즘_형변환5_split구현_문제2 {
	
	
	public static void main(String[] args) {

		String str = "aaa/bbbb/ccc";
		
		String[] temp = str.split("/");

		
		// split은 자동으로 문자열을 배열로 만들어준다.
		// split을 사용하지않고 직접 잘라서 배열어 넣어보자.
		
		
		//문제)   구분자를 기준으로 str 의 내용을 잘라내서 temp2 배열에 저장 
		String 구분자 = "/";
		String [] temp2 = null;
		int count = 0;
		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i) == '/') {
				count += 1;
			}
		}
		
		temp2 = new String[count  + 1];
		
		for(int i = 0; i < temp2.length; i++) {
			temp2[i] = "";
		}
		int k = 0;
		int i = 0;
		while(true) {
			if(str.charAt(k) != '/') {
				temp2[i] += str.charAt(k);
			}else {
				i += 1;
			}
			k += 1;
			if(k == str.length()) {
				break;
			}			
		}
		System.out.println(Arrays.toString(temp2));
	}
}
