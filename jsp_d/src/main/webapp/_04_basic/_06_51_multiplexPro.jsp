<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>

 	 
<%
	request.setCharacterEncoding("EUC-KR");
	
	String str = request.getParameter("num");	
	int num = Integer.parseInt(str);

	String name = request.getParameter("name");	
	
	str = request.getParameter("grade");	
	int grade = Integer.parseInt(str);
	
	String subject = request.getParameter("subject");
	
	/*
		checkbox �� ���� �������̴�. ��, request.getParameter �� ����Ҽ�����.
		request.getParameter �� ����ϸ� ù��° ���� �Ѿ�´�. 
		�Ʒ��Ͱ��� getParameterValues�� ����ؾ��Ѵ�. 
		
	*/
	String[] hobbies = request.getParameterValues("hobbies");
	
	String memo = request.getParameter("memo");
	
	/*
		&nbsp; �ڹ��� �����̽��� ������ ���Ѵ�. 
	*/
	
%>
<div align="center">
	<table border="1">
		<tr>
			<td>��ȣ</td>
			<td>�̸�</td>
			<td>����</td>
			<td>���</td>
			<td>�޸�</td>
		</tr>
		
		<tr>
			<td><%=num %></td>
			<td><%=name %></td>
			<td><%=subject %></td>
			<td>	
				<%for(int i = 0; i < hobbies.length; i++){ %>
					<%= hobbies[i]%> &nbsp;
				<%} %>
			</td>
			<td><%=memo %></td>
		</tr>		
	</table>
</div>
