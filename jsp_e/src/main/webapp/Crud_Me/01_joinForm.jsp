<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<%request.setCharacterEncoding("EUC-KR");%>
<%

		
%>
<div align="center">
<h1>ȸ������</h1>
<form action="01_joinPro.jsp" method="post">
<table border="1">
<tr>
	<td>���̵�</td>
	<td><input type="text" name="id"></td>
</tr>

<tr>
	<td>��й�ȣ</td>
	<td><input type="password" name="pw"></td>
</tr>

<tr>
	<td>�̸�</td>
	<td><input type="text" name="name"></td>
</tr>

<tr>
	<td>��ȭ��ȣ</td>
	<td><input type="text" name="num"></td>
</tr>

<tr>
	<td>����</td>
	<td>
	<input type="radio" name="gender" value="����" checked>����
	<input type="radio" name="gender" value="����">����
	</td>
</tr>

<tr>
	<td colspan="2">
		<input type="submit" value="ȸ������">
		<a href="main.jsp">�ڷΰ���</a>
	</td>
	
</tr>
</table>
</form>
</div>