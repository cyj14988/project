<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>

    
    <%
		Object obj = null;  
	    obj = session.getAttribute("reParentList");
		int[] reParentList = (int[])obj;
		obj = session.getAttribute("reSubjectList");
		String[] reSubjectList = (String[])obj;
		obj = session.getAttribute("reWriteList");
		String[] reWriteList = (String[])obj;
		obj = session.getAttribute("reWriteCount");
		int reWriteCount = (int)obj;  	
			
		String str = request.getParameter("index");
		int index = Integer.parseInt(str);	
		
		reParentList[reWriteCount] = index;
		reSubjectList[reWriteCount] ="[" + index + "ÀÇ ´ñ±ÛÁ¦¸ñ]" + reWriteCount;
		reWriteList[reWriteCount] ="[" + index + "ÀÇ ´ñ±Û³»¿ë]" + reWriteCount;
		reWriteCount += 1;
		session.setAttribute("reParentList", reParentList);
    	session.setAttribute("reSubjectList", reSubjectList);
    	session.setAttribute("reWriteList", reWriteList);
    	session.setAttribute("reWriteCount", reWriteCount);
    	response.sendRedirect("00_list.jsp");
    %>
    
   