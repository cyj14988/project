<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>

<%
	if(session.getAttribute("log") == null){
%>
	<p><a href="05_list2.jsp">ȸ�����</a></p>
	<p><a href="02_insert2.jsp">ȸ������</a></p>
	<p><a href="06_login2.jsp">�α���</a></p>
<%
	}else{
%>
	<p><a href="05_list2.jsp">ȸ�����</a></p>
	<p><a href="03_delete2.jsp">ȸ������</a></p>
	<p><a href="04_update2.jsp">ȸ������</a></p>
	<p><a href="07_logout2.jsp">�α׾ƿ�</a></p>
<%
	}
%>