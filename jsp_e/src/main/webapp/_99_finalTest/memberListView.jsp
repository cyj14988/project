<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    
 <jsp:include page="shopMain.jsp" ></jsp:include>
 	
 <%
 	String memberList[][] = (String[][])session.getAttribute("memberList");
 	int memberCount = (int)session.getAttribute("memberCount");
 	String codeList[][] = (String[][])session.getAttribute("codeList");
 %>	
 	
	<div align="center"> 	
	 	<h2>ȸ�������ȸ/����</h2> 	
	 	<table border="1">		
	 		<tr align="center">
	 			<td width="100px">ȸ����ȣ</td>
	 			<td width="100px">ȸ������</td>
	 			<td width="150px">��ȭ��ȣ</td>
	 			<td width="200px">��Ż�</td>
	 			<td width="100px">��������</td>
	 			<td width="100px">�����</td>
	 			<td width="100px">��������</td>
	 		</tr>	 
	 		<%for(int i = 0; i < memberCount; i++){%>
	 		<tr>
	 		<%for(int j = 0; j < memberList[i].length; j++){ %>
	 				<%if(j == 0){ %>
						<td align="center"><a href="updateForm.jsp?index=<%=i%>"><%=memberList[i][j]%></a></td>	 					
	 				<%}else if(j == 5){ %>
	 					<%if(memberList[i][j].equals("A")){ %>
	 							<td align="center">VIP</td>
	 					<%}else if(memberList[i][j].equals("B")){ %>
	 							<td align="center">�Ϲ�</td>
	 					<%}else if(memberList[i][j].equals("C")){ %>
	 							<td align="center">����</td>
	 					<%} %>				
	 				<%}else if(j == 6){ %>
	 					<%for(int d = 0; d < codeList.length; d++){ %>
	 						<%if(codeList[d][0].equals(memberList[i][j])){ %>
	 							 <td align="center"><%=codeList[d][1]%></td>
	 						<%} %>
	 					<%} %>
	 				<%}else{ %>
	 						<td align="center"><%=memberList[i][j]%></td>
	 				<%} %>
 				<%} %>
			</tr>
	 	<%} %>			
	 	</table>	 	
 	</div>