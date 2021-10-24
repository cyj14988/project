package daily_Quiz;

import java.util.Arrays;

public class 배열6_알고리즘_같은수합치기_문제 {
	/*
	  	input = {8,4,2,2,4,4,8};	
	  
		 [1] input 의 데이터를 순차적으로 a에 저장한다.
		 [2] 저장할려는 수와 그앞의 수가 서로같으면 합친다. (계속 중첩적용)
		 input = {8,4,2,2,4,4,8}	
		 8  ==> a[] =  {8}
		 4  ==> a[] =  {8,4}
		 2  ==> a[] =  {8,4,2}
		 2  ==> a[] =  {8,4,2,2} ==> {8,4,4} ==> {8,8} ==> {16}
		 4 ==>  a[] =  {16,4} 
		 4  ==> a[] =  {16,4,4} ==> {16,8}
		 8  ==> a[] =  {16,8,8} ==> {16,16} ==> {32}	
	 */	
	public static void main(String[] args) {		
		int [] input = {8,4,2,2,4,4,8};	
		int a[] = new int[input.length];	
		
	}
}