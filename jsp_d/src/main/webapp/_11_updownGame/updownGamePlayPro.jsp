<%@page import="java.util.Random"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>  
<%
	String str = request.getParameter("me");
	int me = Integer.parseInt(str);
	Object obj = session.getAttribute("com");
	int com = (int)obj;
%>	
<%if(me > com){%>
	<%=me %> ���� �۴�. <br>
	<a href="updownGamePlay.jsp">�ڷΰ���</a>
<%}else if(me < com){ %>
	<%=me %> ���� ũ��. <br>
	<a href="updownGamePlay.jsp">�ڷΰ���</a>
<%}else if(me == com){ %>
	<%
		session.removeAttribute("com");
		session.removeAttribute("cheat");
	%> 
	�����Դϴ�. <%=com %>	<p>
	<a href="index.jsp">ó������</a>
<%} %>
