<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<%
	int[] numList = (int[])session.getAttribute("numList");
	String[] titleList = (String[])session.getAttribute("titleList");
	String[] writerList = (String[])session.getAttribute("writerList");
	String[] contentList = (String[])session.getAttribute("contentList");
	
	int size = (Integer)session.getAttribute("size");
	int lastNumber = (Integer)session.getAttribute("lastNumber");
	
%>

<div align="center">
	<table border="1">
		<tr align="center">
			<td colspan="4"><h2>�׽�Ʈ �Խ���</h2></td>
		</tr>
		
		<tr align="right">
			<td colspan="4"><input type="button" onclick="window.location.href='main.jsp'" value="��������"></td>
		</tr>
		
		<tr align="right">
			<td colspan="4"><input type="button" onclick="window.location.href='01_samplePro.jsp'" value="�����߰�"></td>
		</tr>
		
		<tr align="center">
			<td width="50px">��ȣ</td>
			<td width="200px">����</td>
			<td width="100px">�ۼ���</td>
			<td width="50px">����</td>
		</tr>
	
			<%if(size > 0){%>
				<%for(int i = 0; i < size; i++){ %>
				<tr>
					<td><%=numList[i]%></td>
					<td><a href="03_boardPage.jsp?index=<%=numList[i]%>"><%=titleList[i]%></a></td>
					<td><%=writerList[i]%></td>
					<td><input type="button" onclick="window.location.href='04_deletePro.jsp?index=<%=numList[i]%>'" value="����"></td>	
				</tr>
				<%} %>
			<%} %>
	</table>
</div>