<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<%
	int count = (Integer)session.getAttribute("count");
	String idList[] = (String[])session.getAttribute("idList");
	String pwList[] = (String[])session.getAttribute("pwList");
	String numList[] = (String[])session.getAttribute("numList");
	String genderList[] = (String[])session.getAttribute("genderList");
	String nameList[] = (String[])session.getAttribute("nameList");	
	
	int index = Integer.parseInt(request.getParameter("index"));
	
	for(int i = index; i < count - 1; i++){
		idList[i] = idList[i+1];
		pwList[i] = pwList[i+1];
		numList[i] = numList[i+1];
		genderList[i] = genderList[i+1];
		nameList[i] = genderList[i+1];
	}
	count--;
	
	session.setAttribute("idList", idList);
	session.setAttribute("pwList", pwList);
	session.setAttribute("numList", numList);
	session.setAttribute("genderList", genderList);
	session.setAttribute("nameList", nameList);
	session.setAttribute("count", count);
	
	response.sendRedirect("00_adminDelete.jsp");
	

%>