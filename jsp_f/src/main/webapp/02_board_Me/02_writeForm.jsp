<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<%request.setCharacterEncoding("EUC-KR");%>
<%
	int lastNumber = (Integer)session.getAttribute("lastNumber");
%>

<div align="center">
<form action="02_writePro.jsp" method="post">
	<table border="1">
		<tr align="center">
			<td colspan="4"><h3>�Խ��� �۾���</h3></td>
		</tr>
		
		<tr align="right">
			<td colspan="4"><input type="button" onclick="window.location.href='main.jsp'" value="��������"></td>
		</tr>
		
		<tr align="center">
			<td width="50px">�۹�ȣ</td>
			<td width="50px"><%=lastNumber+1%></td>
			<td width="100px">�ۼ���</td>
			<td width="150px"><input type="text" name="writer"></td>
		</tr>
		
		<tr align="center">
			<td width="100px">����</td>
			<td width="250px" colspan="3"><input type="text" name="title"></td>
		</tr>
		
		<tr align="center">
			<td>����</td>
			<td colspan="3"><textarea cols="50" rows="10" name="content"></textarea></td>
		</tr>
		
		<tr align="center">
			<td colspan="4"><input type="submit" value="���"></td>
		</tr>
	</table>
</form>	
</div>