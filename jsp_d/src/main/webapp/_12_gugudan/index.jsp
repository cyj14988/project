<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>

<%--
	���α׷� ���� ���� �������� �̸� index ���� session�� �����س��´�.
 --%>

 <% 
 
 int totalcount = 0;
 int totalscore = 0;
 
 session.setAttribute("totalcount", totalcount);
 session.setAttribute("totalscore", totalscore);
 
 
 %>
 <hr>
 <h2>�����ܰ���</h2>
 <hr>
 <button onclick="window.location.href='gugudan.jsp'">���ӽ���</button>