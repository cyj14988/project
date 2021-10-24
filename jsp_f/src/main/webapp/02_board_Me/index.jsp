<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<%
	int[] numList = new int[1000];
	String[] writerList = new String[1000];
	String[] contentList = new String[1000];
	String[] titleList = new String[1000];
	int size = 0;
	int lastNumber = 0;
	
	session.setAttribute("numList", numList);
	session.setAttribute("writerList", writerList);
	session.setAttribute("contentList", contentList);
	session.setAttribute("titleList", titleList);
	session.setAttribute("size", size);
	session.setAttribute("lastNumber", lastNumber);
	
	response.sendRedirect("main.jsp");

%>