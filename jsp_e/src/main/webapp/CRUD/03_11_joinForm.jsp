<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>

<div align="center">
	<h2>ȸ������</h2>
	<form action="03_12_joinPro.jsp" method="post">
		<table  border="1">
			<tr>			
				<td width="100px">���̵�</td>
				<td width="200px"><input type="text" name="id"></td>	
			</tr>
			<tr>			
				<td>��й�ȣ</td>
				<td><input type="text" name="pw"></td>	
			</tr>
			<tr>			
				<td>�̸�</td>
				<td><input type="text" name="name"></td>	
			</tr>
			<tr>			
				<td>����</td>
				<td>
					<input type="radio" name="gender" value="����" checked>����
					<input type="radio" name="gender" value="����">����
				</td>	
			</tr>
			<tr>			
				<td colspan="2" align="center"><input type="submit"  value="ȸ������"></td>									
			</tr>
		</table>
	</form>
	<input type="button" value="����ȭ��" onclick="window.location.href='02_01_main.jsp'">
</div>
