<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<%
	String log = (String)session.getAttribute("log");
%>
<div align="center">
<h1>구구단 게임</h1>
<table border="1">
	<tr>
		<td align="right">
			<%if(log == null){ %>
				<a href="02_logForm.jsp">로그인</a>
				<a href="01_joinForm.jsp">회원가입</a>
			<%}else{%>
				[<%=log%>님 환영합니다.]
				<a href="02_logout.jsp">로그아웃</a>
				<a href="04_updateForm.jsp">회원정보</a>
			<%} %>
		</td>
	</tr>
	<tr>
		<td align="center" width="800px" height="400px"><img src="gugudan.jpg"></td>
	</tr>
	
	<tr>
		<td align="center"><a href="03_gameReady.jsp">게임시작</a></td>
	</tr>
</table>
</div>
