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
<h2>���ٿ����</h2>
<%if(cheat == 0){%>
	<button onclick ="window.location.href='resultPro.jsp'">��Ʈ</button>
<%}else if(cheat == 1){%>
	<%=num%>
<%}%>
<form action = "updownGamePlayPro.jsp">
<input type ="text" name ="me" value="0">
<input type = "submit" value="Ȯ��">
</form>