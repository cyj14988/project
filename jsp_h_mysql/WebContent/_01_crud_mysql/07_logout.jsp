<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
	<% 
		session.removeAttribute("log");
		out.print("로그아웃 되었습니다.<br>");	
	%>
	
	<a href="00_main.jsp">메인으로 돌아가기</a>	
