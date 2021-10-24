package daily_Quiz;

import java.util.Arrays;
import java.util.Random;

public class 배열6_프로젝트_복권제작_정답 {
	/*
	 * [복권제작]
	 * 1. lottoSet 배열은 5 * 7 사이즈 배열이다. 
	 * 2. 복권1개당 7줄이고 , 총 5개의 복권을 만들려고 한다.  
	 * 3. 복권 1줄의 내용은 1또는 7을 랜덤을 저장한다. 
	 * 4. 복권 1줄은 7이 연속으로 3개이상이면 "당첨" 이고 그 미만은 "꽝" 이다.
	 * 5. 5개 복권중에 1개만 당첨이고 4개는 꽝인 복권을 랜덤으로 생성해보자.
	 * 
	 * 예) 아래와 같이 한줄만 "당첨" 이고 나머지 4개는 "꽝"이다.
	 * 1177117 (꽝)
	 * 1117771 (당첨)
	 * 7171117 (꽝)
	 * 7711771 (꽝)
	 * 7171717 (꽝)
	 * 
	 */
	public static void main(String[] args) {
		//로또 배열 5 * 7
		int[][] lottoSet = new int[5][7];
		Random ran = new Random();
		//당첨 여부 변수
		int winCount = 0;
		//무한 반복문
		for(int i = 0; i < 5; ) {
			//로또 뽑는 내부 반복문
			for(int j = 0; j < lottoSet[i].length; j++) {
				//랜덤 
				int r = ran.nextInt(2);
				//조건1. 랜덤 값이 0이면, 1대입
				if(r == 0) {
					lottoSet[i][j] = 1;
				}
				//조건2. 랜덤 값이 1이면, 7대입
				else if(r == 1) {
					lottoSet[i][j] = 7;
				}
			}
			//7개수 세는 카운트 변수
			int count = 0;
			//로또 당첨 배열이 나왔는지 확인하는 변수
			boolean check = false;
			//i행의 로또 반복문
			for(int j = 0; j < lottoSet[i].length; j++) {
				//조건1. 값이 7이면 count++;
				if(lottoSet[i][j] == 7) {
					count += 1;
					//조건1-1. count == 3이면, check = true 주고 break;
					if(count == 3) {
						check = true;
						break;
					}
				}
				//그외, count = 0; 처리
				else {
					count = 0;
				}
			}
			//check == true(해당 행 로또에서 연속 7이 나옴) 이고, winCount == 0(지금까지 당첨 로또 나온 적X) 이면,
			if(check == true && winCount == 0) {
				//winCount = 1(당첨 로또 나왔음), i+= 1;
				winCount = 1;
				i += 1;
			}
			//check == false(해당 행 당첨 로또 아님) 이고, winCount == 1(이전에 당첨 로또 나왔음)이면, i+=1
			else if(check == false && winCount == 1){
				i += 1;
			}			
		}	
		
		for(int i = 0; i < lottoSet.length; i++) {
			System.out.println(Arrays.toString(lottoSet[i]));
		}
		int r = ran.nextInt(lottoSet.length);
		
		int[] temp = lottoSet[0];
		lottoSet[0] = lottoSet[r];
		lottoSet[r] = temp;
		System.out.println("------------------");
		for(int i = 0; i < lottoSet.length; i++) {
			System.out.println(Arrays.toString(lottoSet[i]));
		}
		
	}
}