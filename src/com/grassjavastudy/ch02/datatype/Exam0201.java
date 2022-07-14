package com.grassjavastudy.ch02.datatype;

import java.util.Scanner;

public class Exam0201 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int a = 2022;
		
		//나이계산하기
		System.out.println("태어난 년도를 입력해주세요");
		int year = scanner.nextInt();
		
		scanner.close();
		
		System.out.println("당신의 나이는 "+(a-year+1)+"이네요!");

	}

}
