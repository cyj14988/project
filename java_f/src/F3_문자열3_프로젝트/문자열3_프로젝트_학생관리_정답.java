package F3_문자열3_프로젝트;

import java.util.Arrays;
import java.util.Scanner;

public class 문자열3_프로젝트_학생관리_정답 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int max = 100;
		String[][] dataList = new String[max][5];
		boolean check = false;
			
		String sample[][] = { 
				{ "1001", "qwer", "1234", "김철수", "10" }, 
				{ "1002", "asdf", "2345", "이영희", "30" }, };

		// 이차원 배열을 이용해서 crud 구현
		int size = 0;
		for (int i = 0; i < sample.length; i++) {
			for (int j = 0; j < sample[i].length; j++) {
				dataList[i][j] = sample[i][j];
			}
			size += 1;
		}

		while (true) {
			System.out.println(" [0]종료 [1]가입 [2]탈퇴 [3]수정 [4]검색 [5] 전체출력");
			int sel = scan.nextInt();
			if (sel == 0) {
				break;
			} else if (sel == 1) {
				if(size == max) {
					System.out.println("[회원가입 불가]");
					continue;
				}
				System.out.print("[회원가입] 아이디: ");
				String id = scan.next();
				System.out.print("[회원가입] 비밀번호: ");
				scan.nextLine();
				String pw = scan.nextLine();
				System.out.print("[회원가입] 이름:  ");
				String name = scan.next();
				System.out.print("[회원가입] 나이: ");
				String age = scan.next();
				
				check = false;
				for(int i = 0; i < size; i++) {
					if(dataList[i][1].equals(id)) {
						check = true;
						break;
					}
				}
				if(check == true) {
					System.out.println("[중복 아이디]");
					continue;
				}
				int num = size + 1000;
				
				dataList[size][0] = num +"";
				dataList[size][1] = id;
				dataList[size][2] = pw;
				dataList[size][3] = name;
				dataList[size][4] = age;
				size++;
				
			}else if(sel == 2) {
				if(size == 0) {
					System.out.println("[탈퇴 불가능]");
					continue;
				}
				System.out.print("[탈퇴] 아이디: ");
				String id = scan.next();
				System.out.print("[탈퇴] 비밀번호: ");
				scan.nextLine();
				String pw = scan.nextLine();
				int index = -1;
				check = false;
				for(int i = 0; i < size; i++) {
					if(dataList[i][1].equals(id) && dataList[i][2].equals(pw)) {
						index = i;
						check = true;
						break;
					}
				}
				if(check == true) {
					for(int i = index; i < size-1; i++) {
						for(int j = 0; j < dataList[0].length; j++) {
							dataList[i][j] = dataList[i+1][j];
						}
					}
					size-=1;
					System.out.println("[탈퇴 완료]");
				}
			}else if(sel == 3) {
				if(size == 0) {
					System.out.println("[수정 불가능]");
					continue;
				}
				System.out.print("[수정] 아이디: ");
				String id = scan.next();
				scan.nextLine();
				System.out.print("[수정] 비밀번호: ");
				String pw = scan.nextLine();
				int index = -1;
				check = false;
				for(int i = 0; i < size; i++) {
					if(dataList[i][1].equals(id) && dataList[i][2].equals(pw)) {
						index = i;
						check = true;
						break;
					}
				}
				if(check == false) {
					System.out.println("아이디와 비밀번호를 확인하세요");
					continue;
				}
				System.out.println("[기존] 비밀번호: " + dataList[index][2]);
				System.out.print("[수정] 비밀번호: ");
				String newPw = scan.nextLine();
				System.out.println("[기존] 이름: " + dataList[index][3]);
				System.out.print("[수정] 이름: ");
				String newName = scan.next();
				System.out.println("[기존] 나이: " + dataList[index][4]);
				System.out.print("[수정] 나이: ");
				String newAge = scan.next();
				
				dataList[index][2] = newPw;
				dataList[index][3] = newName;
				dataList[index][4] = newAge;
				
			}else if(sel == 4) {
				System.out.println("[검색] 아이디나 이름으로 검색하세요. ");
				System.out.print("키워드: ");
				String search = scan.next();
				check = false;
				int index = -1;
				for(int i = 0; i < size; i++) {
					if(dataList[i][1].equals(search) || dataList[i][3].equals(search)) {
						check = true;
						index = i;
						break;
					}
				}
				if(check == false) {
					System.out.println("[검색 결과 없습니다.]");
					continue;
				}
				System.out.println(Arrays.toString(dataList[index]));
				
			}else if (sel == 5) {
				for (int i = 0; i < size; i++) {
					for (int j = 0; j < dataList[i].length; j++) {
						System.out.print(dataList[i][j]+ " ");
					}
					System.out.println();
				}
			}
		}
	}
}
