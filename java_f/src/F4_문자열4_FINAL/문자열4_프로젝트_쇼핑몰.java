package F4_문자열4_FINAL;

import java.util.Arrays;

public class 문자열4_프로젝트_쇼핑몰 {
	public static void main(String[] args) {
		
		String[][] memberList = {
			{"1", "qwer", "1234", "홍길동", "m",  "0", "2021-01-01 12:11:30"},
			{"2", "java", "1234", "김유신", "m",  "0", "2021-01-02 03:20:54"},
			{"3", "haha", "1234", "신혜정", "w", "0", "2021-01-07 07:24:14"},
			{"4", "tiger", "1234", "선우호랭", "w", "0", "2020-12-25 05:43:11"},
			{"5", "green", "1234", "정그린", "m", "0", "2018-06-12 07:21:08"}
		};
		
		// 아래 데이터는 그냥 문자열을 통째로 복붙한데이터이다. 이문자열을 다듬어서 bookList 배열에 저장한다. 
		String data = "INSERT INTO book VALUES(1001, '100', '나미야 잡화점의 기적', 15000, 10, '히가시노 게이고', '현대문학', '2019-01-11', 'nothing.jpg', '일본을 대표하는 소설가 히가시노 게이고의 신작', 10, '2019-01-15');\r\n"
				+ "INSERT INTO book VALUES(1002, '100', '연필로 쓰기', 18000, 80, '김훈', '문학동네', '2018-02-14', 'nothing.jpg', '70대의 김훈이 연필로 꾹꾹 눌러쓴 산문의 진경', 5, '2018-02-25');\r\n"
				+ "INSERT INTO book VALUES(1003, '100', '인간 실격', 20000, 50, '다자이 오사무', '민음사', '2016-11-20', 'nothing.jpg', '2019 상반기 종합 베스트셀러', 0, '2016-11-23');\r\n"
				+ "INSERT INTO book VALUES(1004, '100', '기묘한 신혼여행', 12000, 30, '정태원', '문학의 문학', '2017-04-20', 'nothing.jpg', '13편의 추리문학 걸작선', 20, '2017-04-21');\r\n"
				+ "INSERT INTO book VALUES(1005, '100', '우리가 인생이라 부르는 것들', 16000, 10, '정재찬', '인플루엔셀', '2020-02-25', 'nothing.jpg', '자기 삶의 언어를 찾는 열네 번의 시 강의', 0, '2020-02-27');\r\n"
				+ "INSERT INTO book VALUES(1006, '100', '어제의 세계', 18000, 80, '슈테판 츠바이크', '지식공작소', '2014-02-05', 'nothing.jpg', 'Die Welt von Gestern', 20, '2014-02-08');\r\n"
				+ "INSERT INTO book VALUES(2001, '200', '외국어 공부의 감각', 15000, 10, '아키야마 요헤이', '월북', '2011-03-11', 'nothing.jpg', '나는 어떻게 10개 국어를 말하게 되었나?', 25, '2011-03-13');\r\n"
				+ "INSERT INTO book VALUES(2002, '200', 'EBS 수능완성 고등 제2외국어', 28000, 20, 'EBS 편집부', 'EBS교육방송', '2014-08-14', 'nothing.jpg', '2014 학년도 수능 연계교재', 10, '2014-08-17');\r\n"
				+ "INSERT INTO book VALUES(2003, '200', '외국어 전파담', 23000, 70, '로버트 파우저', '혜화', '2012-10-03', 'nothing.jpg', '외국어는 어디에서 어디로', 10, '2012-10-05');\r\n"
				+ "INSERT INTO book VALUES(2004, '200', '아무튼_ 외국어', 22000, 50, '조지영', '위고', '2019-04-20', 'nothing.jpg', '모든 나라에는 철수와 영희가 있다', 10, '2019-04-28');\r\n"
				+ "INSERT INTO book VALUES(2005, '200', '구슬쌤의 예의 바른 영어 표현', 15000, 10, '구슬', '사람in', '2021-01-04', 'nothing.jpg', '유튜브 24만 구독자 구슬쌤이 알려 주는 영어표현', 10, '2021-01-05');\r\n"
				+ "INSERT INTO book VALUES(2006, '200', '시원스쿨 네이티브 5분 영어회화', 13500, 10, '박윤진', '시원스쿨닷컴', '2020-12-21', 'nothing.jpg', '하루 한 문장씩_ 오늘 배워 내일 쓰는', 0, '2020-12-24');\r\n"
				+ "INSERT INTO book VALUES(3001, '300', '컴퓨터 비전과 딥러닝', 35000, 70, '라쟈링가파 샨무갸마니', '에이콘', '2018-02-18', 'nothing.jpg', '텐서플로와 케라스를 사용한 전문 가이드', 5, '2018-02-22');\r\n"
				+ "INSERT INTO book VALUES(3002, '300', '쉽게 배우는 데이터 통신', 19000, 10, '박기현', '한빛아카데미', '2015-03-10', 'nothing.jpg', '데이터 통신과 컴퓨터 네트워크', 10, '2015-03-11');\r\n"
				+ "INSERT INTO book VALUES(3003, '300', '컴퓨터활용능력', 38000, 20, '이주희', '배움', '2012-09-24', 'nothing.jpg', '컴퓨터 자격증', 20, '2012-09-26');\r\n"
				+ "INSERT INTO book VALUES(3004, '300', '초등학생이 알아야할 숫자', 22000, 0, '엘리스 제임스', '어스본코리아', '2013-06-12', 'nothing.jpg', '컴퓨터와 코디 100가지', 10, '2013-06-18');\r\n"
				+ "INSERT INTO book VALUES(3005, '300', 'Java의 정석', 27000, 0, '남궁성', '도우출판', '2016-01-27', 'nothing.jpg', '자바의 기초부터 객체지향개념을 넘어 실정활용까지', 30, '2016-01-29');\r\n"
				+ "INSERT INTO book VALUES(3006, '300', '은노기의 JSP 2.3 웹 프로그래밍', 38000, 0, '김은옥', '삼양미디어', '2014-11-20', 'nothing.jpg', '기초부터 모델2 기반의 MVC패턴까지', 10, '2014-11-22');\r\n"
				+ "INSERT INTO book VALUES(3007, '300', '혼자 공부하는 자바', 24000, 1, '신용권', '한빛미디어', '2019-06-10', 'nothing.jpg', 'Java8 & 11 지원/무료 동영상 강의 제공', 10, '2019-06-19');\r\n"
				+ "INSERT INTO book VALUES(3008, '300', '혼자 공부하는 자바스크립트', 24000, 0, '윤인성', '한빛미디어', '2021-01-04', 'nothing.jpg', '자바스크립트를 탄탄하게 시작하고 싶을 때', 10, '2021-01-09');\r\n"
				+ "INSERT INTO book VALUES(3009, '300', '모던 자바 인 액션', 34000, 5, '라울', '한빛미디어', '2019-08-01', 'nothing.jpg', '전문가를 위한 자바 8_9_10 기법 가이드', 10, '2019-08-02');";
			
		//[1단계] 메모장에서는 줄바꿈을 할때 \r\n 으로 한다. 메모장에서 복붙하니 "\r\n" 으로 잘라준다.
		String data2[] = data.split("\r\n");
		
		//System.out.println(Arrays.toString(data2));
		
		String[][] bookList = new String[data2.length][];
		
		/*
		 * [2단계]  INSERT INTO book VALUES(  ==> 사용하지않는 앞부분 을 제거한다. 
		 * [3단계]  );  ==> 사용하지않는 뒷부분 을 제거한다. 	
		 * [4단계]  '' 홑따옴표를 제거한다 	             					
		 */
		for(int i = 0; i < data2.length; i++) {
			// indexOf() ==> 소괄호안의 문자의 인덱스를 출력해준다.		
			int index = data2[i].indexOf('(');						
			if(index != -1) {
				//불필요한 앞부분 뒷부분제거한다.
				data2[i] = data2[i].substring(index + 1, data2[i].length());
				//System.out.println("전: " +  data2[i]);
				data2[i] = data2[i].substring(0, data2[i].length()-2);
				//System.out.println("후: " +  data2[i]);
			}
			
			// replace() ==> 소괄호 안의 문자를 교체해준다. 지금은 \' 을 "" 공백으로 바꾼다. 
			data2[i] = data2[i].replace("\'", "");
			
			
			String data3[] = data2[i].split(",");
			
			bookList[i] = new String[data3.length];
			
			for(int j = 0; j < data3.length; j++) {
				// trim() ==>  최종적으로 여백을 삭제후 저장한다. 
				bookList[i][j] = data3[j].trim();
			}
			
			//System.out.println(Arrays.toString(data3));
		}
		for(int i = 0; i < bookList.length; i++) {
			System.out.println(Arrays.toString(bookList[i]));
		}
		
		
		String[][] cartList = {
				{"1", "qwer", "24300", "1", "3005", "Java의 정석", "nothing.jpg"},
				{"2", "tiger", "24300", "1", "3005", "Java의 정석", "nothing.jpg"},
				{"3", "haha", "19800", "1", "2004", "아무튼,외국어", "nothing.jpg"},
				{"4", "tiger", "17000", "1", "1003", "인간 실격", "nothing.jpg"},
				{"5", "haha", "34200", "1", "3006", "은노기의 JSP 2.3 웹 프로그래밍", "nothing.jpg"},
				{"6", "tiger", "13500", "1", "1001", "나미야 잡화점의 기적", "nothing.jpg"},
		
		};
	
				//# 문제) member테이블에서 전체 회원 수 가져오기
					int count = 0;
					for(int i = 0; i < memberList.length; i++) {
						count++;
					}
					System.out.println(count+"명");
					
					System.out.println("--------------------------------------------");
				//# 문제) member테이블에서 남자 회원의 수 가져오기
					count = 0;
					for(int i = 0; i < memberList.length; i++){
						String gender = memberList[i][4];
						if(gender.equals("m")) {
							count++;
						}
					}
					System.out.println("남자 회원 수: " + count + "명");
					System.out.println("--------------------------------------------");
				//# 문제) book테이블에서 전체 도서 가격의 총합 가져오기				
					int total = 0;
					for(int i = 0; i < bookList.length; i++) {
						total += Integer.parseInt(bookList[i][3]);
					}
					System.out.println("총합: "+ total +"원");
					System.out.println("--------------------------------------------");
				//# 문제) book테이블에서 전체 도서 가격의 평균 가져오기
				//# 조건) 소수점 이하 2가지까지 출력	
					total = 0;
					double count1 = 0;
					for(int i = 0; i < bookList.length; i++) {
						total += Integer.parseInt(bookList[i][3]);
						count1++;
					}
					System.out.printf("평균: %.2f 원\n", total/count1);
					System.out.println("--------------------------------------------");
				//# 문제) book테이블에서 도서 가격을 10%로 인상했을 때의 총합 가져오기	
					total = 0;
					for(int i = 0; i < bookList.length; i++) {
						total += Integer.parseInt(bookList[i][3])*1.1;
					}
					System.out.println(total +"원");
					System.out.println("--------------------------------------------");
				//# 문제) book테이블에서 도서 가격이 가장 높은 도서가격 가져오기
					int max = 0;
					for(int i = 0; i < bookList.length; i++) {
						int temp = Integer.parseInt(bookList[i][3]);
						if(temp > max) {
							max = temp;
						}
					}
					System.out.println("가장 높은 가격: " + max +"원");
					System.out.println("--------------------------------------------");
				//#--------------------------------------------------------------
	
				//# 문제) member테이블에서 회원의 수를 성별로 가져오기			
				int m = 0;
				int w = 0;
				for(int i = 0; i < memberList.length; i++) {
					String gender = memberList[i][4];
					if(gender.equals("m")) {
						m += 1;
					}else {
						w += 1;
					}
				}
				System.out.println("[m: " + m + "명 || w: " + w +"명]");
				System.out.println("--------------------------------------------");
				//# 문제) book테이블에서 도서 종류별 도서 수량 가져오기			
				String[] kind = new String[bookList.length];
				count = 0;
				for(int i = 0; i < bookList.length; i++) {
					String temp = bookList[i][1];
					boolean check = false;
					for(int j = 0; j < count; j++) {
						if(temp.equals(kind[j])) {
							check = true;
							break;
						}
					}
					if(check == false) {
						kind[count] = temp;
						count++;
					}
				}
				//System.out.println(Arrays.toString(kind));
				String[][] bookKind = new String[count][2];
				for(int i = 0; i < bookKind.length; i++) {
					bookKind[i][0] = kind[i];
				}
				for(int i = 0; i < bookKind.length; i++) {
					String temp = bookKind[i][0];
					int same = 0;
					for(int j = 0; j < bookList.length; j++) {
						if(temp.equals(bookList[j][1])) {
							same ++;
							bookKind[i][1] = same +""; 
						}
					}
				}
				for(int i = 0; i < bookKind.length; i++) {
					System.out.print(bookKind[i][0] + ": ");
					System.out.println(bookKind[i][1] +"권");
				}
				System.out.println("--------------------------------------------");
			
				//# 문제) cart테이블에서 회원별로 구입한 총 수량 가져오기
				//#조건) 내림차순 정렬하기
				String id[] = new String[cartList.length];
				count = 0;
				for(int i = 0; i < cartList.length; i++) {
					boolean check = false;
					for(int j = 0; j < count; j++) {
						if(id[j].equals(cartList[i][1])) {
							check = true;
							break;
						}
					}
					if(check == false) {
						id[count] = cartList[i][1];
						count++;
					}
				}
				String[][] idCart = new String[count][2];
				
				for(int i = 0; i < idCart.length; i++) {
					idCart[i][0] = id[i];
				}
				
				for(int i = 0; i < idCart.length; i++) {
					String temp = idCart[i][0];
					int sum = 0;
					for(int j = 0; j < cartList.length; j++) {
						if(temp.equals(cartList[j][1])) {
							sum++;
							idCart[i][1] = sum +"";
						}
					}
				}
				
				for(int i = 0; i < idCart.length; i++) {
					int str = Integer.parseInt(idCart[i][1]);
					for(int j = 0; j < i; j ++) {
						int str2 = Integer.parseInt(idCart[j][1]);
						if(str > str2) {
							String[] temp = idCart[i];
							idCart[i] = idCart[j];
							idCart[j] = temp;
						}
					}
				}
				for(int i = 0; i < idCart.length; i++) {
					System.out.println(Arrays.toString(idCart[i]));
				}
				System.out.println("--------------------------------------------");
					
				//# 문제) cart테이블에서 회원이 구입한 도서의 수량이 2개 이상인 회원의 id 가져오기				
				
				//위 문제까지 구하고 나서, 
				for(int i = 0; i < idCart.length; i++) {
					int temp = Integer.parseInt(idCart[i][1]);
					if(temp >= 2) {
						System.out.println(idCart[i][0]);
					}
				}
				System.out.println("--------------------------------------------");
				//이렇게 복잡하게 푸는 게 맞나..ㅎ...
				//내 계획
				//(1) 날짜 조건에 맞고, 개수 조건에 맞는 도서를 저장하기. 그 다음에 종류를 저장한 이차원 배열을 기준으로 검사해서 개수 세기.
				//# 문제) book테이블에서 2015년에서 2019년 사이에 출간한 도서 중에 개수가 3개 이하인 도서를 종류별로 가져오기
				String[][] bbook = new String[bookList.length][2];
				count = 0;
				for(int i = 0; i < bookList.length; i++) {
					String[] date = bookList[i][bookList[i].length-1].split("-"); //date[0] 해당 년도
					int temp = Integer.parseInt(date[0]);
					boolean check = false;
					int index = -1;
					if(temp >= 2015 && temp <= 2019) {
						int bookCount = Integer.parseInt(bookList[i][4]);
						if(bookCount <= 3) {
							for(int j = 0; j < count; j++) {
								if(bbook[j][0].equals(bookList[i][1])) {
									index = j;
									check = true;
									break;
								}
							}
							if(check == false) {
								bbook[count][0] = bookList[i][1];
								bbook[count][1] = 1 + "";
								count++;
							}else {
								int sum = Integer.parseInt(bbook[index][1]);
								sum++;
								bbook[index][1] = sum +"";
								//System.out.println("sum: " + sum);
							}
						}
					}
				}
				for(int i = 0; i < count; i++) {
					System.out.println(Arrays.toString(bbook[i]));
				}
				System.out.println("--------------------------------------------");
						
				//# 문제) cart테이블에서 buyer의 이름과 cart의 가격 가져오기
				String buyerList[][] = new String[cartList.length][2];
				count = 0;
				
				for(int i = 0; i < cartList.length; i++) {
					boolean check = false;
					int index = -1;
					for(int j = 0; j < count; j ++) {
						if(buyerList[j][0].equals(cartList[i][1])) {
							check = true;
							index = j;
							break;
						}
					}
					if(check == false) {
						buyerList[count][0] = cartList[i][1];
						buyerList[count][1] = cartList[i][2];
						count++;
					}else {
						int temp = Integer.parseInt(buyerList[index][1]);
						temp += Integer.parseInt(cartList[i][2]);
						buyerList[index][1] = temp + "";
					}
				}
				for(int i = 0; i < count; i++) {
					System.out.println("변경 전: " + Arrays.toString(buyerList[i]));
				}
				
				for(int i = 0; i < count; i++) {
					for(int j = 0; j < memberList.length; j++) {
						if(buyerList[i][0].equals(memberList[j][1])) {
							buyerList[i][0] = memberList[j][3];
							break;
						
						}
					}
				}
				for(int i = 0; i < count; i++) {
					System.out.println("변경 후: " + Arrays.toString(buyerList[i]));
				}
				System.out.println("--------------------------------------------");
				//# 문제) cart테이블에서 회원이 구매한 도서의 할인되기 전의 가격과 할인율 가져오기
				for(int i = 0; i < cartList.length; i++) {
					String idName = cartList[i][1];
					String book = cartList[i][5];
					for(int j = 0; j < bookList.length; j++) {
						if(cartList[i][5].equals(bookList[j][2])) {
							System.out.println(idName +": " + book +", " + bookList[j][3] +", " + bookList[j][10] +"%");
						}
					}
				}
				System.out.println("--------------------------------------------");	
				
				//# 문제) cart테이블에서 회원이 구매한 도서의 할인되기 전의 가격이 2만원 이상인 도서정보와 할인율 가져오기
				for(int i = 0; i < cartList.length; i++) {
					for(int j = 0; j < bookList.length; j++) {
						int cost = Integer.parseInt(bookList[j][3]);
						if(cartList[i][5].equals(bookList[j][2]) && cost >= 20000) {
							System.out.println(Arrays.toString(bookList[j]));
						}
					}
				}
				System.out.println("--------------------------------------------");	
				
				//# 문제) cart테이블에서 buyer의 이름과 cart의 가격 가져오기
				for(int i = 0; i < cartList.length; i++) {
					String idName = cartList[i][1];
					for(int j = 0; j < memberList.length; j++) {
						if(idName.equals(memberList[j][1])) {
							System.out.println(idName +"(" + memberList[j][3] +"): "  + cartList[i][2] +"원");
						}
					}
				}
				System.out.println("--------------------------------------------");	
				
				//# 문제) cart테이블에서 회원이 구매한 도서의 할인되기 전의 가격과 할인율 가져오기
				for(int i = 0; i < cartList.length; i++) {
					for(int j = 0; j < bookList.length; j++) {
						if(cartList[i][4].equals(bookList[j][0])) {
							System.out.println(cartList[i][1] +": " + bookList[j][3] + ", " + bookList[j][bookList[0].length-2]);
						}
					}
				}
				System.out.println("--------------------------------------------");	
			
				// # 문제) book테이블에서 전체 평균 가격보다 더 높은 도서정보 가져오기
				total = 0;
				for(int i = 0; i < bookList.length; i++) {
					total += Integer.parseInt(bookList[i][3]);
				}
				int avg = total / bookList.length;
				System.out.println("평균: " + avg +"원");
				for(int i = 0; i < bookList.length; i++) {
					int cost = Integer.parseInt(bookList[i][3]);
					if(cost > avg) {
						System.out.println(Arrays.toString(bookList[i]));
					}
				}
				System.out.println("--------------------------------------------");	
				
				// memberList [번호, 아이디, 비밀번호, 이름, 성별, 구매수량?, 가입일자]
				// bookList [번호, 종류, 책이름, 가격, 수량, 저자, 출판사, 출판일, 이미지, 내용, 할인율, 마지막 구매일?]
				// cartList [번호, 아이디, 가격, 수량, 책번호, 책이름, 이미지]	
				//# book테이블에서 가장 가격이 높은 도서 정보 가져오기
				max = 0;
				for(int i = 0; i < bookList.length; i++) {
					int cost = Integer.parseInt(bookList[i][3]);
					if(cost > max) {
						max = cost;
					}
				}
				for(int i = 0; i < bookList.length; i++) {
					if(bookList[i][3].equals(max+"")) {	
						System.out.println(Arrays.toString(bookList[i]));
					}
				}
	}
}
