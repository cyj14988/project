package F3_문자열3_프로젝트;

public class 문자열3_프로젝트_도서연체_주석 {

	public static void main(String[] args) {
		String rentalData = "";		
		rentalData += "책번호/책제목/대여날짜/회원번호\n";
		rentalData += "20122/연필로쓰기/2020-11-25/1001\n";
		rentalData += "40143/외국어 공부의 감각/2020-11-27/1003\n";
		rentalData += "54321/컴퓨터활용능력/2020-11-27/1041\n";
		rentalData += "26543/아무튼,외국어/2020-12-01/1034";
		
		
		String userData = "";
		userData += "회원번호/책번호/대여일수(day)\n";
		userData += "1001/20122/10\n";
		userData += "1003/40143/8\n";
		userData += "1041/54321/5\n";
		userData += "1034/26543/2";
		
		//오늘 날짜 배열
		int[] today = {2020, 12, 4};
		//달 일수 배열 
		int[] monthList = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		//위 데이터는 도서관 책 대여 데이터이다.
		// 오늘은 12월4일 이라고했을때 연체한 회원번호 출력
		
		//오늘 날짜까지 총 며칠인지 구함
		int total = 0;
		total += today[0] * 365;
		for(int i = 0; i < today[1]-1; i++) {
			total += monthList[i];
		}
		total += today[2];
		System.out.println("현재: " + total);
		
		int rTotal = 0;
		
		//rentalData, userData 잘라서 넣어줌
		String[] rental = rentalData.split("\n");
		String[] user = userData.split("\n");
		
		//반복문( 1 ~ rental.길이까지) --> 1부터인 이유는 첫번 째줄은 값이 아니기 때문
			//첫 번째부터 날짜 다 더 해주고, 
				//회원 번호가 같으면, 대여 일수 ++; 
					//총값이 현재 날짜보다 적으면 연체
		for(int i = 1; i < rental.length; i++) {
			rTotal = 0;
			String[] rentalList = rental[i].split("/");
			String idNum = rentalList[3];
			String[] temp = rentalList[2].split("-");
			rTotal += Integer.parseInt(temp[0])*365;
			for(int r = 0; r < Integer.parseInt(temp[1])-1; r++) {			
				rTotal += monthList[r];
			}
			rTotal += Integer.parseInt(temp[2]);
			System.out.println("대출(합계 전): " + rTotal);
			
			for(int j = 1; j < user.length; j++) {
				String[] userList = user[j].split("/");
				if(idNum.equals(userList[0])) {
				 rTotal += Integer.parseInt(userList[2]);
				}
			}
			System.out.println("대출(합계 후): " + rTotal);
			if(rTotal < total) {
				System.out.println("연체: " + idNum);
			}
		}
		
		
	}
}
