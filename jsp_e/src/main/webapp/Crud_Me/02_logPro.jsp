<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<%
	request.setCharacterEncoding("EUC-KR");
%>

<%
	String idList[] = (String[])session.getAttribute("idList");
	String pwList[] = (String[])session.getAttribute("pwList");
	String log = (String)session.getAttribute("log");
	int count = (Integer)session.getAttribute("count");
	
	String id = request.getParameter("id");
	String pw = request.getParameter("pw");
	
	boolean check = false;
	for(int i = 0; i < count; i++){
		if(idList[i].equals(id) && pwList[i].equals(pw)){
			check = true;
			break;
		}
	}
	
	if(check == false){
		response.sendRedirect("main.jsp");
	}else{
		log = id;
		session.setAttribute("log", log);
		if(id.equals("admin")){
			response.sendRedirect("00_adminMain.jsp");
		}else{
			response.sendRedirect("main.jsp");
		}
	}
%>