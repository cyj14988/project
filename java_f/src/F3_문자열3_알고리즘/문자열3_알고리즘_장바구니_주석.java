package F3_문자열3_알고리즘;
import java.util.Scanner;
public class 문자열3_알고리즘_장바구니_주석 {
	/*
	 *  # 쇼핑몰 [장바구니]
	 * 1. 로그인 후 쇼핑 메뉴를 선택하면, 다음과 같이 상품목록을 보여준다.
	 * 	 (1) 사과 (2) 바나나 (3) 딸기 
	 * 2. 번호를 선택해 상품을 장바구니에 담을 수 있다.
	 * 3. 로그인 회원아이디 는 각 행의 첫번째 열에 저장한다.
	 * 4. 해당 회원이 구매한 상품은  각 행의 두번째 열에 저장한다.
	 * 예)
	 * {
	 * 		{qwer, 사과},				
	 * 		{javaking, 바나나},				
	 * 		{abcd, 사과},				
	 * 		{qwer, 딸기},		
	 * 		{qwer, 사과},			
	 * 		...
	 * }
	 * 5. 장바구니 메뉴를 선택하면 자기가 산 물품만 보이도록한다.
	 * 예)  qwer ==> 사과 , 딸기 , 사과
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] idList = {"qwer", "javaking", "abcd"};
		String[] pwList = {"1111", "2222", "3333"};
		int MAX_SIZE = 100;
		//cartList[][] 배열 선언 --> {아이디, 물품}
		String[][] cartList = new String[MAX_SIZE][2];
		boolean check = false;
		int count = 0;
		String[] items = {"사과", "바나나", "딸기"};
		//log 변수 선언
		int log = -1;
		
		//무한반복문
		while(true) {
			
			System.out.println("\n[MEGA MART]");
			System.out.println("[1]로 그 인");
			System.out.println("[2]로그아웃");
			System.out.println("[3]쇼     핑");
			System.out.println("[4]장바구니");
			System.out.println("[0]종     료");
			
			System.out.print("메뉴 선택 : ");
			int sel = scan.nextInt();
			//조건1. sel == 1이면, (로그인)
			if(sel == 1) {
				//조건1-1. log != -1 --> 로그인 상태라면,
				if(log != -1) {
					//로그아웃을 먼저해줘라~ continue;
					System.out.println("[로그아웃을 먼저 해주세요]");
					continue;
				}
				System.out.print("[로그인] 아이디: ");
				scan.nextLine();
				String id = scan.nextLine();
				System.out.print("\n[로그인] 비밀번호: ");
				String pw = scan.next();
				check = false;
				int idindex  = -1;
				for(int i = 0; i < idList.length; i++) {
					if(id.equals(idList[i]) && pw.equals(pwList[i])) {
							check = true;
							idindex = i;
							break;
					}
				}
				if(check == false) {
					System.out.println("[로그인 실패]");
					continue;
				}
				log = idindex;
				System.out.println(idList[log] + "님 안녕하세요!");
			}
			//조건2. sel == 2 이면, (로그아웃)
			else if(sel == 2) {
				if(log == -1) {
					System.out.println("[로그인을 먼저 해주세요]");
					continue;
				}
				System.out.println(idList[log] + "님 로그아웃 완료!");
				log = -1;
			}
			//조건3. sel == 3 이면, (쇼핑)
			else if(sel == 3) {
				if(log == -1) {
					System.out.println("[로그인 후 이용 가능합니다.]");
					continue;
				}
				//살수 있는 아이템 품목 출력
				System.out.println("=====MEGA MART=====");
				for(int i = 0; i < items.length; i++) {
					System.out.print("[" + (i+1) +"번] " + items[i] + " ");
				}
				//번호 입력
				System.out.print("\n[장바구니] 번호: ");
				int me = scan.nextInt();
				if(me < 1 || me > items.length) {
					System.out.println("번호 오류");
					continue;
				}
				//입력하면, cartList에 추가해줌
				cartList[count][0] = idList[log];
				cartList[count][1] = items[me-1];
				count++;
				System.out.println("[장바구니 추가 완료]");
			}
			//조건4. sel  == 4 이면, (장바구니)
			else if(sel == 4) {
				if(log == -1) {
					System.out.println("[로그인 후 이용가능합니다.]");
					continue;
				}
				//cartList에서 현재 로그인한 아이디랑 같은 거 찾아서 보여줌
				System.out.println("===" + idList[log] + "님의 장바구니 목록===");
				for(int i = 0; i < count; i++) {
					if(cartList[i][0].equals(idList[log])) {
						System.out.print(cartList[i][1] + " ");
					}
				}
				System.out.println();
				System.out.println("============================");
			}
			else if(sel == 0) {
				System.out.println("프로그램 종료");
				break;
			}		
		}
	}
}