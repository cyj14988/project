<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%
		request.setCharacterEncoding("EUC-KR");
			
		String[] idList = (String[])session.getAttribute("idList");
		String pwList[] =  (String[])session.getAttribute("pwList");
		String nameList[] =  (String[])session.getAttribute("nameList");
		int memberSize= (Integer)session.getAttribute("memberSize");;
		
		
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		String name = request.getParameter("name");
		
		
		boolean check = false;
		for(int i = 0; i < memberSize; i++){
			if(id.equals(idList[i])){
				check = true;
				break;
			}
		}
				
		if(check == false){
			application.log("check : " + check);
			
			idList[memberSize] = id;
			pwList[memberSize] = pw;
			nameList[memberSize] = name;
			memberSize += 1;
			
			session.setAttribute("idList", idList);
			session.setAttribute("pwList", pwList);
			session.setAttribute("nameList", nameList);
			session.setAttribute("memberSize", memberSize);
			
			for(int i = 0; i < memberSize; i++){
				application.log("[" + idList[i] + " " + pwList[i] + " " + nameList[i] + "]");
			}
		
		}else{
			application.log("[가입실패]");
		}
		response.sendRedirect("00_main.jsp");
	%>
