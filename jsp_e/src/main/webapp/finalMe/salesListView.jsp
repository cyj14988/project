<%@page import="java.util.Arrays"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
 <jsp:include page="shopMain.jsp" ></jsp:include>
 
 <%
 	String[][] salesList = (String[][])session.getAttribute("salesList");
 	String[] rankid = new String[salesList.length];
	String[][] memberList = (String[][])session.getAttribute("memberList");
 	int salesCount = (Integer)session.getAttribute("salesCount");
	int index = 0;
 	int count = 0;
 	for(int i = 0; i < salesCount; i++){
 		String id = salesList[i][0];
 		System.out.println(id);
 		boolean check = false;
 		for(int j = 0; j < i; j++){
 			if(id.equals(rankid[j])){
 				check = true;
 				break;
 			}
 		}
 		if(check == false){
 			rankid[index] = id;
 			count++;
 			index++;
 		}
 	}
 	
 	int[] ranking = new int[count];
 	
 	for(int i = 0; i < count; i++){
 		for(int j = 0; j < salesCount; j++){
 			if(salesList[j][0].equals(rankid[i])){
 				ranking[i] += Integer.parseInt(salesList[j][4]);  
 			}
 		}
 	}
 	
 	System.out.println(Arrays.toString(rankid));
	System.out.println(Arrays.toString(ranking));
 	
 	for(int i = 0; i < count; i++){
 		for(int j = i+1; j < count; j++){
 			if(ranking[j] > ranking[i]){
 				int temp = ranking[i];
 				ranking[i] = ranking[j];
 				ranking[j] = temp;
 				
 				String temp2 = rankid[i];
 				rankid[i] = rankid[j];
 				rankid[j] = temp2;
 			}
 		}
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
	 		
	 			<%for(int i = 0; i < count; i++){ %>
	 			<tr align="center">
	 				<td>
	 				<%=rankid[i]%>
	 				</td>
	 				
					<%for(int j = 0; j < memberList.length; j++){%>
						<%if(rankid[i].equals(memberList[j][0])){ %>
							<td><%=memberList[j][1]%></td>
							<td>
							<%if(memberList[j][5].equals("A")){ %>
								VIP
							<%}else if(memberList[j][5].equals("B")){ %>
								일반
							<%}else{ %>
								직원
							<%} %>
							</td>
						<%} %>
					<%} %>
					<td>
		 			<%=ranking[i]%>
		 			</td>
	 				</tr>	
	 			<%} %>
	 	</table>		 	
 	</div>
 