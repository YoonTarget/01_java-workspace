package com.kh.practice.array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayPractice {
	
	public void practice1() {
		// 길이가 10인 배열을 선언
		// 1부터 10까지의 값을 반복문을 이용해서
		// 순서대로 배열 인덱스에 넣은 후 값 출력
		
		// 길이가 10인 배열 선언
		int[] arr = new int[10];
		
		// for문을 이용해서 1부터 10까지의 값을 배열 인덱스에 대입
		for(int i = 0; i < arr.length; i++) {
			arr[i] = i + 1;
		}
		
		// for문을 이용해서 인덱스에 담긴 값을 출력
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
	}
	
	public void practice2() {
		// 길이가 10인 배열 선언
		// 1부터 10까지의 값을 반복문을 이용하여
		// 역순으로 배열 인덱스에 넣은 후 값을 출력
		
		// 길이가 10인 배열 선언
		int[] arr = new int[10];
		
		// for문을 이용해서 1부터 10까지의 값을 역순으로 인덱스에 저장
		for(int i = 0; i < arr.length; i++) {
			arr[i] = 10 - i;
		}
		
		// for문을 이용해서 인덱스에 담긴 값을 출력
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
	}
	
	public void practice3() {
		// 사용자에게 입력 받은 양의 정수만큼 배열의 크기를 할당
		// 1부터 입력 받은 값까지 배열에 초기화 한 후 출력
		
		// 스캐너 생성
		Scanner sc = new Scanner(System.in);
		
		// 양의 정수 입력을 위한 가이드 문구
		System.out.print("양의 정수 : ");
		
		// 양의 정수 입력
		int num = sc.nextInt();
		
		// 양의 정수가 맞다면
		if(num > 0) {
			// 입력된 수만큼 배열의 크기를 할당
			int[] arr = new int[num];
			
			// for문을 이용해 배열 초기화
			for(int i = 0; i < arr.length; i++) {
				arr[i] = i + 1;
			}
			
			// for문을 이용해 배열에 담긴 값을 출력
			for(int i = 0; i < arr.length; i++) {
				System.out.print(arr[i] + " ");
			}
		}
		// 아니라면 안내 문구 출력
		else {
			System.out.println("양의 정수를 입력하세요.");
		}
		
		// 스캐너 종료
		sc.close();
		
	}
	
	public void practice4() {
		// 길이가 5인 String 배열을 선언
		// "사과", "귤", "포도", "복숭아", "참외"로 초기화
		// 배열 인덱스를 활용해 귤을 출력
		
		// 길이가 5인 String 배열 선언과 동시에 초기화
		String[] fruit = {"사과", "귤", "포도", "복숭아", "참외"};
		
		// 배열 인덱스를 활용해 귤을 출력
		System.out.println(fruit[1]);
		
	}
	
	public void practice5() {
		// 문자열을 입력 받아 문자 하나하나를 배열에 넣고
		// 검색할 문자가 문자열에 몇 개 있는지
		// 개수와 몇번째 인덱스에 위치하는지를 출력
		
		// 입력을 받기 위해 스캐너 생성
		Scanner sc = new Scanner(System.in);
		
		// 문자열 입력을 받기 위한 가이드 문구 출력
		System.out.print("문자열 : ");
		// 문자열 입력
		String str = sc.nextLine();
		
		// 문자열의 길이만큼 배열 할당
		char[] arr = new char[str.length()];
		
		// 문자열의 문자 하나하나를 순서대로 배열에 초기화
		for(int i = 0; i < arr.length; i++) {
			arr[i] = str.charAt(i);
		}
		
		// 문자 입력을 위한 가이드 문구 출력
		System.out.print("문자 : ");
		// 검색할 문자 입력
		char ch = sc.nextLine().charAt(0);
		
		// 문자의 개수를 저장할 변수 초기화
		int count = 0;
		
		// 인덱스 위치를 알려주는 가이드 문구 출력
		System.out.print(str + "에 " + ch + "이(가) 존재하는 위치(인덱스) : ");
		
		// 검색할 문자의 개수와 문자가 위치한 인덱스를 찾기 위한 for문
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == ch) {
				System.out.print(i + " ");
				count++;
			}
		}
		System.out.println();
		// i의 개수 출력
		System.out.print("i의 개수 : " + count);
		
		
		// 스캐너 종료
		sc.close();
		
	}
	
	public void practice6() {
		// "월" ~ "일"까지 초기화 된 문자열 배열 생성
		// 0 ~ 6까지의 숫자를 입력 받아
		// 입력한 숫자와 같은 인덱스에 있는 요일을 출력
		// 범위에 없는 숫자 입력 시 "잘못 입력하셨습니다" 출력
		
		// 문자열 배열 생성
		String[] arr = {"월", "화", "수", "목", "금", "토", "일"};
		
		// 스캐너 생성
		Scanner sc = new Scanner(System.in);
		
		// 숫자를 입력 받기 위한 가이드 문구 출력
		System.out.print("0 ~ 6 사이의 숫자 입력 : ");
		// 숫자 입력
		int num = sc.nextInt();
		
		// 범위에 속한 숫자라면
		if(0 <= num && num <= 6) {
			// 입력한 숫자에 해당하는 인덱스 값을 출력
			System.out.println(arr[num] + "요일");
		}
		// 범위에 없는 숫자라면
		else {
			// 안내 문구 출력
			System.out.println("잘못 입력하셨습니다.");
		}
		
		// 스캐너 종료
		sc.close();
		
	}
	
	public void practice7() {
		// 사용자가 배열의 길이를 직접 입력
		// 그 값만큼 정수형 배열을 선언 및 할당
		// 배열의 크기만큼 사용자가 직접 각각의 인덱스에 값을 초기화
		// 배열 전체 값을 나열하고 각 인덱스 값의 합을 출력
		
		// 스캐너 생성
		Scanner sc = new Scanner(System.in);
		
		// 가이드 문구 출력
		System.out.print("정수 : ");
		// 정수 입력
		int num = sc.nextInt();
		
		// 배열 선언 및 할당
		int[] arr = new int[num];
		
		// 총합을 구할 변수 선언 및 초기화
		int sum = 0;
		
		// 가이드 문구 출력 및 각각의 인덱스에 값을 입력해서 대입
		for(int i = 0; i < arr.length; i++) {
			System.out.print("배열 " + i + "번째 인덱스에 넣을 값 : ");
			int index = sc.nextInt();
			arr[i] = index;
		}
		// 각각의 인덱스에 담긴 값을 출력 및 누적합 계산
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
			sum += arr[i];
		}
		System.out.println();
		// 총합 출력
		System.out.print("총 합 : " + sum);
		
		// 스캐너 종료
		sc.close();
		
	}
	
	public void practice8() {
		// 3 이상인 홀수 자연수를 입력 받아
		// 배열의 중간까지는 1부터 1씩 오름차순으로 값 입력
		// 중간 이후부터는 1씩 내림차순으로 값을 넣어 출력
		// 단, 입력한 정수가 홀수가 아니거나 3 미만일 경우 "다시 입력하세요" 출력 후
		// 다시 정수를 입력받도록
		
		// 스캐너 생성
		Scanner sc = new Scanner(System.in);
		
		// 잘못된 수를 입력했을 때 질문을 계속 하기 위해 무한 반복문 준비
		while(true) {
			// 가이드 문구 출력
			System.out.print("정수 : ");
			// 3 이상의 홀수 자연수 입력
			int num = sc.nextInt();
			
			// num이 3 이상인 홀수라면
			if(num >= 3 && num % 2 == 1) {
				// 입력된 수만큼 배열 할당
				int[] arr = new int[num];
				
				// 5 입력 시 => {1, 2, 3, 2, 1}		=> 2번 인덱스까지 증가 그 이후로 감소
				// 7 입력 시 => {1, 2, 3, 4, 3, 2, 1}	=> 3번 인덱스까지 증가 그 이후로 감소
				// 9 입력 시 => 						=> 4번 인덱스까지 증가 그 이후로 감소
				//									=> 배열의 길이 / 2 인덱스까지 증가 그 이후로 감소
				
				
				// 값을 초기화
//				int value = 1;
//				for(int i = 0; i < arr.length; i++) { // 값 대입
//					arr[i] = value;
//					if(i < arr.length / 2) {
//						value++;
//					}
//					else {
//						value--;
//					}
//				}
				
				// 중간까지는 1씩 오름차순
				for(int i = 0; i <= (arr.length / 2); i++) {
					arr[i] = i + 1;
				}
				// 중간 이후부터 끝까지는 1씩 내림차순
				for(int i = (arr.length / 2) + 1; i < arr.length; i++) {
					arr[i] = arr.length - i;
				}
				
				// 전체 인덱스를 하나씩 출력
				for(int i = 0; i < arr.length; i++) {
					System.out.print(arr[i] + " ");
				}
				// 출력이 끝났다면 반복문을 빠져나간다
				break;
			}
			// 값이 범위 밖이라면 안내문을 출력하고 while문의 시작 부분으로 이동
			else {
				System.out.println("다시 입력하세요.");
			}
		}
		
		// 스캐너 종료
		sc.close();
		
	}
	
	public void practice9() {
		// 사용자가 입력한 값이 배열에 있는지 검색
		// 있다면 "OOO 치킨 배달 가능"
		// 없다면 "OOO 치킨은 없는 메뉴입니다." 출력
		// 단, 치킨 메뉴가 들어가있는 배열은 스스로 정하기
		
		// 배열 할당 및 초기화
		String[] menu = {"뿌링클", "고추바사삭", "맛초킹", "호랑이", 
				"양념", "후라이드", "뼈", "잉", "먼"};
		
		// 스캐너 생성
		Scanner sc = new Scanner(System.in);
		
		// 가이드 문구 출력
		System.out.print("치킨 이름을 입력하세요 : ");
		// 문자열 입력
		String chickenName = sc.nextLine();
		
		// 없는 메뉴입니다 출력을 위한 변수 초기화
		int count = 0;
		
		// 해당 치킨이 메뉴에 있는지 없는지 확인
		for(int i = 0; i < menu.length; i++) {
			// 만약에 있는 메뉴라면 if문 안에 있는 문구 출력 후 반복문을 빠져나오기
			if(chickenName.equals(menu[i])) {
				System.out.println(chickenName + "치킨 배달 가능");
				break;
			}
			// 없는 메뉴라면 count를 하나씩 추가
			count++;
		}
		// count가 menu 배열의 길이와 같다면(즉, 해당 치킨이 메뉴에 없다면) if문의 문구를 출력
		if(count == menu.length) {
			System.out.println(chickenName + "치킨은 없는 메뉴입니다.");
		}
		
		
		// 스캐너 종료
		sc.close();
		
	}
	
	public void practice10() {
		// 주민등록번호 성별자리 이후부터 *로 가리고 출력
		// 단, 원본 배열 값은 변경 없이 배열 복사본으로 변경
		
		// 스캐너 생성
		Scanner sc = new Scanner(System.in);
		
		// 가이드 문구 출력
		System.out.print("주민등록번호(-포함) : ");
		// 주민번호 입력
		String num = sc.nextLine();
		
		// 문자열의 길이만큼 배열의 크기 할당
		char[] arr = new char[num.length()];
		
		// 각각의 인덱스에 입력받은 문자열의 문자를 하나하나 초기화
		for(int i = 0; i < arr.length; i++) {
			arr[i] = num.charAt(i);
		}
		
		// 배열 복사본 할당
		char[] copy = new char[14];
		
		// 원본에서 필요한 값만 복사
		System.arraycopy(arr, 0, copy, 0, 8);
		
		// 나머지 값은 '*'로 초기화
		for(int i = 8; i < copy.length; i++) {
			copy[i] = '*';
		}
		
		// 복사본 출력
		for(int i =0 ; i < copy.length; i++) {
			System.out.print(copy[i]);
		}
		
		// 스캐너 종료
		sc.close();
		
	}
	
	public void practice11() {
		// 10개의 값을 저장할 수 있는 정수형 배열 선언 및 할당
		// 1 ~ 10 사이의 난수 생성
		// 배열에 초기화 후 출력
		
		// 10 크기의 정수형 배열 선언 및 할당
		int[] arr = new int[10];
		
		// 난수 생성 및 배열에 초기화
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random() * 10 + 1);
		}
		
		// 각각의 인덱스 출력
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
			
	}
	
	public void practice12() {
		// 10개의 값을 저장할 수 있는 정수형 배열 선언 및 할당
		// 1 ~ 10 사이의 난수를 생성 후 배열에 초기화
		// 배열 전체 값과 그 값 중에서 최대값과 최소값을 출력
		
		// 10 크기의 정수형 배열 선언 및 할당
		int[] arr = new int[10];
				
		// 난수 생성 및 배열에 초기화
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random() * 10 + 1);
		}
				
		// 각각의 인덱스 출력
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		
//		// 최대값 구하기
//		for(int i = 0; i < arr.length; i++) {
//			if(arr[0] < arr[i]) {
//				arr[0] = arr[i];
//			}
//		}
//		System.out.println("최대값 : " + arr[0]);
//		
//		// 최소값 구하기
//		for(int i = 0; i < arr.length; i++) {
//			if(arr[0] > arr[i]) {
//				arr[0] = arr[i];
//			}
//		}
//		System.out.println("최소값 : " + arr[0]);
		
		// 오름차순으로 정리
		int temp = 0;
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 1; j < arr.length; j++) {
				if(arr[j -1] > arr[j]) {
					temp = arr[j];
					arr[j] = arr[j - 1];
					arr[j -1] = temp;
				}
			}
		}
		//최대값, 최소값 출력
		System.out.print("최대값 : " + arr[arr.length -1]);
		System.out.println();
		System.out.print("최소값 : " + arr[0]);
		
	}
	
	public void practice13() {
		// 10개의 값을 저장할 수 있는 정수형 배열 선언 및 할당
		// 1 ~ 10 사이의 난수 생성 후 중복된 값이 없게 배열에 초기화 후 출력
		
		// 배열 선언 및 할당
		int[] arr = new int[10];
		
			// 난수 생성 후 배열에 초기화
			// 탐색?? 반복문!! for문
			for(int i = 0; i < arr.length; i++) {
				arr[i] = (int)(Math.random() * 10 + 1);
				for(int j = 0; j < i; j++) { // 2 2 // 핵심
					if(arr[i] == arr[j]) {
						// 랜덤한 수를 다시 만드는 코드 작성
						i--;
					}
				}
			}
			
//			// 각각의 인덱스 값과 1 ~ 10 사이의 수를 비교
//			for(int j = 1; j <= 10; j++) {
//				for(int i = 0; i < arr.length; i++) {
//					if(arr[j - 1] == arr[i]) {
//						arr[i] = j;
//						break;
//					}
//				}
//			}
			
			// 인덱스 값 출력
			for(int i = 0; i < arr.length; i++) {
				System.out.print(arr[i] + " ");
		}
			
	}
	
	public void practice14() {
		// 로또 번호 자동 생성기 프로그램을 작성
		// 중복 값 없이 오름차순으로 정렬하여 출력
		
		// 스캐너 생성
		Scanner sc = new Scanner(System.in);
		
		// 배열 할당
		int[] arr = new int[6];
		
		// 랜덤값 생성 후 배열에 초기화
//		arr[0] = (int)(Math.random() * 7 + 1);
//		arr[1] = (int)(Math.random() * 7 + 8);
//		arr[2] = (int)(Math.random() * 7 + 15);
//		arr[3] = (int)(Math.random() * 8 + 22);
//		arr[4] = (int)(Math.random() * 8 + 30);
//		arr[5] = (int)(Math.random() * 8 + 38);
		
//		for(int i = 0; i < 3; i++) {
//			arr[i] = (int)(Math.random() * 7 + (7 * i) + 1);
//		}
//		
//		for(int i = 3; i < arr.length; i++) {
//			arr[i] = (int)(Math.random() * 8 + (8 * i) - 2);
//		}
		
//		// 중복값 제거
//		for(int j = 1; j <= 45; j++) {
//			for(int i = 0; i < arr.length; i++) {
//				if(arr[i] == j) {
//					arr[i] = j;
//					break;
//				}
//				else {
//					arr[i] = (int)(Math.random() * 45 + 1);
//				}
//			}
//		}
		// 중복값 제거한 랜덤값 생성 후 배열에 초기화
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random() * 45 + 1);
			for(int j = 0; j < i; j++) {
				if(arr[j] == arr[i]) {
					i--;
				}
			}
		}
		// 오름차순으로 정렬
		int temp = 0;
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 1; j < arr.length; j++) {
				if(arr[j - 1] > arr[j]) {
					temp = arr[j];
					arr[j] = arr[j - 1];
					arr[j -1] = temp;
				}
			}
		}
		// 배열 출력
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
		// 스캐너 종료
		sc.close();
		
	}
	
	public void practice15() {
		// 문자열을 입력 받아 문자열에 어떤 문자가 들어갔는지 배열에 저장
		// 문자의 개수와 함께 출력
		
		// 스캐너 생성
		Scanner sc = new Scanner(System.in);
		
		// 가이드 문구 출력
		System.out.print("문자열 : ");
		// 문자열 입력
		String str = sc.nextLine();
		
		// 문자열의 길이만큼의 배열의 할당
		char[] arr = new char[str.length()];
		
		// 문자 개수를 출력할 변수 선언 및 초기화
		int count = 0;

		System.out.print("문자열에 있는 문자 : ");
		
		// char 배열에 값 대입
		for(int i = 0; i < arr.length; i++) {
			arr[i] = str.charAt(i);
			
			// 중복제거?? 출력.. apple => a p l e
			boolean flag = true; // 스위치처럼 활용(껐다 켰다) // 핵심
			
			for(int j = 0; j < i; j++) {
				if(arr[j] == arr[i]) { // apple a p p
					flag = false;
				}
			}
			if(flag/*flag == true*/) {
				count++;
				if(i == 0) {
					System.out.print(arr[i]);
				}
				else {
					System.out.print(", " + arr[i]);
				}
			}
		}
		System.out.println();
		System.out.print("문자 개수 : " + count);
		
//		for(int i = 0; i < arr.length; i++) {
//			for(int j = 0; j < arr.length; j++) {
//				if(arr[i] == arr[j]) {
//					System.out.print(arr[i] + " ");
//					break;
//				}
//			}
//			
//		}
		
//		// 문자 출력
//		for(int i = 0; i < ch.length; i++) {
//			System.out.print(ch[i] + " ");
//		}
//		System.out.println();
//		System.out.println("문자 개수 : " + ch.length);
		
		// 스캐너 종료
		sc.close();
		
	}
	
	public void practice16() {
		// 사용자가 입력한 배열의 길이만큼의 문자열 배열을 선언 및 할당
		// 배열의 인덱스에 넣을 값 역시 사용자가 입력하여 초기화
		// 단, 사용자에게 배열에 값을 더 넣을지 물어보고 몇 개를 더 입력할건지
		// 늘린 곳에 어떤 데이터를 넣을 것인지 받아라
		// 사용자가 더 이상 입력하지 않겠다고 하면 배열 전체 값을 출력
		
		// 스캐너 생성
		Scanner sc = new Scanner(System.in);
		
		// 가이드 문구 출력
		System.out.print("배열의 크기를 입력하세요 : ");
		
		// 배열의 크기 입력
		int num = sc.nextInt();
		
		sc.nextLine();
		
		// 입력한 수만큼 배열 선언 및 할당
		String[] origin = new String[num];
		String[] copy = null;
		
		// 가이드 문구 출력, 인덱스에 넣을 값 입력 및 초기화
		for(int i = 0; i < origin.length; i++) {
			System.out.printf("%d번째 문자열 : ", i + 1);
			origin[i] = sc.nextLine();
		}
		
		while(true) {
			System.out.print("값을 더 입력하시겠습니까?(Y/N) : ");
			char ch = sc.nextLine().charAt(0); // y Y n N
			
			if(ch == 'y' || ch == 'Y') { // 더 입력하겠다는 경우
				System.out.print("더 입력하고 싶은 개수 : ");
				num = sc.nextInt();
				
				sc.nextLine();
				
				copy = Arrays.copyOf(origin, origin.length + num); // 핵심
				
				for(int i = origin.length; i < copy.length; i++) {
					System.out.printf("%d번째 문자열 : ", i + 1);
					copy[i] = sc.nextLine();
				}
				
				origin = copy; // 핵심
				
			}
			else { // 그만하는 경우
				System.out.print("[");
				for(int i = 0; i < origin.length; i++) {
					if(i == origin.length - 1) { // 마지막 인덱스인 경우
						System.out.printf("%s", origin[i]);
					}
					else {
						System.out.printf("%s, ", origin[i]);
					}
				}
				System.out.print("]");
				break;
			}
			
		}
		
		// 스캐너 종료
		sc.close();
		
	}
	
	public void practice15_1() {
		
		// 스캐너 생성
		Scanner sc = new Scanner(System.in);
		
		// 문자열 입력
		System.out.print("문자열 : ");
		String str = sc.nextLine();
		
		// 문자열 길이만큼 배열 할당
		char[] arr = new char[str.length()];
		
		// 문자 개수를 파악할 변수
		int count = 0;
		
		// 문자열 출력
		System.out.print("문자열에 있는 문자 : ");

		// 배열에 값 초기화
		for(int i = 0; i < arr.length; i++) {
			arr[i] = str.charAt(i);
			
			// 중복된 값을 걸러내는 스위치
			boolean flag = true;
			
			// i값과 i-1값까지를 비교해서
			for(int j = 0; j < i; j++) {
				// 중복된 값이 있다면
				if(arr[i] == arr[j]) {
					// 스위치를 끈다
					flag = false;
				}
			}
			// 스위치가 켜져있다면
			if(flag) {
				// 카운트를 하나씩 올리고
				count++;
				// i가 0인 경우에는 값을 그냥 출력하고
				if(i == 0) {
					System.out.print(arr[i]);
				}
				// 나머지 값들은 앞에 ,를 붙이고 출력한다
				else {
					System.out.print(", " + arr[i]);
				}
			}
		}
		// 개행을 해주고
		System.out.println();
		// 중복된 값이 제거된 문자 개수를 출력한다
		System.out.println("문자 개수 : " + count);
		
		// 스캐너 종료
		sc.close();
		
	}
	
	public void practice16_1() {
		
		// 스캐너 생성
		Scanner sc = new Scanner(System.in);
		
		// 배열 크기 정하기
		System.out.print("배열의 크기를 입력하세요 : ");
		int num = sc.nextInt();
		
		sc.nextLine();
		
		// 문자열 배열 선언 및 할당
		String[] origin = new String[num];
		
		// 인덱스 값 초기화
		for(int i = 0; i < origin.length; i++) {
			System.out.print((i + 1) + "번째 문자열 : ");
			origin[i] = sc.nextLine();
		}
		
		
		while(true) {
			// 값을 더 입력할건지 묻고, 입력
			System.out.print("더 값을 입력하시겠습니까?(Y/N) : ");
			char ch = sc.nextLine().charAt(0);
			
			// Y/N로 나누기
			if(ch == 'y' || ch == 'Y') {
				// 몇개를 더 입력할건지 묻고, 입력
				System.out.print("더 입력하고 싶은 개수 : ");
				num = sc.nextInt();
				
				sc.nextLine();
				
				// 복사본 배열 선언 및 할당
				String[] copy = new String[origin.length + num];
				
				// 원본 배열의 인덱스 복사
				copy = Arrays.copyOf(origin, copy.length);
				
				// 추가된 배열만큼 입력
				for(int i = origin.length; i < copy.length; i++) {
					System.out.print((i + 1) + "번째 문자열 : ");
					copy[i] = sc.nextLine();
				}
				
				// 원본 배열에 복사본 배열을 얕은 복사
				origin = copy;
			}
			else if(ch == 'n' || ch == 'N') {
				System.out.print("[");
				for(int i = 0; i < origin.length; i++) {
					if(i == 0) {
						System.out.print(origin[i]);
					}
					else {
						System.out.print(", " + origin[i]);
					}
				}
				System.out.print("]");
				break;
			}
			else {
				System.out.println("잘못 입력하셨습니다.");
			}
		}
		
		// 스캐너 종료
		sc.close();
		
	}

}
