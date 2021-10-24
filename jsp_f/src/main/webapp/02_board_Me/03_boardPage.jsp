<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<%
	int[] numList = (int[])session.getAttribute("numList");
	String[] titleList = (String[])session.getAttribute("titleList");
	String[] writerList = (String[])session.getAttribute("writerList");
	String[] contentList = (String[])session.getAttribute("contentList");
	
	int index = Integer.parseInt(request.getParameter("index"));
	
	int x = -1;
	for(int i = 0; i < numList.length; i++){
		if(numList[i] == index){
			x = i;
			break;
		}
	}
	
%>
<div align="center">
<form action="02_writePro.jsp" method="post">
	<table border="1">
		<tr align="center">
			<td colspan="4"><h3>게시판</h3></td>
		</tr>
		
		<tr align="right">
			<td colspan="4"><input type="button" onclick="window.location.href='main.jsp'" value="메인으로"></td>
		</tr>
		
		<tr align="center">
			<td width="50px">글번호</td>
			<td width="50px"><%=index%></td>
			<td width="100px">작성자</td>
			<td width="150px"><%=writerList[x]%></td>
		</tr>
		
		<tr align="center">
			<td width="100px">제목</td>
			<td width="250px" colspan="3"><%=titleList[x]%></td>
		</tr>
		
		<tr align="center">
			<td>내용</td>
			<td colspan="3"><textarea cols="50" rows="10"><%=contentList[x]%></textarea></td>
		</tr>
		
	</table>
</form>	
</div>