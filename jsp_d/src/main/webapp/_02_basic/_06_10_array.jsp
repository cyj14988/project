<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>

<%--
	[session] 
		
		session  �� �迭�� �����Ҽ��ִ�.
 --%>

<%
	int arr1[] = {10,20,30};
	String arr2[] = {"aa","bb","cc"};
	session.setAttribute("arr1" , arr1);
	session.setAttribute("arr2" , arr2);

%>

<a href="_06_11_arrayPro.jsp">����������</a>