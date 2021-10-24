<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    
<%

	int [] numberList = new int[1000];   	// 번호
	String[] writerList = new String[1000]; // 글쓴이
	String[] titleList = new String[1000];  // 제목
	String[] contentList = new String[1000];// 내용
	int size = 0;
	int lastNumber = 0; // 마지막번호 (글개수와상관없이 마지막번호는 유지된다.)
	session.setAttribute("numberList", numberList);
	session.setAttribute("writerList", writerList);
	session.setAttribute("titleList", titleList);
	session.setAttribute("contentList", contentList);
	session.setAttribute("size", size);
	session.setAttribute("lastNumber" , lastNumber); 
	response.sendRedirect("00_main.jsp");

%>