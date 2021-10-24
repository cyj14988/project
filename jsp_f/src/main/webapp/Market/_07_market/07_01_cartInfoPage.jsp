<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%
	request.setCharacterEncoding("EUC-KR");
	
	int cartNumberList[] = (int[])session.getAttribute("cartNumberList");
	String cartBuyerList[] = (String[])session.getAttribute("cartBuyerList");
	String cartItemNameList[] = (String[])session.getAttribute("cartItemNameList");
	int cartBuyPriceList[] = (int[])session.getAttribute("cartBuyPriceList");
	int cartBuyCountList[] = (int[])session.getAttribute("cartBuyCountList");
	String cartItemImageList[] = (String[])session.getAttribute("cartItemImageList");
	int cartSize = (Integer)session.getAttribute("cartSize");
	
	
	int mycartNumberList[] = new int[1000];
	String mycartBuyerList[] = new String[1000];
	String mycartItemNameList[] = new String[1000];
	int mycartBuyPriceList[] = new int[1000];
	int mycartBuyCountList[] = new int[1000];
	String mycartItemImageList[] = new String[1000];
	int mycartSize = 0;
	
	
	String id=(String)session.getAttribute("id");
	
	for(int i =0; i < cartSize; i++){
		if(id.equals(cartBuyerList[i])){
			mycartNumberList[mycartSize] = cartNumberList[i];
			mycartBuyerList[mycartSize] = cartBuyerList[i];
			mycartItemNameList[mycartSize] = cartItemNameList[i];
			mycartBuyPriceList[mycartSize] = cartBuyPriceList[i];
			mycartBuyCountList[mycartSize] = cartBuyCountList[i];
			mycartItemImageList[mycartSize] = cartItemImageList[i];		
			mycartSize += 1;
		}
	}
			
	int num = 0;
	int cnt = mycartSize;
	int total = 0;
	int deliveryFee = 3000;
	
	String path = application.getContextPath();
	
%>	
	
	<h2>장바구니</h2>
	<hr size="2" color="purple" width="300">
	
	<%
		if(cnt == 0){
	%>
			<h3>장바구니에 담겨있는 상품이 없습니다.</h3>
	<%
		}else{
			
			for(int i = 0; i < mycartSize; i++){
				
	%>
				<table>
					<tr height="40">
						<td width="50" align="center">
							<font size="2"><%=++num %></font>
						</td>
						
						<td width="100" align="center">
							<img alt="" src="<%=path %>/_07_market/img/<%=mycartItemImageList[i] %>" height="40">
						</td>
						
						<td width="300">
							<font size="3"><b><%=mycartItemNameList[i] %></b></font>
						</td>
						
						<td width="100" align="center">
							<font size = "3"><b><%=mycartBuyCountList[i] %></b></font>
						</td>
						
						<td width="100">
							<font size="3"><b><%=mycartBuyPriceList[i] * 
									mycartBuyCountList[i] %>원</b></font>
						</td>
						
						<td width="40" align="center">
							<input type="image" src="<%=path %>/_07_market/img/delete.png" onclick="location.href='07_02_deleteCartPro.jsp?cart_number=<%=mycartNumberList[i]%>'">
						</td>
					</tr>
				</table>
	
				<hr size="1" color="gray" width="680">
	<%			
				total += mycartBuyPriceList[i] * mycartBuyCountList[i];
			}
	%>
			
			<!-- ------------------------------------------------------- -->
			
			<form method="post">
				<table>
					<tr height="30">
						<td align="right" width="480" align="right">
							<h4>총 상품금액</h4>
						</td>
						
						<td align="right" width="200" align="right">
							<h4><%=total %>원</h4>
						</td>
					</tr>
					
					<tr height="30">
						<td align="right" width="480" align="right">
							<h4>배송비</h4>
						</td>
						
						<td align="right" width="200" align="right">
	<%
							if(total < 40000){
	%>
								<h4><%=deliveryFee %>원</h4>
								<font size="2" color="purple">
									<%=40000 - total %>원 추가주문 시, 무료배송
								</font>
	<%
							}else{
	%>
								<h4>0원</h4>
	<%
							}
	%>
						</td>
					</tr>
					
					<tr height="40">
						<td align="right" width="480" align="right">
							<h3>총 결제금액</h3>
						</td>
						
						<td align="right" width="200" align="right">
	<%
							if(total < 40000){
	%>
								<h3><b><%=total + deliveryFee %>원</b></h3>
	<%							
							}else{
	%>
								<h3><b><%=total %>원</b></h3>
	<%								
							}
	%>
						</td>
					</tr>
					
					<tr height="30">
						<td align="right" colspan="2">
							<input type="image" src="<%=path %>/_07_market/img/order.PNG" name="submit" value="submit" style="height:50px">
							<input type="hidden" name="total" value=<%=total %>>
						</td>
					</tr>
				</table>
			</form>
	<%		
		}
	%>
