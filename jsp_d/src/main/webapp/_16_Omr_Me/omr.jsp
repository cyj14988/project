<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>

<%

	Object obj = null;
	obj = session.getAttribute("testsize");
	int testsize = (int)obj;
	obj = session.getAttribute("samplesize");
	int samplesize = (int)obj;
	obj = session.getAttribute("a");
	int a[] = (int[])obj;
	obj = session.getAttribute("b");
	int b[] = (int[])obj;
	obj = session.getAttribute("resultList");
	int resultList[][] = (int[][])obj;
	obj = session.getAttribute("resultIndex");
	int resultIndex[] = (int[])obj;

%>

<form action="omrPro.jsp">
<div align="center">
<table border="1">
<%for(int i = 0; i < testsize; i++){ %>
	<tr>
	 <td colspan="samplesize" width="300px"><%=i+1%>¹ø ¹®Á¦: <%=a[i]%>*<%=b[i]%> = ?</td>
	 <tr>
	 <%for(int j = 0; j < samplesize; j++){ %>
	 	<%if(j  == 0){ %>
	 		<td><input type="text" name=<%=i%> value="<%=j%>"checked><%=resultList[i][j]%></td>
	 	<%}else {%>
	 		<td><input type="text" name=<%=i%> value="<%=j%>"><%=resultList[i][j]%></td>
	 	<%} %>
	 <%} %>
	 </tr>
	</tr>


<%} %>

<tr>
</tr>

<tr>
</tr>

<tr>
</tr>

<tr>
</tr>

</table>
</div>
</form>