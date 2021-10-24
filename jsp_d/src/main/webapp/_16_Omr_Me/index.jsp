<%@page import="java.util.Random"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>


<%

	Random ran = new Random();
	int testsize = 3;
	int samplesize = 5;
	int a[] = new int[testsize];
	int b[] = new int[testsize];
	int c[] = new int[testsize];
	int resultList[][] = new int[testsize][samplesize];
	int resultIndex[] = new int[testsize];
	
	for(int i = 0; i < testsize; i++){
		a[i] = ran.nextInt(8)+2;
		b[i] = ran.nextInt(9)+1;
		c[i] = a[i] * b[i];
		resultList[i][0] = c[i];	
		for(int j = 1; j < samplesize; j++){
			int r1 = ran.nextInt(8)+2;
			int r2 = ran.nextInt(9)+1;
			resultList[i][j] = r1 * r2;
		}
		
		
		for(int d = 0; d < samplesize; d++){
			for(int n = d + 1; d < samplesize; d++){
				if(resultList[i][d] == resultList[i][n]){
					i--;
					break;
				}
			}
			break;
		}
	}
	for(int i = 0; i < testsize; i++){
		for(int r = 0; r < samplesize; r++){
			int rnum = ran.nextInt(samplesize);
			int temp = resultList[i][rnum];
			resultList[i][rnum] = resultList[i][0];
			resultList[i][0] = temp;
			resultIndex[i] = rnum;
		}
	}
	
	
	session.setAttribute("testsize", testsize);
	session.setAttribute("samplesize", samplesize);
	session.setAttribute("resultList", resultList);
	session.setAttribute("resultIndex", resultIndex);
	session.setAttribute("a", a);
	session.setAttribute("b", b);

%>

<div align="center">
<h1>구구단게임</h1>
<button onclick ="window.location.href='omr.jsp'">게임시작</button>



</div>