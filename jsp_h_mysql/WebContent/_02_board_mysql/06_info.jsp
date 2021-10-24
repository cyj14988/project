<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    
<%	
	int number = Integer.parseInt(request.getParameter("number"));
	application.log("number : " + number);
	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	
	String writer = null;
	String title = null;
	String content = null;
	
	try {
		String jdbcUrl = "jdbc:mysql://localhost:3306/jsp_00_12_board_mysql?serverTimezone=UTC&useSSL=false";
		String dbId = "root";
		String dbPw = "root";
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		conn = DriverManager.getConnection(jdbcUrl, dbId, dbPw);
		
		String sql = "select * from board where number=?";
		pstmt = conn.prepareStatement(sql);
		pstmt.setInt(1, number);
		rs = pstmt.executeQuery();
		
		if(rs.next()){
			writer = rs.getString(2);
			title = rs.getString(3);
			content = rs.getString(4);
		}
		
		conn.close();
		pstmt.close();
		rs.close();
	}catch(Exception e){
		e.printStackTrace();
	}

%>

	<div align="center">
		<h2>게시글 내용</h2>
		<form method="post">
			<table border="1">
				<tr>
					<td >번호</td>
					<td width="300"><%= number %></td>
				</tr>
				<tr>
					<td>작성자</td>
					<td><%= writer %></td>
					
				</tr>
				<tr>
					<td>제목</td>
					<td><%= title %></td>
					
				</tr>
				<tr>
					<td>내용</td>
					<td colspan="3">
						<textarea rows="10" cols="60" readonly><%= content %></textarea>
					</td>
				</tr>
				<tr>
					<td colspan="4" align="center">					
						<input type="button" value="목록으로" onclick="window.location.href='03_02_mainList.jsp'">
					</td>
				</tr>
			</table>
		</form>
	</div>
