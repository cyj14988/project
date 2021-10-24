package F3_문자열3_프로젝트;

import java.util.Arrays;
import java.util.Scanner;

public class 문자열3_프로젝트_장바구니검색_정답 {
	public static void main(String[] args) {
		String itemData = "1001/고래밥,1002/새우깡,1003/칸쵸";
		String userData = "3001/이만수,3002/김철민,3003/이영희";
		
		String cartData = "";
		cartData += "3001/1001\n";
		cartData += "3001/1001\n";
		cartData += "3003/1002\n";
		cartData += "3001/1001\n";
		cartData += "3001/1003\n";
		cartData += "3003/1002\n";
		cartData += "3003/1001\n";
		cartData += "3002/1001";
		
		//문제1) 회원별 아이템 구매목록 출력 
		//예) 이만수==> 고래밥3,칸쵸1 / 김철민 ==> 고래밥1 / 이영희 ==> 고래밥2,새우깡1
		
		Scanner scan = new Scanner(System.in);
		
		String[] item = itemData.split(","); // item[0] => 1001/고래밥;
		String[] user = userData.split(","); // user[0] => 3001/이만수;
		String[] cart = cartData.split("\n"); // cart[0] => 3001/1001;
		
		System.out.print("[검색] 이름: ");
		String me = scan.nextLine();
		String userNum = "";
		String[][] soldList = new String[item.length][2];
		String[][] itemList = new String[item.length][2];
		
		
		for(int i = 0; i < soldList.length; i++) {
			String[] item2 = item[i].split("/");
			soldList[i][0] = item2[1];		
		//	System.out.println(soldList[i][0]);
		}
		
		boolean check = false;
		System.out.print("구매 목록: \n");
		for(int i = 0; i < user.length; i++) {
			String[] user2 = user[i].split("/");
			if(user2[1].equals(me)) {
				userNum = user2[0]; // 내가 입력한 이름의 회원번호 찾기
				check = true;
				break;
			}
		}
		for(int j = 0; j < cart.length; j++) {
			String[] cart2 = cart[j].split("/");
			if(cart2[0].equals(userNum)) { // 회원번호가 같으면,
				
				for(int d = 0; d < item.length; d++) {
					String[] item2 = item[d].split("/"); //회원번호가 담은 상품번호의 이름을 찾는다.
					if(cart2[1].equals(item2[0])) {//상품번호가 같으면,
							
						for(int r = 0; r < soldList.length; r++) { //내가 만든 배열의 값과 비교하는 반복문
							System.out.println(soldList[r][0] +" " + item2[1]);
							if(soldList[r][0].equals(item2[1])) { //해당 상품번호의 이름과 내 장바구니 배열의 이름이 같으면
								if(soldList[r][1] == null) {//한번도 들어온 적이 없으면
									soldList[r][1] = 1 +""; // 1 넣어주기
								}else {
									int num = Integer.parseInt(soldList[r][1]);
									num += 1;
									soldList[r][1] = num +"";
								}
							}
						}
					}
				}
			}
		}
		if(check == false) {
			System.out.println("[해당 회원정보가 없습니다.]");
		}else {
			for(int i = 0; i < soldList.length; i++) {
					System.out.print(soldList[i][0] + ": ");
					if(soldList[i][1] == null) {
						System.out.println("구매X");
					}else {
						System.out.print(soldList[i][1] +"개\n");
					}
			}
			
		}
		//문제2) 아이템별로 구입한 회원이름 출력 
		//예) 고래밥==> 이만수,김철민,이영희 / 새우깡==> 이영희 / 칸쵸==> 이만수
		
	/*	String itemData = "1001/고래밥,1002/새우깡,1003/칸쵸";
		String userData = "3001/이만수,3002/김철민,3003/이영희";
		
		String cartData = "";
		cartData += "3001/1001\n";
		cartData += "3001/1001\n";
		cartData += "3003/1002\n";
		cartData += "3001/1001\n";
		cartData += "3001/1003\n";
		cartData += "3003/1002\n";
		cartData += "3003/1001\n";
		cartData += "3002/1001";
	*/	
		System.out.println("====================================");
		String itemNum = "";
		String str = "";
		for(int i = 0; i < item.length; i++) {
			String[] item2 = item[i].split("/");
			itemList[i][0] = item2[1];
			itemList[i][1] = "";
		}
		
		for(int i = 0; i < itemList.length; i++) {
			str = "";
			String[] item2 = item[i].split("/");
			if(item2[1].equals(itemList[i][0])) {//아이템리스트(상품 이름)의 값과 상품정보의 상품이름이 같다면,
				itemNum = item2[0]; // 해당 상품 이름의 번호를 저장
			}
			
			for(int j = 0; j < cart.length; j++) {
				String[] cart2 = cart[j].split("/");
				if(cart2[1].equals(itemNum)) { // 카트의 상품번호와 내 상품번호가 같다면,
					
					for(int d = 0; d < user.length; d++) {
						String[] user2 = user[d].split("/"); 
						if(cart2[0].equals(user2[0])) {// 해당 카트의 유저번호와 유저배열의 유저 번호가 같다면,
							check = false;
							if(user2[1].equals(str)) {
								
							}else {
								itemList[i][1] += user2[1];
								str = user2[1];
							}
						}
					}
				}
			}
		}
		
		for(int i = 0; i < itemList.length; i++) {
			System.out.println(Arrays.toString(itemList[i]));
		}
		
		
		
		
		
	}
}
