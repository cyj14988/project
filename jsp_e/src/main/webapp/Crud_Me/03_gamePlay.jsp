<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<%
	int dan[] = (int[])session.getAttribute("dan");
	int times[] = (int[])session.getAttribute("times");
	int result[] = (int[])session.getAttribute("result");
	int resultList[][] = (int[][])session.getAttribute("resultList");
	String log = (String)session.getAttribute("log");
	
	if(log == null){
		response.sendRedirect("main.jsp");
	}
	
%>
<div align="center">
<h1>备备窜 巩力</h1>
<form action="03_gamePro.jsp">
<table border="1">
	<%for(int i = 0; i < dan.length; i++){%>
		<tr>
			<td align="center" colspan="5"><h1><%=i+1%>锅) <%=dan[i]%>X<%=times[i]%> = ?</h1></td>
		</tr>
		
		<tr>
		<%for(int j = 0; j < times.length; j++){ %>
			<td width="100px" height="50px" align="center">
				<%if(j == 0){ %>
					<input type="radio" name="<%=i%>" value=<%=j%> checked><h2><%=resultList[i][j]%></h2>
				<%}else{ %>
					<input type="radio" name="<%=i%>" value=<%=j%>><h2><%=resultList[i][j]%></h2>
				<%}%>
			</td>	
		<%}%>
		</tr>
	<%}%>
	<tr>
		<td colspan="5" align="center"><input type="submit" value="力免"><h1></h1></td>
	</tr>
</table>
</form>
</div>

