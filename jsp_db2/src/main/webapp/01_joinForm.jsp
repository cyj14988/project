<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    
 <jsp:include page="00_main.jsp"></jsp:include> 

<div align="center">
	<form method="post" action="01_joinPro.jsp">
		<table border="1">
			<tr align="center">
				<td colspan="2">회원가입</td>
			</tr>
			
			<tr align="center">
				<td>아이디</td>
				<td><input type="text" name="id"></td>
			</tr>
			
			<tr align="center">
				<td>비밀번호</td>
				<td><input type="password" name="pw"></td>
			</tr>
			
			<tr align="center">
				<td>이름</td>
				<td><input type="text" name="name"></td>
			</tr>
			
			<tr>
				<td colspan="2"><input type="submit" value="회원가입"></td>
			</tr>
		</table>
	</form>	
</div>		 
