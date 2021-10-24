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
		int number = Integer.parseInt(request.getParameter("number"));
		String name = request.getParameter("name");
		String phoneNum = request.getParameter("phoneNum");
		String address = request.getParameter("address");
		String grade = request.getParameter("grade");
		String city = request.getParameter("city");
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		try{
			String jdbcUrl = "jdbc:mysql://localhost:3306/jsp_00_db_shoppingmall?serverTimezone=UTC&useSSL=false";
			String dbId = "root";
			String dbPw = "root";
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection(jdbcUrl, dbId, dbPw);
		
			String sql = "UPDATE member_tbl_02 SET custname=?, phone=?, address=?, grade=?, city=? where custno = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(6, number);
			pstmt.setString(1, name);
			pstmt.setString(2, phoneNum);
			pstmt.setString(3, address);
			pstmt.setString(4, grade);
			pstmt.setString(5, city);
			pstmt.executeUpdate();
			
			conn.close();
			pstmt.close();
		}catch(Exception e){
			e.printStackTrace();
		}
	
		response.sendRedirect("memberListView.jsp");
	%>