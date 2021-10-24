<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>

    <% 
    	request.setCharacterEncoding("EUC-KR");
    %>
    
    <%
    	String id = request.getParameter("id");
    	String pw = request.getParameter("pw");
    	String name = request.getParameter("name");
    	
    	Connection conn = null;
    	PreparedStatement pstmt = null;
    	ResultSet rs = null;
    	
    	try{
			String jdbcUrl = "jdbc:mysql://localhost:3306/jsp_00_11_crud_mysql?serverTimezone=UTC&useSSL=false";
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
				int result = rs.getInt(1);
				
				if(result == 1){
					sql = "UPDATE member SET name =? WHERE id =?";
					pstmt = conn.prepareStatement(sql);
					pstmt.setString(1, name);
					pstmt.setString(2, id);
					pstmt.executeUpdate();
					
					out.print("result = " + result + "<br>");
				}else{
					out.print("아이디와 패스워드를 확인해주세요<br>");
				}
			}
			conn.close();
			pstmt.close();
			rs.close();
    	}catch(Exception e){
    		e.printStackTrace();
    	}
    %>
    
    <a href = "00_main2.jsp">메인으로</a>