package 프로그래밍언어활용_정유진;

import java.util.Scanner;

public class CountBox {
	public static void main(String[] args) {
		
		/*
		 사과를 담을 바구니의 개수를 구하는 프로그램을 작성하시오.
		 사과의 개수가 123이고, 하나의 바구니에 10개의 사과를 담을 수 있다면, 
		 13개의 바구니가 필요할 것이다.	
		 */
			
		 Scanner scan = new Scanner(System.in);
		 int limit = 10;
		 int basket = 0;
		 
		 System.out.print("사과: ");
		 int apple = scan.nextInt();
		 
		 basket = apple / limit;
		 if(apple % limit != 0) {
			 basket += 1;
		 }
		 
		 System.out.println("필요한 바구니: " + basket +"개");
		 
	}
}
