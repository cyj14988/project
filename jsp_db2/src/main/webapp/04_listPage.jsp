<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<jsp:include page="00_main.jsp"></jsp:include>
	<%
		String idList[] = (String[])session.getAttribute("idList");
		String numList[] = (String[])session.getAttribute("numList");
		String titleList[] = (String[])session.getAttribute("titleList");
		String contentList[] = (String[])session.getAttribute("contentList");
		String typeList[] = (String[])session.getAttribute("typeList");
		int size = 0;
		
		if(idList == null){
			System.out.println("null임");
			idList = null;
			numList = null;
			titleList = null;
		 	contentList = null;
		 	typeList = null;
		 	size = 0;
		 	
		 	Connection conn = null;
			PreparedStatement pstmt = null;
			ResultSet rs = null;
			
			try{
				String jdbcUrl = "jdbc:mysql://localhost:3306/jsp_00_db2_board?serverTimezone=UTC&useSSL=false";
				String dbId = "root";
				String dbPw = "root";
				
				Class.forName("com.mysql.cj.jdbc.Driver");
				conn = DriverManager.getConnection(jdbcUrl, dbId, dbPw);
			
				String sql = "SELECT COUNT(*) FROM board";
				pstmt = conn.prepareStatement(sql);
				rs = pstmt.executeQuery();
				
				if(rs.next()){
					if(rs.getInt(1) > 0){
						size = rs.getInt(1);
						idList = new String[size];
						numList = new String[size];
						titleList = new String[size];
						contentList = new String[size];
						typeList = new String[size];
						
						sql = "SELECT * FROM board order by number desc";
						pstmt = conn.prepareStatement(sql);
						rs = pstmt.executeQuery();
						
						int i = 0;
						while(rs.next()){
							idList[i] = rs.getString(1) + "";
							numList[i] = rs.getString(2);
							titleList[i] = rs.getString(3);
							contentList[i] = rs.getString(4);
							typeList[i] = rs.getString(5);
							i+= 1;
						}
					}
				}
				conn.close();
				pstmt.close();
				rs.close();
			}catch(Exception e){
				e.printStackTrace();
			}
		}else{
			size = idList.length;
		}
		
	%>
	
	
	<%
		int allBoardCount = size;
		int showBoardCount = 10;
		int allPageCount = allBoardCount / showBoardCount;
		if(allBoardCount % showBoardCount != 0){
			allPageCount += 1;
		}
		
		int currentPage = 1;
		String currentPagestr = request.getParameter("currentPage");
		if(currentPagestr != null){
			currentPage = Integer.parseInt(currentPagestr);
		}
		
		int startIndex = (currentPage - 1) * showBoardCount;
		int lastIndex = startIndex + showBoardCount;
		if(lastIndex > allBoardCount){
			lastIndex = allBoardCount;
		}
		
		int clickMax = 10;
		int startPage = (currentPage - 1)/clickMax * clickMax + 1;
		int lastPage = startPage + clickMax - 1;
		if(lastPage > allPageCount){
			lastPage = allPageCount;
		}
		int number = size - startIndex;
		
		System.out.println("게시판 시작: " + startIndex + " 게시판 끝: " + lastIndex);
	%>
	
	<div align="right">
		total: <%=size%>
	</div>
	<div align="center">
		<table border="1">
			<tr>
				<td width="150px">Type</td>
				<td width="150px">No</td>
				<td width="500px">Title</td>
			</tr>
			
			<%for(int i = startIndex; i < lastIndex; i++){ %>
				<tr>
					<td><%=typeList[i]%></td>
					<td><%=number--%></td>
					<td><a href="07_info.jsp?number=<%=numList[i]%>"><%=titleList[i]%></a></td>
				</tr>
			<%} %>
		</table>		
	</div>
	
	<div align ="right">
		<a href="05_writeForm.jsp">글쓰기</a>
	</div>
	
	<div align="left">
		<form action="08_search.jsp" method="post">
		<input type="checkbox" name="type" value="전체">전체
		<input type="checkbox" name="type" value="일반">일반
		<input type="checkbox" name="type" value="Q&A">Q&A
		<input type="checkbox" name="type" value="익명">익명
		<input type="checkbox" name="type" value="자유">자유
		<input type="submit" value="조회">
		</form>
	</div>
	
	<div align="right">
		<%for(int i = startPage; i <= lastPage; i++){%>
			<%if(startPage > clickMax){ %>
			<a href="04_listPage.jsp?currentPage=<%=startPage - clickMax%>">[이전]</a>
			<%}%>
			<a href="04_listPage.jsp?currentPage=<%=i%>"><%=i%> </a>			
			<%if(lastPage < allPageCount){ %>
			<a href="04_listPage.jsp?currentPage=<%=lastPage + 1%>">[이후]</a>
			<%}%>	
		<%}%>
	</div>
	