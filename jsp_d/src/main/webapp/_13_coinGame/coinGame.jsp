<%@page import="java.util.Random"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    
<%
	Random ran = new Random();
	
	Object obj = null;
	obj = session.getAttribute("scoreCount");
	int scoreCount = (int)obj;
	obj = session.getAttribute("gameCount");
	int gameCount = (int)obj;
	gameCount += 1;
	session.setAttribute("gameCount", gameCount);
	int coin = ran.nextInt(10) + 1;
		
%>
ġƮŰ : <%=coin %>
<h1>Ȧ¦����</h1>
<h2>5������ ���߸� ����</h2>
<h2><%=gameCount %>��° ���� : [����]<%=scoreCount %>��</h2>
<button onclick="window.location.href='coinGamePro.jsp?choice=1&coin=<%=coin%>'">Ȧ</button>
<button onclick="window.location.href='coinGamePro.jsp?choice=2&coin=<%=coin%>'">¦</button>
