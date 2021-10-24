package daily_Quiz;
import java.util.Arrays;
public class 배열5_알고리즘_압축하기_정답 {
	/*
		 위 데이터는 압축전 데이터이다.
		 연속으로 이뤄진 데이터를 모아 압축할려고한다.
		 예) 33    ==> {3,2}
		 예) 55555 ==> {5,5}
		 예) 3     ==> {3,1};
		 예) 444   ==> {4,3};
		  0번은 압축할값 , 1번은 연속된개수 
		 문제) 위 압축전데이터를 분석후 2차원으로 저장하시요.
	*/
	public static void main(String[] args) {	

		int 압축전[] = {3,3,5,5,5,5,5,3,4,4,4};		
		int 압축후[][] = new int[4][2];		
		
		int count = 0;//중복 횟수 카운트
		int x = 0;//압축후 인덱스 2개
		int y = 0;
		//압축후 첫 값에 압축전[0] 대입
		압축후[x][y] = 압축전[0];
		
		//압축후 != 압축전이면(값이 달라지면), 해당 1열에 count대입(중복횟수), 다음행 0열에 달라진 값(다음값)대입
		for(int i = 0; i < 압축전.length; i++) {
			if(압축후[x][y] != 압축전[i]) {
				압축후[x][y+1] = count;
				x = x + 1;
				압축후[x][y] = 압축전[i];
				count = 0;//값이 바뀔 때마다 중복횟수 카운트 리셋
			}
			count++;
		}
		//마지막 카운트 값은 입력되지 않으므로 따로 입력해줌
		압축후[x][y+1] = count; 
		//확인
		for(int i = 0; i < 압축후.length; i++) {
			System.out.println(Arrays.toString(압축후[i]));
		}
		
	}
}