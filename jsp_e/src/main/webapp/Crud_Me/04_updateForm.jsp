<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<%
	String idList[] = (String[])session.getAttribute("idList");
	String pwList[] = (String[])session.getAttribute("pwList");
	String numList[] = (String[])session.getAttribute("numList");
	String genderList[] = (String[])session.getAttribute("genderList");
	String nameList[] = (String[])session.getAttribute("nameList");		
	String log = (String)session.getAttribute("log");
	int count = (Integer)session.getAttribute("count");
	
	int index = -1;
	
	for(int i = 0; i < count; i++){
		if(idList[i].equals(log)){
			index = i;
			break;
		}
	}
%>
<div align="center">
<h1>ȸ����������</h1>
<form action="04_updatePro.jsp" method="post">
<table border="1">
<tr>
	<td>���̵�</td>
	<td><input type="text" name="id" value=<%=log%> disabled></td>
</tr>

<tr>
	<td>��й�ȣ</td>
	<td><input type="password" name="pw" value=<%=pwList[index]%>></td>
</tr>

<tr>
	<td>�̸�</td>
	<td><input type="text" name="name" value=<%=nameList[index]%>></td>
</tr>

<tr>
	<td>��ȭ��ȣ</td>
	<td><input type="text" name="num" value=<%=numList[index]%>></td>
</tr>

<tr>
	<td>����</td>
	<td>
	<%if(genderList[index].equals("����")){ %>
			<input type="radio" name="gender" value="����" checked>����
			<input type="radio" name="gender" value="����">����
	<%}else{ %>
			<input type="radio" name="gender" value="����">����
			<input type="radio" name="gender" value="����" checked>����
	<%} %>
	</td>
</tr>

<tr>
	<td colspan="2">
		<input type="submit" value="��������">
		<a href="main.jsp">�ڷΰ���</a>
		<input type ="hidden" name="index" value=<%=index%>>
	</td>
	
</tr>
</table>
</form>
</div>