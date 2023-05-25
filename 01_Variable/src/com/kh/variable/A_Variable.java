package com.kh.variable;

public class A_Variable {
	
	// 시급과 근무시간, 근무일수를 곱해서 월급을 계산해서 출력하는 메소드
	
	/*
	public void 메소드명() {
	
	}
	*/
	
	public void printVariable() {
		
		System.out.println("=== 변수 사용 전 ===");
		
		System.out.println("시급 : 9620원");
		System.out.println("근무일수 : 6일");
		System.out.println("근무시간 : 8시간");
		
		//월급 = 시급 * 근무시간 * 근무일수
		//차은우 : 0000원 형식으로 출력하고 싶다!
		
		System.out.println("차은우 : " + (9620 * 6 * 8) + "원");
		System.out.println("주지훈 : " + (9620 * 6 * 8) + "원");
		System.out.println("이제훈 : " + (9620 * 6 * 8) + "원");
		System.out.println("장원영 : " + (9620 * 6 * 8) + "원");
		System.out.println("윤관현 : " + (9620 * 6 * 8) + "원");
		//자바에서의 곱셈은 *로 나타낸다
		
		System.out.println();
		
		//변수 사용 후
		System.out.println("=== 변수 사용 후 ===");
		
		//자료형 변수명 = 값; 
		int pay = 10000; 
		int day = 4;
		int time = 8;
		//int pay = 20000; ==> 중복이라서 사용 불가!!
		
		/*
		자바에서 = --> 대입(동등하다는 뜻이 아니라 
		예를 들면, 10000이라는 값을 pay라는 상자에 넣겠다 라는 뜻)
		*/
		
		System.out.println("차은우 : " + (pay * day * time) + "원");
		System.out.println("주지훈 : " + (pay * day * time) + "원");
		System.out.println("이제훈 : " + (pay * day * time) + "원");
		System.out.println("장원영 : " + (pay * day * time) + "원");
		System.out.println("윤관현 : " + (pay * day * time) + "원");
		
		//한 줄 주석
		
		/*
		 여러 줄
		 주석이   == 범위 주석
		 생겨용
		 */
		
		/*
		 * 변수를 사용하는 이유
		 * 1. 변수는 우선적으로 값에 의미를 부여할 목적으로 쓴다. (가독성이 높아진다)
		 * 2. 단 한 번 값을 기록하고 필요할 때마다 가져다 쓰는 목적으로 쓴다. (재사용성이 높아진다)
		 * 3. 유지보수를 보다 쉽게 할 수 있다. 
		 */
		
		System.out.println("시급 : " + pay);
		
		System.out.print("==="); //개행 X
		System.out.println("***"); //개행 O
		
	}
	
