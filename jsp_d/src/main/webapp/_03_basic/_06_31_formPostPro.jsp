<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>


<%
	// form ���� method �Ӽ����� post �ΰ�� ���ڵ�ó���Ѵ�. 
	request.setCharacterEncoding("EUC-KR");

	String id = request.getParameter("id");
	
%>

<%=id %>