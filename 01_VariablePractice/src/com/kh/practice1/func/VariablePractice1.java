/*
 * 실습문제1
 * 이름, 성별, 나이, 키를 사용자에게 입력 받아 각각의 값을 변수에 담고 출력하세요.
 * 
 * ex.
 * 이름을 입력하세요 : 아무개
 * 성별을 입력하세요(남/여) : 남
 * 나이를 입력하세요 : 20
 * 키를 입력하세요(cm) : 180.5
 * 
 * 키 180.5cm인 20살 남자 아무개님 반갑습니다^^
 */
package com.kh.practice1.func;

import java.util.Scanner;

public class VariablePractice1 {
	// 0. 메소드 만들기
	public void inputTest() {
		// 1. 스캐너 생성
		Scanner sc = new Scanner(System.in);
		// 2. 가이드 문구 출력 및 입력받기 
		System.out.print("이름을 입력하세요 : ");
		String name = sc.nextLine();
		
		System.out.print("성별을 입력하세요(남/여) : ");
		char gender = sc.nextLine().charAt(0);
		
		System.out.print("나이를 입력하세요 : ");
		int age = sc.nextInt();
		
		System.out.print("키를 입력하세요(cm) : ");
		double height = sc.nextDouble();
		// 3. 출력
		System.out.println("키 " + height + "cm인 " + age +
				"살 " + gender + "자 " + name + " 님 반갑습니다^^");
		// 4. 스캐너 반납
		sc.close();
		
	}

}
