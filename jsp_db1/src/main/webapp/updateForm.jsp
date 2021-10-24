<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<jsp:include page="shopmain.jsp"></jsp:include>

	<%
		int number = Integer.parseInt(request.getParameter("number"));
		String name = null;
		String phoneNum = null;
		String address = null;
		String date = null;
		String grade = null;
		String city = null;
	%>

	<%
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try{		
			String jdbcUrl = "jdbc:mysql://localhost:3306/jsp_00_db_shoppingmall?serverTimezone=UTC&useSSL=false";
			String dbId = "root";
			String dbPw = "root";
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection(jdbcUrl, dbId, dbPw);
			
			String sql = "SELECT * FROM member_tbl_02 WHERE custno = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, number);
			rs = pstmt.executeQuery();
			
			if(rs.next()){
				name = rs.getString(2);
				phoneNum = rs.getString(3);
				address = rs.getString(4);
				date = rs.getString(5);
				grade = rs.getString(6);
				city = rs.getString(7);
				
			}
		conn.close();
		pstmt.close();
		rs.close();
		}catch(Exception e){
			e.printStackTrace();
		}
	%>
	
	
	<div align="center">
	<h2>홈쇼핑 회원 수정</h2>
	<form action="updatePro.jsp" method="post">
		<table border="1">
			<tr >
				<td width="300px" align="center">회원번호(자동발생)</td>
				<td width="400px"><input type="text" value="<%=number%>"></td>
			</tr>
			<tr>
				<td align="center">회원성명</td>
				<td><input type="text" name="name" value=<%=name%>></td>
			</tr>
			<tr>
				<td align="center">회원전화</td>
				<td><input type="text" name="phoneNum" value=<%=phoneNum%>></td>
			</tr>
			<tr>
				<td align="center">통신사(KS KT LG)</td>
				<td >
					<%if(address.equals("SK")){ %>
						 <input type="radio" name="address" value="SK" checked>SK&nbsp;
				         <input type="radio" name="address" value="KT">KT&nbsp;
				         <input type="radio" name="address" value="LG">LG	
					<%}else if(address.equals("KT")){ %>
						<input type="radio" name="address" value="SK">SK&nbsp;
				        <input type="radio" name="address" value="KT" checked>KT&nbsp;
				        <input type="radio" name="address" value="LG">LG	
					<%}else if(address.equals("LG")){ %>
						<input type="radio" name="address" value="SK">SK&nbsp;
				        <input type="radio" name="address" value="KT">KT&nbsp;
				        <input type="radio" name="address" value="LG" checked>LG	
					<%} %>
				</td>
			</tr>
			<tr>
				<td align="center">가입일자</td>
				<td><input type="text" value=<%=date%>></td>
			</tr>
			<tr>
				<td align="center">고객등급(A:VIP,B:일반,C:직원)</td>
				<td><input type="text" name="grade" value=<%=grade%>></td>
			</tr>
			<tr>
				<td align="center">도시코드</td>
				<td><input type="text" name="city" value=<%=city%>></td>
			</tr>
			<tr>
				<td align="center" colspan="2">
					<input type="hidden" name="number" value="<%=number%>">
					<input type="submit" value="수정">
					<input type="button" value="조회" onclick="window.location.href='memberListView.jsp'">
				</td>
			</tr>		
		</table>
	</form>
</div>