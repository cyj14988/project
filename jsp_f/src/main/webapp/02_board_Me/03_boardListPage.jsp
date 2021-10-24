<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<%
	int size = (Integer)session.getAttribute("size");
	int lastNumber = (Integer)session.getAttribute("lastNumber");
	
	int[] numList = (int[])session.getAttribute("numList");
	String[] titleList = (String[])session.getAttribute("titleList");
	String[] writerList = (String[])session.getAttribute("writerList");
	String[] contentList = (String[])session.getAttribute("contentList");
	
	int allBoardCount = size;
	int showBoardCount = 5;
	
	int allPageCount = allBoardCount / showBoardCount;
	if(allBoardCount % showBoardCount != 0){
		allPageCount += 1;
	}
	int currentPage = 1;
	
	String currentPagestr = request.getParameter("currentPage");
	
	if(currentPagestr != null){
		currentPage = Integer.parseInt(currentPagestr);	
	}
	
	int startIndex = (currentPage - 1)*showBoardCount;
	int lastIndex = startIndex + showBoardCount;
	if(lastIndex > allBoardCount){
		lastIndex = allBoardCount;
	}
	
	int clickMax = 10;
	int startPage = (currentPage-1)/10*clickMax + 1;
	int lastPage = startPage + (clickMax-1);
	if(lastPage > allPageCount){	
		lastPage = allPageCount;
	}
	
	int showNumList[] = new int[size];
	String showTitleList[] = new String[size];
	String showWriterList[] = new String[size];
	String showContentList[] = new String[size];
	
	int reverseIndex = size - 1;
	int reverseCount = allBoardCount - (currentPage-1) * showBoardCount;
	
	for(int i = 0; i < size; i++){
		showNumList[i] = numList[reverseIndex];
		showTitleList[i] = titleList[reverseIndex];
		showWriterList[i] = writerList[reverseIndex];
		showContentList[i] = contentList[reverseIndex];
		reverseIndex--;
	}
	
	System.out.println("시작페이지: " + startPage);
	System.out.println("마지막페이지: " + lastPage);
	
	
%>

<div align="center">
	<table border="1">
		<tr align="center">
			<td colspan="3"><h3>게시판 리스트</h3></td>
		</tr>
		
		<tr>
			<td><input type="button" onclick="window.location.href='main.jsp'" value="메인으로"></td>
		</tr>
		
		<tr align="center">
			<td width="50px">번호</td>
			<td width="150px">제목</td>
			<td width="100px">작성자</td>
		</tr>
		
		
		<%for(int i = startIndex; i < lastIndex; i++){ %>
			<tr align="center">
				<td><%=reverseCount--%></td>
				<td><a href="03_boardPage.jsp?index=<%=showNumList[i]%>&&number=<%=reverseCount%>"><%=showTitleList[i]%></a></td>
				<td><%=showWriterList[i]%></td>
			</tr>
		<%} %>
	
		
		<tr align="center">
			<td colspan="3">
				<%if(lastPage > clickMax){%>
					<a href="03_boardListPage.jsp?currentPage=<%=currentPage - clickMax%>">[이전]</a>		
				<%}%>
				<%for(int i = startPage; i <= lastPage; i++){%>
					<a href="03_boardListPage.jsp?currentPage=<%=i%>">[<%=i%>]</a>
				<%} %>				
				<%if(lastPage < allPageCount){%>
					<a href="03_boardListPage.jsp?currentPage=<%=lastPage + 1%>">[이후]</a>		
				<%} %>
			</td>
		</tr>
	</table>
</div>