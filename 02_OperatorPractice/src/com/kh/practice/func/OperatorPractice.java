package com.kh.practice.func;

import java.util.Scanner;

public class OperatorPractice {
	
	public void practice1() {
		// 키보드로 입력 받은 하나의 정수가 양수면 "양수다"
		// 양수가 아니면 "양수가 아니다" 출력
		
		// 스캐너 생성
		Scanner sc = new Scanner(System.in);
		
		// 정수 입력
		System.out.print("정수 : ");
		int num = sc.nextInt();
		
		// 정수의 값이 양수인지 아닌지 판별
		String result = (num > 0) ? "양수다." : "양수가 아니다.";
		
		// 결과 출력
		System.out.println(result);
		
		// 스캐너 종료
		sc.close();
		
	}
	public void practice2() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 : ");
		int num = sc.nextInt();
		
		String result = (num > 0) ? "양수다." : (num == 0) ? "0이다." : "음수다.";
		
		System.out.println(result);
		
		sc.close();
		
	}
	public void practice3() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 : ");
		int num = sc.nextInt();
		
		String result = (num % 2 == 0) ? "짝수다." : "홀수다.";
		
		System.out.println(result);
		
		sc.close();
		
	}
	public void practice4() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("인원 수 : ");
		int num1 = sc.nextInt();
		
		System.out.print("사탕 개수 : ");
		int num2 = sc.nextInt();
		
		int result1 = num2 / num1;
		int result2 = num2 % num1;
		
		System.out.println("1인당 사탕 개수 : " + result1);
		System.out.println("남는 사탕 개수 : " + result2);
		
		sc.close();
		
	}
	public void practice5() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름 : ");
		String name = sc.nextLine();
		
		System.out.print("학년(숫자만) : ");
		int grade = sc.nextInt();
		
		System.out.print("반(숫자만) : ");
		int classNum = sc.nextInt();
		
		System.out.print("번호(숫자만) : ");
		int studentNum = sc.nextInt();
		
		sc.nextLine();
		
		System.out.print("성별(M/F) : ");
		char gender = sc.nextLine().charAt(0);
		String result = (gender == 'M' || gender == 'm') ? "남학생" : 
			(gender == 'F' || gender == 'f') ? "여학생" : "성별을 다시 입력하세요.";
		
		System.out.print("성적(소수점 아래 둘째자리까지) : ");
		double score = sc.nextDouble();
		
		System.out.println();
		
		System.out.printf("%d학년 %d반 %d번 %s %s의 성적은 %.2f이다.", grade, classNum, studentNum, name, result, score);
		
		sc.close();
		
	}
	public void practice6() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("나이 : ");
		int age = sc.nextInt();
		
		String result = (age <= 13) ? "어린이" : 
			(age <= 19) ? "청소년" : "성인";
		
		System.out.println(result);
		
		sc.close();
		
	}
	public void practice7() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어 : ");
		int korean = sc.nextInt();
		
		System.out.print("영어 : ");
		int english = sc.nextInt();
		
		System.out.print("수학 : ");
		int math = sc.nextInt();
		
		int sum = (korean + english + math);
		double average = (korean + english + math) / 3;
		
		String result = (korean >= 40 && english >= 40 && math >= 40 
				&& average >= 60) ? "합격" : "불합격";
		
		System.out.println("합계 : " + sum);
		System.out.println("평균 : " + average);
		System.out.println(result);
		
		sc.close();
		
	}
	public void practice8() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("주민번호를 입력하세요(-포함) : ");
		int num = sc.nextLine().charAt(7);
		
		String result = (num % 2 == 0) ? "여자" : "남자";
				
		System.out.println(result);
		
		sc.close();
		
	}
	public void practice9() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수1 : ");
		int num1 = sc.nextInt();
		
		System.out.print("정수2 : ");
		int num2 = sc.nextInt();
		
		System.out.print("입력 : ");
		int num3 = sc.nextInt();
		
		boolean result = (num3 <= num1 || num2 < num3) ? true : false;
		
		System.out.println(result);
		
		sc.close();
		
	}
	public void practice10() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("입력1 : ");
		int num1 = sc.nextInt();
		
		System.out.print("입력2 : ");
		int num2 = sc.nextInt();
		
		System.out.print("입력3 : ");
		int num3 = sc.nextInt();
		
		boolean result = (num1 == num2 && num2 == num3 && num3 == num1) ?
				true : false;
		
		System.out.println(result);
		
		sc.close();
		
	}
	public void practice11() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("A사원의 연봉 : ");
		int income = sc.nextInt();
		double income_1 = income * 1.4;
		
		System.out.print("B사원의 연봉 : ");
		int income2 = sc.nextInt();
		double income_2 = income2 *1.0;
		
		System.out.print("C사원의 연봉 : ");
		int income3 = sc.nextInt();
		double income_3 = income3 * 1.15;
		
		String result1 = (income_1 >= 3000) ?
				"3000 이상" : "3000 미만";
		String result2 = (income_2 >= 3000) ?
				"3000 이상" : "3000 미만";
		String result3 = (income_3 >= 3000) ?
				"3000 이상" : "3000 미만";
		
		System.out.println("A사원의 연봉/연봉+a : " + income + "/" + income_1);
		System.out.println(result1);
		System.out.println("B사원의 연봉/연봉+a : " + income2 + "/" + income_2);
		System.out.println(result2);
		System.out.println("C사원의 연봉/연봉+a : " + income3 + "/" + income_3);
		System.out.println(result3);
		
		sc.close();
		
	}
	
}
