<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    
 <jsp:include page="00_main.jsp"></jsp:include> 

<div align="center">
	<form method="post" action="01_joinPro.jsp">
		<table border="1">
			<tr align="center">
				<td colspan="2">ȸ������</td>
			</tr>
			
			<tr align="center">
				<td>���̵�</td>
				<td><input type="text" name="id"></td>
			</tr>
			
			<tr align="center">
				<td>��й�ȣ</td>
				<td><input type="password" name="pw"></td>
			</tr>
			
			<tr align="center">
				<td>�̸�</td>
				<td><input type="text" name="name"></td>
			</tr>
			
			<tr>
				<td colspan="2"><input type="submit" value="ȸ������"></td>
			</tr>
		</table>
	</form>	
</div>		 
