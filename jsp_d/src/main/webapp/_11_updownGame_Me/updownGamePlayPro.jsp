<%@page import="java.util.Random"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>  

<%
	Object obj = null;
	
	obj = session.getAttribute("num");
	int num = (int)obj;
	
	String str = request.getParameter("me");
	int me = Integer.parseInt(str);
	
%>    

<%if(num < me){%>
	<%=me%>�� �� ũ��.
	<a href="updownGamePlay.jsp">�ڷΰ���</a>
<%}else if(num > me){%>
	<%=me%>�� �� �۴�.
	<a href="updownGamePlay.jsp">�ڷΰ���</a>
<%}else{%>
	<%=num%>, ����!
	<% 
	session.removeAttribute("num");
	session.removeAttribute("cheat");
	%>
	<a href="index.jsp">ó������</a>
<%}%>
