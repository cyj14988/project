<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<%request.setCharacterEncoding("EUC-KR");%>
<%

		
%>
<div align="center">
<h1>회원가입</h1>
<form action="01_joinPro.jsp" method="post">
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
	<td>이름</td>
	<td><input type="text" name="name"></td>
</tr>

<tr>
	<td>전화번호</td>
	<td><input type="text" name="num"></td>
</tr>

<tr>
	<td>성별</td>
	<td>
	<input type="radio" name="gender" value="남성" checked>남성
	<input type="radio" name="gender" value="여성">여성
	</td>
</tr>

<tr>
	<td colspan="2">
		<input type="submit" value="회원가입">
		<a href="main.jsp">뒤로가기</a>
	</td>
	
</tr>
</table>
</form>
</div>