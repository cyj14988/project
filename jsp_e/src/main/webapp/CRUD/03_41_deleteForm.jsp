<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>

<div align="center">
   <h3>ȸ��Ż��</h3>
   <form method="post" action="03_42_deletePro.jsp">
	   <table border="1">
		  	<tr>
		  		<td width="100px">���̵�</td> 
		  		<td width="200px"><input type="text" name="id" ></td> 
		  	</tr>  	
		  	<tr>
		 	 	<td>�н�����</td>
		 	 	<td><input type="password" name="pw" ></td> 
		  	</tr>

		  	<tr>
		  		<td colspan="2" align="center">
		  			<input type="submit" value="�Է¿Ϸ�">
		  		</td>
		  	</tr>
	   </table>	
   </form>
   <input type="button" value="����ȭ��" onclick="window.location.href='02_01_main.jsp'">
</div>
