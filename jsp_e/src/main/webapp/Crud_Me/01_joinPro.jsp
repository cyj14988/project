<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<%request.setCharacterEncoding("EUC-KR"); %>

<%
	int count = (Integer)session.getAttribute("count");
	String idList[] = (String[])session.getAttribute("idList");
	String pwList[] = (String[])session.getAttribute("pwList");
	String numList[] = (String[])session.getAttribute("numList");
	String genderList[] = (String[])session.getAttribute("genderList");
	String nameList[] = (String[])session.getAttribute("nameList");	
	
	String id = request.getParameter("id");
	String pw = request.getParameter("pw");
	String name = request.getParameter("name");
	String num = request.getParameter("num");
	String gender = request.getParameter("gender");
	
	boolean check = false;
	for(int i = 0; i < count; i++){
		if(idList[i].equals(id)){
			check = true;
			break;
		}
	}
	if(check == true){
		response.sendRedirect("01_joinForm.jsp");
	}else{
		
		
		idList[count] = id;
		pwList[count] = pw;
		numList[count] = num;
		nameList[count] = name;
		genderList[count] = gender;
		
		count++;
		
		session.setAttribute("idList", idList);
		session.setAttribute("pw", pw);
		session.setAttribute("num", num);
		session.setAttribute("nameList", nameList);
		session.setAttribute("genderList", genderList);
		session.setAttribute("count", count);
		
		response.sendRedirect("main.jsp");
		
	}
%>