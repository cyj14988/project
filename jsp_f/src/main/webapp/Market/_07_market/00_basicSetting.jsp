
<%@page import="java.util.Random"%> <!-- �������� �ʿ�  -->
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%
	Random ran = new Random();

	//ȸ�� �迭
	String idList[] = new String[1000];
	String pwList[] = new String[1000];
	String nameList[] = new String[1000];
	int memberSize= 0;
	session.setAttribute("idList", idList);
	session.setAttribute("pwList", pwList);
	session.setAttribute("nameList", nameList);
	session.setAttribute("memberSize", memberSize);
	
	
	// ������ ī�װ� ����
	String[] itemCategorySample = {
			"ä��", "ä��" , "ä��","ä��", "ä��" , "ä��","ä��", "ä��" , "ä��","ä��",
			"�ػ깰","�ػ깰","�ػ깰","�ػ깰","�ػ깰","�ػ깰",
			"����","����","����","����","����","����","����","����","����","����",
			"������ǰ","������ǰ","������ǰ","������ǰ","������ǰ","������ǰ","������ǰ","������ǰ","������ǰ"
	};
		
		
	// ������ �̸� ����
	String[] itemNameSample = {
			"����", "����" , "���", "����", "��ȣ��" , "����", "��ȣ��", "������ī" , "�ƽ��Ķ�Ž�","����",
			"�ڹݰ���","����","��¡��","������","����","����",
			"��â","�Ƚɽ�����ũ","��","�ߴٸ�" , "����","��䰥��","�����","ġ�����","�߰�����","��������",
			"�׶��δ�","�����ٸ���","������̱�","ü�߰�","����ü�߰�","�̴ϼ�ǳ��","û�ұ�","ī�޶�","�ͼ���"
	};
	
	//������ �迭
	// ���۾����� ���尳�� : 35
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

	// ���۾����� ��� 
	// �����۹�ȣ (1~35)
	for(int i = 0; i < itemSize; i++){
		itemNumberList[i] = i + 1;
		application.log(itemNumberList[i] + ""); // application.log �� ���ڿ��� ��°����ϴ�.
	}

	
	// ������ ī�װ� + ������ �̸�
	for(int i = 0; i < itemSize; i++){
		itemCategoryList[i] = itemCategorySample[i];
		itemNameList[i] = itemNameSample[i];
		application.log(itemNameList[i]);
	}
	
	
	// �����۰��� (10000~30000);
	for(int i = 0; i < itemSize; i++){
		int r = ran.nextInt(20) + 10; // 10~30
		itemPriceList[i] = r * 1000;
	}
	
	// ������ ��� (0~9)
	for(int i = 0; i < itemSize; i++){
		int r = ran.nextInt(10);
		itemStockList[i] = r;
	}
	
	// ������ �̹��� (1.jsp , 2.jsp , 3.jsp ��� ... ) 
	for(int i = 0; i < itemSize; i++){
		String image = (i + 1) + ".jpg";
		itemImageList[i] = image;
		application.log(image);
	 }
	// ������ ���� (�����ϰ� ==>  �����Դϴ�. , �����Դϴ�. ���... ) 
	for(int i = 0; i < itemSize; i++){
		String info = itemNameSample[i] + "�Դϴ�.";
		itemInfoList[i] = info;
		application.log(info);
	 }
	
	// ������ ���� ==> (0,10,20,30)
	for(int i = 0; i < itemSize; i++){	
		int r = ran.nextInt(4);// 0,1,2,3
		itemDiscountList[i] = r * 10;
	}
	
	// ������ �ǸŰ��� ==> (0~20)
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
	
	
	//īƮ �迭
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
 	== ���� ==
 	[1] ȸ�� �迭 
 	String idList[]   = new String[1000];
	String pwList[]   = new String[1000];
	String nameList[] = new String[1000];
	int memberSize= 0;
	
	[2] ������ �迭 
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
	
	//īƮ �迭
	int cartNumberList[]       = new int[1000];
	String cartBuyerList[]     = new String[1000];
	String cartItemNameList[]  = new String[1000];
	int cartBuyPriceList[]     = new int[1000];
	int cartBuyCountList[]     = new int[1000];
	String cartItemImageList[] = new String[1000];
	int cartSize = 0;
 	
 	
 --%>