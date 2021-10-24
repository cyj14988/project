<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<jsp:include page="shopmain.jsp" ></jsp:include>

<%
	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	int size = 0;
	
	String numList[] = null;
	String nameList[] = null;
	String numberList[] = null;
	String addressList[] = null;
	String dateList[] = null;
	String gradeList[] = null;
	String cityList[] = null;
	
	try{
		String jdbcUrl = "jdbc:mysql://localhost:3306/jsp_00_db_shoppingmall?serverTimezone=UTC&useSSL=false";
		String dbId = "root";
		String dbPw = "root";
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		conn = DriverManager.getConnection(jdbcUrl, dbId, dbPw);
		
		String sql = "SELECT COUNT(*) FROM member_tbl_02";
		pstmt = conn.prepareStatement(sql);
		rs = pstmt.executeQuery();
		
		if(rs.next()){
			if(rs.getInt(1) > 0){
				size = rs.getInt(1);
				numList = new String[size];
				nameList = new String[size];
				numberList = new String[size];
				addressList = new String[size];
				dateList = new String[size];
				gradeList = new String[size];
				cityList = new String[size];
				
				sql = "SELECT * FROM member_tbl_02";
				pstmt = conn.prepareStatement(sql);
				rs = pstmt.executeQuery();
				int i = 0;
				while(rs.next()){
					numList[i] = rs.getString(1);
					nameList[i] = rs.getString(2);
					numberList[i] = rs.getString(3);
					addressList[i] = rs.getString(4);
					i+= 1;
				}
				sql = "select DATE_Format(joindate, '%Y년 %m월 %d일') from member_tbl_02";
				pstmt = conn.prepareStatement(sql);
				rs = pstmt.executeQuery();
				i = 0;
				while(rs.next()){
					dateList[i] = rs.getString(1);
					i+= 1;
				}
				
				sql = "SELECT gradename FROM gradelist, member_tbl_02 where member_tbl_02.grade = gradelist.grade";
				pstmt = conn.prepareStatement(sql);
				rs = pstmt.executeQuery();
				i = 0;
				
				while(rs.next()){
					gradeList[i] = rs.getString(1);
					i+=1;
				}
				
				sql = "SELECT cityname FROM codenum, member_tbl_02 WHERE num = city";
				pstmt = conn.prepareStatement(sql);
				rs = pstmt.executeQuery();
				i = 0;
				
				while(rs.next()){
					cityList[i] = rs.getString(1);
					i+=1;
				}
			}
		}
		conn.close();
		pstmt.close();
		rs.close();
	}catch(Exception e){
		e.printStackTrace();
	}
		
%>

	<div align="center"> 	
	 	<h2>회원목록조회/수정</h2> 	
	 	<table border="1">		
	 		<tr align="center">
	 			<td width="100px">회원번호</td>
	 			<td width="100px">회원성명</td>
	 			<td width="150px">전화번호</td>
	 			<td width="200px">통신사</td>
	 			<td width="200px">가입일자</td>
	 			<td width="100px">고객등급</td>
	 			<td width="100px">거주지역</td>
	 		</tr>	 
	 		
			<%for(int i = 0; i < size; i++){ %>
			<tr align="center">
				<td><a href="updateForm.jsp?number=<%=numList[i]%>"><%=numList[i]%></a></td>			
				<td><%=nameList[i]%></td>
				<td><%=numberList[i]%></td>
				<td><%=addressList[i]%></td>
				<td><%=dateList[i]%></td>
				<td><%=gradeList[i]%></td>
				<td><%=cityList[i] %></td>
			</tr>
			<%
			} 
			%>	 					
	 	</table>	 	
 	</div>

