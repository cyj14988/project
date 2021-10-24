<%@page import="java.util.Arrays"%>
<%@page import="java.util.Random"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<%
	Random ran = new Random();
	int testsize = 5;
	int samplesize = 5;
	int[] dan = new int[5];
	int[] times = new int[5];
	int[] result = new int[testsize];
	int[][] resultList = new int[testsize][samplesize];
	
	for(int i = 0; i < dan.length; ){
		int dan1 = ran.nextInt(8)+2;
		int times1 = ran.nextInt(9)+1;
		boolean check = false;
		for(int j = 0; j < i; j++){
			if(dan1 == dan[j] && times1 == times[j]){
				check = true;
				break;
			}
		}
		if(check == false){
			dan[i] = dan1;
			times[i] = times1;
			resultList[i][0] =  dan1 * times1;
			i++;
		}
	}
	
	for(int i = 0; i < testsize; i++){
		for(int j = 1; j < samplesize; ){
			int num = ran.nextInt(8)+2;
			int num1 = ran.nextInt(9)+1;
			boolean check = false;
			for(int d = 0; d < j; d++){
				if(resultList[i][d] == (num * num1)){				
					check = true;
					break;
				}
			}
			if(check  == false){
				resultList[i][j] = num * num1;
				j++;
			}
		}
	}
	
	for(int i = 0; i < testsize; i++){
		int in1 = ran.nextInt(samplesize);
		
		int temp = resultList[i][0];
		resultList[i][0] = resultList[i][in1];
		resultList[i][in1] = temp;
		result[i] = in1;
	}
	
	for(int i = 0; i < testsize; i++){
		System.out.print(dan[i] + "*" + times[i] + "=" + result[i] +" ");
		System.out.println();
		System.out.print(Arrays.toString(resultList[i]));
	}
	
	session.setAttribute("dan", dan);
	session.setAttribute("times", times);
	session.setAttribute("result", result);
	session.setAttribute("resultList", resultList);
	
	response.sendRedirect("03_gamePlay.jsp");

%>