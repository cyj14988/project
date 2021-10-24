package daily_Quiz;

import java.util.Arrays;

public class 배열4_알고리즘_펠린드롬2_정답 {
	/*
	  
	    [펠림드롬]
	    
	     -펠림드롬이란 앞에서 시작해도 뒤에서시작해도 똑같은 값이다.
	    
	  	위 배열에서 0이나 1을 제외한 나머지 값들이 페린드롬인지 출력한다.
		[예] 1과 0을 전부 제외하면 3,2,2,3 이므로 펠린드롬이다.
	 */
	public static void main(String[] args) {
		int arr[] = {1,1,0,5,3,1,2,3,5};
		int count = 0;
		int Ncount = 0;
		int sameCount = 0;
		//반복문. arr[i] != 0 && arr[i] != 1 개수 세기
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] != 0 && arr[i] != 1) {
				Ncount++;
			}
		}
		//마지막 인덱스 변수(양 끝에서 확인 해야하니까)
		int last = arr.length-1;
		//반복문. 증감식은 X(내가 원할 때 멈춰서 검사해야 함)
		for(int i = 0; i < arr.length; ) {
			System.out.println(i + " " + last);
			//조건. arr[i] == 0 이거나 == 1이면, 
			if(arr[i] == 0 || arr[i] == 1) {
				//i++;  그리고 continue;
				i++;
				continue;
			}
			//조건. arr[last] == 0 이거나 == 1이면, 
			if(arr[last] == 0 || arr[last] == 1) {
				//last--;  그리고 continue;
				last--;
				continue;
			}
			//조건. arr[i] == arr[last] 이면, 
			if(arr[i] == arr[last]) {
				//sameCount++;
				System.out.println("같다: " + i + " " + last);
				sameCount++;
			}
			//기본 증감식
				//같든 다르든, count++ i++ last-- (count는 검사 횟수)
			count++;
			i++;
			last--;
			//조건. 검사 횟수가 Ncount/2 랑 같으면 break;
			if(count == Ncount/2) {
				break;
			}
		}
		//System.out.println(count);
		
		//조건. sameCount == Ncount/2 이면, 팰린드롬
		if(sameCount == Ncount/2) {
			System.out.println("펠린드롬입니다.");
		}else {
			System.out.println("펠린드롬이 아닙니다.");
		}
	}
}