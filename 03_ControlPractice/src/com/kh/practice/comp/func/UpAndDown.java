package com.kh.practice.comp.func;

import java.util.Scanner;

public class UpAndDown {
	
	public void upDown() {
		/*
		 * 1부터 100 사이의 정수 중 임의의 난수가 정해지고
		 * 사용자는 정해진 난수를 맞추는데
		 * 몇 번 만에 맞췄는지 출력
		 */
		Scanner sc = new Scanner(System.in); // 스캐너 생성
		
		int random = (int)(Math.random() * 100 + 1); // 랜덤값 생성
		
		int i = 1; // i를 첫 횟수인 1로 선언하고
		while(true) {
			System.out.print("1~100 사이의 임의의 난수를 맞춰보세요 : "); // 가이드 문구 출력
			int num = sc.nextInt(); // 숫자 입력

			
			if(num >= 1 && num <= 100) { // 올바른 수가 입력되었다면
				if(num > random) { // num 값이 random 값보다 크다면
					System.out.println("DOWN!"); // DOWN을 출력
				}
				else if(num < random) { // num값이 random값보다 작다면
					System.out.println("UP!"); // UP을 출력
				}
				else { // num == random이라면
					System.out.println("정답입니다!!"); // 정답을 맞췄을 경우 출력
					System.out.println(i + "회만에 맞추셨습니다."); // 총 횟수를 출력
					break; // 문구 출력 후 반복문을 빠져나온다
				}
			}
			else { // 잘못된 수가 입력되었다면 다시 물어본다
				System.out.println("1~100 사이의 숫자를 입력해주세요.");
			}
			i++; // 횟수를 저장한다
		}
		sc.close(); // 스캐너 종료
		
	}

}
