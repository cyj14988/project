<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<%request.setCharacterEncoding("EUC-KR");%>
<%
	int lastNumber = (Integer)session.getAttribute("lastNumber");
%>

<div align="center">
<form action="02_writePro.jsp" method="post">
	<table border="1">
		<tr align="center">
			<td colspan="4"><h3>게시판 글쓰기</h3></td>
		</tr>
		
		<tr align="right">
			<td colspan="4"><input type="button" onclick="window.location.href='main.jsp'" value="메인으로"></td>
		</tr>
		
		<tr align="center">
			<td width="50px">글번호</td>
			<td width="50px"><%=lastNumber+1%></td>
			<td width="100px">작성자</td>
			<td width="150px"><input type="text" name="writer"></td>
		</tr>
		
		<tr align="center">
			<td width="100px">제목</td>
			<td width="250px" colspan="3"><input type="text" name="title"></td>
		</tr>
		
		<tr align="center">
			<td>내용</td>
			<td colspan="3"><textarea cols="50" rows="10" name="content"></textarea></td>
		</tr>
		
		<tr align="center">
			<td colspan="4"><input type="submit" value="등록"></td>
		</tr>
	</table>
</form>	
</div>