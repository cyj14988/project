<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>

<%
	Object obj = null;
	obj = session.getAttribute("numList");	
	int numList[]= (int[]) obj;
	obj = session.getAttribute("testSize");
	int testSize = (int)obj;
	obj = session.getAttribute("gameCount");
	int gameCount = (int)obj;
%>
<style>
	button{
		width:100px;
		height:50px;
	}
</style>

<div align="center">
	<h1>Max Game</h1>
	
	<%if(gameCount == 5){ %>
		<h2>��� ����</h2>
		<a href="index.jsp">�ٽ��ϱ� </a>
	<%}else {%>
		<h2>����ū ���ڸ� Ŭ���ϼ���.</h2>
		<%for(int i = 0; i < testSize; i++){ %>
			<button onclick="window.location.href='maxGamePro.jsp?index=<%=i%>'"><%=numList[i] %></button>
		<%} %>
	<%} %>
</div>