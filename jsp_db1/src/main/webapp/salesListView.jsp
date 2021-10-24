<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<jsp:include page="shopmain.jsp" ></jsp:include>
	<%
		int numList[] = null;
		String nameList[] = null;
		String gradeList[] = null;
		String saleList[] = null;
		
		int size = 0;
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
			
			
			String sql = "select count(*) from money_tbl_02 group by custno";
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next()){ //사이즈 넣는 다른 방법이 있나ㅠ
				size += 1;
			}
			 numList = new int[size];
			 nameList = new String[size];
			 gradeList = new String[size];
		     saleList = new String[size];
				
			System.out.println("size: "  + size);
			
			sql = "select money_tbl_02.custno, custname, gradename, sum(price) from money_tbl_02, member_tbl_02, gradelist where money_tbl_02.custno = member_tbl_02.custno and member_tbl_02.grade = gradelist.grade group by custno order by sum(price) desc"; 
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			int i = 0;
			while(rs.next()){
				numList[i] = rs.getInt(1);
				nameList[i] = rs.getString(2);
				gradeList[i] = rs.getString(3);
				saleList[i] = rs.getString(4) +"";
				i+=1;
			}
			conn.close();
			pstmt.close();
			rs.close();
		}catch(Exception e){
			e.printStackTrace();
		}
	%>
	
	<div align="center"> 	
	 	<h2>회원매출조회</h2>
	 	
	 	<table border="1">		
	 		<tr align="center">
	 			<td width="100px">회원번호</td>
	 			<td width="100px">회원성명</td>
	 			<td width="170px">고객등급</td>
	 			<td width="150px">매출</td>
	 		</tr>	 		
	 		
	 		<%for(int i = 0; i < size; i++){ %>
	 			<tr align="center">
	 				<td><%=numList[i] %></td>
	 				<td><%=nameList[i] %></td>
	 				<td><%=gradeList[i] %></td>
	 				<td><%=saleList[i] %></td>
	 			</tr>
	 		<%} %>
	 	</table>		 	
 	</div>
	