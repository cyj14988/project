package F1_문자열1_기본이론;

import java.util.Scanner;

public class 문자열1_기본이론1_문자열입력1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		//문자열은 next() 를 사용한다. 단, 공백은 인식못한다.
		System.out.print("이름을 입력하세요 : ");
		String name = scan.next();

		System.out.println("name = " + name);

	}

}