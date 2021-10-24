<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>

<%

	int totalcount = 0;
	int totalscore = 0;
	
	session.setAttribute("totalcount", totalcount);
	session.setAttribute("totalscore", totalscore);
	
	int cheat = 0;
	session.setAttribute("cheat", cheat);
%>

<hr>
<h2>홀짝게임</h2>
<hr>
<button onclick="window.location.href='coinGame.jsp'">시작!</button>