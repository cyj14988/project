<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<%
	int[] numList = (int[])session.getAttribute("numList");
	String[] titleList = (String[])session.getAttribute("titleList");
	String[] writerList = (String[])session.getAttribute("writerList");
	String[] contentList = (String[])session.getAttribute("contentList");
	
	int size = (Integer)session.getAttribute("size");
	int lastNumber = (Integer)session.getAttribute("lastNumber");
	
	for(int i = 0; i < 10; i++){
		numList[size] = lastNumber + 1;
		titleList[size] = "[제목]" + (lastNumber + 1);
		writerList[size] = "[작성자]" + (lastNumber + 1);
		contentList[size] = "[내용]" + (lastNumber + 1);
		size++;
		lastNumber++;
	}
	
	session.setAttribute("numList", numList);
	session.setAttribute("titleList", titleList);
	session.setAttribute("writerList", writerList);
	session.setAttribute("contentList", contentList);
	session.setAttribute("size", size);
	session.setAttribute("lastNumber", lastNumber);
	
	response.sendRedirect("01_sampleForm.jsp");
%>