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
	String name = request.getParameter("name");
	int state = 0;
%>

<%
	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	
	try{
		String jdbcUrl = "jdbc:mysql://localhost:3306/jsp_00_db2_board?serverTimezone=UTC&useSSL=false";
		String dbId = "root";
		String dbPw = "root";
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		conn = DriverManager.getConnection(jdbcUrl, dbId, dbPw);
		
		String sql = "SELECT COUNT(*) FROM member WHERE id = ?";
		pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, id);
		rs = pstmt.executeQuery();
		
		if(rs.next()){
			if(rs.getInt(1) == 1 || id.equals("") || pw.equals("") || name.equals("")){
				state = 1;
			}
		}
		if(state != 1){
			sql = "INSERT INTO member VALUES(?, ?, ?)";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			pstmt.setString(2, pw);
			pstmt.setString(3, name);
			pstmt.executeUpdate();
			
			conn.close();
			pstmt.close();
			rs.close();
		}
	}catch(Exception e){
		e.printStackTrace();
	}
	
%>

	<%if(state == 1){%>
		[중복아이디] or [입력값 오류]
	<%}else{%>
		[<%=id%>님 회원가입 완료]	
		로그인을 해주세요. 
	<%}%>
	

	
	