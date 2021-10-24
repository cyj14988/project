<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%	
	// ------------------------------------------------------------------------------------
	/*
		�Խ��� �ʿ��� ���� 
		1) allBoardCount 	:	��ü �۰��� 
		2) showBoardCount 	:	�������� ������ �۰��� 
		3) currentPage 		:	���� ������
		4) startIndex 		:	�Խ��� ���� �ε���
		5) lastIndex 		:	�Խ��� ������ �ε��� 
		6) numbewr 			:	�̰Խ��ǿ����������ִ¼���.
		7) startPage 		:   ����������
		8) lastPage			: 	������������
		9) clickMax			:   Ŭ�����������������ִ�ġ
		10) allPageCount    :   ��ü����������
	*/
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
				
				sql = "SELECT * FROM board order by number desc";
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

	//-------------------------------------------------------------------------
	
	
	int allBoardCount = size; // ��ü�۰���
	int showBoardCount = 5;   // �ѹ��� �������� ���Ѱ��� 
	
	//-------------------------------------------------------------------------
	int currentPage = 1; // ó���̸� 1���� ���� 
	
	String currentPageStr = request.getParameter("currentPage");	// Ŭ���� ����������	
	if(currentPageStr != null){
		currentPage = Integer.parseInt(currentPageStr); 
	}
	
	int startIndex = (currentPage - 1) * showBoardCount; // �Խ��� �����ε��� 
	int lastIndex = startIndex + showBoardCount;         // �Խ��� �������ε���
	if(lastIndex > allBoardCount){
		lastIndex = allBoardCount;  // �ѹ��� �������� ���� 5�����ȵɶ� 
	}
	
	int allPageCount = allBoardCount/showBoardCount;	// ��ü ����������
	if(allBoardCount % showBoardCount > 0){             // �������������� ��ü���������� 1 �߰� 
		allPageCount += 1;
	}
	
	int showNumber = (allBoardCount) - (showBoardCount * (currentPage-1));
	
	
	//----------------[����¡]-------------------------------------------------	
	int clickMax = 10;									// Ŭ�������� ������ ���� 
	int startPage = 0;									// Ŭ���Ҽ��ִ� ������ ���۹�ȣ  
	
	// Ŭ�������� ������ ���۹�ȣ ��� 
	// 1~10 ���������� ���۹�ȣ��1 �̳������� 
	// 11~20 �� ��������� ���۹�ȣ 11 �̳������� 
	// 21~30 �� ��������� ���۹�ȣ 21 �̳������� 
	startPage = (currentPage - 1) / clickMax * clickMax + 1; 
	
	// Ŭ�������� ������ ��������ȣ ��� 
	int lastPage = startPage + clickMax - 1;	
	if(lastPage > allPageCount){
		lastPage = allPageCount;
	}
	
	
	
%>

	<div align="center">

		����������<%= currentPage %><br> ����������<%= startPage%><br> ������������<%= lastPage%><br>
		��ü����������<%=allPageCount %><br> ��ü�۰���<%= allBoardCount%><br>


		<h2>������ �Խ��� ���</h2>
		<table border="1">
			<tr>
				<td colspan="4" align="right">
					<button onclick="location.href='00_main.jsp'">���θ޴�</button>
				</td>
			</tr>

		

			<tr>
				<td colspan="4" align="right">
					<button onclick="location.href='02_write.jsp'">�۾���</button>
				</td>
			</tr>

			<tr>
				<td width="100">��ȣ</td>
				<td width="250">����</td>
				<td width="150">�ۼ���</td>
			</tr>
			<%if(size >0){ %>

			<%for(int i = startIndex; i < lastIndex; i++){ %>
			<tr>
				<td><%= showNumber--%></td>

				<td><a href="06_info.jsp?number=<%=numberList[i]%>"><%= titleList[i]%></a>
				</td>

				<td><%= writerList[i]%></td>
				
			</tr>

			<%} %>

			<tr>
				<td colspan="4" align="center">
					<%if(currentPage > clickMax){ %> 
						<a href="03_02_mainList.jsp?currentPage=<%= startPage - clickMax %>">[����]</a>
					<%} %> 
					<%for(int i = startPage; i <= lastPage; i++){ %> 
						<a href="03_02_mainList.jsp?currentPage=<%= i%>">[<%= i%>]</a> 
					<%} %> 
					<%if(lastPage < allPageCount){ %> 
						<a href="03_02_mainList.jsp?currentPage=<%= lastPage + 1  %>">[����]</a>
					<%} %>

				</td>
			</tr>

			<%} %>
		</table>
	</div>
