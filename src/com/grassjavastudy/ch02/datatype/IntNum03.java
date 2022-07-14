package com.grassjavastudy.ch02.datatype;

public class IntNum03 {

	public static void main(String[] args) {
		
		//정수형 변수 간의 할당
		
		int intNum01 = 30;
		long longNum01 = 100L;
		
		int intNum02 = (int)longNum01;

		long longNum02 = intNum01;
		
		long multipleNum = longNum01 * intNum01 ;
		
		//long형과 int형을 곱셈한 결과
		System.out.println(multipleNum);
		
		//long형 데이터와  int형 데이터를 나눗셈 한 결과
		System.out.println(longNum01/intNum01);

	}

}
