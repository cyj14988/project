<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>

<%
	int lastNumber = (Integer)session.getAttribute("lastNumber");
	int number = lastNumber + 1;
%>

	<div align="center">
		<h2>게시판 글쓰기</h2>
		
			<form action="01_01_boardWritePro.jsp">
			<table border="1">
				<tr>
					<td colspan="5" align="right">
						<input type="button" onclick="location.href='03_01_boardListPage.jsp'" value="메인게시판">
					</td>
				</tr>
					<tr>
						<td>번호</td>
						<td><%=number %></td>
					</tr>
					<tr>
						<td>제목</td>
						<td><input type="text" name="title"></td>
					</tr>
		
					<tr>
						<td>작성자</td>
						<td><input type="text" name="writer"></td>
					</tr>
					<tr>
						<td>내용</td>
						<td><textarea rows="20" cols="30" name="content"></textarea></td>
					</tr>
					<tr>
						<td colspan="2" align="center">
						<input type="hidden" name="number" value="<%=number%>"> 
						<input type="submit" value="전송"></td>
					</tr>			
			</table>
		</form>
	</div>

