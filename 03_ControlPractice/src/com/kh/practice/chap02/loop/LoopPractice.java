package com.kh.practice.chap02.loop;

import java.util.Scanner;

public class LoopPractice {
	
	public void practice1() {
		/*
		 * 사용자로부터 한 개의 값을 입력 받아 1부터 그 숫자까지의 숫자들을 모두 출력
		 * 단, 입력한 수는 1보다 크거나 같아야 함
		 * 만약, 1 미만의 숫자가 입력됐다면 "1 이상의 숫자를 입력해 주세요."를 출력
		 */
		
		Scanner sc = new Scanner(System.in); // 스캐너 생성
		
		System.out.print("1 이상의 숫자를 입력하세요 : "); // 가이드 문구 출력
		int num = sc.nextInt(); // 값을 입력받음
		
		if(num >= 1) { // 입력한 수가 1보다 크거나 같다면
			for(int i = 1; i <= num; i++) { // 1부터 입력한 수까지 출력
				System.out.print(i + " ");
			}
		}
		else { // 만약, 입력한 수가 1 미만이라면
			System.out.println("1 이상의 숫자를 입력해 주세요."); // 안내 문구 출력
		}
		
		sc.close(); // 스캐너 종료
		
	}
	
	public void practice2() {
		// 위 문제와 동일
		// 단, 1 미만의 숫자가 입력됐다면
		// "1 이상의 숫자를 입력해주세요."가 출력되면서 다시 값을 입력하도록
		Scanner sc = new Scanner(System.in); // 스캐너 생성
		
		while(true) { // 1 미만의 숫자가 입력됐다면 무한반복
			System.out.print("1 이상의 숫자를 입력하세요 : "); // 가이드 문구 출력
			int num = sc.nextInt(); // 값을 입력받음
			
			if(num >= 1) { // 입력한 수가 1보다 크거나 같다면
				for(int i = 1; i <= num; i++) { // 1부터 입력한 수까지 출력하고
					System.out.print(i + " ");
				}
				break; // 반복문을 빠져나오기
			}
		}
		sc.close(); // 스캐너 종료
		
	}
	
	public void practice3() {
		// 사용자로부터 한 개의 값을 입력받기
		// 1부터 그 숫자까지의 모든 숫자를 거꾸러 출력
		// 단, 입력한 수는 1보다 크거나 같아야 함
		Scanner sc = new Scanner(System.in); // 스캐너 생성
		
		System.out.print("1 이상의 숫자를 입력하세요 : "); // 가이드 문구 출력
		int num = sc.nextInt(); // 값 입력받기
		
		if(num >= 1) { // 입력한 수가 1보다 크거나 같다면
			for(int i = num; i >= 1; i--) { // 입력한 수부터 1까지 1씩 감소하는 값을 출력
				System.out.print(i + " ");
			}
		}
		else { // 입력한 수가 1보다 작다면 안내 문구를 출력
			System.out.println("1 이상의 숫자를 입력하세요.");
		}
		
		sc.close(); // 스캐너 종료
		
	}
	
	public void practice4() {
		// 위 문제와 동일
		// 단, 1 미만의 숫자가 입력됐다면
		// "1 이상의 숫자를 입력해주세요" 출력 후 다시 값을 입력하도록 하기
		Scanner sc = new Scanner(System.in); // 스캐너 생성
		
		while(true) {
			System.out.print("1 이상의 숫자를 입력하세요 : "); // 가이드 문구 출력
			int num = sc.nextInt(); // 값 입력받기
			
			if(num >= 1) { // 입력한 수가 1보다 크거나 같다면
				for(int i = num; i >= 1; i--) { // 입력한 수부터 1까지 1씩 감소하는 값을 출력
					System.out.print(i + " ");
				}
				break;
			}
		}
		
		sc.close(); // 스캐너 종료
		
	}
	
