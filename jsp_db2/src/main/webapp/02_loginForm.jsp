<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<jsp:include page="00_main.jsp"></jsp:include>

<div align="center">
	<form method="post" action="02_loginPro.jsp">
		<table border="1">
			<tr align="center">
				<td colspan="2">�α���</td>
			</tr>
			<tr align="center">
				<td>���̵�</td>
				<td><input type="text" name="id"></td>
			</tr>
			<tr align="center">
				<td>��й�ȣ</td> 
				<td><input type="password" name="pw"></td>
			</tr>
			<tr align="center">
				<td colspan="2"><input type="submit" value="�α���"></td>
			</tr>
		</table>
	</form>
</div>