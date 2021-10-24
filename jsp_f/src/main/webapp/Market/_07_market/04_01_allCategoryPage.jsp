<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>

	<%
		request.setCharacterEncoding("EUC-KR");
	
		int itemNumberList[] = (int[])session.getAttribute("itemNumberList");
		String itemCategoryList[] = (String[])session.getAttribute("itemCategoryList");
		String itemNameList[] =  (String[])session.getAttribute("itemNameList");
		int itemPriceList[] = (int[])session.getAttribute("itemPriceList");
		int itemStockList[] = (int[])session.getAttribute("itemStockList");
		String itemImageList[] =  (String[])session.getAttribute("itemImageList");
		String  itemInfoList[] =  (String[])session.getAttribute("itemInfoList");
		int itemDiscountList[] =  (int[])session.getAttribute("itemDiscountList");
		int itemSoldList[] =  (int[])session.getAttribute("itemSoldList");
		int itemSize = (Integer)session.getAttribute("itemSize");
			
		
		String path = application.getContextPath();
	%>
	
	<div>
		
	</div>

	<hr size = "1" color="purple" width="300"><br>
	
	<h1>전체 상품</h1>
	<table>
		<%
			for(int i = 0; i < itemSize; i++){
				int number = itemNumberList[i];
				String image = itemImageList[i];
				String name = itemNameList[i];
				int stock = itemStockList[i] ;
				int price = itemPriceList[i];
				int discount = itemDiscountList[i];
				String info = itemInfoList[i];
		
				if(i % 3 == 0){%>
				<tr height="250"> 
				<%}%>
				
					<td width="400" align="center">
					
						<%if (stock > 0){%>				
							<a href="00_main.jsp?center=05_01_oneItemPage.jsp&
							item_number=<%=number%>&item_image=<%=image%>">								
							<img alt="" src="<%=path %>/_07_market/img/<%=image%>" width="250" ></a>
						
						<%}else{%>
						<img alt="" src="<%=path %>/_07_market/img/<%=image%>" width="250" style="opacity : 40%">
						<% }%>
												
						<p><font size = "5"><b><%=name %></b></font><p>						
					<%if(stock > 0){
					
						int realPrice = price- price * discount / 100;
						
						if(price == realPrice){%>
							<p><font size="4"><%=price %>원</font></p>
						<%}else if(price > realPrice){%>
							<p><font size="3" style="text-decoration:line-through;"><%=price%>원</font> →
								<font size="4" color="purple"><b><%=realPrice %>원</b></font></p>
						<%}%>
					<p><font size="2"><%=info%></font></p>
					<%}else{%>
						<p><font size = "3" color="red"><b>품절</b></font></p>
					<%}%>
					</td>
			<%if(i % 3 == 2){%>
				</tr>
			<%}%>
		
		<%} %>
		
	</table>
	