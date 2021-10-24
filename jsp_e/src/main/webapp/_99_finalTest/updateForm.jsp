<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<%request.setCharacterEncoding("EUC-KR"); %>
<%
	String memberList[][] = (String[][])session.getAttribute("memberList");
	int index = Integer.parseInt(request.getParameter("index"));
%>


<div align="center">
	<h2>홈쇼핑 회원 정보 수정</h2>
	<form action = "updatePro.jsp">
		<table border="1">
			<tr >
				<td width="300px" align="center">회원번호(자동발생)</td>
				<td width="400px">
				<input type="text" value="<%=memberList[index][0]%>" disabled>
				</td>
			</tr>
			<tr>
				<td align="center">회원성명</td>
				<td><input type="text" name="name" value="<%=memberList[index][1]%>"></td>
			</tr>
			<tr>
				<td align="center">회원전화</td>
				<td><input type="text" name="Num" value="<%=memberList[index][2]%>"></td>
			</tr>
			<tr>
				<td align="center">통신사(KS KT LG)</td>
				<td >
					<%if(memberList[index][3].equals("SK")){ %>
						 <input type="radio" name="address" value="SK" checked>SK&nbsp;
			         	 <input type="radio" name="address" value="KT">KT&nbsp;
			       	 	 <input type="radio" name="address" value="LG">LG		
					
					<%}else if(memberList[index][4].equals("KT")){ %>
						 <input type="radio" name="address" value="SK" >SK&nbsp;
			         	 <input type="radio" name="address" value="KT" checked>KT&nbsp;
			       	 	 <input type="radio" name="address" value="LG">LG
					<%}else{ %>
						 <input type="radio" name="address" value="SK" >SK&nbsp;
			         	 <input type="radio" name="address" value="KT">KT&nbsp;
			       	 	 <input type="radio" name="address" value="LG" checked>LG
					<%} %>
				</td>
			</tr>
			<tr>
				<td align="center">가입일자</td>
				<td><input type="text" name="date" value="<%=memberList[index][4]%>"></td>
			</tr>
			<tr>
				<td align="center">고객등급(A:VIP,B:일반,C:직원)</td>
				<td><input type="text" name="grade" value="<%=memberList[index][5]%>"></td>
			</tr>
			<tr>
				<td align="center">도시코드</td>
				<td><input type="text" name="city" value="<%=memberList[index][6]%>"></td>
			</tr>
			<tr>
				<td align="center" colspan="2">
					<input type="hidden" name="index" value=<%=index%>>
					<input type="submit" value="수정">
					<input type="button" value="조회" onclick="window.location.href='memberListView.jsp'">
				</td>
			</tr>		
		</table>
	</form>
</div>
