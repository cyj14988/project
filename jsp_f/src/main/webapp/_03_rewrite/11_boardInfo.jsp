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
		String str = request.getParameter("index");
		int index = Integer.parseInt(str);	
    %>
    
    <div align="center">
    	<h1>�Խñ�����</h1>
    	<table border="1">
    		<tr>
    			<td>��ȣ</td>
    			<td><%=index %></td>
    			
    		</tr>
    		<tr>
    			<td>����</td>
    			<td><%=subjectList[index] %></td>
    			
    		</tr>
    		<tr>
    			<td>����</td>
    			<td><textarea cols="50" rows="10"><%=boardList[index]%></textarea></td>   			
    		</tr>
    		
    		<tr align="center">
    			<td colspan="2">
	    			<button onclick="window.location.href='00_list.jsp'">�ڷΰ���</button>
	    			<button onclick="window.location.href='13_reWritePro.jsp?index=<%=index%>'">����߰�</button>
    			</td>
    		</tr>
    	</table>
    
    </div>
   