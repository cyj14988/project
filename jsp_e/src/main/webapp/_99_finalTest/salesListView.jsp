<%@page import="java.util.Arrays"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <jsp:include page="shopMain.jsp" ></jsp:include>
 
 <%
 	int memberCount = (int)session.getAttribute("memberCount");
 	String salesList[][] = (String[][])session.getAttribute("salesList");
 	String memberList[][] = (String[][])session.getAttribute("memberList");
	int rank[][] = new int[memberCount][2];
	int money = 0;
	int id = 0;
	for(int i = 0; i < memberCount; i++){
		int sum = 0;
		id = Integer.parseInt(memberList[i][0]);
		for(int j = 0; j < salesList.length; j++){
			if(memberList[i][0] == salesList[j][0]){
				money = Integer.parseInt(salesList[j][4]);
				sum += money;
				rank[i][0] = id;
				rank[i][1] = sum;
			}
		}
	}
	for(int i = 0; i < rank.length; i++){
		for(int j = 0; j < i; j++){
			if(rank[i][1] > rank[j][1]){
				int temp = rank[i][1];
				rank[i][1] = rank[j][1];
				rank[j][1] = temp;
				
				int temp2 = rank[i][0];
				rank[i][0] = rank[j][0];
				rank[j][0] = temp2;
			}
		}
	}
	for(int i = 0; i < rank.length; i++){
		System.out.println(Arrays.toString(rank[i]));
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
	 		<%for(int i = 0; i < rank.length; i++){ %>
	 			<tr>
	 			<%for(int j = 0; j < memberCount; j++){ %>
						<%if(memberList[j][0].equals(rank[i][0]+"")){ %>
							<td align="center"><%=memberList[j][0]%></td>
							<td align="center"><%=memberList[j][1] %></td>
							<td align = "center">
							<%if(memberList[j][5].equals("A")){ %>
								VIP
							<%}else if(memberList[j][5].equals("B")){ %>
								일반
							<%}else{ %>
								직원
							<%} %>
							</td>
							<td align="center"><%=rank[i][1]%></td>
						<%} %>
	 			<%} %>
	 			</tr>
	 		<%} %>	 			
	 	</table>		 	
 	</div>
 