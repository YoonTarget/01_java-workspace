package com.kh.practice.chap01;

import java.util.Scanner;

public class ControlPractice {
	
	public void practice1() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1. 입력");
		System.out.println("2. 수정");
		System.out.println("3. 조회");
		System.out.println("4. 삭제");
		System.out.println("7. 종료");
		
		System.out.print("메뉴 번호를 입력하세요 : ");
		int num = sc.nextInt();
		
		switch(num) {
		case 1 : System.out.println("입력 메뉴입니다."); break;
		case 2 : System.out.println("수정 메뉴입니다."); break;
		case 3 : System.out.println("조회 메뉴입니다."); break;
		case 4 : System.out.println("삭제 메뉴입니다."); break;
		case 7 : System.out.println("프로그램이 종료됩니다."); break;
		default : System.out.println("잘못 입력하셨습니다.");
		}
		
		sc.close();
		
	}
	public void practice2() {
		
		Scanner sc = new Scanner(System.in);

		System.out.print("숫자를 한 개 입력하세요 : ");
		int num = sc.nextInt();
		
		if(num > 0) {
			if(num % 2 == 0) {
				System.out.println("짝수입니다.");
			}
			else {
				System.out.println("홀수입니다.");
			}
		}
		else {
			System.out.println("양수만 입력해주세요.");
		}
		
		sc.close();
	
	}
	public void practice3() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어점수 : ");
		int korean = sc.nextInt();
		
		System.out.print("영어점수 : ");
		int english = sc.nextInt();

		System.out.print("수학점수 : ");
		int math = sc.nextInt();
		
		int sum = korean + english + math;
		double average = sum / 3;
		
		if(korean >= 40 && english >= 40 && math >= 40
				&& average >=60) {
			System.out.println("국어 : " + korean);
			System.out.println("수학 : " + math);
			System.out.println("영어 : " + english);
			System.out.println("합계 : " + sum);
			System.out.println("평균 : " + average);
			System.out.println("축하합니다, 합격입니다!");
		}
		else {
			System.out.println("불합격입니다.");
		}
		
		sc.close();
		
	}
	public void practice4() {
		
		Scanner sc = new Scanner(System.in);

		System.out.print("1 ~ 12 사이의 정수 입력 : ");
		int month = sc.nextInt();
		
		switch(month) {
		case 12 :
		case 1 :
		case 2 :
			System.out.println(month + "월은 겨울입니다.");
			break;
		case 3 :
		case 4 :
		case 5 :
			System.out.println(month + "월은 봄입니다.");
			break;
		case 6 :
		case 7 :
		case 8 :
			System.out.println(month + "월은 여름입니다.");
			break;
		case 9 :
		case 10 :
		case 11 :
			System.out.println(month + "월은 가을입니다.");
			break;
		default :
			System.out.println(month + "월은 잘못 입력된 달입니다.");
		}
		
		sc.close();
		
	}
	public void practice5() {
		
		Scanner sc = new Scanner(System.in);
		
		String fixedId = "myId";
		String fixedPassword = "myPassword12";
		
		System.out.print("아이디 : ");
		String id = sc.nextLine();
		
		System.out.print("비밀번호 : ");
		String password = sc.nextLine();
		
		if(id.equals(fixedId) && password.equals(fixedPassword)) {
			System.out.println("로그인 성공!!");
		}
		else if(id.equals(fixedId)) {
			System.out.println("비밀번호가 틀렸습니다.");
		}
		else if(password.equals(fixedPassword)) {
			System.out.println("아이디가 틀렸습니다.");
		}
		else {
			System.out.println("로그인에 실패하였습니다.");
		}
		
		sc.close();
		
	}
	public void practice6() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("권한을 확인하고자 하는 회원 등급 : ");
		String position = sc.nextLine();
		
		switch(position) {
		case "관리자" :
			System.out.print("회원관리, 게시글 관리, ");
		case "회원" :
			System.out.print("게시글 작성, 댓글 작성, ");
		case "비회원" :
			System.out.print("게시글 조회");
			break;
		default :
			System.out.print("권한이 없습니다.");
		}
		
		sc.close();
		
	}
	public void practice7() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("키(m)를 입력해 주세요 : ");
		double height = sc.nextDouble();
		
		System.out.print("몸무게(kg)를 입력해 주세요 : ");
		double weight = sc.nextDouble();
		
		double bmi = weight / (height * height);
		System.out.println("BMI 지수 : " + bmi);
		
		String result = "";
		
		if(bmi < 18.5) {
			result = "저체중";
		}
		else if(bmi < 23) {
			result = "정상체중";
		}
		else if(bmi < 25) {
			result = "과체중";
		}
		else if(bmi < 30) {
			result = "비만";
		}
		else {
			result = "고도 비만";
		}
		System.out.println(result);
		
		sc.close();
		
	}
	public void practice8() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("피연산자1 입력 : ");
		int num1 = sc.nextInt();
		
		System.out.print("피연산자2 입력 : ");
		int num2 = sc.nextInt();
		
		sc.nextLine();
		
		System.out.print("연산자를 입력(+,-,*,/,%) : ");
		char ch = sc.nextLine().charAt(0);
		
		if(num1 > 0 && num2 > 0) {
			switch(ch) {
			case '+' :
				System.out.printf("%d + %d = %d", num1, num2, (num1 + num2));
				break;
			case '-' :
				System.out.printf("%d - %d = %d", num1, num2, (num1 - num2));
				break;
			case '*' :
				System.out.printf("%d * %d = %d", num1, num2, (num1 * num2));
				break;
			case '/' :
				System.out.printf("%d / %d = %f", num1, num2, ((double)num1 / (double)num2));
				break;
			case '%' :
				System.out.printf("%d %% %d = %d", num1, num2, (num1 % num2));
				break;
			default :
				System.out.println("잘못 입력하셨습니다. 프로그램을 종료합니다.");
			}
		}
		else {
			System.out.println("양수를 입력해 주세요.");
		}
		
		sc.close();
		
	}
	public void practice9() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("중간고사 점수 : ");
		int middleScore = sc.nextInt();
		
		System.out.print("기말고사 점수 : ");
		int finalScore = sc.nextInt();
		
		System.out.print("과제 점수 : ");
		int homeworkScore = sc.nextInt();
		
		System.out.print("출석 횟수  : ");
		int attendanceScore = sc.nextInt();
		
		double middleScore2 = middleScore * 0.2;
		double finalScore2 = finalScore * 0.3;
		double homeworkScore2 = homeworkScore * 0.3;
		double attendanceScore2 = attendanceScore;
		
		double sum = middleScore2 + finalScore2 + homeworkScore2 + attendanceScore2;
		
		System.out.println("============ 결과 ============");

		if(sum >= 70 && attendanceScore > 14) {
			System.out.println("중간고사 점수(20) : " + middleScore2);
			System.out.println("기말고사 점수(30) : " + finalScore2);
			System.out.println("과제 점수   (30) : " + homeworkScore2);
			System.out.println("출석 점수   (20) : " + attendanceScore2);
			System.out.println("총점 : " + sum);
			System.out.println("PASS");
		}
		else if(sum < 70 && attendanceScore > 14) {
			System.out.println("중간고사 점수(20) : " + middleScore2);
			System.out.println("기말고사 점수(30) : " + finalScore2);
			System.out.println("과제 점수   (30) : " + homeworkScore2);
			System.out.println("출석 점수   (20) : " + attendanceScore2);
			System.out.println("총점 : " + sum);
			System.out.println("Fail [점수미달]");
		}
		else if(sum >= 70 && attendanceScore <= 14) {
			System.out.println("Fail [출석 회수 부족 (" + attendanceScore + "/20)]");
		}
		else {
			System.out.println("Fail");
		}
		
		sc.close();
		
	}
	public void practice10() {
		
		Scanner sc = new Scanner(System.in);
		
		sc.close();
		
	}

}
