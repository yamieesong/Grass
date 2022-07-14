package com.grassjavastudy.ch02.datatype;

public class RealNum01 {

	public static void main(String[] args) {
		
		//float 실수형 변수(숫자 뒤에  F나 f를 붙여 float형임을 명시적으로 표현)
		float f = 10.0F;
		float f2 = 10.35F;
		
		
		//실수형의 기본형이  double이므로 뒤에 D를 생략해도 되지만 붙여도 됨
		double d = 20.5;
		double d2 = 5.0e3D;
		
		System.out.println(f+d);
		System.out.println(d2*d);

	}

}
