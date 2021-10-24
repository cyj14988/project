<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    <style>
	 
	 button{
	 	width:50px;
	 	height:50px;
	 }
	 .red{
	 	background-color: red;
	 }
	 .blue{
	 	background-color: blue;
	 }
</style>
<%

	final int Playing = 0;
	final int Win = 1;
	final int Lost = 2;
	
	Object obj = null;
	obj = session.getAttribute("size");
	int size = (int)obj;
	obj = session.getAttribute("state");
	int state = (int)obj;
	obj = session.getAttribute("count");
	int count = (int)obj;
	obj = session.getAttribute("arr");
	int arr[] = (int[])obj;
	obj = session.getAttribute("check");
	boolean check[] = (boolean[])obj;
	
	
%>

<div align="center">
<h2>행운의 카드를 맞혀라</h2><br>
<h4>파랑색 3장 맞히면 당첨, <%=count%>번째 게임</h4>
<%for(int i = 0; i < size; i++){ %>
	<%if(check[i] == true&&arr[i] == 7){ %>
			<button class="blue" disabled></button>
	<%}else if(check[i] == true && arr[i] == 1){%>
			<button class="red" disabled></button>
	<%}else{ %>
		<%if(state == Playing){%>
			<button onclick="window.location.href='lottoGamePro.jsp?index=<%=i%>'"></button>
		<%}else{ %>
			<button disabled></button>
		<%} %>
	<%} %>
<%} %>

<%if(state == Win){%>
	<h1>축하합니다. 당첨입니다.</h1>
	<a href= "index.jsp">다시하기</a>
<%}else if(state == Lost){ %>
	<h1>꽝입니다.</h1>
	<a href= "index.jsp">다시하기</a>
<%} %>

</div>