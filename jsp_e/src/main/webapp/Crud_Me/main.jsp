<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<%
	String log = (String)session.getAttribute("log");
%>
<div align="center">
<h1>������ ����</h1>
<table border="1">
	<tr>
		<td align="right">
			<%if(log == null){ %>
				<a href="02_logForm.jsp">�α���</a>
				<a href="01_joinForm.jsp">ȸ������</a>
			<%}else{%>
				[<%=log%>�� ȯ���մϴ�.]
				<a href="02_logout.jsp">�α׾ƿ�</a>
				<a href="04_updateForm.jsp">ȸ������</a>
			<%} %>
		</td>
	</tr>
	<tr>
		<td align="center" width="800px" height="400px"><img src="gugudan.jpg"></td>
	</tr>
	
	<tr>
		<td align="center"><a href="03_gameReady.jsp">���ӽ���</a></td>
	</tr>
</table>
</div>
