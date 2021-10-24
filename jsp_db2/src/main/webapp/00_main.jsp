<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>

	<%
		int state = 0;
		String log = (String)session.getAttribute("log");
	
		if(log == null){
			state = 1;
		}
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try{
			String jdbcUrl = "jdbc:mysql://localhost:3306/jsp_00_db2_board?serverTimezone=UTC&useSSL=false";
			String dbId = "root";
			String dbPw = "root";
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection(jdbcUrl, dbId, dbPw);
			
			String sql = "SELECT max(number) from board";
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			if(rs.next()){
				session.setAttribute("lastNumber", rs.getInt(1));
			}
			
		}catch(Exception e){
			e.printStackTrace();
		}
		
	%>
		
<style>
	.title{
		width : 100%;
		color: white;
		background-color: blue;
	}
	.menu{
		width : 100%;
		color : white;
		background-color: aqua;
	}	
</style>

		<div class="title">
			<h1 align="center">게시판 관리</h1>
		</div>
		<div class="menu">
		 	<table >		
		 		<tr align="center">
		 			<td width="400px"><a href="04_listPageIndex.jsp">게시판</a></td>
		 			<td width="500px"><a href="06_testPage.jsp">테스트 게시판</a></td>
		 			<td width="400px"><a href="00_main.jsp">홈으로</a></td>
		 		</tr>		
		 	</table>	 	
	 	</div>
	 	<div align="left">
	 		<%if(state == 1){ %>
				<h3><a href="02_loginForm.jsp">login</a>
				<a href="01_joinForm.jsp">join</a></h3>	 		
	 		<%}else {%>
	 			<h3><%=log%>님 환영합니다. 
	 			<a href="03_logout.jsp">logout</a></h3>
	 		<%} %>
	 	</div>
  	