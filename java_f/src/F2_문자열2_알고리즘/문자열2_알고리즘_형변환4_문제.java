package F2_문자열2_알고리즘;

public class 문자열2_알고리즘_형변환4_문제 {
	public static void main(String[] args) {
		
		String str = "김철수/87,이만수/42,이영희/95";
		
		// 위 데이터에서 꼴등을 삭제후 다시 문자열로 변경
		
		//1) 문자열을 잘라서 배열에 저장한다.
		//2) 배열에서 꼴등을 삭제한다
		//3) 삭제한배열을 다시 문자열로 만든다.
		
		// str = "김철수/87,이영희/95";
		
		String arr[] = str.split(",");
		str = "";
		int count = 0;
		for(int i = 0; i < arr.length - 1; i++) {
			str += arr[i];
			count++;
			if(count == 1) {
				str += ", ";
			}
		}
		System.out.println(str);
	}
}
