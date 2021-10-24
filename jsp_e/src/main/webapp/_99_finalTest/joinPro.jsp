<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%
	request.setCharacterEncoding("EUC-KR");
	String memberList[][] = (String[][])session.getAttribute("memberList");
	int memberCount = (int)session.getAttribute("memberCount");
	String Count = request.getParameter("Count");
	String name = request.getParameter("name");
	String Num = request.getParameter("Num");
	String address = request.getParameter("address");
	String date = request.getParameter("date");
	String city = request.getParameter("city");
	String grade = request.getParameter("grade");
		
	System.out.println("idNum: " + Count);
	System.out.println("name: " + name);
	System.out.println("Num: " + Num);
	System.out.println("address: " + address);
	System.out.println("date: " + date);
	System.out.println("grade: " + grade);
	System.out.println("city: " + city);
	
	if(name.equals("")){
		response.sendRedirect("joinForm.jsp");
	}else if(Num.equals("")){
		response.sendRedirect("joinForm.jsp");
	}else if(address.equals("")){
		response.sendRedirect("joinForm.jsp");
	}else if(date.equals("")){
		response.sendRedirect("joinForm.jsp");
	}else if(city.equals("")){
		response.sendRedirect("joinForm.jsp");
	}else if(grade.equals("")){
		response.sendRedirect("joinForm.jsp");
	}else{
		memberList[memberCount][0] = Count;
		memberList[memberCount][1] = name;
		memberList[memberCount][2] = Num;
		memberList[memberCount][3] = address;
		memberList[memberCount][4] = date;
		memberList[memberCount][5] = grade;
		memberList[memberCount][6] = city;
		
		memberCount++;
		session.setAttribute("memberCount", memberCount);
		response.sendRedirect("shopMain.jsp");
	}
	
	

%>