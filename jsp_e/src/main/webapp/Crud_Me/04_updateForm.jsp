<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<%
	String idList[] = (String[])session.getAttribute("idList");
	String pwList[] = (String[])session.getAttribute("pwList");
	String numList[] = (String[])session.getAttribute("numList");
	String genderList[] = (String[])session.getAttribute("genderList");
	String nameList[] = (String[])session.getAttribute("nameList");		
	String log = (String)session.getAttribute("log");
	int count = (Integer)session.getAttribute("count");
	
	int index = -1;
	
	for(int i = 0; i < count; i++){
		if(idList[i].equals(log)){
			index = i;
			break;
		}
	}
%>
<div align="center">
<h1>회원정보수정</h1>
<form action="04_updatePro.jsp" method="post">
<table border="1">
<tr>
	<td>아이디</td>
	<td><input type="text" name="id" value=<%=log%> disabled></td>
</tr>

<tr>
	<td>비밀번호</td>
	<td><input type="password" name="pw" value=<%=pwList[index]%>></td>
</tr>

<tr>
	<td>이름</td>
	<td><input type="text" name="name" value=<%=nameList[index]%>></td>
</tr>

<tr>
	<td>전화번호</td>
	<td><input type="text" name="num" value=<%=numList[index]%>></td>
</tr>

<tr>
	<td>성별</td>
	<td>
	<%if(genderList[index].equals("남성")){ %>
			<input type="radio" name="gender" value="남성" checked>남성
			<input type="radio" name="gender" value="여성">여성
	<%}else{ %>
			<input type="radio" name="gender" value="남성">남성
			<input type="radio" name="gender" value="여성" checked>여성
	<%} %>
	</td>
</tr>

<tr>
	<td colspan="2">
		<input type="submit" value="정보수정">
		<a href="main.jsp">뒤로가기</a>
		<input type ="hidden" name="index" value=<%=index%>>
	</td>
	
</tr>
</table>
</form>
</div>