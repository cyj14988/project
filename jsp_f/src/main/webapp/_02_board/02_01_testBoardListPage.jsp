<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    
<%	
	int [] numberList = (int[])session.getAttribute("numberList");
	String[] writerList = (String[])session.getAttribute("writerList");
	String[] titleList =(String[])session.getAttribute("titleList");
	String[] contentList = (String[])session.getAttribute("contentList");
	int size = (Integer)session.getAttribute("size");	
%>

	<div align="center">


		<h2>������ �Խ��� ���</h2>
		<table border="1">
			<tr>
				<td colspan="4" align="right">
					<button onclick="location.href='00_main.jsp'">���θ޴�</button>
				</td>
			</tr>

			<tr>
				<td colspan="4" align="right">
					<button onclick="location.href='02_03_sampleBoardInsertPro.jsp'">�����߰�</button>
				</td>
			</tr>

			
			<tr>
				<td width="100">��ȣ</td>
				<td width="250">����</td>
				<td width="150">�ۼ���</td>
				<td width="50">����</td>
			</tr>
			<%if(size >0){ %>
				<%for(int i = 0; i < size; i++){ %>
				<tr>
					<td><%= numberList[i]%></td>
	
					<td><%= titleList[i]%></td>
	
					<td><%= writerList[i]%></td>
					<td width="50">
						<input type=button value="����"
							onclick="window.location.href='02_02_boardDeletePro.jsp?remove=<%=numberList[i]%>'">
					</td>
				</tr>
	
				<%} %>	
			<%} %>
		</table>
	</div>
