<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>

    
 <%
 	
 	Object obj = null;
 
 	String str = request.getParameter("sel");
 	int sel = Integer.parseInt(str);
 	str = request.getParameter("num");
 	int num = Integer.parseInt(str);
 	
 	obj = session.getAttribute("totalcount");
	int totalcount = (int)obj;
	
	obj = session.getAttribute("totalscore");
	int totalscore = (int)obj;
 
 %>
 
<%if(sel == 0){%>
	<%if(num % 2 == 0){ %>
		<%=num%>, ����!
	<%}else{ %>
		<%=num%>, ����! 
		<%totalscore+=10; %>
		<%
		session.setAttribute("totalscore", totalscore);
		%>
	<%} %>
	<a href="coinGame.jsp">�ڷΰ���</a>
<%}else if(sel == 1){%>
	<%if(num % 2 == 0){ %>
		<%=num%>, ����! 
		<%totalscore+=10; %>
		session.setAttribute("totalscore", totalscore);
	<%}else{ %>
		<%=num%>, ����!
	<%} %>
	<a href="coinGame.jsp">�ڷΰ���</a>
<%}%>
<%if(totalcount == 5){%>
	 ���� ��!
	 <%
	  	 session.removeAttribute("totalscore");
		 session.removeAttribute("totalcount");
		 session.removeAttribute("cheat");
	 %>
	 <a href="index.jsp">ó������</a>
	  
<%}%>