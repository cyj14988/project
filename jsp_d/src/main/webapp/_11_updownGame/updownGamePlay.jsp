<%@page import="java.util.Random"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>  
    
<%
	Object obj = null;

	obj = session.getAttribute("cheat");
	int cheat = (int)obj;	
	obj = session.getAttribute("com");
	int com = (int)obj;
%>
<h1>���ٿ����</h1>
<%if(cheat == 0){%>
	<button onclick="window.location.href='resultPro.jsp'">����</button>
<%}else if(cheat == 1){ %>	
	<%=com %>
<%} %>

<form action="updownGamePlayPro.jsp">
	<input type="text" name="me" value="0">
	<input type="submit" value="����">
</form>