package daily_Quiz;

public class 배열6_알고리즘_순서숫자찾기_정답 {
	/*
	 input 의 배열안의 값들이   array배열의 값들과 일치하고,
	  그순서도 일치하면  true , 아니면 false 출력 	
	  
	예) input1의 값들은  6,1,8  이고 array 의  
		index 5~7(6,1,8) 의 값과 순서가 일치한다.
	결과)  true	
		  	
	예) input2의 값들을 array 배열에 있는값들과 일치하지만, 
	   input2 순서가 6,3 이고, array 의 값은 3,6 으로 순서가 다르다.
	결과) false
*/
	public static void main(String[] args) {		
		int array[] = {1,3,3,6,5,6,1,8,9};	
		int input1[] = {6,1,8};
		int input2[] = {6,3};
		int win = 0;
		for(int i = 0; i < array.length - (input1.length-1); i++) {
			int count = 0;
			for(int j = 0; j < input1.length; j++) {
				System.out.print("[" + input1[j] + " " + array[j + i]  + "]");
							
				if(input1[j] == array[j + i]) {
					count += 1;
				}
			}
			System.out.println();
			if(count == 3) {
				win = 1;
			}
		}
		if(win == 1) {
			System.out.println("있다.");
		}else {
			System.out.println("없다.");
		}
		
	}
}