<%@page import="java.util.Arrays"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="EUC-KR"%>

<%
 	// 1���� �����ڿ� 3���� ȸ�� ���õ����� ���� 
	String[] sample_id = {"admin" , "aaa", "bbb" , "ccc"};
	String[] sample_pw = {"admin" , "234" , "345", "123"};
	String[] sample_name = {"������" , "�̸���" , "�ڿ���" , "�̼���"};
	String[] sample_gender = {"����", "����" , "����" , "����"};
	
	String[] idList = new String[100];
	String[] pwList = new String[100];
	String[] nameList = new String[100];
	String[] genderList = new String[100];
	
	int size = sample_id.length;
	for(int i = 0; i < size; i++){
		idList[i] = sample_id[i];
		pwList[i] = sample_pw[i];
		nameList[i] = sample_name[i];
		genderList[i] = sample_gender[i];
	}
	session.setAttribute("log", null);
	session.setAttribute("idList", idList);
	session.setAttribute("pwList", pwList);
	session.setAttribute("nameList", nameList);
	session.setAttribute("genderList", genderList);
	session.setAttribute("size", size); 
	
	System.out.println(Arrays.toString(idList));
	response.sendRedirect("02_01_main.jsp");		
%>
