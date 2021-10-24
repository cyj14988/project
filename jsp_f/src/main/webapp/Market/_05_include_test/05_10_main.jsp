<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>

	<%
		String center = request.getParameter("center");
		if(center == null || center.equals(""))
		{
			center = "05_12_center1.jsp";	
		}
	%>
	<h2>홈페이지</h2>
	<table border="1">
		<tr>
			<td colspan="2">
				<jsp:include page="05_11_top.jsp" />
			</td>
		</tr>
		<tr>
			<td>
				<jsp:include page="05_11_left.jsp" />
			</td>
			<td>
				<jsp:include page="<%= center %>" />
			</td>
		</tr>
		<tr>
			<td colspan="2">
				<jsp:include page="05_11_bottom.jsp" />
			</td>
		</tr>
	</table>