	//변수의 선언을 공부하기 위한 메소드
	public void decleareVariable() {
		
		/*
		 * 변수의 선언
		 * 값을 기록하기 위한 변수를 메모리 공간에 확보, 할당한다. == 즉, 값을 보관하기 위한 상자를 만들겠다!
		 * 
		 * [표현법] 자료형 변수명;
		 * 
		 * 자료형 : 변수의 크기 및 모양을 지정해주는 부분
		 * 변수명 : 변수의 이름을 붙여주는 부분 (※의미 부여※)
		 * 
		 * 변수 선언 시 주의 사항
		 * 1. 변수명은 소문자로 시작 / 단, 낙타봉 표기법을 지킬 것!! 예약어는 불가
		 * 2. 같은 영역 안(), {}에서는 동일한 변수명으로 선언 불가!! ==> 즉, 중복이 불가!!
		 * 3. 해당 영역 안(), {}에서 선언한 변수는 그 영역 안에서만 사용 가능
		 * ==> 다른 메소드에서는 사용이 불가능!! 
		 */
		
		//사용자 이름 ==> user + name ==> userName
		
		//int pay = 20000; ==> 다른 영역이므로 사용 가능!!
		
		//System.out.println("시급 : " + pay);
		
		//----- 자료형에 대한 개념 -----
		//1. 논리형 (논리값 = true / false)
		boolean isTrue; //변수 선언만
		boolean isFalse = false; //1byte, 변수 선언과 동시에 값을 대입
		
		//System.out.println("isFalse의 값 : " + isFalse);
		
		isTrue = 1 + 3 > 1; //1+3이 1보다 큽니까?? == true
		isFalse = 4 + 2 < 1; //4+2가 1보다 작습니까?? == false
		//System.out.println("isTrue의 값 : " + isTrue);
		
		
		 //2. 숫자형
		 //2_1. 정수형 (소수점 X)
		
		byte bNum = 100; //1byte (-128 ~ 127)
		
		short sNum = 1000; //2byte 
		
		int iNum = 10000; //4byte, 정수형의 기본 자료형
		
		long lNum = 100000; //8byte
		
		//2_2. 실수형 (소수점 O)
		float fNum = 0.0f; //4byte => 소수점 7자리까지 표현 가능
							//float의 경우 double과 값을 구분하기 위해 값 귀에 f를 붙인다
		double dNum = 0.12345; //8byte => 소수점 15자리까지 표현 가능, 실수형의 기본 자료형
		
		//3.문자형
		//3_1. 문자
		char ch = 'a'; //2byte, 홑따옴표로 담는다
		char kim;
		kim = '김';
		
		//3_2. 문자열 
		String str; //참조 자료형 색깔 안 바뀜, 종특
		str = "abc";
		
		//값이 잘 담겨있는지 확인해보자!!
		
		System.out.println("isTrue의 값 : " + isTrue);
		System.out.println("isFalse의 값 : " + isFalse);
		System.out.println("bNum의 값 : " + bNum);
		System.out.println("sNum의 값 : " + sNum);
		System.out.println("iNum의 값 : " + iNum);
		System.out.println("lNum의 값 : " + lNum);
		System.out.println("fNum의 값 : " + fNum);
		System.out.println("dNum의 값 : " + dNum);
		System.out.println("ch의 값 : " + ch);
		System.out.println("str의 값 : " + str);
		
		//상수의 선언
		//[표현법] final 자료형 상수명(대문자);
		final int AGE;
		AGE = 10; //초기화
		
		System.out.println("AGE : " + AGE);
		
		//AGE = 11; => 상수의 값은 변경이 불가하다
		
		//대표적인 상수의 예 : 3.14(파이, 원주율)
		System.out.println("파이 : " + Math.PI);
		
		//번외 : 가독성을 위해 언더바를 사용할 수 있음
		int etc = 999_999_999;
		System.out.println("etc : " + etc);
		
		//*변수 명명규칙
		int number;
		
		//1) 같은 영역내에 중복된 이름 안됨!!
		//int number;ㅣ
		//대소문자 구분
		int numBer; //이건 된다
		
		//2) 예약어(자바에서 사용되고 있는 키워드)
		//int true;
		//int abstract;
		//int class;
		
		//3) 숫자 사용 가능하나(단, 숫자로 시작하는 건 안됨)
		int number1;
		int num1ber;
		//int 1number;
		
		//4) 특수문자 사용 가능하나(단, _랑 $이외에는 사용 안됨)
		int number_1;
		int number$1;
		//int number!1;
		
		//권장사항!! (오류는 안 나나 지켜줬으면 하는 것!) => 개발자 간의 규칙(매너)
		//1) 낙타봉 표기법 (두 번째 단어부터 첫 글자를 대문자로 작성)
		String username; //관례상 틀림
		String userName; //관례상 맞는 표현
		String userNameTest;
		
		//2) 한글 사용 가능하나 무조건 영문자로 작성하자!!
		String 이름;
		int 나이; //한글을 사용하지 않는 환경에서는 오류를 발생시킬 수 있음!!
		int userAge;
		
	}
	
}
