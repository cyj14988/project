<%@page import="java.util.Random"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>  
    
<%--
	���α׷� ���� ���� �������� �̸� index ���� session�� �����س��´�.
 --%>

<%
	Random ran = new Random();

	int num = ran.nextInt(100)+1;
	session.setAttribute("num", num);
	
	int cheat = 0;
	session.setAttribute("cheat", cheat);

%>
<hr>
<h2>���ٿ����!</h2>
<hr>
<button onclick="window.location.href='updownGamePlay.jsp'">���ӽ���</button>
