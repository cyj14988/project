<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>


<%
	Object obj = null;
	obj = session.getAttribute("max");
	int max = (int)obj;
	obj = session.getAttribute("arr");
	int arr[] = (int[])obj;
	obj = session.getAttribute("count");
	int count = (int)obj;
	
	String str = request.getParameter("index");
	int index = Integer.parseInt(str);
	
%>
<form action="04_updatePro.jsp">
<h2><%=arr[index]%>�� �����մϴ�.</h2><br>
�Է�: <input type="text" name="Nnumber" value="0">
<input type="hidden" name="index" value=<%=index%>>
<input type="submit" value="����">
</form>

