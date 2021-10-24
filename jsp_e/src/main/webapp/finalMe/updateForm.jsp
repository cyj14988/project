<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<%	
	String[][] memberList = (String[][])session.getAttribute("memberList");
	int number = Integer.parseInt(request.getParameter("number"));
%>

<div align="center">
	<h2>홈쇼핑 회원 수정</h2>
	<form action="updatePro.jsp" method="post">
		<table border="1">
			<tr >
				<td width="300px" align="center">회원번호(자동발생)</td>
				<td width="400px"><input type="text" value="<%=memberList[number][0]%>" disabled></td>
			</tr>
			<tr>
				<td align="center">회원성명</td>
				<td><input type="text" name="name" value=<%=memberList[number][1]%>></td>
			</tr>
			<tr>
				<td align="center">회원전화</td>
				<td><input type="text" name="num" value=<%=memberList[number][2]%>></td>
			</tr>
			<tr>
				<td align="center">통신사(KS KT LG)</td>
				<td >
					<%if(memberList[number][3].equals("SK")){ %>
						 <input type="radio" name="address" value="SK" checked>SK&nbsp;
				         <input type="radio" name="address" value="KT">KT&nbsp;
				         <input type="radio" name="address" value="LG">LG	
					<%}else if(memberList[number][3].equals("KT")){ %>
						<input type="radio" name="address" value="SK">SK&nbsp;
				        <input type="radio" name="address" value="KT" checked>KT&nbsp;
				        <input type="radio" name="address" value="LG">LG	
					<%}else if(memberList[number][3].equals("LG")){ %>
						<input type="radio" name="address" value="SK">SK&nbsp;
				        <input type="radio" name="address" value="KT">KT&nbsp;
				        <input type="radio" name="address" value="LG" checked>LG	
					<%} %>
				</td>
			</tr>
			<tr>
				<td align="center">가입일자</td>
				<td><input type="text" name="date" value=<%=memberList[number][4]%>></td>
			</tr>
			<tr>
				<td align="center">고객등급(A:VIP,B:일반,C:직원)</td>
				<td><input type="text" name="grade" value=<%=memberList[number][5]%>></td>
			</tr>
			<tr>
				<td align="center">도시코드</td>
				<td><input type="text" name="city" value=<%=memberList[number][6]%>></td>
			</tr>
			<tr>
				<td align="center" colspan="2">
					<input type="hidden" name="index" value="<%=number%>">
					<input type="submit" value="수정">
					<input type="button" value="조회" onclick="window.location.href='memberListView.jsp'">
				</td>
			</tr>		
		</table>
	</form>
</div>
