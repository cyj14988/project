<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
	<jsp:include page="00_main.jsp"></jsp:include>

	<%
		int lastNumber = (Integer)session.getAttribute("lastNumber");
		String log = (String)session.getAttribute("log");
		String id = null;
		
		if(log != null){
			id = log;		
		}else{
			id = "��ȸ��";
		}
		
	%>
	
		<div align="center" >
			<form method="post" action="05_writePro.jsp">
				<table border="1">
					<tr align="center">
						<td colspan="4">�۾���</td>
					</tr>
					
					<tr align="center">
						<td>��ȣ</td>
						<td><%=lastNumber + 1%></td>
						<td>���̵�</td>
						<td><%=id%></td>
					</tr>
					
					<tr align="center">
						<td>��������</td>
						<td colspan="3">
							<select name="type">
								<option value="�Ϲ�">�Ϲ�</option>
								<option value="Q&A">Q&A</option>
								<option value="�͸�">�͸�</option>
								<option value="����">����</option>
							</select>
						</td>
					</tr>
					
					<tr align="center">
						<td>����</td>
						<td colspan="3">
							<input type="text" name="title" value="����<%=lastNumber+1%>">
						</td>
					</tr>
					
					<tr align="center">
						<td colspan="4">����</td>
					</tr>
					
					<tr align="center">
						<td colspan="4">
							<textarea rows="20" cols="100" name="content">����<%=lastNumber+1%></textarea>
						</td>
					</tr>
					
					<tr align="center">
						<td colspan="4">
							<input type="hidden" name="id" value=<%=id%>>
							<input type="submit" value="�ۼ�">
						</td>
					</tr>
				</table>
			</form>
		</div>	