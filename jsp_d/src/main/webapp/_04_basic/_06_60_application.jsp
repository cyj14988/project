<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    

 
 <%
    String info = application.getServerInfo();
	String path1 = application.getRealPath(""); // ()�ȿ� ��θ� �߰����Է��Ҽ��ִ�.
	String path2 = application.getRealPath("/test");
	application.log("�α� ��� 1 : " + path1);  // �����۾��� �ܼ����� ��µȴ�.
	application.log("�α� ��� 2 : " + path2);  // �����۾��� �ܼ����� ��µȴ�.
	
	String path3 = application.getContextPath();
	application.log("������Ʈ�� : " + path3);	
  %> 
  
<h2>application ���尴ü</h2>
 �� �����̳��� �̸��� ���� : <%=info%><p>
 <hr>
 �� ���ø����̼� ������ ���� �ý��� ��� : <%=path1%> 
 <hr>
 �� ���ø����̼� ������ ���� �ý��� ��� : <%=path2%>
 <hr>
 ������Ʈ�� : <%=path3%>