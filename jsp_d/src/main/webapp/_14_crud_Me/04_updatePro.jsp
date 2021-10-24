<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>

<%
	Object obj = null;
	obj = session.getAttribute("max");
	int max = (int)obj;
	obj = session.getAttribute("arr");
	int arr[] = (int[])obj;
	obj = session.getAttribute("count");
	int count = (int)obj;
	
	String str = request.getParameter("index");
	int index = Integer.parseInt(str);

	str = request.getParameter("Nnumber");
	int Nnumber = Integer.parseInt(str);
	
	arr[index] = Nnumber;
	
	session.setAttribute("arr", arr);
	
	response.sendRedirect("01_list.jsp");
	




%>