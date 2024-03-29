package com.kh.chap03.branch;

import java.util.Scanner;

public class A_Break {
	
	/*
	 * break;	: 반복문 안에 사용되는 분기문
	 * 			  break;가 실행되는 순간 현재 속해있는 반복문을 강제로 빠져나감
	 * 
	 * * 유의사항 : switch문 안의 break;는 단지 switch문만을 빠져나가는 구문
	 */
	
	public void method1() {
		// 랜덤값(1~100) 발생시키고 그 랜덤값 출력 (이 과정 매번 반복)
		// 단, 발생된 랜덤값이 3의 배수일 경우 (3으로 나눴을 때 나머지가 0일 경우) 반복문을 빠져나와보자
		
		while(true) { // 무한반복
			int random = (int)(Math.random() * 100 + 1);
			System.out.println("random 값 : " + random);
			
			if(random % 3 ==0) { // 3의 배수
				break; // 반복문을 강제로 빠져나가게 하는 구문
			}
		}
		
	}
	
	public void method2() {
		// 사용자에게 문자열을 입력받아 해당 문자열의 길이를 출력(무한반복)
		// 단, 사용자가 입력한 문자열이 "exit"일 경우 반복문을 빠져나가도록
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("문자열 입력 : ");
			String str = sc.nextLine();
			
			if(str.equals("exit")) { // 사용자가 입력한 문자가 "exit"일 때
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			else { // 근데 그게 아닐 경우 => 문자열의 길이 출력
				System.out.println("문자열의 길이 : " + str.length());
			}
			System.out.println();
		}
		sc.close();
		
	}
	
	public void method3() {
		// 사용자에게 단(2~9)을 입력받아 해당 단을 출력
		// 혹시라도 잘못된 단을 입력했을 경우 다시 단을 입력받도록 유도
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("단(2~9)을 입력해주세요 : ");
			int dan = sc.nextInt();
			System.out.println();
			
			if(dan >= 2 && dan <= 9)  { // 잘 입력했을 경우
				System.out.println("=== " + dan +"단 ===");
				for(int i = 1; i <= 9; i++) {
					System.out.printf("%d X %d = %d\n", dan , i, (dan * i));
				}
				break;
			}
			else { // 잘못 입력했을 경우
				System.out.println("잘못 입력했습니다. 다시 입력해주세요.");
			}
			System.out.println();
		}
		sc.close();
		
	}

}
