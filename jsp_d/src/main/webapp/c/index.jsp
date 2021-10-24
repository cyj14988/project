<%@page import="java.util.Arrays"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>

    
 <%
 	int arr[][] =  new int[5][9];
 	int num = 1;
 		for(int j = 0; j < arr.length; j++){ 
 			for(int d = 0; d < arr[j].length; d++){ 
 				arr[j][d]= num;
 				num++;
 			} 
 		}
 	
 	for(int i = 0; i < arr.length; i++){
 		System.out.print(Arrays.toString(arr[i])+ " ");
 	}
 %>
 <table border="1">
 
 	<%for(int j = 0; j < arr.length; j++){ %>
 	<tr>
 		<%for(int d = 0; d < arr[j].length; d++){ %>
 			<td><%=arr[j][d]%></td>
 		<%} %>
 	</tr>
 	<%} %>
 </table>