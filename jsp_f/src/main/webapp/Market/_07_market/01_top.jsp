<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    
	<%
		
		request.setCharacterEncoding("EUC-KR");				
		String[] idList = (String[])session.getAttribute("idList");		
		String pwList[] =  (String[])session.getAttribute("pwList");		
		String nameList[] =  (String[])session.getAttribute("nameList");		
		int memberSize= (Integer)session.getAttribute("memberSize");
					
		String id = (String)session.getAttribute("id");
		String name = "";
		if(id != null){			
			for(int i = 0; i < memberSize; i++){
				if(id.equals(idList[i])){
					name = nameList[i];
					break;
				}
			}	
		}	
		
		String path = application.getContextPath();
	%>
	<div align="right">
		<font size="2">
			<%
				if(id==null ){
			%>
					<a href="00_main.jsp?center=02_01_joinForm.jsp" style="text-decoration:none">ȸ������</a>&nbsp;
					<img alt="" src="<%=path %>/img/top1.jpg">&nbsp;
					<a href="00_main.jsp?center=03_01_loginForm.jsp" style="text-decoration:none">�α���</a>&nbsp;
			<%
				}else{
					
					System.out.println("�α��� ���̵� Ȯ�ο� = " + name);
			%>
					<%=name %>�� &nbsp; <img alt="" src="<%=path %>/img/top1.jpg"> &nbsp;
					<a style="text-decoration:none">�ֹ�Ȯ��</a>&nbsp;
					<img alt="" src="<%=path %>/_07_market/img/top1.jpg"> &nbsp;
					<a href="03_02_logoutPro.jsp" style="text-decoration:none">�α׾ƿ�</a>&nbsp;
			<%		
				}
			%>
					<img alt="" src="<%=path %>/_07_market/img/top1.jpg"> &nbsp;
					<a style="text-decoration:none">������</a>&nbsp;
		</font>
	</div>
	<div align="center">
		<a href="00_main.jsp">
			<img src="<%=path %>/_07_market/img/logo.png" alt="" height="80">
		</a>
	</div>
	<br>
	<div align="center">
		<table style="font-size: 1vw">
			<tr height="50">
				<td width="180" align="center" id="dropdown">
					<font size="3" color="black">
						<a href="00_main.jsp?center=04_01_allCategoryPage.jsp" style="text-decoration:none"><b>��ü��ǰ ����</b></a>
					</font>
				</td>
				<td width="10" align="center">
					<img alt="" src="<%=path %>/_07_market/img/top1.jpg">
				</td>
				<td width="180" align="center">
					<font size="3" color="black">
						<a  style="text-decoration:none"><b>�Ż�ǰ</b></a>
					</font>
				</td>
				<td width="10" align="center">
					<img alt="" src="<%=path %>/_07_market/img/top1.jpg">
				</td>
				<td width="180" align="center">
					<font size="3" color="black">
						<a style="text-decoration:none"><b>����Ʈ</b></a>
					</font>
				</td>
				<td width="10" align="center">
					<img alt="" src="<%=path %>/_07_market/img/top1.jpg">
				</td>
				<td width="180" align="center">
					<font size="3" color="black">
						<a  style="text-decoration:none"><b>�˶����</b></a>
					</font>
				</td>
				<td width="10" align="center">
					<img alt="" src="<%=path %>/_07_market/img/top1.jpg">
				</td>
				<td width="180" align="center">
					<font size="3" color="black">
						<a style="text-decoration:none"><b>�̺�Ʈ</b></a>
					</font>
				</td>
				<td width="40" align="center">
					<a href="00_main.jsp?center=07_01_cartInfoPage.jsp"><img alt="" src="<%=path %>/_07_market/img/cart.png" width="30"></a>
				</td>
				
			</tr>
		</table>
	</div>
    