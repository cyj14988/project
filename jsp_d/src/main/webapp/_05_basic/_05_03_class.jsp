<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>


<%-- 
		<style> 태그 
		class 속성 ==> 디자인요소를 변경할때 사용한다. 
		어떠한 태그 전체에 디자인요소를 변경하면 모두 변경되기때문에 
		일부만 변경하고싶을때 사용 
		
		class 를 찾을때는 (.속성명) 을 사용한다. 		
--%>

<style>
	button{
		width:100px;
		height:50px;
	}
	.d{
		background-color : red;
	}
</style>
<button>a</button>
<button>b</button>
<button>c</button>
<button class="d">d</button>