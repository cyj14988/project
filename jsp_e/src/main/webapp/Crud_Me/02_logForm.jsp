<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>

<div align="center">
<h1>로그인</h1>
<form action="02_logPro.jsp" method="post">
<table border="1">
<tr>
	<td>아이디</td>
	<td><input type="text" name="id"></td>
</tr>

<tr>
	<td>비밀번호</td>
	<td><input type="password" name="pw"></td>
</tr>

<tr>
	<td colspan="2">
		<input type="submit" value="로그인">
		<a href="main.jsp">뒤로가기</a>
	</td>
	
</tr>
</table>
</form>
</div>