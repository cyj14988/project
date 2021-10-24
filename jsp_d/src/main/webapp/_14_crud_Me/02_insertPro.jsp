<%@page import="java.util.Random"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>

<%
	Random ran = new Random();
	
	Object obj = null;
	obj = session.getAttribute("max");
	int max = (int)obj;
	obj = session.getAttribute("count");
	int count = (int)obj;
	obj = session.getAttribute("arr");
	int arr[] = (int[])obj;
	
	if(count < max){
		int num = ran.nextInt(50)+1;
		arr[count] = num;
		count++;
		session.setAttribute("count", count);
		session.setAttribute("arr", arr);	
	}else{
		System.out.println("°¡µæÂü");		
	}

	response.sendRedirect("01_list.jsp");

%>
   