	public void practice5() {
		// 1부터 사용자에게 입력 받은 수까지의 정수들의 합을 출력
		Scanner sc = new Scanner(System.in); // 스캐너 생성
		
		System.out.print("정수를 하나 입력하세요 : "); // 가이드 문구 출력
		int num = sc.nextInt(); // 정수 값 입력
		
		int i = 1; // 맨 처음에 출력되는 1
		int sum = i; // sum에 i를 대입해서 현재 sum값은 1
		
		System.out.print(sum); // 현재 sum값을 먼저 출력
		
		for(int j = 2; j <= num; j++) { // 2부터 입력값까지 더하는 for문 생성
			sum += j; // 누적합 공식
			System.out.print(" + " + j);
		}
		System.out.print(" = " + sum); // sum값 출력
		
		sc.close(); // 스캐너 종료
		
	}
	
	public void practice6() {
		// 사용자로부터 두 개의 값을 입력 받고
		// 두 값 사이의 숫자를 모두 출력
		// 만일, 1 미만의 숫자가 입력됐다면 "1 이상의 숫자를 입력해주세요." 출력
		Scanner sc = new Scanner(System.in); // 스캐너 생성
		
		System.out.print("첫번째 숫자 : "); // 첫번째 가이드 문구 출력
		int num1 = sc.nextInt(); // 첫번째 값 입력
		
		System.out.print("두번째 숫자 : "); // 두번째 가이드 문구 출력
		int num2 = sc.nextInt(); // 두번째 값 입력
		
		if(num1 >= 1 && num2 >= 1) { // 두 값이 1보다 크거나 같다면
			if(num1 >= num2) { // num1이 num2보다 크거나 같을 때
				for(int i = num2; i <= num1; i++) { // 두 값 사이의 값을 출력
					System.out.print(i + " ");
				}
			}
			else { // num2가 num1보다 클 때
				for(int i = num1; i <= num2; i++) { // 두 값 사이의 값을 출력
					System.out.print(i + " ");
				}
			}
		}
		else { // 두 값이 1 미만이라면
			System.out.println("1 이상의 숫자를 입력해주세요."); // 안내 문구 출력
		}
		
		sc.close(); // 스캐너 종료
		
	}
	
	public void practice7() {
		// 위 문제와 동일
		// 단, 1 미만의 숫자가 입력됐다면
		// "1 이상의 숫자를 입력해 주세요."가 출력되면서 다시 값을 입력하도록 하라
		Scanner sc = new Scanner(System.in); // 스캐너 생성
		
		while(true) { // 1 미만의 숫자가 입력됐다면 무한반복
			System.out.print("첫번째 숫자 : "); // 첫번째 가이드 문구 출력
			int num1 = sc.nextInt(); // 첫번째 값 입력
			
			System.out.print("두번째 숫자 : "); // 두번째 가이드 문구 출력
			int num2 = sc.nextInt(); // 두번째 값 입력
			
			if(num1 >= 1 && num2 >= 1) { // 두 값이 1보다 크거나 같다면
				if(num1 >= num2) { // num1이 num2보다 크거나 같을 때
					for(int i = num2; i <= num1; i++) { // 두 값 사이의 값을 출력
						System.out.print(i + " ");
					}
				}
				else { // num2가 num1보다 클 때
					for(int i = num1; i <= num2; i++) { // 두 값 사이의 값을 출력
						System.out.print(i + " ");
					}
				}
				break; // 올바른 값이 입력됐을 경우에 결과를 출력하고 반복문을 빠져나감
			}
			else { // 1 미만의 숫자가 입력됐다면
				System.out.println("1 이상의 숫자를 입력해 주세요."); // 안내 문구 출력
			}
		}
		sc.close(); // 스캐너 종료
		
	}
	
