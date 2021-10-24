<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<% request.setCharacterEncoding("EUC-KR");%>
<%
	String pwList[] = (String[])session.getAttribute("pwList");
	String numList[] = (String[])session.getAttribute("numList");
	String genderList[] = (String[])session.getAttribute("genderList");
	String nameList[] = (String[])session.getAttribute("nameList");	
	
	String pw = request.getParameter("pw");
	String name = request.getParameter("name");
	String num = request.getParameter("num");
	String gender = request.getParameter("gender");
	
	int index = Integer.parseInt(request.getParameter("index"));
	
	pwList[index] = pw;
	numList[index] = num;
	genderList[index] = gender;
	nameList[index] = name;
	
	session.setAttribute("pwList", pwList);
	session.setAttribute("numList", numList);
	session.setAttribute("genderList", genderList);
	session.setAttribute("nameList", nameList);
	
	response.sendRedirect("04_updateForm.jsp");
%>