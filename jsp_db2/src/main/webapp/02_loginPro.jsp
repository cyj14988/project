<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<jsp:include page="00_main.jsp"></jsp:include>

<%
	request.setCharacterEncoding("EUC-KR");
%>

<%
	String id = request.getParameter("id");
	String pw = request.getParameter("pw");
%>

<%
	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	int state = 0;
	
	try{
		String jdbcUrl = "jdbc:mysql://localhost:3306/jsp_00_db2_board?serverTimezone=UTC&useSSL=false";
		String dbId = "root";
		String dbPw = "root";
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		conn = DriverManager.getConnection(jdbcUrl, dbId, dbPw);
		
		String sql = "SELECT COUNT(*) FROM member WHERE id = ? AND pw = ?";
		pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, id);
		pstmt.setString(2, pw);
		rs = pstmt.executeQuery();
		
		if(rs.next()){
			if(rs.getInt(1) == 1){
				state = 1;
				session.setAttribute("log", id);
			}
		}
		conn.close();
		pstmt.close();
		rs.close();
	}catch(Exception e){
		e.printStackTrace();
	}
	
	if(state == 0){
		System.out.println("아이디와 비밀번호를 확인하세요.");
	}
	
	response.sendRedirect("00_main.jsp");
	
%>
	
