<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<%
	int count = (Integer)session.getAttribute("count");
	String idList[] = (String[])session.getAttribute("idList");
	String pwList[] = (String[])session.getAttribute("pwList");
	String numList[] = (String[])session.getAttribute("numList");
	String genderList[] = (String[])session.getAttribute("genderList");
	String nameList[] = (String[])session.getAttribute("nameList");	

%>

<div align="center">
<h1>ȸ������</h1>
<table border="1">
	<tr>
		<td colspan="4" align="center">ȸ�����</td>
	</tr>
	
	<tr>
		<td>���̵�</td>
		<td>�̸�</td>
		<td>��ȭ��ȣ</td>
		<td>����</td>
	</tr>
	
	<%for(int i = 1; i < count; i++){%>
		<tr>
			<td><a href="00_adminDetail"><%=idList[i]%></a></td>
			<td><%=nameList[i]%></td>
			<td><%=numList[i]%></td>
			<td><input type="button" onclick="window.location.href='00_adminDeletePro.jsp?index=<%=i%>'" value="����"></td>
		</tr>
	<%} %>
	
	<tr>
		<td align="center" colspan="4"><a href="00_adminMain.jsp">������ ������</a></td>
	</tr>
</table>
</div>