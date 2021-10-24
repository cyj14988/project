<%@page import="java.util.Random"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>

 <%
   	Random ran = new Random();
 
 	int dan = ran.nextInt(8)+2;
 	int times = ran.nextInt(9)+1;
 	
 	Object obj = null;
 	
 	obj = session.getAttribute("totalscore");
 	int totalscore = (int)obj;
 	
 	obj = session.getAttribute("totalcount");
 	int totalcount = (int)obj;
 	totalcount += 1;
 	session.setAttribute("totalcount", totalcount);
 
 %>
 <h2>구구단게임</h2><br>
 <%=totalcount%>번째 게임<br>
 현재 점수: <%=totalscore%>점<br>
 <form action = "gugudanPro.jsp">
 <%=dan%>X<%=times%>=? <br>
 <input type="text" value="0" name="me">
 <input type="submit" value="제출">
 <input type="hidden" value=<%=dan%> name="dan">
  <input type="hidden" value=<%=times%> name="times">
 </form>