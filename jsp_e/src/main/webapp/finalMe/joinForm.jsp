<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<jsp:include page="shopMain.jsp" ></jsp:include>

<%
	int memberCount = (Integer)session.getAttribute("memberCount");
	int number = memberCount + 10001;

%>

<div align="center">
	<h2>Ȩ���� ȸ�� ���</h2>
	<form action="joinPro.jsp" method="post">
		<table border="1">
			<tr >
				<td width="300px" align="center">ȸ����ȣ(�ڵ��߻�)</td>
				<td width="400px"><input type="text" value="<%=number%>" disabled></td>
			</tr>
			<tr>
				<td align="center">ȸ������</td>
				<td><input type="text" name="name"></td>
			</tr>
			<tr>
				<td align="center">ȸ����ȭ</td>
				<td><input type="text" name="num"></td>
			</tr>
			<tr>
				<td align="center">��Ż�(KS KT LG)</td>
				<td >
					 <input type="radio" name="address" value="SK" checked>SK&nbsp;
			         <input type="radio" name="address" value="KT">KT&nbsp;
			         <input type="radio" name="address" value="LG">LG			
				</td>
			</tr>
			<tr>
				<td align="center">��������</td>
				<td><input type="text" name="date"></td>
			</tr>
			<tr>
				<td align="center">�����(A:VIP,B:�Ϲ�,C:����)</td>
				<td><input type="text" name="grade"></td>
			</tr>
			<tr>
				<td align="center">�����ڵ�</td>
				<td><input type="text" name="city"></td>
			</tr>
			<tr>
				<td align="center" colspan="2">
					<input type="hidden" name="number" value="<%=number%>">
					<input type="submit" value="���">
					<input type="button" value="��ȸ" onclick="window.location.href='memberListView.jsp'">
				</td>
			</tr>		
		</table>
	</form>
</div>
