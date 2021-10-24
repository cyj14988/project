<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<jsp:include page="shopmain.jsp" ></jsp:include>
<%
	request.setCharacterEncoding("EUC-KR");
%>

<%
	int state = 0;
	int number = Integer.parseInt(request.getParameter("number"));
	String name = request.getParameter("name");
	String num = request.getParameter("num");
	String address = request.getParameter("address");
	String date = request.getParameter("date");
	String grade = request.getParameter("grade");
	String city = request.getParameter("city");
	
	if(name.equals("") || address.equals("")|| date.equals("") || grade.equals("") || city.equals("")){
		System.out.println("값을 모두 입력해주세요.");
		state = 1;
	}//왜 null이 아니고 공백이지?
	
	if(state == 0){
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		try{
			String jdbcUrl = "jdbc:mysql://localhost:3306/jsp_00_db_shoppingmall?serverTimezone=UTC&useSSL=false";
			String dbId = "root";
			String dbPw = "root";
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection(jdbcUrl, dbId, dbPw);
			
			String sql = "INSERT INTO member_tbl_02 VALUES(?, ?, ?, ?, ?, ?, ?)";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, number);
			pstmt.setString(2, name);
			pstmt.setString(3, num);
			pstmt.setString(4, address);
			pstmt.setString(5, date);
			pstmt.setString(6, grade);
			pstmt.setString(7, city);
			pstmt.executeUpdate();
			
			System.out.println("회원가입 완료: " + name);
			
			conn.close();
			pstmt.close();
		}catch(Exception e){
			e.printStackTrace();
		}
	}else{
		response.sendRedirect("joinForm.jsp");
	}
	
%>
	[<%=name%>님 회원가입 완료]