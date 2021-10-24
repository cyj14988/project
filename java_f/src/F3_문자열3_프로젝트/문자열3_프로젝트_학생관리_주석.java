package F3_문자열3_프로젝트;

import java.util.Arrays;
import java.util.Scanner;

public class 문자열3_프로젝트_학생관리_주석 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int max = 100;
		String[][] dataList = new String[max][5];
		boolean check = false;
			
		String sample[][] = { 
				{ "1001", "qwer", "1234", "김철수", "10" }, 
				{ "1002", "asdf", "2345", "이영희", "30" }, };

		// 이차원 배열을 이용해서 crud 구현
		
		//샘플 정보를 dataList에 집어넣음
		int size = 0;
		for (int i = 0; i < sample.length; i++) {
			for (int j = 0; j < sample[i].length; j++) {
				dataList[i][j] = sample[i][j];
			}
			size += 1;
		}
		//무한반복문
		while (true) {
			System.out.println(" [0]종료 [1]가입 [2]탈퇴 [3]수정 [4]검색 [5] 전체출력");
			int sel = scan.nextInt();
			//조건1. sel == 0 이면, break;
			if (sel == 0) {
				break;
			}
			//조건2. sel == 1 (가입) 이면,
			else if (sel == 1) {
				//조건2-1. size == max 면, 회원가입 불가
				if(size == max) {
					System.out.println("[회원가입 불가]");
					continue;
				}
				//아이디, 비번, 이름, 나이 입력받고 
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
				//중복 아이디 확인
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
				
			}
			//조건3. sel == 2 (탈퇴) 이면,
			else if(sel == 2) {
				//조건3-1. size == 0 이면, 탈퇴 불가능 
				if(size == 0) {
					System.out.println("[탈퇴 불가능]");
					continue;
				}
				//아이디, 비번 입력받고, 맞으면 탈퇴 처리 
				System.out.print("[탈퇴] 아이디: ");
				String id = scan.next();
				System.out.print("[탈퇴] 비밀번호: ");
				scan.nextLine();
				String pw = scan.nextLine();
				int index = -1;
				check = false;
				//검사 후, 인덱스 저장해서 
				for(int i = 0; i < size; i++) {
					if(dataList[i][1].equals(id) && dataList[i][2].equals(pw)) {
						index = i;
						check = true;
						break;
					}
				}
				//뒤에서 앞으로 정보 옮기기
				if(check == true) {
					for(int i = index; i < size-1; i++) {
						for(int j = 0; j < dataList[0].length; j++) {
							dataList[i][j] = dataList[i+1][j];
						}
					}
					//사이즈 하나 줄이고, 탈퇴 완료~
					size-=1;
					System.out.println("[탈퇴 완료]");
				}
			}
			//조건4. sel == 3 (수정) 이면,
			else if(sel == 3) {
				//조건4-1. size == 0 이면, 수정 불가능
				if(size == 0) {
					System.out.println("[수정 불가능]");
					continue;
				}
				// 아이디, 비번 입력받고 맞으면 수정처리
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
				
			}
			//조건5. sel == 4 (검색) 이면,
			else if(sel == 4) {
				System.out.println("[검색] 아이디나 이름으로 검색하세요. ");
				System.out.print("키워드: ");
				String search = scan.next();
				check = false;
				int index = -1;
				//이름 아이디, 찾아서 동일한 값이 있으면 출력
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
				
			}
			//조건6. sel == 5 (전체출력)이면, 
			else if (sel == 5) {
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
