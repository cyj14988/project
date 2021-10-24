<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!-- 값이 없으면 다시 돌려보내고 싶은데 -->
	<h2>회원정보 수정</h2>
	<form method="post" action="04_updatePro.jsp">
		아이디 : <input type="text" name="id"> <br>
		패스워드 : <input type="password" name="pw"> <br>
		변경할 이름 : <input type="text" name="name"> <br>
		
		<input type="submit" value="입력완료">
	</form>
