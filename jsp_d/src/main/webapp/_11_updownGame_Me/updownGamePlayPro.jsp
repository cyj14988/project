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
	<%=me%>가 더 크다.
	<a href="updownGamePlay.jsp">뒤로가기</a>
<%}else if(num > me){%>
	<%=me%>가 더 작다.
	<a href="updownGamePlay.jsp">뒤로가기</a>
<%}else{%>
	<%=num%>, 정답!
	<% 
	session.removeAttribute("num");
	session.removeAttribute("cheat");
	%>
	<a href="index.jsp">처음으로</a>
<%}%>
