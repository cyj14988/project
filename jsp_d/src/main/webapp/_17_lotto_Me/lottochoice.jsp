<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<%
	Object obj = null;
	obj = session.getAttribute("lotto");
	int lotto[] = (int[])obj;
	obj = session.getAttribute("win");
	int win = (int)obj;
	obj = session.getAttribute("choice");//선택지 번호 
	int choice[] = (int[])obj;
	obj = session.getAttribute("check");
	boolean check[] = (boolean[])obj;
	obj = session.getAttribute("choiceCheck");
	boolean choiceCheck[][] = (boolean[][])obj;

	String str = request.getParameter("index");
	int index = Integer.parseInt(str);
	str = request.getParameter("number");
	int number = Integer.parseInt(str);
	
	if(choiceCheck[index][number] == true){
		choiceCheck[index][number] = false;
		check[number] = false;
	}
	
	if(check[number] == false){
		check[number] = true;
		choiceCheck[index][number] = true;
		
		
		
	}
	
	
	
	





%>