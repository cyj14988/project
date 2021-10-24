<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>


<%-- 
		<style> 태그 
		id 속성 ==> 클래스와 역활은 동일하다. 단, 찾을때 (#속성명) 을 사용한다.
			
--%>

<style>
	button{
		width:100px;
		height:50px;
	}
	.d{
		background-color : red;
	}
	#c{
		background-color : aqua;
	} 
</style>
<button>a</button>
<button>b</button>
<button id="c">c</button>
<button class="d">d</button>