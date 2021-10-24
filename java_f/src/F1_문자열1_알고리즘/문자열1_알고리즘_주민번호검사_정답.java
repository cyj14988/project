package F1_문자열1_알고리즘;

public class 문자열1_알고리즘_주민번호검사_정답 {
	public static void main(String[] args) {

		String jumin = "890101-2012932";
		
		// 문제 1) 성별 출력
		// 정답 1) 여성
		
		// 문제 2) 나이 출력
		// 정답 2) 30세
		
		System.out.print("성별 출력: ");
		System.out.println(jumin.charAt(7));
		if(jumin.charAt(7) == '2') {
			System.out.println("여성");
		}else {
			System.out.println("남성");
		}
		int year = 2021;
		
		System.out.print("나이 출력: ");
		System.out.println(jumin.substring(0, 2));
		String age = jumin.substring(0, 2);
		int a = Integer.parseInt(age);
		if(a <= (year - 2000)) {
			a += 2000;
		}else {
			a += 1900;
		}
		a = year - a;
		System.out.println(a + "살");
	}
}
