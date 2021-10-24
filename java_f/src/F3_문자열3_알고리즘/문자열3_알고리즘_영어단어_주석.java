package F3_문자열3_알고리즘;

import java.util.Random;
import java.util.Scanner;

public class 문자열3_알고리즘_영어단어_주석 {
	public static void main(String[] args) {
		// 문제) 영어단어 맞추기
		// 영어단어가 전부 * 로 표시된다.
		// 영어단어를 입력받고 틀릴때마다 랜덤으로 한글자씩 벗겨진다. (점수는 5점씩 감점)
		// (조건) 만약에 같은 철자가 여러개면 한번에 벗겨진다.
		// 전부 벗겨지거나 맞추면 종료
		Random ran = new Random();
		Scanner scan = new Scanner(System.in);
		int score = 100;
		String word = "performance";
		String meaning = "공연";
		
		//word의 길이 변수
		int size = word.length();
		//각 인덱스마다 이미 나온 값인지 알 수 있는 체크 변수
		int check[] = new int[size]; // 힌트 체크를 통해서 확인할수있다.
		//랜덤값 
		int num = ran.nextInt(size);
		int count = 0;
		boolean win = false;
		
		//무한반복문
		while (true) {
			System.out.println("=====================================");
			System.out.println("뜻 : " + meaning);
			System.out.print("문제 : ");
			//조건. count != 0 이라면(첫 시작이 아니라면)
			if(count != 0) {
				//win = false; 
				win = false;
				//반복문. 단어의 길이만큼 
				for(int i = 0; i < word.length(); i++) {
					//랜덤 인덱스와 값이 같으면
					if(word.charAt(num) == word.charAt(i)) {
						//check[인덱스] = 1을 줌
						check[i] = 1;
					}
					//조건. check[인덱스]가 1이 아니라면(== 아직 힌트가 전부 안 나왔다면)
					if(check[i] != 1) {
						//win = true를 줌
						win = true;
					}
				}
			}
			//그외, win == true; (첫 번째는 무조건 win = true, 한번도 힌트를 준 적이 없으니까)
			else {
				win = true;
			}
			//반복문. 0부터 size 까지
			for (int i = 0; i < size; i++) {
				//조건. check[인덱스]가 1이면
				if(check[i] == 1) {
					//값을 출력
					System.out.print(word.charAt(i));
				}
				//아니라면 * 출력
				else {
					System.out.print("*");
				}
			}
			//win == false면(힌트가 전부 나옴), 실패 후 break;
			if(win == false) {
				System.out.println("\n실패");
				break;
			}
			//영단어 입력 받기
			System.out.println();
			System.out.println("영어단어를 입력하세요 >>> ");
			String me = scan.next();
			//조건. 정답이면 정답! 하고 break;
		    if(word.equals(me)) {
		    	System.out.println("정답!");
		    	break;
		    }
		    //그외(오답이면)
		    else {
		    	//무한반복문
			    while(true) {
				    //랜덤값 뽑음
			    	num = ran.nextInt(size);
				    //조건. check[num] != 1(1이면 이미 힌트로 제공된 값이라는 뜻)이면, break;
			    	if(check[num] != 1) {
				    	break;
				    }
			    }
			    //오답 --> score -= 5;
			    score -= 5;
			    count++;
			    System.out.println("틀림, 점수: " + score + "점\n랜덤: " + num);
		    }
		}
	}
}
