package F2_문자열2_알고리즘;

import java.util.Arrays;

public class 문자열2_알고리즘_형변환5_split구현_문제 {
	
	
	public static void main(String[] args) {

		String str = "aaa/bbbb/ccc";
		//String[] temp = str.split("/");
		
		// split은 자동으로 문자열을 배열로 만들어준다.
		// split을 사용하지않고 직접 잘라서 배열어 넣어보자.
		
		
		//문제)   구분자를 기준으로 str 의 내용을 잘라내서 temp2 배열에 저장 
		int count = 0;
		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i) == '/') {
				count++;
			}
		}
		int[] 구분자 = new int[count];
		String[] temp = new String[count+1];
		int index = 0;
		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i) == '/') {
				구분자[index] = i;
				index++;
			}
		}
		
		for(int i =0; i < temp.length; i++) {
			temp[i] = "";
		}
		
		index = 0;
		int tindex = 0;
		for(int i = 0; i < str.length(); i++) {
			if(구분자[index] == i) {
				tindex++;
				index++;
				if(index >= 구분자.length) {
					index-=1;
				}
			}else {
				temp[tindex] += str.charAt(i);
				System.out.println(Arrays.toString(temp));
			}
		}
		System.out.println(Arrays.toString(temp));
		
		
	}
}
