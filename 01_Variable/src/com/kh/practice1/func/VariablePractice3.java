/*
 * 실습문제3
 * 키보드로 가로, 세로 값을 실수형으로 입력 받아 사각형의 면적과 둘레를 계산하여 출력하세요.
 * 계산 공식) 면적 : 가로 * 세로 / 둘레 : (가로 + 세로) * 2
 * 
 * ex.
 * 가로 : 13.5
 * 세로 : 41.7
 * 
 * 면적 : 562.95
 * 둘레 : 110.4
 */
package com.kh.practice1.func;

import java.util.Scanner;

public class VariablePractice3 {
	
	public void inputTest3() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("가로 : ");
		double num1 = sc.nextDouble();
		
		System.out.print("세로 : ");
		double num2 = sc.nextDouble();
		
		double mul = num1 * num2;
		double sum = (num1 + num2) * 2; 
		
		System.out.println("면적 : " + mul);
		System.out.println("둘레 : " + sum);
		
		sc.close();
		
	}

}
