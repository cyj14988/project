<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>

<%--
	[session] 
		
	session �� request �� �޸� �������� ����Ǵµ��� ó������ ������ �����Ͱ� 
	�����ȴ�. 
	
	[1] session.setAttribute(Ű,��);
	[2] session.getAttribute(Ű);  object Ÿ������ ��ȯ�ȴ�. ��, ����ȯ���ؾ��Ѵ�.
	[3] session.removeAttribute(Ű);  session �� ����� �����͸� �����Ѵ�. 
	
 --%>

<%
	int a = 10;
	int b = 20;
	session.setAttribute("a" , a);
	session.setAttribute("b" , b);

%>

<a href="_06_01_sessionPro.jsp">����������</a>