package 프로그래밍언어활용_정유진;

public class SumAvg {
	public static void main(String[] args) {
		/*
		 1부터 100까지의 합과 평균을 산출하는 프로그램을 작성하시오.
		 */
		
		int sum = 0;
		double avg = 0;
		for(int i = 1; i <= 100; i++) {
			sum += i;
		}
		avg  = sum / 100.0;
		
		System.out.println("합: " + sum);
		System.out.printf("평균: %.2f", avg);
		
	}
}
