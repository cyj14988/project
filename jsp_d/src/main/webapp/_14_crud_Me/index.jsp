<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>

<%

	int max = 5;
	int arr[] = new int[max];
	int count = 0;
	
	session.setAttribute("max", max);
	session.setAttribute("arr", arr);
	session.setAttribute("count", count);

%>


<div align="center">
<h1>CRUD</h1>
<button onclick ="window.location.href='01_list.jsp'">List</button>
</div>