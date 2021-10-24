package daily_Quiz;

import java.util.Arrays;

public class 배열4_알고리즘_펠린드롬2_문제 {
	/*
	  
	    [펠림드롬]
	    
	     -펠림드롬이란 앞에서 시작해도 뒤에서시작해도 똑같은 값이다.
	    
	  	위 배열에서 0이나 1을 제외한 나머지 값들이 페린드롬인지 출력한다.
		[예] 1과 0을 전부 제외하면 3,2,2,3 이므로 펠린드롬이다.
	 */
	public static void main(String[] args) {
		int arr[] = {0,3,2,2,2,2,1,1,0};
		int b[] = new int[arr.length];
		
		int count = 0;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] != 0 && arr[i] != 1) {
				count++;
			}
		}
		
		b = new int[count];
		int index = 0;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] != 0 && arr[i] != 1) {
				b[index] = arr[i];
				index++;
			}
		}
		System.out.println(Arrays.toString(b));
		
		count = count / 2;
		int duplicate = 0;
		index = b.length - 1;
		for(int i = 0; i < count; i++) {
			if(b[i] == b[index]) {
				System.out.println("같다: "  + i + " " + index);
				duplicate++;
				index--;
			}
		}
		if(duplicate == count) {
			System.out.println("팰린드롬");
		}
		
		
	}
}