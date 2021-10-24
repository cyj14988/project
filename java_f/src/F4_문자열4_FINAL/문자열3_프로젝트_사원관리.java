package F4_���ڿ�4_FINAL;

import java.util.Arrays;

public class ���ڿ�3_������Ʈ_������� {
	public static void main(String[] args) {
		//[�μ�����]
		//[�μ���ȣ,�μ���,����]
		String[][] departmentData = { 
				{ "10", "ACCOUNTING", "NEW YORK" }, 
				{ "20", "RESEARCH", "DALLAS" },
				{ "30", "SALES", "CHICAGO" }, 
				{ "40", "OPERATIONS", "BOSTON" }, 
			};
		// [�������]
		// [��ȣ,�̸�,��å,����ȣ,�Ի���,�޿�,Ŀ�̼�,�μ���ȣ]
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
		
		// [���� ���]
		// [��� , �޿�MIN , �޿�MAX]
		int salaryGradeData[][] = { 
				{ 1, 700, 1200 }, // 1����̰� �޿� 700~1200 ����
				{ 2, 1201, 1400 }, 
				{ 3, 1401, 2000 }, 
				{ 4, 2001, 3000 },
				{ 5, 3001, 9999 } };

		// ����) # "DALLAS"���� �ٹ��ϴ� ����� �̸�,����,�μ���ȣ,�μ����� ��ȸ�Ͻÿ�.	
		
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
		
		// ����) # ALLEN�� ���� �μ��� �ٹ��ϴ� ����� �̸�, �μ���ȣ�� ��ȸ�Ͻÿ�.
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
		 
		//#������ �μ����� ��ȸ�Ͻÿ�.
		
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

	
		//#�̸�,����,���޵���� ��ȸ�Ͻÿ�.
		
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
		
		//#�̸�,�μ���,���޵���� ��ȸ�Ͻÿ�.
		
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
		 
		//#�̸�,���ӻ���̸��� ��ȸ�Ͻÿ�.
		
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
				System.out.println(name + "�� ���: " + employeeData[index][1]);
			}else {
				System.out.println(name + "�� ���: ����");
			}
		}
		 
		System.out.println("========================================================");
		
		//# �̸�,�μ���ȣ,�μ��̸��� ��ȸ�Ͻÿ�.
		
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
		
		//#�μ���ȣ�� 30���� ������� �̸�, ����, �μ���ȣ, �μ���ġ�� ��ȸ�Ͻÿ�.
		
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
		
		//#Ŀ�̼��� �޴� ����� �̸�, Ŀ�̼�, �μ��̸�,�μ���ġ�� ��ȸ�Ͻÿ�.
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

		//#DALLAS���� �ٹ��ϴ� ����� �̸�,����,�μ���ȣ,�μ����� ��ȸ�Ͻÿ�.
		
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

		//# �̸��� A �� ���� ����� �̸�,�μ����� ��ȸ�Ͻÿ�.
		
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

		//#�̸�, ����, ���޿�, ���޿������ ��ȸ�Ͻÿ�.
		
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

		//#ALLEN�� ���� �μ��� �ٹ��ϴ� ����� �̸�, �μ���ȣ�� ��ȸ�Ͻÿ�.
		
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
		//# ����� 'JONES'�� ���� �μ����� ��ȸ�Ͻÿ�.
		
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

		//# 10�� �μ����� �ٹ��ϴ� ����� �̸��� 10�� �μ��� �μ����� ��ȸ�Ͻÿ�.
		for(int i = 0; i < departmentData.length; i++) {
			if(departmentData[i][0].equals("10")) {
				System.out.println("10���� �μ���: " + departmentData[i][1]);
			}
		}
		for(int i = 0; i < employeeData.length; i++) {
			dpNum = employeeData[i][7];
			if(dpNum.equals("10")) {
				System.out.println(employeeData[i][1] + ": " + employeeData[i][7]);
			}
		}
		System.out.println("========================================================");

		//# ��� ���޿����� �� ���� ���޿��� ���� ����� �����ȣ,�̸�,���޿� ��ȸ�Ͻÿ�.
		int total = 0;
		for(int i = 0; i < employeeData.length; i++) {
			int sal = Integer.parseInt(employeeData[i][5]);
			total += sal;
		}
		int avg = total / employeeData.length;
		
		System.out.println("��ձ޿�: " + avg + "����");
		for(int i = 0; i < employeeData.length; i++) {
			int sal = Integer.parseInt(employeeData[i][5]);
			if(sal > avg) {
				System.out.println(employeeData[i][0] +": " + employeeData[i][1] +", " + sal);
			}
		}
		System.out.println("========================================================");

		//# �μ���ȣ�� 20�� ����߿��� �ִ�޿��� �޴� ����� ������ �޿��� �޴� ����� �����ȣ, �̸��� ��ȸ�Ͻÿ�.
		
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
		System.out.println("�μ���ȣ 20 ����� �� �ִ�޿�: " + max +"����");
		
		String maxx = max +"";
		for(int i = 0; i < employeeData.length; i++) {
			String sal = employeeData[i][5];
			if(maxx.equals(sal)) {
				System.out.println(employeeData[i][0] +": " + employeeData[i][1]);
			}
		}
		System.out.println("========================================================");
		
		//#�μ� ���̺�� ������̺��� ���, �����, �μ��ڵ�, �μ����� �˻��Ͻÿ�. ( ����� �������� ������ �� )
		
		String ����[][] = new String[employeeData.length][4]; // ���, �����, �μ��ڵ�, �μ��� �־���� �迭
		
		for(int i = 0; i < employeeData.length; i++) {
			dpNum = employeeData[i][7];
			for(int j = 0; j < departmentData.length; j++) {
				if(dpNum.equals(departmentData[j][0])) {
					dpName = departmentData[j][1];
					break;
				}
			}
			����[i][0] = employeeData[i][0];
			����[i][1] = employeeData[i][1];
			����[i][2] = dpNum;
			����[i][3] = dpName;
		}
		
		for(int i = 0; i < ����.length; i++) {
			System.out.println(Arrays.toString(����[i]));
		}
		System.out.println("----------------------------------------------------");
		
		for(int i = 0; i < ����.length; i++) {
			char str = ����[i][0].charAt(0);
			for(int j = 0; j < i; j++) {
				if(����[i][1].compareTo(����[j][1]) < 0) {
					String temp[] = ����[i];
					����[i] = ����[j];
					����[j] = temp;
				}
			}
		}
		for(int i = 0; i < ����.length; i++) {
			System.out.println(Arrays.toString(����[i]));
		}
	
		System.out.println("========================================================");

		//#��� ���̺�� �޿� ��� ���̺��� ���, �����, �޿�, ����� �˻��Ͻÿ�. 
		 //��, ����� �޿��� ���Ѱ��� ���Ѱ� ������ ���Եǰ� ����� 4�̸� �޿��� �������� �������������� ��.
			
		int count = 0;
		for(int i = 0; i < employeeData.length; i++) {
			int sal = Integer.parseInt(employeeData[i][5]);
				int min = salaryGradeData[3][1];
				max = salaryGradeData[3][2];
				if(min <= sal && sal <= max) {
					count++;
				}
		}
		String �޿�[][] = new String[count][4];
		index = 0;
		
		for(int i = 0; i < employeeData.length; i++) {
			int sal = Integer.parseInt(employeeData[i][5]);
				int min = salaryGradeData[3][1];
				max = salaryGradeData[3][2];
				if(min <= sal && sal <= max) {
					�޿�[index][0] = employeeData[i][0];
					�޿�[index][1] = employeeData[i][1];
					�޿�[index][2] = sal +"";
					�޿�[index][3] = salaryGradeData[3][0]+""; 
					index++;
				}
		}
		
		for(int i = 0; i < �޿�.length; i++) {
			System.out.println(Arrays.toString(�޿�[i]));
		}
		System.out.println("----------------------------------------------------");
		
		for(int i = 0; i < �޿�.length; i++) {
			int sal1 = Integer.parseInt(�޿�[i][2]);
			for(int j = i; j < �޿�.length; j++) {
				int sal2 = Integer.parseInt(�޿�[j][2]);
				if(sal1 < sal2) {
					String temp[] = �޿�[i];
					�޿�[i] = �޿�[j];
					�޿�[j] = temp;
				}
			}
		}
		for(int i = 0; i < �޿�.length; i++) {
			System.out.println(Arrays.toString(�޿�[i]));
		}
		System.out.println("========================================================");
		
		//#�μ� ���̺�, ��� ���̺�, �޿���� ���̺��� ���, �����, �μ���, �޿� , ����� �˻��Ͻÿ�. 
		//��, ����� �޿��� ���Ѱ��� ���Ѱ� ������ ���ԵǸ� ����� �������� �������� ������ ��.
		
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

		//#��� ���̺��� ������ �ش� ����� �����ڸ��� �˻��Ͻÿ�
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
				System.out.println(employeeData[i][1] +"�� ������: " + employeeData[index][1]);
			}else {
				System.out.println(employeeData[i][1] +"�� ������: ����");
			}
		}
		System.out.println("========================================================");

		//#��� ���̺��� �����, �ش� ����� �����ڸ�, �ش� ����� �������� �����ڸ��� �˻��Ͻÿ�
		for(int i = 0; i < employeeData.length; i++) {
			String bossNum = employeeData[i][3]; //���1�� ����ȣ
			int index1 = -1;
			int index2 = -1;
			boolean check1 = false;
			boolean check2 = false;
			for(int j = 0; j < employeeData.length; j++) {
				if(employeeData[j][0].equals(bossNum)) { //����ȣ�� �����ȣ�� ������
					String bossNum2 = employeeData[j][3]; //�� ����� ����ȣ�� ����
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
				System.out.println(employeeData[i][1] +"�� ���: " + employeeData[index1][1] +"�� ���: " + employeeData[index2][1]);
			}else if(check1 == false) {
				System.out.println(employeeData[i][1] +"�� ���: ����");
			}else {
				System.out.println(employeeData[i][1] +"�� ���: " + employeeData[index1][1] +"�� ���: ����");
			}
			
		}
		System.out.println("========================================================");

		//# 30�� �μ��� �̸��� �� �μ��� �ٹ��ϴ� ����� �̸��� ����Ͻÿ�.
		for(int i = 0; i < departmentData.length; i++) {	
			if(departmentData[i][0].equals("30")) {
				System.out.println("30�� �μ�: " + departmentData[i][1]);
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

		//#��� ���̺��� MILLER ���� �ʰ� �Ի��� ����� ���, �̸�, �Ի����� �˻��Ͻÿ�(�� ���� �������� �ٽ� Ǯ��~)
		
		int �Ի���[] = new int[3];
		for(int i = 0; i < employeeData.length; i++) {
			if(employeeData[i][1].equals("MILLER")) {
				String[] temp2 = employeeData[i][4].split("-");
				index = 0;
				for(int j = �Ի���.length-1; j >= 0; j--) {
					�Ի���[j] = Integer.parseInt(temp2[index]);
					index++;
				}
				break;
			}
		}
		System.out.println(Arrays.toString(�Ի���));
	
		for(int i = 0; i < employeeData.length; i++) {
			String[] temp2 = employeeData[i][4].split("-");
			int year = Integer.parseInt(temp2[2]);
			int month = Integer.parseInt(temp2[1]);
			int day = Integer.parseInt(temp2[0]);
			boolean check = false;
			
			if(�Ի���[0] < year) {
				check = true;
			}else if(�Ի���[0] == year && month > �Ի���[1]) {
				check = true;
			}else if(�Ի���[0] == year && month == �Ի���[1] && day > �Ի���[2]) {
				check = true;
			}
			
			if(check == true) {
				System.out.println(employeeData[i][0] + ": " + employeeData[i][1] + ", " + employeeData[i][4]);
			}
		}
		System.out.println("========================================================");
		
		//# ��� ���̺��� �μ��� �ִ� �޿��� �޴� ������� ���, �̸�, �μ��ڵ�, �޿��� �˻��Ͻÿ�.
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
				System.out.println("[" + departmentData[i][1] +"] : ���� ����" );
			}else {
				System.out.println("[" + departmentData[i][1] +"] " +  employeeData[index][0] +": " + employeeData[index][1] +", " + employeeData[index][7] + ", " + max);
			}
		}
		System.out.println("========================================================");
		
		//[�μ�����] departmentData
		//[�μ���ȣ,�μ���,����]
		
		//[�������] employeeData
		//[��ȣ,�̸�,��å,����ȣ,�Ի���,�޿�,Ŀ�̼�,�μ���ȣ]
		
		//[���� ���] salaryGradeData
		//[��� , �޿�MIN , �޿�MAX]
		
		//#Salgrade�� 2����� ������� ��� �޿����� ���� �޴� ��� ������ �˻��Ͻÿ�.
		
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
		System.out.println(total + "���� || " + count + "�� || " + total/count +"����" );
		avg = total / count;
		
		for(int i = 0; i < employeeData.length; i++) {
			int sal = Integer.parseInt(employeeData[i][5]);
			if(sal < avg) {
				System.out.println(Arrays.toString(employeeData[i]));
			}
		}
	}
}