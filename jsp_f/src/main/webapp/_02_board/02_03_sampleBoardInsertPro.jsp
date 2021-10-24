<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    
<%

	int [] numberList = (int[])session.getAttribute("numberList");
	String[] writerList = (String[])session.getAttribute("writerList");
	String[] titleList =(String[])session.getAttribute("titleList");
	String[] contentList = (String[])session.getAttribute("contentList");
	int size = (Integer)session.getAttribute("size");
	int lastNumber = (Integer)session.getAttribute("lastNumber");
	
	for(int i = 0; i < 10; i++){
		numberList[size] = lastNumber + 1;
		writerList[size] = "[작성자]" + (lastNumber + 1);
		titleList[size] = "[제목]" + (lastNumber + 1);
		contentList[size] = "[내용]" + (lastNumber + 1);
		lastNumber += 1;
		size += 1;
	}
	
	session.setAttribute("numberList", numberList);
	session.setAttribute("writerList", writerList);
	session.setAttribute("titleList", titleList);
	session.setAttribute("contentList", contentList);
	session.setAttribute("size", size);
	session.setAttribute("lastNumber", lastNumber);
	response.sendRedirect("02_01_testBoardListPage.jsp");


%>