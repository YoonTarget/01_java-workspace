package com.kh.practice.comp.func;

import java.util.Scanner;

public class CompExample {
	
	public void practice1() {
		/*
		 * 정수를 입력 받아 양수일 때만 1부터 입력 받은 수까지 홀/짝을 나눠서
		 * 홀수면 '박', 짝수면 '수'를 출력
		 * 단, 입력 받은 수가 양수가 아니면 "양수가 아닙니다." 출력
		 */
		Scanner sc = new Scanner(System.in); // 스캐너 생성
		
		System.out.print("정수 : "); // 가이드 문구 출력
		int num = sc.nextInt(); // 정수 입력
		
		if(num > 0) { // 양수일 경우
			for(int i = 1; i <= num; i++) { // 반복문을 생성
				if(i % 2 == 0) { // 짝수일 경우
					System.out.print("수"); // 수 출력
				}
				else { // 홀수일 경우
					System.out.print("박"); // 박 출력
				}
			}
		}
		else { // 양수가 아닐 경우
			System.out.println("양수가 아닙니다."); // "양수가 아닙니다." 출력
		}
		
		sc.close(); // 스캐너 종료
		
	}
	
	public void practice2() {
		/*
		 * 위 문제와 동일
		 * 단, 1 미만의 숫자가 입력됐다면
		 * "양수가 아닙니다." 출력하면서 다시 입력하도록 하기		
		 */
		Scanner sc = new Scanner(System.in); // 스캐너 생성
		
		while(true) { // 값이 제대로 입력되지 않으면 무한 반복
			System.out.print("정수 : "); // 가이드 문구 출력
			int num = sc.nextInt(); // 정수 입력
			
			if(num > 0) { // 입력된 수가 양수라면
				for(int i = 1; i <= num; i++) { // 입력된 수까지 반복
					if(i % 2 == 1) { // i가 홀수일 경우
						System.out.print("박"); // 박 출력
					}
					else { // i가 짝수일 경우
						System.out.print("수"); // 수 출력
					}
				}
				break; // 결과를 출력하고 반복문을 빠져나온다
			}
			else { // 입력된 수가 양수가 아니라면
				System.out.println("양수가 아닙니다."); // 안내 문구 출력 후 무한반복 구간으로 이동
			}
		}
		sc.close(); // 스캐너 종료
		
	}
	
	public void practice3() {
		/*
		 * 사용자로부터 문자열을 입력 받고
		 * 문자열에서 검색될 문자를 입력 받아
		 * 해당 문자열에 그 문자가 몇 개 있는지 개수를 출력
		 */
		Scanner sc = new Scanner(System.in); // 스캐너 생성
		
		System.out.print("문자열 : "); // 가이드 문구 출력
		String str = sc.nextLine(); // 문자열 입력
		 
		System.out.print("문자 : "); // 가이드 문구 출력
		char ch = sc.nextLine().charAt(0); // 문자 입력
		
		int sum = 0; // 문자열 안에 포함된 문자 개수를 저장하기 위해 sum을 생성
		
		for(int i = 0; i < str.length(); i++) { // 문자열만큼 반복
			if(str.charAt(i) == ch) { // 만약, 같은 문자가 있다면 sum에 저장 
				sum++;
			}
		}
		System.out.printf("%s 안에 포함된 %c 개수 : %d", str, ch, sum); // 최종 값 출력
		
		sc.close(); // 스캐너 종료
		
	}
	
	public void practice4() {
		/*
		 * 위 문제와 동일
		 * 추가로 "더 하시겠습니까?"라고 물어보기
		 * N 또는 n이 나오면 프로그램 종료
		 * Y 또는 y가 나오면 계속 진행
		 * 다른 문자를 입력했을 경우에는 "잘못된 대답입니다. 다시 입력해 주세요." 출력 후 더 하겠냐고 묻기
		 */
		Scanner sc = new Scanner(System.in); // 스캐너 생성
		
		while(true) { // 'N'이나 'n'이 입력이 안 되었다면 무한 반복
			
			System.out.print("문자열 : "); // 가이드 문구 출력
			String str = sc.nextLine(); // 문자열 입력
			
			System.out.print("문자 : "); // 가이드 문구 출력
			char ch = sc.nextLine().charAt(0); // 문자 입력
			
			int sum = 0; // 문자열 안에 포함된 문자 개수를 저장하기 위해 sum을 생성
			
			for(int i = 0; i < str.length(); i++) { // 문자열만큼 반복
				if(str.charAt(i) == ch) { // 만약, 같은 문자가 있다면 sum에 저장 
					sum++;
				}
			}
			System.out.printf("%s 안에 포함된 %c 개수 : %d\n", str, ch, sum); // 최종 값 출력
			
			System.out.println("더 하시겠습니까? (Y/N) : "); // 더 하겠냐고 물음
			char answer = sc.nextLine().charAt(0); // 답변을 입력
			
			if(answer == 'N' || answer == 'n') { // 싫다고 한다면 문장을 출력 후 반복문을 빠져나감
				System.out.println("프로그램을 종료하겠습니다.");
				break;
			}
			else if(answer == 'Y' || answer == 'y') { // 좋다고 한다면 계속 진행
				System.out.println("계속 진행하겠습니다.");
			}
			else {
				System.out.println("잘못된 대답입니다. 다시 입력해주세요."); // 잘못된 입력이면 다시 입력
				
				int i = 0; // 싫다고 했을 때 바깥 반복문을 빠져나가기 위한 변수
				while(true) { // 잘못 입력했을 경우 무한반복
					System.out.println("더 하시겠습니까? (Y/N) : "); // 더 하겠냐고 물음
					char answer2 = sc.nextLine().charAt(0); // 답변을 입력
					
					if(answer2 == 'N' || answer2 == 'n') { // 싫다고 한다면 문장을 출력 후 반복문을 빠져나감
						System.out.println("프로그램을 종료하겠습니다.");
						i++; // i의 값을 1 증가시킴
						break;
					}
					else if(answer2 == 'Y' || answer2 == 'y') { // 좋다고 한다면 문장을 출력 후 반복문을 빠져나감
						System.out.println("계속 진행하겠습니다.");
						break;
					}
					else {
						System.out.println("잘못된 대답입니다. 다시 입력해주세요."); // 잘못된 입력이면 다시 입력
					}
				}
				if(i == 1) { // 싫다는 답변을 받았을 때 바깥 반복문을 한 번 더 빠져나가야 하기 때문에 미리 선언한 변수를 활용해서 빠져나간다
					break;
				}
			}	
			
		}
		
		sc.close(); // 스캐너 종료
		
	}

}
