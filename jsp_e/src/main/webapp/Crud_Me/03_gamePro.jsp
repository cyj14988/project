<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<style>
	.red{
		backgournd-color: red;
	}
	
	.yellow{
		backgournd-color: yellow;
	}
</style>
<%
	int dan[] = (int[])session.getAttribute("dan");
	int times[] = (int[])session.getAttribute("times");
	int result[] = (int[])session.getAttribute("result");
	int resultList[][] = (int[][])session.getAttribute("resultList");	
	String log = (String)session.getAttribute("log");
	int me[][] = new int[5][1];
	int total = 0;
		
	for(int i = 0; i < me.length; i++){
		me[i][0] = Integer.parseInt(request.getParameter(i+""));
		System.out.print(me[i][0] + " ");
		if(me[i][0] == result[i]){ 
			total += 20;
		}
	}
	
		
%>
<div align="center">
<h1>구구단 문제</h1>
<h2>점수: <%=total%></h2>
<form action="gamePro.jsp">
<table border="1">
	<%for(int i = 0; i < dan.length; i++){%>
		<tr>
			<td align="center" colspan="5"><h1><%=i+1%>번) <%=dan[i]%>X<%=times[i]%> = ?</h1></td>
		</tr>
		
		<tr>
		<%for(int j = 0; j < times.length; j++){ %>
				<%if(me[i][0] == j){%>
					<%if(me[i][0] == result[i]){ %>
						<td bgcolor="yellow" width="100px" height="50px" align="center"><input type="radio" checked><h2><%=resultList[i][j]%></h2></td>
					<%}else{ %>
						<td bgcolor="red" width="100px" height="50px" align="center"><input type="radio" checked><h2><%=resultList[i][j]%></h2></td>
					<%} %>
				<%}else if(result[i] == j){ %>
						<td bgcolor="yellow" width="100px" height="50px" align="center"><input type="radio"><h2><%=resultList[i][j]%></h2></td>
				<%}else{%>
						<td width="100px" height="50px" align="center"><input type="radio" disabled><h2><%=resultList[i][j]%></h2></td>
				<%} %>
		<%}%>
		</tr>
	<%}%>
	<tr>
		<td colspan="5" align="center"><a href="#"><h3>랭킹</h3></a><a href="03_gameReady.jsp"><h3>다시하기</h3></a></td>
	</tr>
</table>
</form>
</div>
