<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<jsp:include page="shopMain.jsp" ></jsp:include>

<%
	int memberCount = (Integer)session.getAttribute("memberCount");
	int number = memberCount + 10001;

%>

<div align="center">
	<h2>홈쇼핑 회원 등록</h2>
	<form action="joinPro.jsp" method="post">
		<table border="1">
			<tr >
				<td width="300px" align="center">회원번호(자동발생)</td>
				<td width="400px"><input type="text" value="<%=number%>" disabled></td>
			</tr>
			<tr>
				<td align="center">회원성명</td>
				<td><input type="text" name="name"></td>
			</tr>
			<tr>
				<td align="center">회원전화</td>
				<td><input type="text" name="num"></td>
			</tr>
			<tr>
				<td align="center">통신사(KS KT LG)</td>
				<td >
					 <input type="radio" name="address" value="SK" checked>SK&nbsp;
			         <input type="radio" name="address" value="KT">KT&nbsp;
			         <input type="radio" name="address" value="LG">LG			
				</td>
			</tr>
			<tr>
				<td align="center">가입일자</td>
				<td><input type="text" name="date"></td>
			</tr>
			<tr>
				<td align="center">고객등급(A:VIP,B:일반,C:직원)</td>
				<td><input type="text" name="grade"></td>
			</tr>
			<tr>
				<td align="center">도시코드</td>
				<td><input type="text" name="city"></td>
			</tr>
			<tr>
				<td align="center" colspan="2">
					<input type="hidden" name="number" value="<%=number%>">
					<input type="submit" value="등록">
					<input type="button" value="조회" onclick="window.location.href='memberListView.jsp'">
				</td>
			</tr>		
		</table>
	</form>
</div>
