<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>

 		
    <%--
    	 -댓글-
    	[1] 아래그림과 같은 댓글이 일반적인 댓글이나 난이도가 높기 때문에 추후에 배우기로하고,
    	[2] 지금은 일단 본문에만 댓글을 달수있는 형태로 만들어보겠다. 
    	---------------------------------------------------------------------  	 
    	 	[본문]
    	 		-> [본문의리플]
    	 			->[본문의리플의리플]
    	 				->[본문의리플의리플의리플] 
    	---------------------------------------------------------------------  	 
    	
		[아이디어] 
		
		본문만 저장하는 배열과 댓글만 저장하는 배열을따로 만든다. 
		
		본문배열은 (제목배열 ,내용배열) 2개를 만들고
		댓글배열은 (부모글번호배열 , 댓글제목, 댓글내용) 배열 3개를 만든다.  
		
		예) 본문 bb에 댓글이 2개 , 본문cc 에 댓글이 1개 라고한다면,
		
		본문배열 [] = {"aa" , "bb" , cc"};		
		본문제목배열 [] = {"aa제목" , "bb제목" , cc제목"};		
		
		부모번호 [] = { 1,1,2 };
		댓글제목배열 [] = { "bb댓글제목" , "bb댓글제목" , "cc댓글제목" };
		댓글배열 [] = {"bb댓글" , "bb댓글" , "cc댓글"};
		
     --%>
    
    
    <%
    	final int MAX = 1000;
    	String[] boardList = new String[MAX];
    	String[] subjectList = new String[MAX];
    	int boardCount = 0;
    	
		int[] reParentList = new int[MAX];  	
    	String[] reSubjectList = new String[MAX];
    	String[] reWriteList = new String[MAX];
    	int reWriteCount = 0;    	
    	
    	session.setAttribute("boardList", boardList);
    	session.setAttribute("subjectList", subjectList);
    	session.setAttribute("boardCount", boardCount);
    	
    	session.setAttribute("reParentList", reParentList);
    	session.setAttribute("reSubjectList", reSubjectList);
    	session.setAttribute("reWriteList", reWriteList);
    	session.setAttribute("reWriteCount", reWriteCount);
    	response.sendRedirect("00_list.jsp");
    %>