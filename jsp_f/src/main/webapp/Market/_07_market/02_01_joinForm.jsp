<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%
	String path = application.getContextPath();

%>    
    

<div align="center">
	<h1>회원가입</h1>
	<hr width="700" color="black" size="3"/>
	<br>
	<form method="post" action="02_01_joinPro.jsp" accept-charset="utf-8">
		<table>
			<tr height="50">
				<td width="150"><b>아이디</b></td>
				<td width="300" align="center"><input type="text" name="id" placeholder="id입력" style="width:300px; height:30px"></td>
			</tr>
			
			<tr height="50">
				<td width="150"><b>비밀번호</b></td>
				<td width="300" align="center"><input type="password" name="pw" placeholder="pw입력" style="width:300px; height:30px"></td>
			</tr>
			
			<tr height="50">
				<td width="150"><b>이름</b></td>
				<td width="300" align="center"><input type="text" name="name" placeholder="이름 입력" style="width:300px; height:40px"></td>
			</tr>
			
	
			

		</table>
	
		<table>
			<tr height="50">
				<td colspan="2" align="center"><br>
					<input type="image" src="<%=path %>/_07_market/img/gotoJoinPro.PNG" name="submit" value="submit" style="height:50px;">
				</td>
			</tr>
		</table>
	</form>
	</div>