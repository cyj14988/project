<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>

<%
	if(session.getAttribute("log") == null){
%>
	<p><a href="05_list2.jsp">회원목록</a></p>
	<p><a href="02_insert2.jsp">회원가입</a></p>
	<p><a href="06_login2.jsp">로그인</a></p>
<%
	}else{
%>
	<p><a href="05_list2.jsp">회원목록</a></p>
	<p><a href="03_delete2.jsp">회원삭제</a></p>
	<p><a href="04_update2.jsp">회원수정</a></p>
	<p><a href="07_logout2.jsp">로그아웃</a></p>
<%
	}
%>