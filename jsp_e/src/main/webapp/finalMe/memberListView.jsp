<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    
 <jsp:include page="shopMain.jsp" ></jsp:include>
 
 <%
 	String memberList[][] = (String[][])session.getAttribute("memberList");
 	String codeList[][] = (String[][])session.getAttribute("codeList");
 	int memberCount = (Integer)session.getAttribute("memberCount");
	 
 %>
 	
	<div align="center"> 	
	 	<h2>회원목록조회/수정</h2> 	
	 	<table border="1">		
	 		<tr align="center">
	 			<td width="100px">회원번호</td>
	 			<td width="100px">회원성명</td>
	 			<td width="150px">전화번호</td>
	 			<td width="200px">통신사</td>
	 			<td width="100px">가입일자</td>
	 			<td width="100px">고객등급</td>
	 			<td width="100px">거주지역</td>
	 		</tr>	 
	 		
	 		<%for(int i = 0; i < memberCount; i++){ %>
	 			<tr align="center">
	 			<%for(int j = 0; j < memberList[0].length; j++){ %>
	 				<td>
	 				<%if(j == 0){ %>
	 					<a href="updateForm.jsp?number=<%=i%>"><%=memberList[i][j]%></a>
	 				<%}else if(j == 5){ %>
	 					<%if(memberList[i][j].equals("A")){ %>
	 						VIP
	 					<%}else if(memberList[i][j].equals("B")){ %>
	 						일반
	 					<%}else if(memberList[i][j].equals("C")){ %>
							직원
	 					<%} %>
	 				<%}else if(j == 6){ %>
	 					<%for(int d = 0; d < codeList.length; d++){%>
							<%if(memberList[i][j].equals(codeList[d][0])){%>
								<%=codeList[d][1]%>
	 						<%}%>
	 					<%} %>
	 				<%}else{ %>
	 					<%=memberList[i][j]%>
	 				<%} %>
	 				</td>
	 			<%} %>
	 			</tr>
	 		<%} %>
	 		
	 					
	 	</table>	 	
 	</div>