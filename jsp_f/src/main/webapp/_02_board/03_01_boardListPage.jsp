<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    
    
<%	
	// ------------------------------------------------------------------------------------
	/*
		�Խ��� �ʿ��� ���� 
		1) allBoardCount 	:	��ü �۰��� 
		2) showBoardCount 	:	�������� ������ �۰��� 
		3) currentPage 		:	���� ������
		4) startIndex 		:	�Խ��� ���� �ε���
		5) lastIndex 		:	�Խ��� ������ �ε��� 
		6) numbewr 			:	�̰Խ��ǿ����������ִ¼���.
		7) startPage 		:   ����������
		8) lastPage			: 	������������
		9) clickMax			:   Ŭ�����������������ִ�ġ
		10) allPageCount    :   ��ü����������
	*/
	
	int [] numberList = (int[])session.getAttribute("numberList");
	String[] writerList = (String[])session.getAttribute("writerList");
	String[] titleList =(String[])session.getAttribute("titleList");
	int size = (Integer)session.getAttribute("size");
	//-------------------------------------------------------------------------
	
	int allBoardCount = size; // ��ü�۰���
	int showBoardCount = 5;   // �ѹ��� �������� ���Ѱ��� 
	
	//-------------------------------------------------------------------------
	int currentPage = 1; // ó���̸� 1���� ���� 
	
	String currentPageStr = request.getParameter("currentPage");	// Ŭ���� ����������	
	if(currentPageStr != null){
		currentPage = Integer.parseInt(currentPageStr);  // Ŭ���� ������������ ����
	}
	
	int startIndex = (currentPage - 1) * showBoardCount; // �Խ��� �����ε��� 
	int lastIndex = startIndex + showBoardCount;         // �Խ��� �������ε���
	if(lastIndex > allBoardCount){
		lastIndex = allBoardCount;  // �ѹ��� �������� ���� 5�����ȵɶ� 
	}
	
	
	// �Խ����� �ֽűۼ����� �������⶧���� ���� �����´�.
	// ���������� �迭 ����
	int [] showNumberList = new int[allBoardCount];
	String[] showWriterList = new String[allBoardCount];
	String[] showTitleList = new String[allBoardCount];
	
	// �Ųٷ� ����
	int reverseIndex = allBoardCount - 1;
	for(int i = 0; i < allBoardCount; i++){
		showNumberList[i] = numberList[reverseIndex];
		showWriterList[i] = writerList[reverseIndex];
		showTitleList[i] = titleList[reverseIndex];
		reverseIndex -= 1;
	}
	// �� ��ȣ�� �ڿ��� ���� ����Ѵ�.
	int showNumber = allBoardCount - ((currentPage - 1) * showBoardCount) ;
	
	//-------------- [����¡] -----------------------------------	
	int allPageCount = allBoardCount/showBoardCount;	// ��ü ����������
	if(allBoardCount % showBoardCount > 0){             // �������������� ��ü���������� 1 �߰� 
		allPageCount += 1;
	}	
	int clickMax = 10;									// Ŭ�������� ������ ���� 
	int startPage = 0;									// Ŭ���Ҽ��ִ� ������ ���۹�ȣ  
	
	// Ŭ�������� ������ ���۹�ȣ ��� 
	// 1~10 ���������� ���۹�ȣ��1 �̳������� 
	// 11~20 �� ��������� ���۹�ȣ 11 �̳������� 
	// 21~30 �� ��������� ���۹�ȣ 21 �̳������� 
	startPage = (currentPage - 1) / clickMax * clickMax + 1; 
	
	// Ŭ�������� �������� ��������ȣ ��� 
	int lastPage = startPage + clickMax - 1;	
	if(lastPage > allPageCount){
		lastPage = allPageCount;
	}
	
	
	
%>

	<div align="center">

		����������<%= currentPage %><br> ����������<%= startPage%><br> ������������<%= lastPage%><br>
		��ü����������<%=allPageCount %><br> ��ü�۰���<%= allBoardCount%><br>
		�����ε���<%= startIndex %><br>�������ε���<%= lastIndex %>

		<h2>������ �Խ��� ���</h2>
		<table border="1">
			<tr>
				<td colspan="4" align="right">
					<button onclick="location.href='00_main.jsp'">���θ޴�</button>
				</td>
			</tr>

			<tr>
				<td colspan="4" align="right">
					<button onclick="location.href='01_01_boardWriteForm.jsp'">�۾���</button>
				</td>
			</tr>

			<tr>
				<td width="100">��ȣ</td>
				<td width="250">����</td>
				<td width="150">�ۼ���</td>
			</tr>
			<%if(size >0){ %>
			<%for(int i = startIndex; i < lastIndex; i++){ %>
			<tr>
				<td><%= showNumber--%></td>

				<td><a href="03_02_boardPage.jsp?number=<%=showNumberList[i]%>"><%= showTitleList[i]%></a>
				</td>

				<td><%= showWriterList[i]%></td>
				
			</tr>

			<%} %>

			<tr>
				<td colspan="4" align="center">
					<%if(currentPage > clickMax){ %> 
						<a href="03_01_boardListPage.jsp?currentPage=<%=startPage - clickMax %>">[����]</a>
					<%}%> 
					<%for(int i = startPage; i <= lastPage; i++){ %> 
						<a href="03_01_boardListPage.jsp?currentPage=<%= i%>">[<%= i%>]</a> 
					<%} %> 
					<%if(lastPage < allPageCount){ %> 
						<a href="03_01_boardListPage.jsp?currentPage=<%= lastPage + 1  %>">[����]</a>
					<%}%>
				</td>
			</tr>
			<%} %>
			
	
		</table>
	</div>
