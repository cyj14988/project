<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    
    
<%	
	// ------------------------------------------------------------------------------------
	/*
		게시판 필요한 변수 
		1) allBoardCount 	:	전체 글개수 
		2) showBoardCount 	:	한페이지 보여줄 글개수 
		3) currentPage 		:	현재 페이지
		4) startIndex 		:	게시판 시작 인덱스
		5) lastIndex 		:	게시판 마지막 인덱스 
		6) numbewr 			:	이게시판에서만보여주는숫자.
		7) startPage 		:   시작페이지
		8) lastPage			: 	마지막페이지
		9) clickMax			:   클릭가능한페이지수최대치
		10) allPageCount    :   전체페이지개수
	*/
	
	int [] numberList = (int[])session.getAttribute("numberList");
	String[] writerList = (String[])session.getAttribute("writerList");
	String[] titleList =(String[])session.getAttribute("titleList");
	int size = (Integer)session.getAttribute("size");
	//-------------------------------------------------------------------------
	
	int allBoardCount = size; // 전체글개수
	int showBoardCount = 5;   // 한번에 보여지는 글총개수 
	
	//-------------------------------------------------------------------------
	int currentPage = 1; // 처음이면 1부터 시작 
	
	String currentPageStr = request.getParameter("currentPage");	// 클릭한 현재페이지	
	if(currentPageStr != null){
		currentPage = Integer.parseInt(currentPageStr);  // 클릭한 현재페이지로 변경
	}
	
	int startIndex = (currentPage - 1) * showBoardCount; // 게시판 시작인덱스 
	int lastIndex = startIndex + showBoardCount;         // 게시판 마지막인덱스
	if(lastIndex > allBoardCount){
		lastIndex = allBoardCount;  // 한번에 보여지는 글이 5개가안될때 
	}
	
	
	// 게시판은 최신글순으로 보여지기때문에 전부 뒤집는다.
	// 뒤집기위한 배열 생성
	int [] showNumberList = new int[allBoardCount];
	String[] showWriterList = new String[allBoardCount];
	String[] showTitleList = new String[allBoardCount];
	
	// 거꾸로 저장
	int reverseIndex = allBoardCount - 1;
	for(int i = 0; i < allBoardCount; i++){
		showNumberList[i] = numberList[reverseIndex];
		showWriterList[i] = writerList[reverseIndex];
		showTitleList[i] = titleList[reverseIndex];
		reverseIndex -= 1;
	}
	// 글 번호도 뒤에서 부터 출력한다.
	int showNumber = allBoardCount - ((currentPage - 1) * showBoardCount) ;
	
	//-------------- [페이징] -----------------------------------	
	int allPageCount = allBoardCount/showBoardCount;	// 전체 페이지개수
	if(allBoardCount % showBoardCount > 0){             // 나머지가있으면 전체페이지개수 1 추가 
		allPageCount += 1;
	}	
	int clickMax = 10;									// 클릭가능한 페이지 개수 
	int startPage = 0;									// 클릭할수있는 페이지 시작번호  
	
	// 클릭가능한 페이지 시작번호 계산 
	// 1~10 을눌렀을대 시작번호는1 이나오도록 
	// 11~20 을 누렀을대는 시작번호 11 이나오도록 
	// 21~30 을 누렀을대는 시작번호 21 이나오도록 
	startPage = (currentPage - 1) / clickMax * clickMax + 1; 
	
	// 클릭가능한 페이지수 마지막번호 계산 
	int lastPage = startPage + clickMax - 1;	
	if(lastPage > allPageCount){
		lastPage = allPageCount;
	}
	
	
	
%>

	<div align="center">

		현재페이지<%= currentPage %><br> 시작페이지<%= startPage%><br> 마지막페이지<%= lastPage%><br>
		전체페이지개수<%=allPageCount %><br> 전체글개수<%= allBoardCount%><br>
		시작인덱스<%= startIndex %><br>마지막인덱스<%= lastIndex %>

		<h2>페이지 게시판 목록</h2>
		<table border="1">
			<tr>
				<td colspan="4" align="right">
					<button onclick="location.href='00_main.jsp'">메인메뉴</button>
				</td>
			</tr>

			<tr>
				<td colspan="4" align="right">
					<button onclick="location.href='01_01_boardWriteForm.jsp'">글쓰기</button>
				</td>
			</tr>

			<tr>
				<td width="100">번호</td>
				<td width="250">제목</td>
				<td width="150">작성자</td>
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
						<a href="03_01_boardListPage.jsp?currentPage=<%=startPage - clickMax %>">[이전]</a>
					<%}%> 
					<%for(int i = startPage; i <= lastPage; i++){ %> 
						<a href="03_01_boardListPage.jsp?currentPage=<%= i%>">[<%= i%>]</a> 
					<%} %> 
					<%if(lastPage < allPageCount){ %> 
						<a href="03_01_boardListPage.jsp?currentPage=<%= lastPage + 1  %>">[이후]</a>
					<%}%>
				</td>
			</tr>
			<%} %>
			
	
		</table>
	</div>
