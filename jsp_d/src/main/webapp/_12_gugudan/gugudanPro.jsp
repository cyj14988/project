<%@page import="java.util.Random"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%
	Object obj = null;	

	obj = session.getAttribute("totalscore");
	int totalscore = (int)obj;
	
	obj = session.getAttribute("totalcount");
	int totalcount = (int)obj;

	String str = request.getParameter("me");
	int me = Integer.parseInt(str);
	str = request.getParameter("dan");
	int dan = Integer.parseInt(str);
	str = request.getParameter("times");
	int times = Integer.parseInt(str);
	
	int result = dan * times;
	int state = 0;
	
	if(me == result){
		state = 1;
		totalscore += 10;
		session.setAttribute("totalscore", totalscore);
	}else{
		state = 2;
	}
	if(totalcount == 5){
		state = 3;
	}
%>

<%if(state == 1){ %>
	����!
	<a href="gugudan.jsp?">�ڷΰ���</a>
	
<%}else if(state == 2){%>
	����!
	<a href="gugudan.jsp?">�ڷΰ���</a>
<%}else if(state == 3){%>
	���� ����!
	<%
		session.removeAttribute("totalscore");
		session.removeAttribute("totalcount");
	%>
	<a href="index.jsp">ó������</a>
<%}%>