<%@page import="java.util.Random"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    
<%
	
	Random ran = new Random();

	Object obj = null;
	obj = session.getAttribute("max");
	int max = (int)obj;
	obj = session.getAttribute("arr");
	int arr[] = (int[])obj;
	obj = session.getAttribute("count");
	int count = (int)obj;
	

%>
<div align="center">
<table border="1">
<tr>
<td bgcolor="yellow" width="300px" height="50px"><button onclick="window.location.href='02_insertPro.jsp?'">랜덤추가</button></td>
</tr>
<%for(int i = 0; i < count; i++){ %>
	<tr>
	<%if(arr[i] != 0){ %>
		<td><%=arr[i]%><button onclick="window.location.href='03_updateForm.jsp?index=<%=i%>'">수정</button>
		<button onclick="window.location.href='05_removePro.jsp?index=<%=i%>'">삭제</button>
		</td>
	<%}else{ %>
		<td></td>
	<%} %>
	</tr>
<%} %>
</table>
</div>

