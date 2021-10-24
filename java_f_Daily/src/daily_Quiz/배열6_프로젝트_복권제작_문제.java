package daily_Quiz;

import java.util.Arrays;
import java.util.Random;

public class 배열6_프로젝트_복권제작_문제{
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
		
		Random ran = new Random();
		int[][] lottoSet = new int[5][7];

	}
}
