<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
	<%
		request.setCharacterEncoding("EUC-KR");
	%>

	<%
		String[] idList = (String[])session.getAttribute("idList");
		String[] pwList = (String[])session.getAttribute("pwList");
		String[] nameList = (String[])session.getAttribute("nameList");
		String[] genderList = (String[])session.getAttribute("genderList");
		int size = (Integer)session.getAttribute("size");
	
		
	%>
<div align="center">
	<h2>������ ������(ȸ�� ���� Ȯ���ϱ�)</h2>
	<table border="1">
	
		<tr>
			<td width="100px">���̵�</td>
			<td>�н�����</td>
			<td>�̸�</td>
			<td>����</td>
			<td>����</td>
		</tr>
		<%--�����ڴ� ���� --%>
		<%for(int i = 1; i < size; i++){ %>			
			<tr>
				<td><%= idList[i] %></td>
				<td><%= pwList[i] %></td>
				<td><%= nameList[i] %></td>
				<td><%= genderList[i] %></td>
				<td><input type="button" value="����" 
				onclick="window.location.href='01_03_adminUserDelete.jsp?id=<%=idList[i]%>'"></td>
			</tr>
		
		<%} %>

	</table>
	<p></p>
	<input type="button" value="������������" onclick="window.location.href='01_01_adminMain.jsp'">
</div>