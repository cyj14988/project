<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>

	<%
		if(session.getAttribute("log") == null) {
	%>
		<p><a href="05_list.jsp">ȸ�����</a></p>
		<p><a href="02_insert.jsp">ȸ������</a></p>
		<p><a href="06_login.jsp">�α���</a></p>
	<%
		}else{
	%>
		<p><a href="05_list.jsp">ȸ�����</a></p>
		<p><a href="03_delete.jsp">ȸ������</a></p>
		<p><a href="04_update.jsp">ȸ������</a></p>
		<p><a href="07_logout.jsp">�α׾ƿ�</a></p>
	<%
		}
	%>
