<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    
<%
	// String �� ���Ҷ��� == �� ����ϸ�ȵǰ�, equals �� ����ؾ��Ѵ�. 

	String name = request.getParameter("name");	
	
	System.out.println("-------------------------------");

	if(name == "aaa"){
		System.out.println("����1.");
	}else{
		System.out.println("�ٸ���1.");
	}
	
	
	if(name.equals("aaa") == true){
		System.out.println("����2.");
	}else{
		System.out.println("�ٸ���2.");
	}
	
	if(name.equals("aaa") == false){
		System.out.println("�ٸ���3.");
	}else{
		System.out.println("����3.");
	}
	
	
	System.out.println("-------------------------------");
%>