package com.grassjavastudy.ch02.datatype;

public class VariableDeclaration {

	public static void main(String[] args) {
		
		
		int a, b;
		float f;
		char ch = '한';
		
		a = 10;
		b = 100;
		f = 10.532F;
		
		System.out.println(a+" : "+b);
		System.out.println(f);
		System.out.println(ch);
		
		a = b;
		System.out.println("a : "+a);
		
		b = b+10;
		System.out.println("b : "+b);

	}

}
