package daily_Quiz;

import java.util.Arrays;
import java.util.Scanner;

public class 배열3_알고리즘_배열중복삭제_정답 {
	/*
	 * 	 
	 * 
		 [문제] 값을 입력받고 삭제 
		 [조건] 만약에 같은값이 여러개 있으면 가장첫번째의 값  한개만 삭제 후 b 에 순차적으로 저장 
		 
		 		  data[] = {5,2,6,8,5,6};
		 		  
		 [예] 2 ==>  b [] = {5,6,8,5,6,0};
		 [예] 6 ==>  b [] = {5,2,8,5,6,0};
	 */
	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		
		int data[] = {5,2,6,8,5,6};
		int b [] = {0,0,0,0,0,0};
		
		//들어오는 값마다 검사
//		int count = 0;
//		for(int i = 0; i < data.length; i++) {
//			if(count == 0) {
//				b[count] = data[i];
//				count++;
//			}else {
//				int index = -1;
//				for(int j = 0; j < count; j++) {
//					if(b[j] == data[i]) {
//						System.out.println("기존값: " + b[j] + "|| 입력값: " + data[i]);
//						System.out.println("count: "+ count);
//						b[j] = 0;
//						index = j;
//						break;
//					}
//				}
//				if(index == -1) {
//					b[count] = data[i];
//					count++;
//				}else {
//					for(int j = index; j < count - 1; j++) {
//						b[j] = b[j+1];
//					}
//					b[count - 1] = data[i];
//				}
//			}
//			System.out.println(Arrays.toString(b));
//		}
		
		int index = -1;
		//전체반복
		//하나씩 전부 검사해서 중복값이 있으면 count++(*자기 자신은 항상 포함됨)
		//따라서 count == 2 인덱스 가져옴(바로 break;하면 첫번째 중복값의 첫번째 인덱스)
		//data[index]가 0이거나 index == -1 이면 중복값 없음 출력 후 break
		//index 값이 있으면 index == i 랑 같을 때 제외하고 b[]에 입력
		//** 그 후 꼭 data[] = b[] 해줘야 함 data[]값은 계속 똑같기 때문에! 아님 걍 data[]로만 돌리던가
		while(true) {
			index = -1;
			for(int i = 0; i < data.length; i++){
				int count = 0;
				for(int j = 0; j < data.length; j++) {
					if(data[i] == data[j]) {
						count++;
					}
				}
				if(count == 2) {
					index = i;
					break;
				}
			}
			if(index == -1 || data[index] == 0) {
				System.out.println("[중복값 없음]");
				break;
			}else {
				int bindex = 0;
				for(int i = 0; i < b.length; i++) {
					if(index != i) {
						b[bindex] = data[i];
						bindex++;
					}
				}
			}
			System.out.println(Arrays.toString(b));
			
			for(int i = 0; i < data.length; i++) {
				data[i] = b[i];
			}
		}
		
	}
}