<%@page import="java.util.Random"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%
	Random ran = new Random();
	int num = ran.nextInt(100)+1;
	
	Object obj = null;
	
	obj = session.getAttribute("totalscore");
	int totalscore = (int)obj;
	
	obj = session.getAttribute("totalcount");
	int totalcount = (int)obj;
	totalcount += 1;
	session.setAttribute("totalcount", totalcount);

	obj = session.getAttribute("cheat");
	int cheat = (int)obj;
%>
<h2>홀짝게임</h2>
<%if(cheat == 0){ %>
	<button onclick="window.location.href='cheat.jsp'">힌트</button>
<%}else if(cheat == 1){ %>
	<%=num%>
<%} %>
현재 <%=totalcount%>번쨰 게임 | <%=totalscore%>점
<form action = "coinGamePro.jsp">
<h3>?</h3><br>
<button onclick="window.location.href='coinGamePro.jsp?sel=0&num=<%=num%>'">홀</button>
<button onclick="window.location.href='coinGamePro.jsp?sel=1&num=<%=num%>'">짝</button>
</form>	