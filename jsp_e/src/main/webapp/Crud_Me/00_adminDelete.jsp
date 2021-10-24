<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<%
	int count = (Integer)session.getAttribute("count");
	String idList[] = (String[])session.getAttribute("idList");
	String pwList[] = (String[])session.getAttribute("pwList");
	String numList[] = (String[])session.getAttribute("numList");
	String genderList[] = (String[])session.getAttribute("genderList");
	String nameList[] = (String[])session.getAttribute("nameList");	

%>

<div align="center">
<h1>회원관리</h1>
<table border="1">
	<tr>
		<td colspan="4" align="center">회원목록</td>
	</tr>
	
	<tr>
		<td>아이디</td>
		<td>이름</td>
		<td>전화번호</td>
		<td>삭제</td>
	</tr>
	
	<%for(int i = 1; i < count; i++){%>
		<tr>
			<td><a href="00_adminDetail"><%=idList[i]%></a></td>
			<td><%=nameList[i]%></td>
			<td><%=numList[i]%></td>
			<td><input type="button" onclick="window.location.href='00_adminDeletePro.jsp?index=<%=i%>'" value="삭제"></td>
		</tr>
	<%} %>
	
	<tr>
		<td align="center" colspan="4"><a href="00_adminMain.jsp">관리자 페이지</a></td>
	</tr>
</table>
</div>