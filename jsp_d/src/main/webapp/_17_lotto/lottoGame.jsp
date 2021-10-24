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
<h2>����� ī�带 ������</h2><br>
<h4>�Ķ��� 3�� ������ ��÷, <%=count%>��° ����</h4>
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
	<h1>�����մϴ�. ��÷�Դϴ�.</h1>
	<a href= "index.jsp">�ٽ��ϱ�</a>
<%}else if(state == Lost){ %>
	<h1>���Դϴ�.</h1>
	<a href= "index.jsp">�ٽ��ϱ�</a>
<%} %>

</div>