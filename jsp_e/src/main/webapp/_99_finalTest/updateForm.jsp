<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<%request.setCharacterEncoding("EUC-KR"); %>
<%
	String memberList[][] = (String[][])session.getAttribute("memberList");
	int index = Integer.parseInt(request.getParameter("index"));
%>


<div align="center">
	<h2>Ȩ���� ȸ�� ���� ����</h2>
	<form action = "updatePro.jsp">
		<table border="1">
			<tr >
				<td width="300px" align="center">ȸ����ȣ(�ڵ��߻�)</td>
				<td width="400px">
				<input type="text" value="<%=memberList[index][0]%>" disabled>
				</td>
			</tr>
			<tr>
				<td align="center">ȸ������</td>
				<td><input type="text" name="name" value="<%=memberList[index][1]%>"></td>
			</tr>
			<tr>
				<td align="center">ȸ����ȭ</td>
				<td><input type="text" name="Num" value="<%=memberList[index][2]%>"></td>
			</tr>
			<tr>
				<td align="center">��Ż�(KS KT LG)</td>
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
				<td align="center">��������</td>
				<td><input type="text" name="date" value="<%=memberList[index][4]%>"></td>
			</tr>
			<tr>
				<td align="center">�����(A:VIP,B:�Ϲ�,C:����)</td>
				<td><input type="text" name="grade" value="<%=memberList[index][5]%>"></td>
			</tr>
			<tr>
				<td align="center">�����ڵ�</td>
				<td><input type="text" name="city" value="<%=memberList[index][6]%>"></td>
			</tr>
			<tr>
				<td align="center" colspan="2">
					<input type="hidden" name="index" value=<%=index%>>
					<input type="submit" value="����">
					<input type="button" value="��ȸ" onclick="window.location.href='memberListView.jsp'">
				</td>
			</tr>		
		</table>
	</form>
</div>
