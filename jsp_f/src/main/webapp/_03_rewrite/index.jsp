<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>

 		
    <%--
    	 -���-
    	[1] �Ʒ��׸��� ���� ����� �Ϲ����� ����̳� ���̵��� ���� ������ ���Ŀ� ������ϰ�,
    	[2] ������ �ϴ� �������� ����� �޼��ִ� ���·� �����ڴ�. 
    	---------------------------------------------------------------------  	 
    	 	[����]
    	 		-> [�����Ǹ���]
    	 			->[�����Ǹ����Ǹ���]
    	 				->[�����Ǹ����Ǹ����Ǹ���] 
    	---------------------------------------------------------------------  	 
    	
		[���̵��] 
		
		������ �����ϴ� �迭�� ��۸� �����ϴ� �迭������ �����. 
		
		�����迭�� (����迭 ,����迭) 2���� �����
		��۹迭�� (�θ�۹�ȣ�迭 , �������, ��۳���) �迭 3���� �����.  
		
		��) ���� bb�� ����� 2�� , ����cc �� ����� 1�� ����Ѵٸ�,
		
		�����迭 [] = {"aa" , "bb" , cc"};		
		��������迭 [] = {"aa����" , "bb����" , cc����"};		
		
		�θ��ȣ [] = { 1,1,2 };
		�������迭 [] = { "bb�������" , "bb�������" , "cc�������" };
		��۹迭 [] = {"bb���" , "bb���" , "cc���"};
		
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