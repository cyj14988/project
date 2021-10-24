<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
	<%
		request.setCharacterEncoding("EUC-KR");
	%>
	<%
	
		String type[] = request.getParameterValues("type");
		int state = 0;
		if(type == null){
			state = 1;
		}else{
			for(int i = 0; i < type.length; i++){
				System.out.println("type: " + type[i]);
				if(type[i].equals("전체")){
					state = 1;
				}
			}
		}
	%>	
		
	<%
		System.out.println("state: " + state);
		String idList[] = null;
		String numList[] = null;
		String titleList[] = null;
		String contentList[] = null;
		String typeList[] = null;
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		int size = 0;
		
		if(state != 1){
			try{
				String jdbcUrl = "jdbc:mysql://localhost:3306/jsp_00_db2_board?serverTimezone=UTC&useSSL=false";
				String dbId = "root";
				String dbPw = "root";
				
				Class.forName("com.mysql.cj.jdbc.Driver");
				conn = DriverManager.getConnection(jdbcUrl, dbId, dbPw);
				
				String sql = "SELECT COUNT(*) FROM board WHERE type=?";
				pstmt = conn.prepareStatement(sql);
				
				for(int i = 0; i < type.length; i++){
					pstmt.setString(1, type[i]);
					rs = pstmt.executeQuery();
					if(rs.next()){
						size += rs.getInt(1);
					}
				}
				System.out.println("size: " + size);
				idList = new String[size];
				numList = new String[size];
				titleList = new String[size];
				contentList = new String[size];
				typeList = new String[size];
				
				sql = "SELECT * FROM board WHERE type=? order by board.number desc"; //mysql에선 or로 처리하면 되는데 여기선 꼭 이렇게 해야 하나
				pstmt = conn.prepareStatement(sql);
				int j = 0;
				for(int i = 0; i < type.length; i++){ //근데 이렇게 하니까 유형별로 뭉쳐서 나오는데ㅠ
					pstmt.setString(1, type[i]);
					rs = pstmt.executeQuery();
					
					while(rs.next()){
						idList[j] = rs.getString(1);
						numList[j] = rs.getInt(2) +"";
						titleList[j] = rs.getString(3);
						contentList[j] = rs.getString(4);
						typeList[j] = rs.getString(5);
						
						System.out.println(idList[j] + ", " + numList[j]);
						j+=1;
					}
				}	
				conn.close();
				pstmt.close();
				rs.close();
			}catch(Exception e){
				e.printStackTrace();
			}
		}
		session.setAttribute("idList", idList);
		session.setAttribute("numList", numList);
		session.setAttribute("titleList", titleList);
		session.setAttribute("contentList", contentList);
		session.setAttribute("typeList", typeList);
		
		response.sendRedirect("04_listPage.jsp");
	%>