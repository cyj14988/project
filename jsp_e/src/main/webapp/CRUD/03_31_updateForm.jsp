<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>

<%
	request.setCharacterEncoding("EUC-KR");
	String[] idList = (String[])session.getAttribute("idList");
	String[] pwList = (String[])session.getAttribute("pwList");
	String[] nameList = (String[])session.getAttribute("nameList");
	String[] genderList = (String[])session.getAttribute("genderList");
	int size = (Integer)session.getAttribute("size");
	 
	String log = (String)session.getAttribute("log");
	String id = "";
 	String name = "";
 	String pw = "";
 	String gender = "";
 	for(int i = 0; i <size; i++){
 		if(idList[i].equals(log)){
 			id = idList[i];
 			name = nameList[i];
 			pw = pwList[i];
 			gender= genderList[i];
 			break;
 		}
 	}
%>
<div align="center">
   <h3>ȸ������ ����</h3>
   <form method="post" action="03_32_updatePro.jsp">
	   <table border="1">
		  	<tr>
		  		<td width="100px">���̵�</td> 
		  		<td width="200px"><%=id%></td> 
		  	</tr>  	
		  	<tr>
		 	 	<td>�н�����</td>
		 	 	<td><input type="password" name="pw" value="<%=pw%>"></td> 
		  	</tr>
		  	<tr>
		  		<td >�̸�</td>
		  		<td><input type="text" name="name" value="<%=name%>"></td>	  	
		  	</tr>
		  	<tr>
		  		<td>����</td>
				<td>
					<%if(gender.equals("����")){ %>
						<input type="radio" name="gender" value="����" checked>����
						<input type="radio" name="gender" value="����" >����
					<%}else{ %>	
						<input type="radio" name="gender" value="����">����		
						<input type="radio" name="gender" value="����" checked>����
					<%} %>
				</td>			  	
		  	</tr>
		  	<tr>
		  		<td colspan="2" align="center">
		  			<input type="hidden" value=<%=id %> name="id">
		  			<input type="submit" value="�Է¿Ϸ�">
		  		</td>
		  	</tr>
	   </table>	
   </form>
   <input type="button" value="����ȭ��" onclick="window.location.href='02_01_main.jsp'">
</div>
