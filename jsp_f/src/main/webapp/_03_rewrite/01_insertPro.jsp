<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>

    
    <%
    	Object obj = null;  
	    obj = session.getAttribute("boardList");
		String[] boardList = (String[])obj;   	
		obj = session.getAttribute("subjectList");
		String[] subjectList = (String[])obj;   
		obj = session.getAttribute("boardCount");
		int boardCount = (int)obj;	
    	
		subjectList[boardCount] = "[제목]" + boardCount;
		boardList[boardCount] = "[본문]" + boardCount;
    	boardCount += 1;
    	
    	session.setAttribute("subjectList", subjectList);
    	session.setAttribute("boardList", boardList);
    	session.setAttribute("boardCount", boardCount);
    	response.sendRedirect("00_list.jsp");
    %>
    
   