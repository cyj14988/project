<%@page import="java.util.Random"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>


<%

	Random ran = new Random();
	int size = 7;
	int c1 = 4;
	int c7 = 3;
	int arr[] = new int[size];
	for(int i = 0; i < arr.length; ){	
		int num = ran.nextInt(2);
		if(num == 0 && c1 > 0){
			arr[i] = 1;
			c1--;
			i++;
		}else if(num == 1 && c7 > 0){
			arr[i] = 7;
			c7--;
			i++;
		}
	}
	for(int i = 0; i < arr.length; i++){
		System.out.print(arr[i] + " ");
	}
	
	session.setAttribute("size", size);
	session.setAttribute("arr", arr);
	int state = 0;
	session.setAttribute("state", state);
	boolean check[] = new boolean[size];
	session.setAttribute("check", check);
	int count = 0;
	session.setAttribute("count", count);
	
	response.sendRedirect("lottoGame.jsp");
	
%>
