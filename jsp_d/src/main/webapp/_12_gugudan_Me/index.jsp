<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>

<%--
	���α׷� ���� ���� �������� �̸� index ���� session�� �����س��´�.
 --%>

<%
	int gameCount = 0;
	int scoreCount = 0;
	session.setAttribute("gameCount", gameCount);
	session.setAttribute("scoreCount", scoreCount);
%>
<h1>�����ܰ���</h1>
<h2>5������ ���߸� ����</h2>
<a href="gugudan.jsp">���ӽ���</a>
    