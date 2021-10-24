<%@page import="java.util.Arrays"%>
<%@page import="java.util.Random"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>

<%
    Random ran  = new Random();
	
	int allLotto[] = new int[45];
	int lotto[] = new int[7];//로또 번호 추첨
	boolean check[] = new boolean[6];//인덱스 중복 방지
	int choice[] = new int[45];//선택지 번호
	boolean choiceCheck[][] = new boolean[6][45];//각 선택지별 숫자
 	int win = 0;
	for(int i = 0; i < 45; i++){
		allLotto[i] = i+1;
	}
	
	for(int i = 0; i < 50; i++){
		int num = ran.nextInt(45);
		int num2 = ran.nextInt(45);
		int temp = allLotto[num];
		allLotto[num] = allLotto[num2];
		allLotto[num2] = temp;
	}
	System.out.println(Arrays.toString(allLotto));
	
	for(int i = 0; i < 7; i++){
		lotto[i] = allLotto[i];
	}
	
	session.setAttribute("lotto", lotto);
	session.setAttribute("win", win);
	session.setAttribute("check", check);
	session.setAttribute("choice", choice);
	session.setAttribute("choiceCheck", choiceCheck);
	
	response.sendRedirect("lottoplay.jsp");
%>
