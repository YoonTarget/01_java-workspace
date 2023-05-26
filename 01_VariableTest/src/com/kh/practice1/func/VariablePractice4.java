/*
 * 실습문제4
 * 영어 문자열 값을 키보드로 입력 받아 문자에서 앞에서 세 개를 출력하세요.
 * 
 * ex.
 * 문자열을 입력하세요 : apple
 * 
 * 첫 번째 문자 : a
 * 두 번째 문자 : p
 * 세 번째 문자 : p
 */
package com.kh.practice1.func;

import java.util.Scanner;

public class VariablePractice4 {	
	// 0. 메소드 생성
	public void inputTest4() {
		// 1. 스캐너 생성
		Scanner sc = new Scanner(System.in);
		// 2. 문자열을 입력 받아 변수로 저장
		System.out.print("문자열을 입력하세요 : ");
		String str = sc.nextLine();
		
		char ch1 = str.charAt(0);
		char ch2 = str.charAt(1);
		char ch3 = str.charAt(2);
		// 3. 출력 (3번)
		System.out.println("첫 번째 문자 : " + ch1);
		System.out.println("두 번째 문자 : " + ch2);
		System.out.println("세 번째 문자 : " + ch3);
		// 4. 스캐너 반납
		sc.close();
		
	}
	
}