	public void practice8() {
		//사용자로부터 입력 받은 숫자의 단을 출력하기
		Scanner sc = new Scanner(System.in); // 스캐너 생성
		
		System.out.print("숫자 : "); // 가이드 문구 출력
		int dan = sc.nextInt(); // 숫자 입력
		
		System.out.println("=== " + dan + "단 ==="); // 몇 단인지 알려주기
		
		for(int i = 1; i <= 9; i++) { // 구구단 생성해서 출력
			System.out.printf("%d X %d = %d\n", dan, i, (dan * i));
		}
		
		sc.close(); // 스캐너 종료
		
	}
	
	public void practice9() {
		// 사용자로부터 입력 받은 숫자의 단부터 9단까지 출력
		// 단, 입력 받은 숫자가 9를 초과하면
		// "9 이하의 숫자만 입력해 주세요." 출력
		Scanner sc = new Scanner(System.in); // 스캐너 생성
		
		System.out.print("숫자 : "); // 가이드 문구 출력
		int num = sc.nextInt(); // 숫자 입력
		
		if(num >= 2 && num <= 9) { // 2 이상 9 이하의 숫자가 들어왔다면
			for(int dan = num; dan <= 9; dan++) { // 해당 단부터 9단까지 구구단을 출력
				System.out.println("=== " + dan + "단 ==="); // 몇 단인지 구분
				for(int i = 1; i <= 9; i++) {
					System.out.printf("%d X %d = %d\n", dan, i , (dan * i));
				}
				System.out.println(); // 단끼리 개행을 해서 구별하기
			}
		}
		else { // 다른 숫자가 들어왔다면
			System.out.println("2 이상 9 이하의 숫자만 입력해 주세요.");
		}
		
		sc.close(); // 스캐너 종료
		
	}
	
	public void practice10() {
		// 위 문제와 동일
		// 단, 입력 받은 숫자가 9를 초과하면
		// "9 이하의 숫자를 입력해 주세요." 출력 후 다시 값을 입력하도록 하기
		Scanner sc = new Scanner(System.in); // 스캐너 생성
		
		while(true) { // 잘못된 수를 입력한다면 무한반복
			System.out.print("숫자 : "); // 가이드 문구 출력
			int num = sc.nextInt(); // 숫자 입력
			
			if(num >= 2 && num <= 9) { // 입력한 수가 2부터 9 사이의 수라면
				for(int dan = num; dan <= 9; dan++) { // 해당 단부터 9단까지 구구단을 출력
					System.out.println("===" + dan + "단 ==="); // 몇 단인지 알려주기
					for(int i = 1; i <= 9; i++) {
						System.out.printf("%d X %d = %d\n", dan, i, (dan * i));
					}
					System.out.println(); // 단마다 개행을 해서 구별하기
				}
				break; // 구구단을 출력한 뒤에 해당 반복문을 빠져나감
			}
			else { // 입력한 수가 이외의 수라면
				System.out.println("2부터 9 사이의 수를 입력해 주세요."); // 안내 문구 출력
			}
		}
		sc.close(); // 스캐너 종료
		
	}
	
	public void practice11() {
		// 사용자로부터 시작 숫자와 공차를 입력 받아
		// 일정한 값으로 숫자가 커지거나 작아지는 프로그램 만들기
		// 단, 출력되는 숫자는 총 10개
		Scanner sc = new Scanner(System.in); // 스캐너 생성
		
		System.out.print("시작 숫자 : "); // 숫자 가이드 문구 출력
		int num = sc.nextInt(); // 시작 숫자 입력
		
		System.out.print("공차 : "); // 공차 가이드 문구 출력
		int tolerance = sc.nextInt();// 공차 입력
		
		int i = num; // 반복문에서 사용할 i에 시작 숫자를 대입
		
		while(i <= (num + (tolerance * 9))) { // 10번째 수(시작 숫자 + (공차 * 9))까지 
			System.out.print(i + " "); // i에 공차를 더한 값을 계속 출력
			i += tolerance; // i에 공차를 계속 더해주기
		}
		
		sc.close(); // 스캐너 종료
		
	}
	
