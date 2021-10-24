<%@page import="java.util.Random"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>  
    
<%--
	프로그램 내내 사용될 변수들은 미리 index 에서 session에 저장해놓는다.
 --%>

<%
	Random ran = new Random();

	int num = ran.nextInt(100)+1;
	session.setAttribute("num", num);
	
	int cheat = 0;
	session.setAttribute("cheat", cheat);

%>
<hr>
<h2>업다운게임!</h2>
<hr>
<button onclick="window.location.href='updownGamePlay.jsp'">게임시작</button>
