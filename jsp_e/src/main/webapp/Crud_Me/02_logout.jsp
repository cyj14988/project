<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<%
	session.removeAttribute("log");

	response.sendRedirect("main.jsp");
%>

