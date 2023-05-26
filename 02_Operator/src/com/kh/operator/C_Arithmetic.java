package com.kh.operator;

public class C_Arithmetic {
	
	/*
	 * 산술연산자 (이항연산자 == 두 개의 값을 가지고 연산)
	 * + - * / %
	 * 
	 * * / % > + -
	 */

	public void method1() {
		
		int num1 = 10;
		int num2 = 3;
		
		//System.out.println("num1 + num2 = " + num1 + num2); // 103이 나옴...
		System.out.println("num1 + num2 = " + (num1 + num2)); // 13 출력
		//System.out.println("num1 - num2 = " + num1 - num2); // 에러 발생 : 문자 - 숫자 불가
		System.out.println("num1 - num2 = " + (num1 - num2)); // 7
		System.out.println("num1 * num2 = " + (num1 * num2)); // 곱셈 연산은 우선순위가 먼저! 하지만, 가독성을 위해 ()로 묶는다
		System.out.println("num1 / num2 = " + (num1 / num2)); // 나누기 연산 시 몫 출력
		System.out.println("num1 % num2 = " + (num1 % num2)); // 나누기 연산 시 나머지 출력 <짝홀>
		
		// 값 % 2 == 0 이라는 건 짝수라는 소리
		// 값 % 2 == 1 이라는 건 홀수라는 소리
		
		// 값 % 5 == 0 이라는 건 5의 배수라는 소리
		// 값 % 3 == 0 이라는 건 3의 배수라는 소리
		
	}
	
	public void quiz1(){
	      int a = 5;
	      int b = 10;
	      int c = (++a) + b; 
	      int d = c / a;   
	      int e = c % a;   
	      int f = e++;   
	      int g = (--b) + (d--);
	      int h = 2; 
	      int i = (a++) + b / (--c / f) * (g-- - d) % (++e + h);
	   
	   
	      System.out.println("a : " + a); 
	      System.out.println("b : " + b); 
	      System.out.println("c : " + c);   
	      System.out.println("d : " + d);   
	      System.out.println("e : " + e);   
	      System.out.println("f : " + f);   
	      System.out.println("g : " + g);   
	      System.out.println("h : " + h);   
	      System.out.println("i : " + i);   
	      
	      System.out.println("=======");
	      
	      int num = 10;
	      num++;
	      System.out.println(num++);
	      System.out.println(num);
	   }
	
}
