<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    
<%
	// String 을 비교할때는 == 을 사용하면안되고, equals 를 사용해야한다. 

	String name = request.getParameter("name");	
	
	System.out.println("-------------------------------");

	if(name == "aaa"){
		System.out.println("같다1.");
	}else{
		System.out.println("다르다1.");
	}
	
	
	if(name.equals("aaa") == true){
		System.out.println("같다2.");
	}else{
		System.out.println("다르다2.");
	}
	
	if(name.equals("aaa") == false){
		System.out.println("다르다3.");
	}else{
		System.out.println("같다3.");
	}
	
	
	System.out.println("-------------------------------");
%>