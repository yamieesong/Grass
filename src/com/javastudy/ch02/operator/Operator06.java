package com.javastudy.ch02.operator;

public class Operator06 {

	public static void main(String[] args) {
		
		int x = 3;
		
		//조건식?true:false 	     		 true  :  false
		System.out.println((x/2==1?"홀수":"짝수"));

		
		
		x = -3;
		//중첩 삼항연산자 조건이 참이면 true, 거짓이면 다시 한 번 조건식
		System.out.println(x>0 ? "양수" : x==0 ? "0" : "음수");
	}

}
