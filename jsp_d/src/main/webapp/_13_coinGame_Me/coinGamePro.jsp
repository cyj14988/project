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
		<%=num%>, 오답!
	<%}else{ %>
		<%=num%>, 정답! 
		<%totalscore+=10; %>
		<%
		session.setAttribute("totalscore", totalscore);
		%>
	<%} %>
	<a href="coinGame.jsp">뒤로가기</a>
<%}else if(sel == 1){%>
	<%if(num % 2 == 0){ %>
		<%=num%>, 정답! 
		<%totalscore+=10; %>
		session.setAttribute("totalscore", totalscore);
	<%}else{ %>
		<%=num%>, 오답!
	<%} %>
	<a href="coinGame.jsp">뒤로가기</a>
<%}%>
<%if(totalcount == 5){%>
	 게임 끝!
	 <%
	  	 session.removeAttribute("totalscore");
		 session.removeAttribute("totalcount");
		 session.removeAttribute("cheat");
	 %>
	 <a href="index.jsp">처음으로</a>
	  
<%}%>