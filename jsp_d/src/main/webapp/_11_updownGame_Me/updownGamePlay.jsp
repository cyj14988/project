<%@page import="java.util.Random"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>  
    
<%

	Object obj = null;

	obj = session.getAttribute("cheat");
	int cheat = (int)obj;
	
	obj = session.getAttribute("num");
	int num = (int)obj;
%>
<h2>업다운게임</h2>
<%if(cheat == 0){%>
	<button onclick ="window.location.href='resultPro.jsp'">힌트</button>
<%}else if(cheat == 1){%>
	<%=num%>
<%}%>
<form action = "updownGamePlayPro.jsp">
<input type ="text" name ="me" value="0">
<input type = "submit" value="확인">
</form>