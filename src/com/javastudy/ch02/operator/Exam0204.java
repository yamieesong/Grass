package com.javastudy.ch02.operator;

import java.util.Scanner;

public class Exam0204 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("9의 배수를 입력해주세요");
		int nine = sc.nextInt();
		System.out.println("입력된 숫자는 : "+nine+"(으)로 9의 배수가"+(nine%9==0?"맞습니다":"아닙니다"));
	
		System.out.println("9의 배수를 입력해주세요");
		int nine2 = sc.nextInt();
		System.out.println("입력된 숫자는 : "+nine2+"(으)로 9의 배수가"+(nine2%9==0?"맞습니다":"아닙니다"));
	
		sc.close();
	
	}

}
