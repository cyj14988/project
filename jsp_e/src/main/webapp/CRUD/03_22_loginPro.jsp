<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%
	request.setCharacterEncoding("EUC-KR");
	String[] idList = (String[])session.getAttribute("idList");
	String[] pwList = (String[])session.getAttribute("pwList");
	int size = (Integer)session.getAttribute("size");

	String id = request.getParameter("id");
	String pw = request.getParameter("pw");
	
	// ������ üũ�� ȸ��üũ
	
	if(id.equals("admin") && pw.equals("admin")){ 
		response.sendRedirect("01_01_adminMain.jsp");	
	}else{
		boolean check = false;
		for(int i = 0; i < size; i++){
			if(idList[i].equals(id) && pwList[i].equals(pw)){
				check = true;
				break;
			}
		}
		if(check){
			session.setAttribute("log", id);
			// ������ ��ȿ�ð� �������� 100�� �� �ڵ� ������ �����ȴ�.
			session.setMaxInactiveInterval(100*60) ; 
			response.sendRedirect("02_01_main.jsp");

		}else {			
			response.sendRedirect("03_21_loginForm.jsp");		
		} 
	}
%>

		
