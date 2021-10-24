<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%
	
	int remove = Integer.parseInt(request.getParameter("remove"));

	Connection conn = null;
	PreparedStatement pstmt = null;
	
	try{
		String jdbcUrl = "jdbc:mysql://localhost:3306/jsp_00_12_board_mysql?serverTimezone=UTC&useSSL=false";
		String dbId = "root";
		String dbPw = "root";
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		conn = DriverManager.getConnection(jdbcUrl, dbId, dbPw);
		
		String sql = "DELETE FROM board WHERE number=?";
		pstmt = conn.prepareStatement(sql);
		pstmt.setInt(1, remove);
		pstmt.executeUpdate();
		

		conn.close();
		pstmt.close();

	}catch(Exception e){
		e.printStackTrace();
		
	}
	
	response.sendRedirect("03_01_testList.jsp");
	
%>