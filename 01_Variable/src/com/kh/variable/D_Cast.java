package com.kh.variable;

public class D_Cast {
	
	/*
	 * * 형변환 : 값의 자료형을 바꾸는 것
	 * 
	 *  * 컴퓨터에서의 값 처리 규칙 (즉, 형변환이 필요한 상황)
	 *  1. 대입 연산자를 기준으로 왼쪽과 오른쪽은 같은 자료형이어야 한다!!
	 *  => 즉, 같은 자료형에 해당하는 값만 대입이 가능!!
	 *  => 즉, 다른 자료형의 값을 대입하고자 한다면 형 변환이 필수!!
	 *  
	 *  [표현법] 변수명 = (자료형) 값;
	 *  ex) int a = (int) 8.0;
	 *  
	 *  2. 같은 자료형끼리만 연산이 가능
	 *  
	 *  값 + 값 => 계산 결과도 같은 자료형으로 나옴!!
	 *  
	 *  * 형변환 종류
	 *  1. 자동 형변환(Auto Casting) => 자동으로 형변환이 이루어져서 형변환을 시킬 필요가 없음
	 *  2. 강제(명시적) 형변환 => 자동 형변환이 안돼서 직접 형변환을 해줘야 함
	 *  
	 *  [표현법] (바꿀 자료형) 값;
	 *  
	 *  * 주의사항 *
	 *  boolean은 형변환 불가!!
	 */
	
	public void autoCasting() {
		
		/*
		 * 자동형변환
		 * : 값의 범위가 작은 자료형과 큰 자료형 간의 연산 시
		 * 자동으로 범위가 작은 자료형을 큰 자료형으로 변환 후 처리해줌
		 */
		
		// 1. int(4byte) => double(8byte)
		int i1 = 12;
		double d1 = /*(double)*/i1;
		
		//엄청 큰 박스에는 작은 박스를 담을 수 있음! 자동 형변환 가능!(큰 옷, 작은 사람)
		System.out.println("d1 : " + d1);
		
		int i2 = 12;
		double d2 = 3.3;
		
		double result = /*(double)*/ i2 + d2;
		
		System.out.println("result : " + result);
		
		// 2. int(4byte) => long(8byte)
		int i3 = 1000;
		long l3 = /*(long)*/ i3;
		
		System.out.println("l3 : " + l3);
		
		// 3. float(4byte) => double(8byte)
		float f4 = 1.0f;
		double d4 = /*(double)*/ f4;
		
		System.out.println("d4 : " + d4);
		
		// === 특이 케이스 ===
		// 4. long(8byte) => float(4byte)
		//    float이 실수형이기 때문에 long형보다 표현 가능한 수의 범위가 더 커서 자동 형변환 됨
		long l5 = 1000000L;
		float f5 = /*(float)*/ l5;
		
		System.out.println("f5 : " + f5);
		
		// 5. char(2byte) <=> int(4byte)
		int num = /*(int)*/ 'A';
		System.out.println("num : " + num);
		
		char ch = /*(char)*/ 91;
		System.out.println("ch : " + ch);
		
		// 아스키 코드표
		
		// 각 문자들마다 고유한 숫자가 지정되어 있기 때문에 쌍방향으로 형변환이 가능
		// char는 음수값 저장 불가 => 값의 범위가 0 ~ 65535
		
		// 6. byte 또는 short 간의 연산
		byte b1 = 1;
		byte b2 = 10;
		
		//byte b3 = b1 + b2; // byte나 short는 연산 시 무조건 int형으로 처리함
							// 연산 결과가 범위가 더 큰 int형임 => byte형에 대입 불가	
		
		byte b3 = (byte) (b1 + b2);
		
		System.out.println("b3 : " + b3);
		
	}

}
