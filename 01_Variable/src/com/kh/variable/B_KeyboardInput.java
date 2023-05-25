package com.kh.variable;

import java.util.Scanner;

//사용자가 키보드로 입력한 값을 받아들이는 Scanner 실습
public class B_KeyboardInput {
	/*
	public void 메소드 명() {
	
	}
	*/
	public void inputTest1() {
		
		/*
		 * 키보드로 값을 입력받는 방법
		 * Scanner를 사용한다!
		 * 즉, java.util.Scanner 클래스를 이용하는 것이다!
		 * Scanner 클래스 내부의 메소드를 호출해서 입력받는 것
		 */
		
		//스캐너 생성(new)
		Scanner sc = new Scanner(System.in);
		//System.in 은 입력받은 값을 바이트 단위로 받아들이겠다는 의미
		
		System.out.print("아무거나 입력해 보세용 : ");
		String message = sc.nextLine(); //Scanner 클래스 내부에 있는 nextLine() 메소드를 호출
		
		System.out.println("입력받은 내용 : " + message);
		
		sc.close();
		
	}
	
	/*
	 * 1. inputTest2() 메소드 생성
	 * 2. 스캐너 생성
	 * 3. 당신의 이름은 무엇입니까? 가이드 문구
	 * 4. 이름을 변수에 저장
	 * 5. 변수에 저장된 걸 출력
	 * 6. 스캐너 반납
	 */
	
	public void inputTest2() {
		Scanner sc = new Scanner(System.in);
		System.out.print("당신의 이름은 무엇입니까? ");
		
		//사용자가 입력한 값을 문자열로 받아오는 메소드(nextLine(), next())
		//String name = sc.next();
		//next() : 사용자가 입력한 값 중 공백이 있을 경우, 공백 이전까지의 값만 읽어옴
		// 			ex) 경기도 용인시 수지구 => 경기도
		//			따라서 거주지처럼 공백이 있는 데이터는 제대로 된 값을 못 가져올 수도 있음
		//enter == \n
		String name = sc.nextLine();
		//nextLine() : 사용자가 입력한 값 모두 읽어옴 (엔터 전까지의 모든 값)
		
		System.out.print("당신의 나이는 몇 살입니까? ");
		int age = sc.nextInt(); //사용자가 입력한 값을 정수로 읽어들이는 메소드
		
		System.out.print("당신의 키는 몇 입니까?(소수점 첫 째 자리까지) ");
		double height = sc.nextDouble(); //사용자가 입력한 값을 실수로 읽어들이는 메소드
		
		//XXX 님은 XX살이며, 키는 XXX.X cm 입니다.
		
		System.out.println(name + " 님은 " + age + "살이며, 키는 " 
		+ height + "cm 입니다.");
		
		sc.close();
		
	}
	//키보드로 값을 입력 받을 때 종종 발생되는 문제
	public void inputTest3() {
		//스캐너 생성
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름 : ");
		String name = sc.nextLine();
		
		System.out.print("나이 : ");
		int age = sc.nextInt();
		
		//int age1 = sc.nextInt(); => nextInt()와 nextLine()이 만난 게 문제다
		
		//버퍼에 남아있는 엔터를 비워주는 코드를 추가
		sc.nextLine(); //키보드로 엔터를 입력받은 것과 같다
		
		System.out.print("주소 : ");
		String address = sc.nextLine();
		
		System.out.print("키 : ");
		double height = sc.nextDouble();
		
		//xxx 님은 xx살이며, 사는 곳은 xxx이고, 키는 xxx.x cm입니다.
		System.out.println(name + " 님은 " + age + "살이며, 사는 곳은 "
				+ address + "이고, 키는 " + height + "cm입니다.");
		
		sc.close();
		
	}
	
	public void inputTest4() {
		
		Scanner sc = new Scanner(System.in);
		
		//문자열을 입력 받을 때 => sc.nextLine(), sc.next() => 문자만, 공백까지만
		//정수값을 입력 받을 때 => sc.nextInt()
		//실수값을 입력 받을 때 => sc.nextDouble()
		
		System.out.print("이름 : ");
		String name = sc.nextLine();
		
		System.out.print("성별(M/F) : ");
		//char gender = sc.nextChar(); 와 같은 메소드는 존재하지 않음!!
		char gender = sc.nextLine().charAt(0);
		//문자열.charAt(index) : 해당 문자열로부터 해당 인덱스의 문자를 추출해주는 메소드
		//**인덱스 : 순번 같은 존재. 단, 0부터 시작함!!
		/*
		 * a p p l e
		 * | | | | | => index
		 * 0 1 2 3 4
		 */
		
		System.out.print("나이 : ");
		int age = sc.nextInt();
		
		System.out.print("키 : ");
		double height = sc.nextDouble();
		
		System.out.println(name + " 님의 개인정보");
		System.out.println("성별 : " + gender);
		System.out.println("나이 : " + age);
		System.out.println("키 : " + height);	
		
		sc.close();
		
	}
	
	public void charAtTest() {
		
		String str = "Hello";
		
		//변수에 기록하여 출력하는 방식
		char ch = str.charAt(0); //H
		System.out.println(ch);
		
		//바로 출력하는 방식
		System.out.println(str.charAt(3));
		
		//존재하지 않는 인덱스 : 오류발생!!
		//System.out.println(str.charAt(12)); // java.lang.StringIndexOutOfBoundsException
		
	}
	
	/*
	 * ** 정리 **
	 * 1. 콘솔 창에 (모니터에) 출력하기 위해 : System.out.print[ln]() 메소드 이용
	 * 2. 콘솔 창에 (키보드에) 입력받기 위해 : Scanner 이용해서 
	 * (nextLine(), next(), nextInt(), nextDouble()....)
	 * 
	 * 		=> 주의사항
	 * 		1) sc.nextXXX() 메소드 뒤에 sc.nextLine() 메소드가 와야될 경우
	 * 		   sc.nextLine() 메소드를 한 번 더 써줘서 버퍼에 남아있는 '엔터'를 빼주는 과정 필수!
	 * 		2) '문자'값을 입력받아야 될 경우
	 * 			sc.nextLine() 메소드를 통해 우선 문자열로 받고 그 뒤에 
	 * 		 	.charAt(index) 메소드를 통해서 문자 하나 추출
	 */

}
