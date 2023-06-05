package com.kh.practice.comp.func;

import java.util.Scanner;

public class RockPaperScissors {
	
	public void rps() {
		/*
		 * 사용자의 이름을 입력하고 컴퓨터와 가위바위보를 해라
		 * 컴퓨터가 가위인지 보인지 주먹인지는 랜덤값으로 결정
		 * 사용자 직접 입력
		 * "exit" 입력 전까지 계속 진행
		 * "exit" 입력 시 몇 번의 승부에서 몇 번 이기고 몇 번 비기고 몇 번 졌는지 출력
		 */
		Scanner sc = new Scanner(System.in); // 스캐너 생성
		
		int random = (int)(Math.random() * 3 + 1); // 1~3까지의 랜덤값 생성
		
		String computer = ""; // String 값 초기화
		
		switch(random) { // 랜덤값을 가위, 바위, 보에 대입한다
		case 1 :
			computer = "가위";
			break;
		case 2 :
			computer = "바위";
			break;
		case 3 :
			computer = "보";
		}
		
		System.out.print("당신의 이름을 입력해 주세요 : "); // 이름 입력 가이드 문구 출력
		String name = sc.nextLine(); // 이름 입력
		
		int match = 0; // 전적 계산을 위한 int 값 초기화
		int win = 0;
		int draw = 0;
		int lose = 0;
		
		while(true) { // exit가 입력되기 전까지는 무한 반복
			System.out.print("가위바위보 : "); // 가위바위보 가이드 문구 출력
			String me = sc.nextLine(); // 사용자의 가위바위보 입력
			
			if(me.equals("exit")) { // exit가 입력된다면 전적을 계산하고 반복문을 빠져나가기
				System.out.printf("%d전 %d승 %d무 %d패", match, win, draw, lose);
				break;
				// return; // 메소드 밖을 빠져나가는 구문
			}
			else if(me.equals("가위") || me.equals("바위") // 가위 또는 바위 또는 보가 입력된다면 결과를 출력
					|| me.equals("보")) {
				System.out.println("컴퓨터 : " + computer);
				System.out.println(name + " 님 : " + me);
				
				if(computer.equals(me)) { // 비겼다면 비겼다는 문구 출력
					System.out.println("비겼습니다.");
					draw++; // 비긴 횟수 증가
				}
				else if(computer.equals("가위") && me.equals("보")) { // 졌다면 졌다는 문구 출력
					System.out.println("졌습니다ㅠㅠ");
					lose++; // 진 횟수 증가
				}
				else if(computer.equals("바위") && me.equals("가위")) { // 졌다면 졌다는 문구 출력
					System.out.println("졌습니다ㅠㅠ");
					lose++; // 진 횟수 증가
				}
				else if(computer.equals("보") && me.equals("바위")) { // 졌다면 졌다는 문구 출력
					System.out.println("졌습니다ㅠㅠ");
					lose++; // 진 횟수 증가
				}
				else { // 이겼다면 이겼다는 문구 출력
					System.out.println("이겼습니다!!^^");
					win++; // 이긴 횟수 출력
				}
				match++; // 경기수 증가
			}
			else { // 잘못 입력했을 경우
				System.out.println("잘못 입력하셨습니다.");
			}
			System.out.println(); // 경기마다 개행을 통해 보기 쉽게 한다
		}
		sc.close(); // 스캐너 종료
		
	}
	
	public void rps2() {
		
		Scanner sc = new Scanner(System.in);
		// 필요한 자원 => 변수
		int total = 0; // 전
		int win = 0; // 승
		int tie = 0; // 무
		int lose = 0; // 패
		
		System.out.print("당신의 이름을 입력해 주세요 : ");
		String name = sc.nextLine();
		
		while(true) {
			System.out.print("가위바위보 : ");
			String rps = sc.nextLine(); // exit
			
			break;
		}
		
		sc.close();
		
	}

}
