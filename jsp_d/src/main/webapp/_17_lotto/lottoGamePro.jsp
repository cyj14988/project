<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>

<%
	Object obj = null;

	obj = session.getAttribute("size");
	int size = (int)obj;
	obj = session.getAttribute("state");
	int state = (int)obj;
	obj = session.getAttribute("count");
	int count = (int)obj;
	obj = session.getAttribute("arr");
	int arr[] = (int[])obj;
	obj = session.getAttribute("check");
	boolean check[] = (boolean[])obj;
	
	String str = request.getParameter("index");
	int index = Integer.parseInt(str);
	
	check[index] = true;
	count++;
	
	if(count == 3){
		int winCount = 0;
		for(int i = 0; i < check.length; i++){
			if(check[i] == true && arr[i] == 7){
				winCount++;
			}
		}
		if(winCount == 3){
			state = 1;	
		}else{
			state = 2;
		}
	}
	session.setAttribute("count", count);
	session.setAttribute("check", check);
	session.setAttribute("state", state);
	
	response.sendRedirect("lottoGame.jsp");
	
%>