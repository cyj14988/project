<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
 	 
 	 <%
 		int[] arr = {10,20,30,40};	 	
 	 	String[] data = {"��ö��" , "�̸���" , "�ֿ���" , "���ع�"};
 	 	
 	 	session.setAttribute("arr", arr);
 	 	session.setAttribute("data", data);
 	 	session.setMaxInactiveInterval(10); // 10 �ʰ� ���� �� �����ȴ�.
 	 	
 	
 	 	response.sendRedirect("_06_41_setTimePro.jsp");
 	 %>
	