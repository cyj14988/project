<%@page import="java.util.Random"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>  
    
<%--
	���α׷� ���� ���� �������� �̸� index ���� session�� �����س��´�.
 --%>
<%
	Random ran = new Random();
	int com = ran.nextInt(100) + 1;
	session.setAttribute("com" , com);
	session.setAttribute("cheat", 0);

%>
<h1>���ٿ����</h1>


<a href="updownGamePlay.jsp">���ӽ���</a>