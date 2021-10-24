package F3_문자열3_프로젝트;

import java.util.Arrays;
import java.util.Scanner;

public class 문자열3_프로젝트_학생관리_문제 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int max = 100;
		String[][] dataList = new String[max][5];
		boolean check = false;
			
		String sample[][] = { 
				{ "1001", "qwer", "1234", "김철수", "10" }, 
				{ "1002", "asdf", "2345", "이영희", "30" }, };

		// 이차원 배열을 이용해서 crud 구현
		int size = 0;
		for (int i = 0; i < sample.length; i++) {
			for (int j = 0; j < sample[i].length; j++) {
				dataList[i][j] = sample[i][j];
			}
			size += 1;
		}

		while (true) {
			System.out.println(" [0]종료 [1]가입 [2]탈퇴 [3]수정 [4]검색 [5] 전체출력");
			int sel = scan.nextInt();
		}
	}
}
