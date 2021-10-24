<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<%
	request.setCharacterEncoding("EUC-KR");
%>

<%
	int number = Integer.parseInt(request.getParameter("number"));
	String memberList[][] = (String[][])session.getAttribute("memberList");
	String codeList[][] = (String[][])session.getAttribute("codeList");
	//넘버 이름 전번 통신사 사번 등급 도시 
	int memberCount = (Integer)session.getAttribute("memberCount");

	memberList[memberCount][0] = number +"";
	memberList[memberCount][1] = request.getParameter("name");
	memberList[memberCount][2] = request.getParameter("num");
	memberList[memberCount][3] = request.getParameter("address");
	memberList[memberCount][4] = request.getParameter("date");
	memberList[memberCount][5] = request.getParameter("grade");
	memberList[memberCount][6] = request.getParameter("city");
	memberCount++;
	
	session.setAttribute("memberList", memberList);
	session.setAttribute("memberCount", memberCount);
	
	response.sendRedirect("joinForm.jsp");
%>