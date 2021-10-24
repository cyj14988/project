<%@page import="javax.websocket.SendResult"%>
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

<%
	String id=(String)session.getAttribute("id");

	int index = 0;
	int item_number = Integer.parseInt(request.getParameter("item_number"));
	for(int i =0; i < itemSize; i++){
		if(item_number == itemNumberList[i]){
			index = i;
			break;
		}
	}
	
%>

	<form method = "post" action = "06_01_insertCartPage.jsp">
		<table>
			<tr height="80">
				<td rowspan = "6" width = "350" align = "center" >
					<img alt="" src="<%=path %>/_07_market/img/<%=itemImageList[index]%>" height = "350">
				</td>
				<td width = "400" colspan="2">
					<font size = "5"><b><%=itemNameList[index] %></b></font><br>
					<font size = "2"><%=itemInfoList[index] %></font>
				</td>
			</tr>
			
			<tr height="70">
				<td width = "400" colspan="2">
					<font size="3" style="text-decoration:line-through;"><b><%=itemPriceList[index] %>원</b></font> →
					<font size="4" color="purple"><b><%=itemPriceList[index] - itemPriceList[index] * itemDiscountList[index]/100 %>원</b></font><br>
					<font size="2" color = "purple">로그인 후 적립혜택이 적용됩니다.</font>
				</td>
			</tr>
			
			<tr height="50">
				<td width = "100">
					<font size="2"><b>판매단위</b></font>
				</td>
				<td width = "300">
					<font size="2">1개</font>
				</td>
			</tr>
			
			<tr height="50">
				<td width = "100">
					<font size="2"><b>배송방법</b></font>
				</td>
				<td width = "300">
					<font size="2">샛별배송/택배배송</font>
				</td>
			</tr>
			
			<tr height="50">
				<td width = "100">
					<font size="2"><b>포장타입</b></font>
				</td>
				<td width = "300">
					<font size="2">상온/종이포장</font><br>
					<font size="1">택배배송은 에코포장이 스티로폼으로 대체됩니다.</font>
				</td>
			</tr>
			
			<tr height="50">
				<td width = "100">
					<font size="2"><b>구매수량</b></font>
				</td>
				<td width = "300">
					<input type = "number" name="buyCnt" min="0" max="100" size = "100" value = "1">
				</td>
			</tr>
			
			<tr height="35">
				<td colspan="3" align="right">
					<input type="image" src = "<%=path %>/_07_market/img/sendcart.PNG" name="submit" value="submit" style="height:50px">
					<input type="hidden" name = "item_number" value="<%=itemNumberList[index] %>">
				</td>
			</tr>
		</table>
	</form>
