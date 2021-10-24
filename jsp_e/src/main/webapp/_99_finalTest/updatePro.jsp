<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<%
	String memberList[][] = (String[][])session.getAttribute("memberList");
	int index = Integer.parseInt(request.getParameter("index"));
	String name = request.getParameter("name");
	String Num = request.getParameter("Num");
	String address = request.getParameter("address");
	String date = request.getParameter("date");
	String grade = request.getParameter("grade");
	String city = request.getParameter("city");
	
	memberList[index][1] = name;
	memberList[index][2] = Num;
	memberList[index][3] = address;
	memberList[index][4] = date;
	memberList[index][5] = grade;
	memberList[index][6] = city;
	
	response.sendRedirect("updateForm.jsp");
%>s