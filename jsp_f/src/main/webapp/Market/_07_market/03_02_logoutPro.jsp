<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
	<%
		request.setCharacterEncoding("EUC-KR");
		
		session.removeAttribute("id");
		response.sendRedirect("00_main.jsp");
	%>
