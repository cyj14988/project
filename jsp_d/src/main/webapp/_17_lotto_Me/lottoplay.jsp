<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<style>
	button{
		width: 1px;
		height: 1px;
	}
	
	.lotto{
		width: 50px;
		height: 50px;
	}
	


</style>
<%

	Object obj = null;
	obj = session.getAttribute("lotto");
	int lotto[] = (int[])obj;
	obj = session.getAttribute("win");
	int win = (int)obj;
	obj = session.getAttribute("choice");//선택지 번호 
	int choice[] = (int[])obj;
	obj = session.getAttribute("check");
	boolean check[] = (boolean[])obj;
	obj = session.getAttribute("choiceCheck");
	boolean choiceCheck[][] = (boolean[][])obj;
	
%> 
<div align="center">
<h1></h1>
<%for(int i = 0; i < lotto.length; i++){ %>
<%if(win == 0){ %>
	<button class="lotto"></button>
<%}else if(win == 1){ %>
	<button><%=lotto[i]%></button>
<%} %>
<%} %>
<table border="2">
<tr>
<%for(int i = 0; i < 6; i++){ %>
	<td>
	<%for(int j = 0; j < 45; j++){%>
		<button onclick="window.location.href='lottochoice.jsp?index=<%=i%>&number=<%=j+1%>'"><%=j+1%></button>
		<%if(j % 9 == 8){ %>
		<%System.out.println();%>
		<%} %>
	<%}%>
	</td>
<%} %>
</tr>
</table>
</div> 