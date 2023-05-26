/*
 * 실습문제2
 * 키보드로 정수 두 개를 입력 받아 두 수의 합, 차, 곱, 나누기한 몫을 출력하세요.
 * 
 * ex.
 * 첫 번째 정수 : 23
 * 두 번째 정수 : 7
 * 
 * 더하기 결과 : 30
 * 빼기 결과 : 16
 * 곱하기 결과 : 161
 * 나누기 몫 결과 : 3
 */
package com.kh.practice1.func;

import java.util.Scanner;

public class VariablePractice2 {
	// 0. 메소드 만들기
	public void inputTest2() {
		// 1. 스캐너 생성
		Scanner sc = new Scanner(System.in);
		// 2. 두 수를 입력받는 가이드 문구 출력 및 입력받기
		System.out.print("첫 번째 정수 : ");
		int num1 = sc.nextInt();
		
		System.out.print("두 번째 정수 : ");
		int num2 = sc.nextInt();
		
		int sum = num1 + num2;
		int sub = num1 - num2;
		int mul = num1 * num2;
		int div = num1 / num2;
		// 3. 연산결과 출력
		System.out.println("더하기 결과 : " + sum);
		System.out.println("빼기 결과 : " + sub);
		System.out.println("곱하기 결과 : " + mul);
		System.out.println("나누기 결과 : " + div);
		// 4. 스캐너 반납
		sc.close();
		
	}

}
