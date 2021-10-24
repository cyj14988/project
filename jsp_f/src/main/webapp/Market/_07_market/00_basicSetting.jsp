
<%@page import="java.util.Random"%> <!-- 랜덤사용시 필요  -->
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%
	Random ran = new Random();

	//회원 배열
	String idList[] = new String[1000];
	String pwList[] = new String[1000];
	String nameList[] = new String[1000];
	int memberSize= 0;
	session.setAttribute("idList", idList);
	session.setAttribute("pwList", pwList);
	session.setAttribute("nameList", nameList);
	session.setAttribute("memberSize", memberSize);
	
	
	// 아이템 카테고리 샘플
	String[] itemCategorySample = {
			"채소", "채소" , "채소","채소", "채소" , "채소","채소", "채소" , "채소","채소",
			"해산물","해산물","해산물","해산물","해산물","해산물",
			"육류","육류","육류","육류","육류","육류","육류","육류","육류","육류",
			"전자제품","전자제품","전자제품","전자제품","전자제품","전자제품","전자제품","전자제품","전자제품"
	};
		
		
	// 아이템 이름 샘플
	String[] itemNameSample = {
			"대파", "상추" , "당근", "깻잎", "애호박" , "버섯", "단호박", "파프리카" , "아스파라거스","양파",
			"자반고등어","연어","오징어","바지락","새우","전복",
			"막창","안심스테이크","닭","닭다리" , "폭립","양념갈비","등갈비구이","치즈돈가스","닭가슴살","차돌박이",
			"그라인더","스팀다리미","헤어드라이기","체중계","전자체중계","미니선풍기","청소기","카메라","믹서기"
	};
	
	//아이템 배열
	// 시작아이템 저장개수 : 35
	int itemNumberList[] = new int[1000];
	String itemCategoryList[] = new String[1000];
	String itemNameList[] = new String[1000];
	int itemPriceList[] = new int[1000];
	int itemStockList[] = new int[1000];
	String itemImageList[] = new String[1000];
	String  itemInfoList[] = new String[1000];
	int itemDiscountList[] = new int[1000];
	int itemSoldList[] = new int[1000];		
	int itemSize= 35;

	// 시작아이템 등록 
	// 아이템번호 (1~35)
	for(int i = 0; i < itemSize; i++){
		itemNumberList[i] = i + 1;
		application.log(itemNumberList[i] + ""); // application.log 는 문자열만 출력가능하다.
	}

	
	// 아이템 카테고리 + 아이템 이름
	for(int i = 0; i < itemSize; i++){
		itemCategoryList[i] = itemCategorySample[i];
		itemNameList[i] = itemNameSample[i];
		application.log(itemNameList[i]);
	}
	
	
	// 아이템가격 (10000~30000);
	for(int i = 0; i < itemSize; i++){
		int r = ran.nextInt(20) + 10; // 10~30
		itemPriceList[i] = r * 1000;
	}
	
	// 아이템 재고 (0~9)
	for(int i = 0; i < itemSize; i++){
		int r = ran.nextInt(10);
		itemStockList[i] = r;
	}
	
	// 아이템 이미지 (1.jsp , 2.jsp , 3.jsp 등등 ... ) 
	for(int i = 0; i < itemSize; i++){
		String image = (i + 1) + ".jpg";
		itemImageList[i] = image;
		application.log(image);
	 }
	// 아이템 정보 (간단하게 ==>  대파입니다. , 상추입니다. 등등... ) 
	for(int i = 0; i < itemSize; i++){
		String info = itemNameSample[i] + "입니다.";
		itemInfoList[i] = info;
		application.log(info);
	 }
	
	// 아이템 할인 ==> (0,10,20,30)
	for(int i = 0; i < itemSize; i++){	
		int r = ran.nextInt(4);// 0,1,2,3
		itemDiscountList[i] = r * 10;
	}
	
	// 아이템 판매개수 ==> (0~20)
	for(int i = 0; i < itemSize; i++){	
		int r = ran.nextInt(20);
		itemSoldList[i] = r;
	}
	
	session.setAttribute("itemNumberList", itemNumberList);
	session.setAttribute("itemCategoryList", itemCategoryList);
	session.setAttribute("itemNameList", itemNameList);
	session.setAttribute("itemPriceList", itemPriceList);
	session.setAttribute("itemStockList", itemStockList);
	session.setAttribute("itemImageList", itemImageList);
	session.setAttribute("itemInfoList", itemInfoList);
	session.setAttribute("itemDiscountList", itemDiscountList);
	session.setAttribute("itemSoldList", itemSoldList);
	session.setAttribute("itemSize", itemSize);
	
	
	//카트 배열
	int cartNumberList[] = new int[1000];
	String cartBuyerList[] = new String[1000];
	String cartItemNameList[] = new String[1000];
	int cartBuyPriceList[] = new int[1000];
	int cartBuyCountList[] = new int[1000];
	String cartItemImageList[] = new String[1000];
	int cartSize = 0;
	
	session.setAttribute("cartNumberList", cartNumberList);
	session.setAttribute("cartBuyerList", cartBuyerList);
	session.setAttribute("cartItemNameList", cartItemNameList);
	session.setAttribute("cartBuyPriceList", cartBuyPriceList);
	session.setAttribute("cartBuyCountList", cartBuyCountList);
	session.setAttribute("cartItemImageList", cartItemImageList);
	session.setAttribute("cartSize", cartSize);
	response.sendRedirect("00_main.jsp");

	
%>

<%-- 
 	== 설명서 ==
 	[1] 회원 배열 
 	String idList[]   = new String[1000];
	String pwList[]   = new String[1000];
	String nameList[] = new String[1000];
	int memberSize= 0;
	
	[2] 아이템 배열 
	int itemNumberList[]      = new int[1000];
	String itemCategoryList[] = new String[1000];
	String itemNameList[]     = new String[1000];
	int itemPriceList[]       = new int[1000];
	int itemStockList[]       = new int[1000];
	String itemImageList[]    = new String[1000];
	String  itemInfoList[]    = new String[1000];
	int itemDiscountList[]    = new int[1000];
	int itemSoldList[]        = new int[1000];	
	int itemSize= 35;
	
	//카트 배열
	int cartNumberList[]       = new int[1000];
	String cartBuyerList[]     = new String[1000];
	String cartItemNameList[]  = new String[1000];
	int cartBuyPriceList[]     = new int[1000];
	int cartBuyCountList[]     = new int[1000];
	String cartItemImageList[] = new String[1000];
	int cartSize = 0;
 	
 	
 --%>