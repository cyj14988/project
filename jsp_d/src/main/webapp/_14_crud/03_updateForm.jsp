<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>


<%
	Object obj = null;
	obj = session.getAttribute("arr");
	int arr[] = (int[])obj;
		
	String str = request.getParameter("index");
	int index= Integer.parseInt(str);
	
%>

<h1>����</h1> 
    
<form action="04_updatePro.jsp">
	<%=arr[index] %>�� ���� �����մϴ�.<p>
    �����Ұ� �Է� : <input type="number" name="updateNumber">
    <input type="hidden" name="index" value=<%=index %>>
    <input type="submit">
</form>