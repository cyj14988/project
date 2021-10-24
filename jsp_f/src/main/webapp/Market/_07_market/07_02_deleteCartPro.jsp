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
	
	
	
		int cart_number = Integer.parseInt(request.getParameter("cart_number"));
		String buyer = (String)session.getAttribute("id");
	
	%>

<%
		
		if(buyer==null){
			response.sendRedirect("00_main.jsp");

		}else{
			
			int index = 0;
			for(int i = 0; i < cartSize; i++){
				if(cart_number == cartNumberList[i]){
					index = i;
					break;
				}
			}
			
			for(int i = index; i < cartSize -1; i++){
				cartNumberList[i] = cartNumberList[i + 1]; 
				cartBuyerList[i] = cartBuyerList[i + 1];
				cartItemNameList[i] =cartItemNameList[i + 1];
				cartBuyPriceList[i] = cartBuyPriceList[i + 1];
				cartBuyCountList[i] = cartBuyCountList[i + 1];
				cartItemImageList[i] = cartItemImageList[i + 1];				
			}			
			cartSize -= 1;
			 
			session.setAttribute("cartNumberList", cartNumberList);
			session.setAttribute("cartBuyerList", cartBuyerList);
			session.setAttribute("cartItemNameList", cartItemNameList);
			session.setAttribute("cartBuyPriceList", cartBuyPriceList);
			session.setAttribute("cartBuyCountList", cartBuyCountList);
			session.setAttribute("cartItemImageList", cartItemImageList);
			session.setAttribute("cartSize", cartSize);
			 
			
			response.sendRedirect("00_main.jsp?center=07_01_cartInfoPage.jsp");
		}
	%>

