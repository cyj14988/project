<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%
	String log = (String)session.getAttribute("log");	

%>

<div align="center" >
	<h2>����������</h2>
	
	
	<table  border="1">
		<tr>
			<td align="right" width="1000px">
				<% if(log != null){%>
						[<%=log  %>]
						<a href="03_23_logoutPro.jsp">�α׾ƿ�</a>	
						<a href="03_31_updateForm.jsp">ȸ����������</a>
						<a href="03_41_deleteForm.jsp">ȸ��Ż��</a>	
				<% }else if(log == null){ %>
						<a href="03_11_joinForm.jsp">ȸ������</a>
						<a href="03_21_loginForm.jsp">�α���</a>	
				<%} %>
			</td>
		</tr>	
		<tr>	
			<td align="center"><img src="gugudan.jpg"></td>
		</tr>
		<tr>
			<td align="center">
				<button onclick="window.location.href='02_02_gugudanReady.jsp'">���ӽ�ŸƮ</button>
			</td>
		</tr>
	</table>
</div>

