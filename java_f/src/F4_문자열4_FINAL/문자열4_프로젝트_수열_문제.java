package F4_문자열4_FINAL;

import java.util.Arrays;

public class 문자열4_프로젝트_수열_문제 {
	/*
    	다음은 읽고 말하기 수열의 규칙입니다.
  
  		1, 11, 12, 1121, 122111, 112213
  
	 	첫번째 수열 : 1
	 	두번째 수열 : 1이 1개 = 11
	 	세번째 수열 : 1이 2개 = 12
	 	네번째 수열 : 1이 1개, 2가 1개 = 1121
	 	다섯번째 수열 : 1이 2개, 2가 1개, 1이 1개 = 122111
	 	여섯번재 수열 : 1이 1개, 2가 2개, 1이 3개 = 112213
		1   
		11 
		12 
		1121
		122111
		112213
		12221131
		1123123111
		12213111213113
		11221131132111311231
		
		
		12221231123121133112213111
		1123112131122131112112321222113113
		1221311221113112221131132112213121112312311231
		11221131122213311223123112312112221131112113213111213112213111
		이런식으로 가나...
		
	 	이러한 수열의 10번째 숫자를 프로그램을 만들어 찾으시오.
	 */
	public static void main(String[] args) {
	
		int arr[] = new int[100];
		//계속 리셋될 임시 배열
		int temp[] = new int[100];
		int count = 0;
		int tin = 0;
		
		//총 10번 도는 반복문
		for(int i = 0; i < 10; i++) {
			//한번도 안 들어왔을 땐, 1 넣어줌.
			if(count == 0) {
				arr[count] = 1;
				count++;
			}
			//그외, 
			else {
				//tin(리셋 배열 카운트) 리셋 (처음부터 하나씩 다시 넣어줄거니까)
				tin = 0;
				//기준 배열 count 까지 반복문(증감식은 넣지 않음, 시작 인덱스가 중복값 개수에 따라 달라지기 때문)
				for(int j = 0; j < count; ) {
					//중복 갯수 duplicate = 1 로 리셋(기준값을 정하는 순간 1번은 나왔기 때문)
					int duplicate = 1;
					//임시 배열[tin] = arr[j](기준값) 대입 후 , tin++;
					temp[tin] = arr[j];
					tin++;
					//기준 배열 + 1 부터 count 까지 반복문 
					for(int d = j + 1; d < count; d++) {
						//기준 배열과 검사 배열 값이 다르면 (중복 카운트를 끝내야 할 때가 오면) ex) {1(기준), 1, 2(여기)}, break;
						if(arr[j] != arr[d]) {
							break;
						}
						//duplicate++; 
						duplicate++;
					}
					//temp[tin] = duplicate 넣어주고, tin++;
					temp[tin] = duplicate;
					tin += 1;
					//j += duplicate (기준배열의 시작 인덱스는 중복값 개수에 따라 달라짐)
					j += duplicate;
				}
				//temp배열을 arr배열에 넣어주는 과정
				System.out.println();
				System.out.print((i+1) +"번째: ");
				int index = 0;
				for(int r = 0; r < tin; r++) {
					arr[index] = temp[r];
					System.out.print(arr[r] + " ");
					index++;
				}
				//count = tin (기준 배열의 개수(count)는 임시 배열의 개수(tin)와 같아져야 함)
				count = tin;
			}
		}
	}
}
