<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<%
	request.setCharacterEncoding("EUC-KR");
%>
<%
	int size = (Integer)session.getAttribute("size");
	int lastNumber = (Integer)session.getAttribute("lastNumber");
	
	int[] numList = (int[])session.getAttribute("numList");
	String[] titleList = (String[])session.getAttribute("titleList");
	String[] writerList = (String[])session.getAttribute("writerList");
	String[] contentList = (String[])session.getAttribute("contentList");
	
	String writer = request.getParameter("writer");
	String content = request.getParameter("content");
	String title = request.getParameter("title");
	
	numList[size] = lastNumber + 1;
	titleList[size] = title;
	writerList[size] = writer;
	contentList[size] = content;
	
	size++;
	lastNumber++;
	
	session.setAttribute("numList", numList);
	session.setAttribute("titleList", titleList);
	session.setAttribute("writerList", writerList);
	session.setAttribute("contentList", contentList);
	session.setAttribute("lastNumber", lastNumber);
	session.setAttribute("size", size);
	
	response.sendRedirect("03_boardListPage.jsp");
%>