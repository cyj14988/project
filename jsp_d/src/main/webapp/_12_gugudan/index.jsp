<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>

<%--
	프로그램 내내 사용될 변수들은 미리 index 에서 session에 저장해놓는다.
 --%>

 <% 
 
 int totalcount = 0;
 int totalscore = 0;
 
 session.setAttribute("totalcount", totalcount);
 session.setAttribute("totalscore", totalscore);
 
 
 %>
 <hr>
 <h2>구구단게임</h2>
 <hr>
 <button onclick="window.location.href='gugudan.jsp'">게임시작</button>