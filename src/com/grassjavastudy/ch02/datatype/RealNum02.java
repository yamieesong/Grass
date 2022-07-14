package com.grassjavastudy.ch02.datatype;

public class RealNum02 {

	public static void main(String[] args) {
		
		//실수형 데이터  float
		float f = 0.763F;
		float f1 = 0.763f;
		double d = 0.763d;
		
		
		//float형과 double형의 정밀도 비교
		System.out.println(f/f1);
		System.out.println(f/d);
		System.out.println();
		System.out.println((float)(9.9/3));
		System.out.println(9.9/3);

	}

}
