package F2_문자열2_알고리즘;

import java.util.Arrays;

public class 문자열2_알고리즘_형변환2_문제 {
	public static void main(String[] args) {

		// 문제) 이름은 name배열에 성적은 score배열에 각각 저장 및 출력
		
		String str = "김철수/87,이만수/42,이영희/95";
		
		String[] name = new String[3]; // 김철수,이만수,이영희
		int[] score = new int[3];      // 87,42,95
		
		String info[] = str.split(",");
		
		for(int i = 0; i < info.length; i++) {
			System.out.println(info[i]);
			String info2[] = info[i].split("/");
			System.out.println(Arrays.toString(info2));
			
			name[i] = info2[0];
			score[i] = Integer.parseInt(info2[1]);
		}
		
		System.out.println(Arrays.toString(name));
		System.out.println(Arrays.toString(score));
		
	}
}
