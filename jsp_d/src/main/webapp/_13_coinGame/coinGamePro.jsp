<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%
	String str = request.getParameter("coin");
	int coin = Integer.parseInt(str);

	str = request.getParameter("choice");
	int choice = Integer.parseInt(str);
	
	Object obj = session.getAttribute("scoreCount");
	int scoreCount = (int)obj;
	obj = session.getAttribute("gameCount");
	int gameCount = (int)obj;	
	
	
	int state = 0;
	
	if(choice == 1 && coin % 2 == 1){
		state = 1;
		scoreCount += 1;
		session.setAttribute("scoreCount", scoreCount);
	}else if(choice == 2 && coin % 2 == 0){
		state = 1;
		scoreCount += 1;
		session.setAttribute("scoreCount", scoreCount);
	}else{
		state = 2;
	}
	if(gameCount == 5){
		state = 3;
	}
	
%>	

<h1><%=gameCount %>��°���� </h1>
<h1><%=scoreCount %>��</h1>
<%if(state == 1){%>
	<h1>����</h1>
	<a href="coinGame.jsp">�ڷΰ���</a>
<%}else if(state == 2){ %>
	<h1>����</h1>
	<a href="coinGame.jsp">�ڷΰ���</a>
<%}else if(state == 3){%>
	<h1>���� </h1>		
	<a href="index.jsp">ó������</a>
<%}%> 