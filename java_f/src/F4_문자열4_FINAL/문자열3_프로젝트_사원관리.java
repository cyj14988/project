package F4_문자열4_FINAL;

import java.util.Arrays;

public class 문자열3_프로젝트_사원관리 {
	public static void main(String[] args) {
		//[부서정보]
		//[부서번호,부서명,지역]
		String[][] departmentData = { 
				{ "10", "ACCOUNTING", "NEW YORK" }, 
				{ "20", "RESEARCH", "DALLAS" },
				{ "30", "SALES", "CHICAGO" }, 
				{ "40", "OPERATIONS", "BOSTON" }, 
			};
		// [사원정보]
		// [번호,이름,직책,상사번호,입사일,급여,커미션,부서번호]
		String[][] employeeData = { 
				{ "7369", "SMITH", "CLERK", "7902", "17-12-1980", "800", "0", "20" },
				{ "7499", "ALLEN", "SALESMAN", "7698", "20-2-1981", "1600", "300", "30" },
				{ "7521", "WARD", "SALESMAN", "7698", "22-2-1981", "1250", "500", "30" },
				{ "7566", "JONES", "MANAGER", "7839", "2-4-1981", "2975", "0", "20" },
				{ "7654", "MARTIN", "SALESMAN", "7698", "28-9-1981", "1250", "1400", "30" },
				{ "7698", "BLAKE", "MANAGER", "7839", "1-5-1981", "2850", "0", "30" },
				{ "7782", "CLARK", "MANAGER", "7839", "9-6-1981", "2450", "0", "10" },
				{ "7788", "SCOTT", "ANALYST", "7566", "13-7-1987", "3000", "0", "20" },
				{ "7839", "KING", "PRESIDENT", "NULL", "17-11-1981", "5000", "0", "10" },
				{ "7844", "TURNER", "SALESMAN", "7698", "8-9-1981", "1500", "0", "30" },
				{ "7876", "ADAMS", "CLERK", "7788", "13-7-1987", "1100", "0", "20" },
				{ "7900", "JAMES", "CLERK", "7698", "3-12-1981", "950", "0", "30" },
				{ "7902", "FORD", "ANALYST", "7566", "3-12-1981", "3000", "0", "20" },
				{ "7934", "MILLER", "CLERK", "7782", "23-1-1982", "1300", "0", "10" }
				};	
		
		// [월급 등급]
		// [등급 , 급여MIN , 급여MAX]
		int salaryGradeData[][] = { 
				{ 1, 700, 1200 }, // 1등급이고 급여 700~1200 사이
				{ 2, 1201, 1400 }, 
				{ 3, 1401, 2000 }, 
				{ 4, 2001, 3000 },
				{ 5, 3001, 9999 } };

		// 문제) # "DALLAS"에서 근무하는 사원의 이름,직급,부서번호,부서명을 조회하시오.	
		
		String departMentNumber = "";		
		for(int i = 0; i < departmentData.length; i++) {
			if(departmentData[i][2].equals("DALLAS")) {
				departMentNumber = departmentData[i][0];
			}
		}
		System.out.println(departMentNumber);	
		for(int i = 0; i  < employeeData.length; i++) {
			if(departMentNumber.equals(employeeData[i][7])) {
				System.out.println(Arrays.toString(employeeData[i]));
			}
		}
		
		System.out.println("========================================================");
		
		// 문제) # ALLEN과 같은 부서에 근무하는 사원의 이름, 부서번호를 조회하시오.
		String depNum = "";
		for(int i=0; i<employeeData.length; i++) {
			if(employeeData[i][1].equals("ALLEN")) {
				depNum = employeeData[i][7];
			}
		}
		
		for(int i=0; i<employeeData.length; i++) {
			if(depNum.equals(employeeData[i][7])) {
				System.out.println(employeeData[i][1] + " : " + employeeData[i][7]);
			}
		}		
		
		System.out.println("========================================================");
		 
		//#사원명과 부서명을 조회하시오.
		
		for(int i = 0; i < employeeData.length; i++) {
			String dpNum = employeeData[i][7];
			String name = employeeData[i][1];
			for(int j = 0; j < departmentData.length; j++) {
				if(departmentData[j][0].equals(dpNum)) {
					System.out.println(name + ": " + departmentData[j][1]);
				}
			}
			
		}
		
		System.out.println("========================================================");

	
		//#이름,월급,월급등급을 조회하시오.
		
		for(int i = 0; i < employeeData.length; i++) {
			String name = employeeData[i][1];
			int sal = Integer.parseInt(employeeData[i][5]);
			
			for(int j = 0; j < salaryGradeData.length; j++) {
				int min = salaryGradeData[j][1];
				int max = salaryGradeData[j][2];
				if(min <= sal && sal <= max) {
					System.out.println(name + ": " + sal + ", " + salaryGradeData[j][0]);
				}
			}
		}
		
		System.out.println("========================================================");
		
		//#이름,부서명,월급등급을 조회하시오.
		
		for(int i = 0;i < employeeData.length; i++) {
			String name = employeeData[i][1];
			String deNum = employeeData[i][7];
			int sal = Integer.parseInt(employeeData[i][5]);
			for(int j = 0; j < departmentData.length; j++) {
				if(departmentData[j][0].equals(deNum)) {
					deNum = departmentData[j][1];
					break;
				}
			}
			for(int j = 0; j < salaryGradeData.length; j++){	
				int min = salaryGradeData[j][1];
				int max = salaryGradeData[j][2];
				if(min <= sal && sal <= max) {
					sal = salaryGradeData[j][0];
					break;
				}
			}
			System.out.println(name +": " + deNum +", " + sal);
		}
		
		System.out.println("========================================================");
		 
		//#이름,직속상사이름을 조회하시오.
		
		for(int i = 0; i < employeeData.length; i++) {
			String name = employeeData[i][1];
			String Num = employeeData[i][3];
			boolean check = false;
			int index = -1;
			for(int j = 0; j < employeeData.length; j++) {
				if(employeeData[j][0].equals(Num)) {
					index = j;
					check = true;
					break;
				}
			}
			if(check == true) {
				System.out.println(name + "의 상사: " + employeeData[index][1]);
			}else {
				System.out.println(name + "의 상사: 없음");
			}
		}
		 
		System.out.println("========================================================");
		
		//# 이름,부서번호,부서이름을 조회하시오.
		
		for(int i = 0; i < employeeData.length; i++) {
			String name = employeeData[i][1];
			String deNum = employeeData[i][7];
			
			for(int j = 0; j < departmentData.length; j++) {
				if(departmentData[j][0].equals(deNum)) {
					System.out.println(name +": " + deNum +", " + departmentData[j][1]);
				}
			}
		}
		System.out.println("========================================================");
		
		//#부서번호가 30번인 사원들의 이름, 직급, 부서번호, 부서위치를 조회하시오.
		
		for(int i = 0; i < employeeData.length; i++) {
			String dpNum = employeeData[i][7];
			String dpName = "";
			if(dpNum.equals("30")) {
				for(int j = 0; j < departmentData.length; j++) {
					if(dpNum.equals(departmentData[j][0])) {
						dpName = departmentData[j][1];
						break;
					}
				}
				System.out.println(employeeData[i][1] +": " + employeeData[i][2] + " " + dpNum + ", " + dpName);
			}
		}
		System.out.println("========================================================");
		
		//#커미션을 받는 사원의 이름, 커미션, 부서이름,부서위치를 조회하시오.
		for(int i = 0; i < employeeData.length; i++) {
			String dpNum = employeeData[i][7];
			String dpName = "";
			String dploc = "";
			int cmm = Integer.parseInt(employeeData[i][6]);
			if(cmm != 0) {
				
				for(int j = 0; j < departmentData.length; j++) {
					if(departmentData[j][0].equals(dpNum)) {
						dpName = departmentData[j][1];
						dploc = departmentData[j][2];
						break;
					}
				}
				System.out.println(employeeData[i][1] + ": " + cmm + ", " + dpName + ", " + dploc);
			}
		}
		System.out.println("========================================================");

		//#DALLAS에서 근무하는 사원의 이름,직급,부서번호,부서명을 조회하시오.
		
		String dpNum = "";
		String dpName = "";
		for(int i = 0; i < departmentData.length; i++) {
			if(departmentData[i][2].equals("DALLAS")) {
				dpNum = departmentData[i][0];
				dpName = departmentData[i][1];
			}
		}
		for(int i = 0; i < employeeData.length; i++) {
			if(employeeData[i][7].equals(dpNum)) {
				System.out.println(employeeData[i][1] +": " + employeeData[i][2] +", " + employeeData[i][7] + ", " + dpName);
			}
		}
		System.out.println("========================================================");

		//# 이름에 A 가 들어가는 사원의 이름,부서명을 조회하시오.
		
		for(int i = 0; i < employeeData.length; i++) {
			int limit = employeeData[i][1].length();
			boolean check = false;
			int index = -1;
			for(int j = 0; j < limit; j++) {
				if('A' == employeeData[i][1].charAt(j)) {
					index = i;
					check = true;
					break;
				}
			}
			if(check == true) {
				dpNum = employeeData[index][7];
				for(int j = 0; j < departmentData.length; j++) {
					if(departmentData[j][0].equals(dpNum)) {
						dpName = departmentData[j][1];
						break;
					}
				}
				System.out.println(employeeData[index][1] + ": " + dpName);
				
			}
		}
		System.out.println("========================================================");

		//#이름, 직급, 월급여, 월급여등급을 조회하시오.
		
		for(int i = 0; i < employeeData.length; i++) {
			String name = employeeData[i][1];
			int sal = Integer.parseInt(employeeData[i][5]);
			int grade = 0;
			for(int j = 0; j < salaryGradeData.length; j++) {
				int min = salaryGradeData[j][1];
				int max = salaryGradeData[j][2];
				if(min <= sal && sal <= max) {
					grade = salaryGradeData[j][0];
					break;
				}
			}
			System.out.println(name + ": " + employeeData[i][2] +", " + sal + ", " + grade);
		}
		System.out.println("========================================================");

		//#ALLEN과 같은 부서에 근무하는 사원의 이름, 부서번호를 조회하시오.
		
		dpNum = "";
		int index = -1;
		for(int i = 0; i < employeeData.length; i++) {
			String name = employeeData[i][1];
			if(name.equals("ALLEN")) {
				index = i;
				dpNum = employeeData[i][7];
				break;
			}
		}
		for(int i = 0; i < employeeData.length; i++) {
			String name = employeeData[i][1];
			if(employeeData[i][7].equals(dpNum) && i != index) {
				System.out.println(name +": " + dpNum);
			}
		}
		System.out.println("========================================================");
		//# 사원명 'JONES'가 속한 부서명을 조회하시오.
		
		for(int i = 0; i < employeeData.length; i++) {
			String name = employeeData[i][1];
			if(name.equals("JONES")) {
				dpNum = employeeData[i][7];
				break;
			}
		}
		for(int i = 0; i < departmentData.length; i++) {
			if(dpNum.equals(departmentData[i][0])){
				System.out.println(departmentData[i][1]);
			}
		}
		System.out.println("========================================================");

		//# 10번 부서에서 근무하는 사원의 이름과 10번 부서의 부서명을 조회하시오.
		for(int i = 0; i < departmentData.length; i++) {
			if(departmentData[i][0].equals("10")) {
				System.out.println("10번의 부서명: " + departmentData[i][1]);
			}
		}
		for(int i = 0; i < employeeData.length; i++) {
			dpNum = employeeData[i][7];
			if(dpNum.equals("10")) {
				System.out.println(employeeData[i][1] + ": " + employeeData[i][7]);
			}
		}
		System.out.println("========================================================");

		//# 평균 월급여보다 더 많은 월급여를 받은 사원의 사원번호,이름,월급여 조회하시오.
		int total = 0;
		for(int i = 0; i < employeeData.length; i++) {
			int sal = Integer.parseInt(employeeData[i][5]);
			total += sal;
		}
		int avg = total / employeeData.length;
		
		System.out.println("평균급여: " + avg + "만원");
		for(int i = 0; i < employeeData.length; i++) {
			int sal = Integer.parseInt(employeeData[i][5]);
			if(sal > avg) {
				System.out.println(employeeData[i][0] +": " + employeeData[i][1] +", " + sal);
			}
		}
		System.out.println("========================================================");

		//# 부서번호가 20인 사원중에서 최대급여를 받는 사원과 동일한 급여를 받는 사원의 사원번호, 이름을 조회하시오.
		
		int max = 0;
		for(int i = 0; i < employeeData.length; i++) {
			dpNum = employeeData[i][7];
			if(dpNum.equals("20")) {
				int sal = Integer.parseInt(employeeData[i][5]);
				if(sal > max) {
					max = sal;
				}
			}
		}
		System.out.println("부서번호 20 사원들 중 최대급여: " + max +"만원");
		
		String maxx = max +"";
		for(int i = 0; i < employeeData.length; i++) {
			String sal = employeeData[i][5];
			if(maxx.equals(sal)) {
				System.out.println(employeeData[i][0] +": " + employeeData[i][1]);
			}
		}
		System.out.println("========================================================");
		
		//#부서 테이블과 사원테이블에서 사번, 사원명, 부서코드, 부서명을 검색하시오. ( 사원명 오름차순 정렬할 것 )
		
		String 정렬[][] = new String[employeeData.length][4]; // 사번, 사원명, 부서코드, 부서명만 넣어놓은 배열
		
		for(int i = 0; i < employeeData.length; i++) {
			dpNum = employeeData[i][7];
			for(int j = 0; j < departmentData.length; j++) {
				if(dpNum.equals(departmentData[j][0])) {
					dpName = departmentData[j][1];
					break;
				}
			}
			정렬[i][0] = employeeData[i][0];
			정렬[i][1] = employeeData[i][1];
			정렬[i][2] = dpNum;
			정렬[i][3] = dpName;
		}
		
		for(int i = 0; i < 정렬.length; i++) {
			System.out.println(Arrays.toString(정렬[i]));
		}
		System.out.println("----------------------------------------------------");
		
		for(int i = 0; i < 정렬.length; i++) {
			char str = 정렬[i][0].charAt(0);
			for(int j = 0; j < i; j++) {
				if(정렬[i][1].compareTo(정렬[j][1]) < 0) {
					String temp[] = 정렬[i];
					정렬[i] = 정렬[j];
					정렬[j] = temp;
				}
			}
		}
		for(int i = 0; i < 정렬.length; i++) {
			System.out.println(Arrays.toString(정렬[i]));
		}
	
		System.out.println("========================================================");

		//#사원 테이블과 급여 등급 테이블에서 사번, 사원명, 급여, 등급을 검색하시오. 
		 //단, 등급은 급여가 하한값과 상한값 범위에 포함되고 등급이 4이며 급여를 기준으로 내림차순정렬할 것.
			
		int count = 0;
		for(int i = 0; i < employeeData.length; i++) {
			int sal = Integer.parseInt(employeeData[i][5]);
				int min = salaryGradeData[3][1];
				max = salaryGradeData[3][2];
				if(min <= sal && sal <= max) {
					count++;
				}
		}
		String 급여[][] = new String[count][4];
		index = 0;
		
		for(int i = 0; i < employeeData.length; i++) {
			int sal = Integer.parseInt(employeeData[i][5]);
				int min = salaryGradeData[3][1];
				max = salaryGradeData[3][2];
				if(min <= sal && sal <= max) {
					급여[index][0] = employeeData[i][0];
					급여[index][1] = employeeData[i][1];
					급여[index][2] = sal +"";
					급여[index][3] = salaryGradeData[3][0]+""; 
					index++;
				}
		}
		
		for(int i = 0; i < 급여.length; i++) {
			System.out.println(Arrays.toString(급여[i]));
		}
		System.out.println("----------------------------------------------------");
		
		for(int i = 0; i < 급여.length; i++) {
			int sal1 = Integer.parseInt(급여[i][2]);
			for(int j = i; j < 급여.length; j++) {
				int sal2 = Integer.parseInt(급여[j][2]);
				if(sal1 < sal2) {
					String temp[] = 급여[i];
					급여[i] = 급여[j];
					급여[j] = temp;
				}
			}
		}
		for(int i = 0; i < 급여.length; i++) {
			System.out.println(Arrays.toString(급여[i]));
		}
		System.out.println("========================================================");
		
		//#부서 테이블, 사원 테이블, 급여등급 테이블에서 사번, 사원명, 부서명, 급여 , 등급을 검색하시오. 
		//단, 등급은 급여가 하한값과 상한값 범위에 포함되며 등급을 기준으로 내림차순 정렬할 것.
		
		String temp[][] = new String[employeeData.length][5];
		
		for(int i = 0; i < employeeData.length; i++) {
			temp[i][0] = employeeData[i][0];
			temp[i][1] = employeeData[i][1];
			dpNum = employeeData[i][7];
			
			int sal = Integer.parseInt(employeeData[i][5]);
			for(int j = 0; j < departmentData.length; j++) {
				if(dpNum.equals(departmentData[j][0])) {
					temp[i][2] = departmentData[j][1];
				}
			}
			for(int j = 0; j < salaryGradeData.length; j++) {
				int min = salaryGradeData[j][1];
				max = salaryGradeData[j][2];
				if(min <= sal && sal <= max) {
					temp[i][3] =  sal +"";
					temp[i][4] = salaryGradeData[j][0] +"";
				}
			}
		}
		for(int i = 0; i < temp.length; i++) {
			System.out.println(Arrays.toString(temp[i]));
		}
		System.out.println("---------------------------------------------");
		
		for(int i = 0; i < temp.length; i++) {
			int str = Integer.parseInt(temp[i][4]);
			for(int j = 0; j < i; j++) {
				int str2 = Integer.parseInt(temp[j][4]);
				if(str > str2) {
					String temp2[] = temp[i];
					temp[i] = temp[j];
					temp[j] = temp2;
				}
			}
		}
		for(int i = 0; i < temp.length; i++) {
			System.out.println(Arrays.toString(temp[i]));
		}
		System.out.println("========================================================");

		//#사원 테이블에서 사원명과 해당 사원의 관리자명을 검색하시오
		for(int i = 0; i < employeeData.length; i++) {
			String bossNum = employeeData[i][3];
			boolean check = false;
			index = -1;
			for(int j = 0; j < employeeData.length; j++) {
				if(bossNum.equals(employeeData[j][0])) {
					check = true;
					index = j;
					break;
				}
			}
			if(check == true) {
				System.out.println(employeeData[i][1] +"의 관리자: " + employeeData[index][1]);
			}else {
				System.out.println(employeeData[i][1] +"의 관리자: 없음");
			}
		}
		System.out.println("========================================================");

		//#사원 테이블에서 사원명, 해당 사원의 관리자명, 해당 사원의 관리자의 관리자명을 검색하시오
		for(int i = 0; i < employeeData.length; i++) {
			String bossNum = employeeData[i][3]; //사원1의 상사번호
			int index1 = -1;
			int index2 = -1;
			boolean check1 = false;
			boolean check2 = false;
			for(int j = 0; j < employeeData.length; j++) {
				if(employeeData[j][0].equals(bossNum)) { //상사번호랑 사원번호가 같으면
					String bossNum2 = employeeData[j][3]; //그 사원의 상사번호를 저장
					index1 = j;
					check1 = true;
					for(int r = 0; r < employeeData.length; r++) {
						if(employeeData[r][0].equals(bossNum2)) {
							index2 = r;
							check2 = true;
							break;
						}
					}
				}
			}
			if(check1 == true && check2 == true) { 
				System.out.println(employeeData[i][1] +"의 상사: " + employeeData[index1][1] +"의 상사: " + employeeData[index2][1]);
			}else if(check1 == false) {
				System.out.println(employeeData[i][1] +"의 상사: 없음");
			}else {
				System.out.println(employeeData[i][1] +"의 상사: " + employeeData[index1][1] +"의 상사: 없음");
			}
			
		}
		System.out.println("========================================================");

		//# 30번 부서의 이름과 그 부서에 근무하는 사원의 이름을 출력하시오.
		for(int i = 0; i < departmentData.length; i++) {	
			if(departmentData[i][0].equals("30")) {
				System.out.println("30번 부서: " + departmentData[i][1]);
				break;
			}
		}
		for(int i = 0; i < employeeData.length; i++) {
			dpNum = employeeData[i][7];
			if(dpNum.equals("30")) {
				System.out.println(employeeData[i][1]);
			}
		}
		System.out.println("========================================================");

		//#사원 테이블에서 MILLER 보다 늦게 입사한 사원의 사번, 이름, 입사일을 검색하시오(좀 식이 지저분함 다시 풀기~)
		
		int 입사일[] = new int[3];
		for(int i = 0; i < employeeData.length; i++) {
			if(employeeData[i][1].equals("MILLER")) {
				String[] temp2 = employeeData[i][4].split("-");
				index = 0;
				for(int j = 입사일.length-1; j >= 0; j--) {
					입사일[j] = Integer.parseInt(temp2[index]);
					index++;
				}
				break;
			}
		}
		System.out.println(Arrays.toString(입사일));
	
		for(int i = 0; i < employeeData.length; i++) {
			String[] temp2 = employeeData[i][4].split("-");
			int year = Integer.parseInt(temp2[2]);
			int month = Integer.parseInt(temp2[1]);
			int day = Integer.parseInt(temp2[0]);
			boolean check = false;
			
			if(입사일[0] < year) {
				check = true;
			}else if(입사일[0] == year && month > 입사일[1]) {
				check = true;
			}else if(입사일[0] == year && month == 입사일[1] && day > 입사일[2]) {
				check = true;
			}
			
			if(check == true) {
				System.out.println(employeeData[i][0] + ": " + employeeData[i][1] + ", " + employeeData[i][4]);
			}
		}
		System.out.println("========================================================");
		
		//# 사원 테이블에서 부서별 최대 급여를 받는 사원들의 사번, 이름, 부서코드, 급여를 검색하시오.
		for(int i = 0; i < departmentData.length; i++) {
			dpNum = departmentData[i][0];
			max = 0;
			index = -1;
			for(int j = 0; j < employeeData.length; j++) {
				int sal = Integer.parseInt(employeeData[j][5]);
				if(employeeData[j][7].equals(dpNum)) {
					if(max < sal) {
						max = sal;
						index = j;
					}
				}
			}
			if(index == -1) {
				System.out.println("[" + departmentData[i][1] +"] : 정보 없음" );
			}else {
				System.out.println("[" + departmentData[i][1] +"] " +  employeeData[index][0] +": " + employeeData[index][1] +", " + employeeData[index][7] + ", " + max);
			}
		}
		System.out.println("========================================================");
		
		//[부서정보] departmentData
		//[부서번호,부서명,지역]
		
		//[사원정보] employeeData
		//[번호,이름,직책,상사번호,입사일,급여,커미션,부서번호]
		
		//[월급 등급] salaryGradeData
		//[등급 , 급여MIN , 급여MAX]
		
		//#Salgrade가 2등급인 사원들의 평균 급여보다 적게 받는 사원 정보를 검색하시오.
		
		total = 0;
		count = 0;
		for(int i = 0; i < employeeData.length; i++) {
			int sal = Integer.parseInt(employeeData[i][5]);
			int min = salaryGradeData[1][1];
			max = salaryGradeData[1][2];
			if(min <= sal && sal <= max) {
				total += sal;
				count++;
			}
		}
		System.out.println(total + "만원 || " + count + "명 || " + total/count +"만원" );
		avg = total / count;
		
		for(int i = 0; i < employeeData.length; i++) {
			int sal = Integer.parseInt(employeeData[i][5]);
			if(sal < avg) {
				System.out.println(Arrays.toString(employeeData[i]));
			}
		}
	}
}