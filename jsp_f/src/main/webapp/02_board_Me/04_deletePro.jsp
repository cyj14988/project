<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<%
	int[] numList = (int[])session.getAttribute("numList");
	String[] titleList = (String[])session.getAttribute("titleList");
	String[] writerList = (String[])session.getAttribute("writerList");
	String[] contentList = (String[])session.getAttribute("contentList");
	
	int size = (Integer)session.getAttribute("size");
	int index = Integer.parseInt(request.getParameter("index"));
	
	int x = -1;
	for(int i = 0; i < numList.length; i++){
		if(numList[i] == index){
			x = i;
			break;
		}
	}
	
	for(int i = x; i < size - 1; i++){
		numList[i] = numList[i+1];
		titleList[i] = titleList[i+1];
		writerList[i] = writerList[i+1];
		contentList[i] = contentList[i+1];
	}
	size--;
	
	session.setAttribute("numList", numList);
	session.setAttribute("titleList", titleList);
	session.setAttribute("writerList", writerList);
	session.setAttribute("contentList", contentList);
	session.setAttribute("size", size);
	
	response.sendRedirect("01_sampleForm.jsp");
	
%>