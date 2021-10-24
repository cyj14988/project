<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%
	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	int size = 0;
	int[] numberList = null;
	String[] writerList = null;
	String[] titleList = null;
	String[] contentList = null;
	try {
		String jdbcUrl = "jdbc:mysql://localhost:3306/jsp_00_12_board_mysql?serverTimezone=UTC&useSSL=false";
		String dbId = "root";
		String dbPw = "root";

		Class.forName("com.mysql.cj.jdbc.Driver");
		conn = DriverManager.getConnection(jdbcUrl, dbId, dbPw);
		
		String sql = "SELECT count(*) FROM board";
		pstmt = conn.prepareStatement(sql);
		rs = pstmt.executeQuery();
		if (rs.next()) {
			size = rs.getInt(1);
					
			if (size > 0) {
				numberList = new int[size];
				writerList = new String[size];
				titleList = new String[size];
				contentList = new String[size];
				
				sql = "SELECT * FROM board";
				pstmt = conn.prepareStatement(sql);
				rs = pstmt.executeQuery();
				int i = 0;
				while (rs.next()) {
					numberList[i] = rs.getInt(1);
					writerList[i] = rs.getString(2);
					titleList[i] = rs.getString(3);
					contentList[i] = rs.getString(4);
					i += 1;

				}
			}
		}

		conn.close();
		pstmt.close();
		rs.close();
	} catch (Exception e) {
		e.printStackTrace();
	}
%>
<!--  거꾸로 안 넣어줬는데 왜 거꾸로 출력이 되는거지?? -->
	<div align="center">


		<h2>페이지 게시판 목록</h2>
		<table border="1">
			<tr>
				<td colspan="4" align="right">
					<button onclick="location.href='00_main.jsp'">메인메뉴</button>
				</td>
			</tr>

			<tr>
				<td colspan="4" align="right">
					<button onclick="location.href='05_samplePro.jsp'">샘플추가</button>
				</td>
			</tr>


			<tr>
				<td width="100">번호</td>
				<td width="250">제목</td>
				<td width="150">작성자</td>
				<td width="50">삭제</td>
			</tr>
			<%
				if (size > 0) {
			%>

				<%
					for (int i = 0; i < size; i++) {
				%>
				<tr>
					<td><%=numberList[i]%></td>
	
					<td><%=titleList[i]%></td>
	
					<td><%=writerList[i]%></td>
					<td width="50"><input type=button value="삭제"
						onclick="window.location.href='04_deletePro.jsp?remove=<%=numberList[i]%>'">
					</td>
				</tr>
	
				<%
					}
				%>



			<%
				}
			%>
		</table>
	</div>
