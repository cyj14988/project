<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%-- 
		radio�� checkbox�� ���� �׷� ������ �ݵ�� ���� name �Ӽ��� �����ؾ� �Ѵ�.
--%>
<%-- 
		textarea�� value �Ӽ��� ������ ������ ������ 
		<textarea></textarea> ������ ������ value�� �ν��Ѵ�.		
		<textarea></textarea> ���̿��� ĭ�� ���ų� ���� �ٲ��� �ʴ´�.
--%>

<div align="center">
	<h2>�й�, �̸�, �г�, ���ð����� �Է��ϴ� ��</h2>
	    
    <form method="post" action="_06_51_multiplexPro.jsp">
    	<table border="1">
    	<tr>
    		<td>�й�</td>
    		<td><input type="text" name="num"></td>
        </tr>
        <tr>
         	<td>�̸�</td>
         	<td><input type="text" name="name"></td>
        </tr>
        <tr>
        	<td>�г�</td>
        	<td>
	        	 <input type="radio" name="grade" value="1" checked>1�г�&nbsp;
		         <input type="radio" name="grade" value="2">2�г�&nbsp;
		         <input type="radio" name="grade" value="3">3�г�&nbsp;
		         <input type="radio" name="grade" value="4">4�г�
        	</td>
        </tr>
        <tr>
        	<td> ���ð���</td>
        	<td>
		        <select name="subject">
		             <option value="JAVA">JAVA</option>
		             <option value="JSP">JSP</option>
		             <option value="SPRING">SPRING</option>
		         </select>     	
        	</td>
        </tr>
         <tr>
        	<td>���</td>
        	<td>
	        	<input type="checkbox" name="hobbies" value="�">�
			   	<input type="checkbox" name="hobbies" value="����">����
			   	<input type="checkbox" name="hobbies" value="����">����  
			   	<input type="checkbox" name="hobbies" value="����">����        	
        	</td>
        </tr>
		<tr>
			<td>�޸�</td>
			<td><textarea rows="10" cols="50" name="memo"></textarea></td>
		</tr>
         	<tr>
         		<td colspan="2" align="center"><input type="submit" value="�Է¿Ϸ�"></td>
         	</tr>
         </table>
    </form>
  </div>