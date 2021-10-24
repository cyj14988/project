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

	for(int i = index; i < arr.length-1; i++){	
		arr[i] = arr[i+1];
	}
	count--;
	session.setAttribute("count", count);
	session.setAttribute("arr", arr);
	
	response.sendRedirect("01_list.jsp");


%>