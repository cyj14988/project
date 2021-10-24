<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
	<%
		request.setCharacterEncoding("EUC-KR");
	%>
	
	<%
		String id = request.getParameter("id");
		int lastNumber = (Integer)session.getAttribute("lastNumber");
		String title = request.getParameter("title");
		String content  = request.getParameter("content");
		String type = request.getParameter("type");
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		try{
			String jdbcUrl = "jdbc:mysql://localhost:3306/jsp_00_db2_board?serverTimezone=UTC&useSSL=false";
			String dbId = "root";
			String dbPw = "root";
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection(jdbcUrl, dbId, dbPw);
						
			String sql = "INSERT INTO board VALUES(?, ?, ? ,?, ?)";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			pstmt.setInt(2, lastNumber+1);
			pstmt.setString(3, title);
			pstmt.setString(4, content);
			pstmt.setString(5, type);
			pstmt.executeUpdate();
			session.setAttribute("lastNumber", lastNumber+1);
			
			conn.close();
			pstmt.close();
		}catch(Exception e){
			e.printStackTrace();
		}
		
		response.sendRedirect("04_listPageIndex.jsp");
	%>