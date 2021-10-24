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
					<a href="00_main.jsp?center=02_01_joinForm.jsp" style="text-decoration:none">회원가입</a>&nbsp;
					<img alt="" src="<%=path %>/img/top1.jpg">&nbsp;
					<a href="00_main.jsp?center=03_01_loginForm.jsp" style="text-decoration:none">로그인</a>&nbsp;
			<%
				}else{
					
					System.out.println("로그인 아이디 확인용 = " + name);
			%>
					<%=name %>님 &nbsp; <img alt="" src="<%=path %>/img/top1.jpg"> &nbsp;
					<a style="text-decoration:none">주문확인</a>&nbsp;
					<img alt="" src="<%=path %>/_07_market/img/top1.jpg"> &nbsp;
					<a href="03_02_logoutPro.jsp" style="text-decoration:none">로그아웃</a>&nbsp;
			<%		
				}
			%>
					<img alt="" src="<%=path %>/_07_market/img/top1.jpg"> &nbsp;
					<a style="text-decoration:none">고객센터</a>&nbsp;
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
						<a href="00_main.jsp?center=04_01_allCategoryPage.jsp" style="text-decoration:none"><b>전체상품 보기</b></a>
					</font>
				</td>
				<td width="10" align="center">
					<img alt="" src="<%=path %>/_07_market/img/top1.jpg">
				</td>
				<td width="180" align="center">
					<font size="3" color="black">
						<a  style="text-decoration:none"><b>신상품</b></a>
					</font>
				</td>
				<td width="10" align="center">
					<img alt="" src="<%=path %>/_07_market/img/top1.jpg">
				</td>
				<td width="180" align="center">
					<font size="3" color="black">
						<a style="text-decoration:none"><b>베스트</b></a>
					</font>
				</td>
				<td width="10" align="center">
					<img alt="" src="<%=path %>/_07_market/img/top1.jpg">
				</td>
				<td width="180" align="center">
					<font size="3" color="black">
						<a  style="text-decoration:none"><b>알뜰쇼핑</b></a>
					</font>
				</td>
				<td width="10" align="center">
					<img alt="" src="<%=path %>/_07_market/img/top1.jpg">
				</td>
				<td width="180" align="center">
					<font size="3" color="black">
						<a style="text-decoration:none"><b>이벤트</b></a>
					</font>
				</td>
				<td width="40" align="center">
					<a href="00_main.jsp?center=07_01_cartInfoPage.jsp"><img alt="" src="<%=path %>/_07_market/img/cart.png" width="30"></a>
				</td>
				
			</tr>
		</table>
	</div>
    