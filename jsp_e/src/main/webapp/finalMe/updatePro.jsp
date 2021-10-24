<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<%
	int index = Integer.parseInt(request.getParameter("index"));
	String memberList[][] = (String[][])session.getAttribute("memberList");
	//넘버 이름 전번 통신사 사번 등급 도시 
	memberList[index][1] = request.getParameter("name");
	memberList[index][2] = request.getParameter("num");
	memberList[index][3] = request.getParameter("address");
	memberList[index][4] = request.getParameter("date");
	memberList[index][5] = request.getParameter("grade");
	memberList[index][6] = request.getParameter("city");
	
	session.setAttribute("memberList", memberList);
	
	response.sendRedirect("memberListView.jsp");
	
%>