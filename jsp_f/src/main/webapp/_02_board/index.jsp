<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    
<%

	int [] numberList = new int[1000];   	// ��ȣ
	String[] writerList = new String[1000]; // �۾���
	String[] titleList = new String[1000];  // ����
	String[] contentList = new String[1000];// ����
	int size = 0;
	int lastNumber = 0; // ��������ȣ (�۰����ͻ������ ��������ȣ�� �����ȴ�.)
	session.setAttribute("numberList", numberList);
	session.setAttribute("writerList", writerList);
	session.setAttribute("titleList", titleList);
	session.setAttribute("contentList", contentList);
	session.setAttribute("size", size);
	session.setAttribute("lastNumber" , lastNumber); 
	response.sendRedirect("00_main.jsp");

%>