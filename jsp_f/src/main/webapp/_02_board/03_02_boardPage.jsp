<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    
<%	
	int [] numberList = (int[])session.getAttribute("numberList");
	String[] writerList = (String[])session.getAttribute("writerList");
	String[] titleList =(String[])session.getAttribute("titleList");
	String[] contentList = (String[])session.getAttribute("contentList");
	int size = (Integer)session.getAttribute("size");
	
	
	int number = Integer.parseInt(request.getParameter("number"));
	
	int index = 0;
	for(int i = 0; i < size; i++){
		if(number == numberList[i]){
			index = i;
			break;
		}
	}

%>

	<div align="center">
		<h2>�Խñ� ����</h2>
		<form method="post">
			<table border="1">
				<tr>
					<td >��ȣ</td>
					<td width="300"><%= numberList[index] %></td>
				</tr>
				<tr>
					<td>�ۼ���</td>
					<td><%= writerList[index] %></td>
					
				</tr>
				<tr>
					<td>����</td>
					<td><%= titleList[index]%></td>
					
				</tr>
				<tr>
					<td>����</td>
					<td colspan="3">
						<textarea rows="10" cols="60" readonly><%= contentList[index] %></textarea>
					</td>
				</tr>
				<tr>
					<td colspan="4" align="center">					
						<input type="button" value="�������" onclick="window.location.href='03_01_boardListPage.jsp'">
					</td>
				</tr>
			</table>
		</form>
	</div>
