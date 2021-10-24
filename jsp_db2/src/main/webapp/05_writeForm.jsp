<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
	<jsp:include page="00_main.jsp"></jsp:include>

	<%
		int lastNumber = (Integer)session.getAttribute("lastNumber");
		String log = (String)session.getAttribute("log");
		String id = null;
		
		if(log != null){
			id = log;		
		}else{
			id = "비회원";
		}
		
	%>
	
		<div align="center" >
			<form method="post" action="05_writePro.jsp">
				<table border="1">
					<tr align="center">
						<td colspan="4">글쓰기</td>
					</tr>
					
					<tr align="center">
						<td>번호</td>
						<td><%=lastNumber + 1%></td>
						<td>아이디</td>
						<td><%=id%></td>
					</tr>
					
					<tr align="center">
						<td>문의유형</td>
						<td colspan="3">
							<select name="type">
								<option value="일반">일반</option>
								<option value="Q&A">Q&A</option>
								<option value="익명">익명</option>
								<option value="자유">자유</option>
							</select>
						</td>
					</tr>
					
					<tr align="center">
						<td>제목</td>
						<td colspan="3">
							<input type="text" name="title" value="제목<%=lastNumber+1%>">
						</td>
					</tr>
					
					<tr align="center">
						<td colspan="4">내용</td>
					</tr>
					
					<tr align="center">
						<td colspan="4">
							<textarea rows="20" cols="100" name="content">내용<%=lastNumber+1%></textarea>
						</td>
					</tr>
					
					<tr align="center">
						<td colspan="4">
							<input type="hidden" name="id" value=<%=id%>>
							<input type="submit" value="작성">
						</td>
					</tr>
				</table>
			</form>
		</div>	