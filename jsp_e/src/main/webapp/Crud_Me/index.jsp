<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<%
	String[] s_idList = {"admin", "정호두", "정호도", "정호호", "정후후"};
	String[] s_pwList = {"admin", "1234", "1234", "1234", "1234"};
	String[] s_nameList = {"관리자", "정호두", "정호도", "정호호", "정후후"};
	String[] s_genderList = {"여성", "여성", "여성", "여성", "여성"};
	String[] s_numList = {"010", "010", "010", "010", "010"};

	String[] idList = new String[1000];
	String[] pwList = new String[1000];
	String[] nameList = new String[1000];
	String[] genderList = new String[1000];
	String[] numList = new String[1000];
	
	String log = null;
	int count = 0;
	
	for(int i = 0; i < s_idList.length; i++){
		idList[i] = s_idList[i];
		pwList[i] = s_pwList[i];
		nameList[i] = s_nameList[i];
		genderList[i] = s_genderList[i];
		numList[i] = s_numList[i];
		count++;
	}
	
	session.setAttribute("idList", idList);
	session.setAttribute("pwList", pwList);
	session.setAttribute("nameList", nameList);
	session.setAttribute("genderList", genderList);
	session.setAttribute("numList", numList);
	session.setAttribute("count", count);
	session.setAttribute("log", log);
	
	response.sendRedirect("main.jsp");
	
%>