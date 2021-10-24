<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
  
    <% 
		Object obj = null;  

		obj = session.getAttribute("reSubjectList");
		String[] reSubjectList = (String[])obj;
		obj = session.getAttribute("reWriteList");
		String[] reWriteList = (String[])obj;
		obj = session.getAttribute("reWriteCount");
		int reWriteCount = (int)obj;  	
		String str = request.getParameter("index");
		int index = Integer.parseInt(str);	
    %>
    
    <div align="center">
    	<h1>게시글정보</h1>
    	<table border="1">
    		<tr>
    			<td>번호</td>
    			<td><%=index %></td>
    			
    		</tr>
    		<tr>
    			<td>제목</td>
    			<td><%=reSubjectList[index] %></td>
    			
    		</tr>
    		<tr>
    			<td>내용</td>
    			<td><textarea cols="50" rows="10"><%=reWriteList[index]%></textarea></td>   			
    		</tr>
    		
    		<tr align="center">
    			<td colspan="2">
	    			<button onclick="window.location.href='00_list.jsp'">뒤로가기</button>
    			</td>
    		</tr>
    	</table>
    
    </div>
   