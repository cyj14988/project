<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    
<%
	int [] numberList = (int[])session.getAttribute("numberList");
	String[] writerList = (String[])session.getAttribute("writerList");
	String[] titleList =(String[])session.getAttribute("titleList");
	String[] contentList = (String[])session.getAttribute("contentList");
	int size = (Integer)session.getAttribute("size");
	
	
	int remove = Integer.parseInt(request.getParameter("remove"));
	
	int index = 0;
	for(int i = 0; i < size; i++){
		if(remove == numberList[i]){
			index = i;
			break;
		}
	}
	
	for(int i = index; i < size-1; i++){
		numberList[i] = numberList[i + 1];
		writerList[i] = writerList[i + 1];
		titleList[i] = titleList[i + 1];
		contentList[i] = contentList[i + 1];
	}
	size -= 1;
	
	session.setAttribute("numberList", numberList);
	session.setAttribute("writerList", writerList);
	session.setAttribute("titleList", titleList);
	session.setAttribute("contentList", contentList);
	session.setAttribute("size", size);
	
	response.sendRedirect("02_01_testBoardListPage.jsp");


%>