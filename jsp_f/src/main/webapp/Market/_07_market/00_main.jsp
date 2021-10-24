<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>

<style>
	a{
		color : black;
	}
	a:hover{
		color : purple;
	}
</style>

<%
	request.setCharacterEncoding("EUC-KR");
	
	String center = request.getParameter("center");
	if(center == null){
		center = "01_center.jsp";
	}
%>

<div align="center">
	<jsp:include page="01_top.jsp"/>
	<jsp:include page="<%=center %>"/>
	<jsp:include page="01_bottom.jsp"/>
</div>
