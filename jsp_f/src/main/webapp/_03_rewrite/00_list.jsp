<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>

    
    <%
    	Object obj = null;  	  
    	obj = session.getAttribute("boardList");
    	String[] boardList = (String[])obj;   	
    	obj = session.getAttribute("subjectList");
    	String[] subjectList = (String[])obj;   
    	obj = session.getAttribute("boardCount");
    	int boardCount = (int)obj;	
    	//---------------------------------------------
    	obj = session.getAttribute("reParentList");
    	int[] reParentList = (int[])obj;
    	obj = session.getAttribute("reSubjectList");
    	String[] reSubjectList = (String[])obj;
    	obj = session.getAttribute("reWriteList");
    	String[] reWriteList = (String[])obj;
    	obj = session.getAttribute("reWriteCount");
    	int reWriteCount = (int)obj;  	
    	int num = 1;    
    %>
    
    <div align="center">
    	<h1> �Խ��� </h1>
    	<table border="1">
    		<tr align="right">
    			<td colspan="2"><button onclick="window.location.href='01_insertPro.jsp'">�����߰�</button></td>
    		</tr>
   			<tr>
   				<td width="100px" height="30px">�۹�ȣ</td>
   				<td width="300px" ">�۳���</td>
   			</tr>
    		<%for(int i = 0; i < boardCount; i++){ %>
    			<tr>
    				<td><%=num++%></td>
    				<td><a href="11_boardInfo.jsp?index=<%=i%>"><%=subjectList[i] %></a></td>
    			</tr>
    			<%for(int j = 0; j < reWriteCount; j++){ %>
    				<%
    					if(i == reParentList[j]) {%>
	    					<tr>
		    					<td><%=num++%></td>
		    					<td><a href="12_reWriteInfo.jsp?index=<%=j%>">
		    					<%="[���] " + reSubjectList[j] %></a></td>
	    					</tr>  					
    					<%} %>
    				
    			<%} %>
    		<%} %>
    		
    	
    	</table>
    </div>
    