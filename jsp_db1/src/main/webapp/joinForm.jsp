<%@page import="java.sql.Connection"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>

<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<jsp:include page="shopmain.jsp" ></jsp:include>
	
	<%
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		int size = 0;
		
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
				if(rs.getInt(1) > 0 ){
					size = rs.getInt(1);
				}
			}
			conn.close();
			pstmt.close();
			rs.close();
		}catch(Exception e){
			e.printStackTrace();
		}
		
		int number = 100001 + size;
	
	%>

<div align="center">
	<h2>Ȩ���� ȸ�� ���</h2>
	<form action="joinPro.jsp" method="post">
		<table border="1">
			<tr >
				<td width="300px" align="center">ȸ����ȣ(�ڵ��߻�)</td>
				<td width="400px"><input type="text" value="<%=number%>" disabled></td>
			</tr>
			<tr>
				<td align="center">ȸ������</td>
				<td><input type="text" name="name"></td>
			</tr>
			<tr>
				<td align="center">ȸ����ȭ</td>
				<td><input type="text" name="num"></td>
			</tr>
			<tr>
				<td align="center">��Ż�(KS KT LG)</td>
				<td >
					 <input type="radio" name="address" value="SK" checked>SK&nbsp;
			         <input type="radio" name="address" value="KT">KT&nbsp;
			         <input type="radio" name="address" value="LG">LG			
				</td>
			</tr>
			<tr>
				<td align="center">��������</td>
				<td><input type="text" name="date"></td>
			</tr>
			<tr>
				<td align="center">�����(A:VIP,B:�Ϲ�,C:����)</td>
				<td><input type="text" name="grade"></td>
			</tr>
			<tr>
				<td align="center">�����ڵ�</td>
				<td><input type="text" name="city"></td>
			</tr>
			<tr>
				<td align="center" colspan="2">
					<input type="hidden" name="number" value="<%=number%>">
					<input type="submit" value="���">
					<input type="button" value="��ȸ" onclick="window.location.href='memberListView.jsp'">
				</td>
			</tr>		
		</table>
	</form>
</div>
