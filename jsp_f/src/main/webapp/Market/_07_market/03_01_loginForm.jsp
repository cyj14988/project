<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>

<%
	String path = application.getContextPath();
%>

<form method="post" action="03_01_loginPro.jsp">
<table>
	<tr>
		<td width="300" align="center">
			<h2>�α���</h2>
		</td>
	</tr>
	<tr height="50">
		<td width="300" align="center">
			<input type="text" name="id" placeholder="���̵� �Է��ϼ���" style="width:300px; height:30px">
		</td>
	</tr>
	
	<tr height="50">
		<td width="300" align="center">
			<input type="text" name="pw" placeholder="�н����带 �Է��ϼ���" style="width:300px; height:30px">
		</td>
	</tr>
	
	<tr height="50">
		<td width="300" align="right">
			<font size="2" color="gray"><a  style="text-decoration:none">���̵�ã��</a></font>
			<img alt="" src="<%=path %>/_07_market/img/top1.jpg">
			<font size="2" color="gray"><a  style="text-decoration:none">��й�ȣã��</a></font>
		</td>
	</tr>
	
	<tr height="50">
		<td width="300">
			<input type="image" src="<%=path %>/_07_market/img/login.PNG" name="submit" value="submit" style="width:320px">
		</td>
	</tr>
	
	<tr height = "50">
		<td width="300">
			<img alt="ȸ������" src="<%=path %>/_07_market/img/join.PNG" onclick="location.href='00_main.jsp?center=02_01_joinForm.jsp'"
				style="height:50px; width:320px; cursor:pointer">
			</td>
		</tr>
	</table>
</form>
 
