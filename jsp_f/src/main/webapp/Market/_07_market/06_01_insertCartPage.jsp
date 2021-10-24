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

	
	int cartNumberList[] = (int[])session.getAttribute("cartNumberList");
	String cartBuyerList[] = (String[])session.getAttribute("cartBuyerList");
	String cartItemNameList[] = (String[])session.getAttribute("cartItemNameList");
	int cartBuyPriceList[] = (int[])session.getAttribute("cartBuyPriceList");
	int cartBuyCountList[] = (int[])session.getAttribute("cartBuyCountList");
	String cartItemImageList[] = (String[])session.getAttribute("cartItemImageList");
	int cartSize = (Integer)session.getAttribute("cartSize");
%>

<% 
	String buyer = (String)session.getAttribute("id");
	int buy_count = Integer.parseInt(request.getParameter("buyCnt"));		
	application.log("item_number : " + request.getParameter("item_number"));
	
	int item_number = Integer.parseInt(request.getParameter("item_number"));
	int index = 0;
	for(int i =0; i < itemSize; i++){
		if(item_number == itemNumberList[i]){
			index = i;
			break;
		}
	}
		
	String item_name = itemNameList[index];
	String item_image = itemImageList[index];
	int item_stock = itemStockList[index];
	int buy_price = itemPriceList[index] - itemPriceList[index]  * itemDiscountList[index] / 100;

	if(buyer == null){
		response.sendRedirect("00_main.jsp?center=03_01_loginForm.jsp");

	}else{
		if(item_stock > 0){
			
			cartNumberList[cartSize] =  cartSize + 1;
			cartBuyerList[cartSize] = buyer;
			cartItemNameList[cartSize] = item_name;
			cartBuyPriceList[cartSize] = buy_price;
			cartBuyCountList[cartSize] = buy_count;
			cartItemImageList[cartSize] = item_image;
			cartSize += 1;
			
			session.setAttribute("cartNumberList", cartNumberList);
			session.setAttribute("cartBuyerList", cartBuyerList);
			session.setAttribute("cartItemNameList", cartItemNameList);
			session.setAttribute("cartBuyPriceList", cartBuyPriceList);
			session.setAttribute("cartBuyCountList", cartBuyCountList);
			session.setAttribute("cartItemImageList", cartItemImageList);
			session.setAttribute("cartSize", cartSize);
			response.sendRedirect("00_main.jsp?center=07_01_cartInfoPage.jsp");

		}else{	
			response.sendRedirect("00_main.jsp?center=04_01_allCategoryPage.jsp");			
		}
	}
	 %>

