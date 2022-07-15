package com.javastudy.ch02.operator;

import java.util.Scanner;

public class Operator10 {

	public static void main(String[] args) {
		
		//스캐너 입력
		int boxSize=5;
		Scanner sc = new Scanner(System.in);
		System.out.println("몇 권의 책을 가지고 계신가요?");
		int books = sc.nextInt();
		
		//삼항연산자 활용
		System.out.println("당신의 책을 모두 포장하려면"
									+(books%boxSize ==0 ? books/boxSize : books/boxSize+1)
									+"개의 박스가 필요합니다");
		
		sc.close();

	}

}