	public void practice12() {
		// 정수 2개와 연산자를 입력 받고 결과 출력
		// 연산자 입력에 "exit"가 들어올 때까지 무한반복
		// "exit" 들어오면 "프로그램을 종료합니다."를 출력하고 종료
		// 또한, 연산자가 나누기이면서 두 번째 정수가 0으로 들어오면
		// "0으로 나눌 수 없습니다. 다시 입력해 주세요." 출력 후 처음으로 돌아가 재실행
		// 없는 연산자가 들어올 시 "없는 연산자입니다. 다시 입력해 주세요" 출력 후 처음으로 돌아가 재실행
		Scanner sc = new Scanner(System.in); // 스캐너 생성
		
		while(true) { // 연산자 입력에 exit가 들어올 때까지 무한반복
			
			System.out.print("연산자(+, -, *, /, %) : "); // 연산자 가이드 문구 출력
			String op = sc.nextLine(); // 연산자 입력("exit"가 들어와야 하기 때문에 String으로 선언)

			if(op.equals("exit")) { // 연산자 입력에 exit가 들어오면
				System.out.println("프로그램을 종료합니다.");
				break; // sysout을 출력 후 반복문을 빠져나간다
			}
			else { // exit가 입력되지 않았다면
				System.out.print("정수1 : "); // 정수1 가이드 문구 출력
				int num1 = sc.nextInt(); // 정수1 입력
				
				System.out.print("정수2 : "); // 정수2 가이드 문구 출력
				int num2 = sc.nextInt(); // 정수2 입력
				
				char op2 = op.charAt(0); // 연산자의 첫째 자리를 구한다
				
				if(op2 == '/' && num2 == 0) { // 연산자가 나누기이면서 두번째 정수가 0인 경우
					System.out.println("0으로 나눌 수 없습니다. 다시 입력해 주세요.");
				}
				else { // 정상적인 연산자인 경우
					switch(op2) {
					case '+' :
						System.out.printf("%d + %d = %d\n", num1, num2, (num1 + num2));
						break;
					case '-' :
						System.out.printf("%d - %d = %d\n", num1, num2, (num1 - num2));
						break;
					case '*' :
						System.out.printf("%d * %d = %d\n", num1, num2, (num1 * num2));
						break;
					case '/' :
						System.out.printf("%d / %d = %d\n", num1, num2, (num1 / num2));
						break;
					case '%' :
						System.out.printf("%d %% %d = %d\n", num1, num2, (num1 % num2));
						break;
					default :
						System.out.println("없는 연산자입니다. 다시 입력해 주세요."); // 없는 연산자인 경우
					}
				}
			}
			sc.nextLine();
			
		}
		sc.close(); // 스캐너 종료
		
	}
	
	public void practice13() {
		// 별 찍기
		// 별이 하나씩 늘어나는 직각 삼각형 구현하기
		Scanner sc = new Scanner(System.in); // 스캐너 생성
		
		System.out.print("정수 입력 : "); // 가이드 문구 출력
		int num = sc.nextInt(); // 숫자 입력
		
		for(int i = 0; i < num; i++) { // 입력한 숫자만큼의 행을 출력
			for(int j = 0; j <= i; j++) { // 행이 커질 때마다 입력한 수까지의 별을 하나씩 증가시키면서 출력 
				System.out.print("*");
			}
			System.out.println(); // 한 행씩 출력하기 위해 개행이 필요하다
		}
		
		sc.close(); // 스캐너 종료
		
	}
	
	public void practice14() {
		// 별이 하나씩 줄어드는 직각 삼각형 출력
		Scanner sc = new Scanner(System.in); // 스캐너 생성
		
		System.out.print("정수 입력 : "); // 가이드 문구 출력
		int num = sc.nextInt(); // 숫자 입력
		
		for(int i = 0; i < num; i++) {
			for(int j = 0; j < num - i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		sc.close(); // 스캐너 종료
		
	}

}
