package F3_문자열3_프로젝트;

import java.util.Arrays;
import java.util.Scanner;

public class 문자열3_프로젝트_장바구니검색_주석 {
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
		String search = scan.next();
		String[][] buy_item = {
				{"고래밥", "0"},
				{"새우깡", "0"},
				{"칸쵸", "0"}
		};
		
		for(int i = 0; i < user.length; i++) {
			String[] userList = user[i].split("/");
			if(userList[1].equals(search)) {
				String idNum = userList[0];
				
				for(int j = 0; j < cart.length; j++) {
					String[] cartList = cart[j].split("/");
					if(idNum.equals(cartList[0])) { //(상위조건)유저 정보의 아이디 번호와 카트의 아이디 번호가 같으면,
						String itemNum = cartList[1]; //카트에 실린 상품번호를 저장하고,
						
						for(int d = 0; d < item.length; d++) { //아이템 배열을 검사했을 때,
							String[] itemList = item[d].split("/"); 
							if(itemNum.equals(itemList[0])) { //카트의 상품번호와 아이템 배열의 상품번호가 같으면,
								int num = Integer.parseInt(buy_item[d][1]); 
								num += 1;
								buy_item[d][1] = num +"";
							}
						}
					}
				}
			}
		}
		for(int i = 0; i < buy_item.length; i++) {
			System.out.println(buy_item[i][0] +": " + buy_item[i][1] +"개");
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
		
		String[][] buyItem = {
				{"고래밥", ""},
				{"새우깡", ""},
				{"칸쵸", ""}
		};
		
		//이렇게 복잡하게 푸는게...맞나...?
		for(int i = 0; i < item.length; i++) {
			String itemList[] = item[i].split("/"); // {1001, 고래밥}
			int idindex = 0;
			String[] id = new String[3];
			for(int j = 0; j < cart.length; j++) {
				String cartList[] = cart[j].split("/"); // {3001, 1001}
				
				if(itemList[0].equals(cartList[1])) {
					
					for(int r = 0; r < user.length; r++) {
						String userList[] = user[r].split("/"); // {3001, 이만수}
						
						if(cartList[0].equals(userList[0])) {
							boolean duplicate = false;
							for(int d = 0; d < idindex; d++) {
								if(id[d].equals(userList[1])) {  // 이전에 이미 나온 이름이면
									duplicate = true;
									break;
								}
							}
							if(duplicate == false) { //한번도 안 나온 이름이면
								id[idindex] = userList[1]; //추가
								idindex++;
							}
						}
					}
				}
			}
			// 나온 이름들 buyItem 배열에 넣어줌
			for(int j = 0; j < idindex; j++) {
				buyItem[i][1] += id[j];
			}
		}
		for(int i = 0; i < buyItem.length; i++) {
			System.out.println(Arrays.toString(buyItem[i]));
		}
	}
}
