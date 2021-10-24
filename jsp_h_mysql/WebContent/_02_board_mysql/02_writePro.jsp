<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    
<%	
	
	int number = Integer.parseInt(request.getParameter("number"));
	String title = request.getParameter("title");
	String writer = request.getParameter("writer");
	String content = request.getParameter("content");
		
%>
	<%		
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		try {
			String jdbcUrl = "jdbc:mysql://localhost:3306/jsp_00_12_board_mysql?serverTimezone=UTC&useSSL=false";
			String dbId = "root";
			String dbPw = "root";
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection(jdbcUrl, dbId, dbPw);
			
			String sql = "INSERT INTO board VALUES(?, ?, ?, ?)";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1,number);
			pstmt.setString(2,writer);
			pstmt.setString(3,title);
			pstmt.setString(4,content);		
			pstmt.executeUpdate();
			conn.close();
			pstmt.close();
		}catch(Exception e){
			e.printStackTrace();
		}
		
		response.sendRedirect("03_02_mainList.jsp");
		
	%>

