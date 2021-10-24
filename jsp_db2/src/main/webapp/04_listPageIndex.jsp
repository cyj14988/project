<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>

	<%
		session.removeAttribute("idList");
		session.removeAttribute("numList");
		session.removeAttribute("titleList");
		session.removeAttribute("contentList");
		session.removeAttribute("typeList");
		
		response.sendRedirect("04_listPage.jsp");
	%>