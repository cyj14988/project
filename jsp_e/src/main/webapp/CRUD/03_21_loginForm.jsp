<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>

<div align="center">
	<h2>�α���������</h2>		
		<form action="03_22_loginPro.jsp" method="post">
			<table border="1">
				<tr>
					<td width="100px">���̵�</td>
					<td width="200px"><input type="text" name="id"></td>
				</tr>
				<tr>
					<td width="100px">��й�ȣ</td>
					<td width="200px"><input type="text" name="pw"></td>
				</tr>
				<tr>
					<td colspan="2" align="center"><input type="submit"  value="�α���"></td>
				</tr>
			
			</table>			
		</form>	
		<input type="button" value="����ȭ��" onclick="window.location.href='02_01_main.jsp'">
	</div>