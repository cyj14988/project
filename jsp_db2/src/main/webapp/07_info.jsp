<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
	<jsp:include page="00_main.jsp"></jsp:include>
	
	<%
		String id = null;
		int num = Integer.parseInt(request.getParameter("number"));
		String title = null;
		String content = null;
		String type = null;
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try{
			String jdbcUrl = "jdbc:mysql://localhost:3306/jsp_00_db2_board?serverTimezone=UTC&useSSL=false";
			String dbId = "root";
			String dbPw = "root";
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection(jdbcUrl, dbId, dbPw);
			
			String sql = "SELECT * FROM board WHERE board.number = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, num);
			rs = pstmt.executeQuery();
			while(rs.next()){
				id = rs.getString(1);
				title = rs.getString(3);
				content = rs.getString(4);
				type = rs.getString(5);
			}
			conn.close();
			pstmt.close();
			rs.close();
		}catch(Exception e){
			e.printStackTrace();
		}
		
	%>
		
			<div align="center" >
			<form method="post" action="05_writePro.jsp">
				<table border="1">
					<tr align="center">
						<td colspan="4">게시글</td>
					</tr>
					
					<tr align="center">
						<td>번호</td>
						<td><%=num%></td>
						<td>아이디</td>
						<td><%=id%></td>
					</tr>
					
					<tr align="center">
						<td>문의유형</td>
						<td colspan="3">
							<%=type%>
						</td>
					</tr>
					
					<tr align="center">
						<td>제목</td>
						<td colspan="3">
							<%=title%>
						</td>
					</tr>
					
					<tr align="center">
						<td colspan="4">내용</td>
					</tr>
					
					<tr align="center">
						<td colspan="4">
							<textarea rows="20" cols="100" readonly><%=content%></textarea>
						</td>
					</tr>
				</table>
			</form>
		</div>	
	