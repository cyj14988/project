<%@page import="java.util.Random"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    
<%
	
	Object obj = null;
	obj = session.getAttribute("max");
	int max = (int)obj;
	obj = session.getAttribute("arr");
	int arr[] = (int[])obj;
	obj = session.getAttribute("count");
	int count = (int)obj;
	
%>
<h1> ��ü ����Ʈ </h1>
<button onclick="window.location.href='02_insertPro.jsp'">�����߰�</button>
<hr>
<%for(int i = 0; i < count; i++){%>
	<%=arr[i] %> 
	<button onclick="window.location.href='03_updateForm.jsp?index=<%=i%>'">����</button>
	<button onclick="window.location.href='05_removePro.jsp?index=<%=i%>'">����</button>
	<p>
<%} %>
<hr>