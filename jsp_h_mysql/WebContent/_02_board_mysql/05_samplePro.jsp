<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%

		
	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	int size = 0;
	try {
		String jdbcUrl = "jdbc:mysql://localhost:3306/jsp_00_12_board_mysql?serverTimezone=UTC&useSSL=false";
		String dbId = "root";
		String dbPw = "root";
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		conn = DriverManager.getConnection(jdbcUrl, dbId, dbPw);
		
		String sql = "SELECT max(number) FROM board";
		pstmt = conn.prepareStatement(sql);
		rs = pstmt.executeQuery();
				
		if(rs.next()){
			if(rs.getInt(1) > 0){
				size = rs.getInt(1);
			}		
			for(int i = 0; i < 10; i++){
				sql = "INSERT INTO board VALUES(?, ?, ?, ?)";
				pstmt = conn.prepareStatement(sql);
				int num  = size + 1;
				String writer = "[작성자]" + num;
				String title = "[제목]" + num;
				String content = "[내용]" + num;
				
				pstmt.setInt(1,num);
				pstmt.setString(2,writer);
				pstmt.setString(3,title);
				pstmt.setString(4,content);		
				pstmt.executeUpdate();
				size += 1;
			}		
		}
		conn.close();
		pstmt.close();
	}catch(Exception e){
		e.printStackTrace();
	}
	
	response.sendRedirect("03_01_testList.jsp");

%>

