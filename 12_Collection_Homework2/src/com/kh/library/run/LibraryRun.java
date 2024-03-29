package com.kh.library.run;

import java.util.ArrayList;
import java.util.Scanner;

import com.kh.library.controller.BookController;
import com.kh.library.model.vo.Book;
import com.kh.library.model.vo.Magazine;

public class LibraryRun {

	public static void main(String[] args) {// 소장책 DB
		
		/* printBooks() 메소드에 static을 붙이기 싫다면
		LibraryRun r = new LibraryRun();
		r.printBooks(bList);
		*/
		
		ArrayList<Book> bList = new ArrayList<>();
		
		bList.add(new Book("100", "잃어버린 주원이를 찾아서", "저자 고경원", "상호 출판사", 8500, "『유정스』, 『르 몽드』 선정 20세기 최고의 책"));
		bList.add(new Book("101", "현우의 자서전", "지완이가 옮김", "빛나는 현수출판사", 8500, "영화배우 민병진이 추천한 젊음에 바치는 영혼의 자서전"));
		bList.add(new Magazine("102", "박경훈 과학동아", "편집부 박용진 선생", "혜수 사이언스", 8500, "관우의 유튜브에 소개된 과학만화 잡지", 2023,3));
		bList.add(new Book("103", "관현이의 코딩스쿨", "코딩천재 윤재성", "정묵이네 동네", 9900, "제 13회 래언이가 주는 문학상 수상작"));
		bList.add(new Magazine("104", "수진이와 지영이의 여행일기", "서울대 이승준 교수", "시연21", 3800, "영화감독 이원종pd가 집필한 영화 전문 잡지", 2023, 4));
		bList.add(new Magazine("105", "호연이의 OOTD", "인플루언서 장희주", "유리네 책방", 12000, "핫가이 조대현의 샤라웃을 받은 잡지", 2022,11));
		bList.add(new Book("106", "조준하의 미라클모닝", "샤이걸 성윤찡", "연우 출판사", 6300, "용석이도 2번이나 성공한 미라클모닝"));
		bList.add(new Book("107", "민정이의 백만가지 요리레시피", "제주도에서 온 상원이", "우리반 출판사", 6300, "제주에서 밥해먹고 사는 일상"));
		
		printBooks(bList);

	}

	public static void printBooks(ArrayList<Book> bs) {
		// 여기서 메뉴열고 구현 시작
		BookController bc = new BookController();
		
		for(Book nBook : bs) {
			System.out.println(nBook);
			bc.addBook(nBook);
		}

		boolean flag = true; // 메뉴 스위치

		while (flag == true) { // 메뉴 스위치가 켜져있는 동안 무한반복
			System.out.println("===============================");
			System.out.println("KH 우리반전용 도서관 관리 페이지입니다.");
			System.out.println("1. 조회하기");
			System.out.println("2. 추가하기");
			System.out.println("3. 책 찾기");
			System.out.println("4. 전체 책 가격 합계 및 평균 조회");
			System.out.println("5. 프로그램 종료");
			System.out.println("===============================");

			Scanner sc = new Scanner(System.in);
			System.out.print("메뉴번호를 입력해주세요 : ");
			int menu = sc.nextInt(); // 메뉴 번호 입력
			
			sc.nextLine();
			
			switch (menu) {
			case 1: // 1. 조회하기
				System.out.println("===============================");
				System.out.println("어떤 방법으로 책을 조회하겠습니까?");
				System.out.println("1. 도서관 전체 소장책 조회하기");
				System.out.println("2. 일반도서만 조회하기(잡지 제외)");
				System.out.println("3. 잡지만 조회하기(일반도서 제외)");
				System.out.println("4. 이전으로");
				System.out.println("===============================");

				System.out.print("메뉴번호를 입력해주세요 : ");
				int search = sc.nextInt();
				sc.nextLine();
				
				if (search == 1) {
					ArrayList<Book> bList = bc.getAllBook();
					for(Book b : bList) {
						System.out.println(b);
					}
				}
				else if (search == 2) {
					ArrayList<Book> book = bc.onlySearchBook();
					for(Book b : book) {
						System.out.println(b);
					}
				}
				else if (search == 3) {
					ArrayList<Book> magazine = bc.onlySearchMagazine();
					for(Book b : magazine) {
						System.out.println(b);
					}
				}
				else if (search == 4) {
					// 이전으로 가야함
					continue;
				}
				break;
				
			case 2: // 2. 추가하기
				System.out.print("bNo을 입력하세요 : ");
				String bNo = sc.nextLine();
				
				System.out.print("책 제목을 입력하세요 : ");
				String title = sc.nextLine();
				
				System.out.print("작가를 입력하세요 : ");
				String author = sc.nextLine();
				
				System.out.print("출판사를 입력하세요 : ");
				String publisher = sc.nextLine();
				
				System.out.print("가격을 입력하세요 : ");
				int price = sc.nextInt();
				
				sc.nextLine();
				
				System.out.print("간단한 설명을 입력하세요 : ");
				String description = sc.nextLine();
				
				System.out.print("일반도서이면 true, 잡지이면 false를 입력하세요 : ");
				Boolean bkOrMaga = sc.nextBoolean();
				
				Book nBook = null;
				
				if (bkOrMaga.equals(true)) { // 일반도서
					
					nBook = new Book(bNo, title, author, publisher, price, description);
				
				} else if (bkOrMaga.equals(false)) { // 잡지
					
					System.out.print("출간연도를 입력하세요 : ");
					int year = sc.nextInt();
					
					System.out.print("출간월을 입력하세요 : ");
					int month = sc.nextInt();
					
					nBook = new Magazine(bNo, title, author, publisher, price, description, year, month);
				
				}
				
				/*
				int result = 0;
				ArrayList<Book> checkOutBook = bc.getAllBook();
				
				for(Book b : checkOutBook) {
					if(b.getbNo().equals(bNo)) {
						System.out.println("해당 도서는 이미 소장하고 있는 책입니다.");
						result = 1;
						break;
					}
				}
				
				if(result == 0) {
					bc.addBook(nBook);
					System.out.println("도서가 성공적으로 추가되었습니다.");
					
					ArrayList<Book> bList = bc.getAllBook();
					
					for(Book b : bList) {
						System.out.println(b);
					}
				}
				break;
				*/
				
				Book bk = bc.searchBookBybNo(bNo);
				
				if(bk == null) {
					bc.addBook(nBook);
					System.out.println("도서가 성공적으로 추가되었습니다.");
					
					ArrayList<Book> bList = bc.getAllBook();
					
					for(Book b : bList) {
						System.out.println(b);
					}
				}
				else {
					System.out.println("이미 소장중인 도서입니다.");
				}
				break;
				
			case 3:// 3. 책 찾기
				System.out.println("===============================");
				System.out.println("어떤 방법으로 책을 찾겠습니까?");
				System.out.println("1. bNo으로 책 찾기");
				System.out.println("2. 책 제목으로 책 찾기");
				System.out.println("3. 출간연도로 잡지 찾기");
				System.out.println("4. 출판사로 책 찾기");
				System.out.println("5. 특정 가격 밑으로 책 찾기");
				System.out.println("6. 이전으로");
				System.out.println("===============================");
				System.out.print("메뉴번호를 입력해주세요 : ");
				search = sc.nextInt();
				sc.nextLine();

				if (search == 1) { // bNo으로 책 찾기
					System.out.print("bNo을 입력하세요 : ");
					bNo = sc.nextLine();
					
					System.out.println("=========== 검색 결과 ===========");
					
					Book b = bc.searchBookBybNo(bNo);

					if(b == null) {
						System.out.println("조회된 도서가 없습니다.");
					}
					else {
						System.out.println(b);
					}
					
				} else if (search == 2) { // 책 제목으로 책 찾기
					System.out.print("책 제목을 입력하세요 : ");
					title = sc.nextLine();
					
					System.out.println("=========== 검색 결과 ===========");
					
					ArrayList<Book> searchTitle = bc.searchBookByTitle(title);
					
					// isEmpty()는 해당 리스트에 아무 값도 없을 때 true를 반환해주는 boolean형 메소드이다. 잘 기억해두자!!
					if(searchTitle.isEmpty()) { 
						System.out.println("조회된 도서가 없습니다.");
					}
					else {
						for(Book b : searchTitle) {
							System.out.println(b);
						}
					}
					
				} else if (search == 3) { // 출간연도로 잡지 찾기
					System.out.print("출간연도를 입력하세요 : (올해 --> 2022) : ");
					int year = sc.nextInt();
					
					System.out.println("=========== 검색 결과 ===========");
					
					ArrayList<Book> searchYear = bc.magazineOfThisYearInfo(year);
					
					if(searchYear.isEmpty()) {
						System.out.println("조회된 도서가 없습니다.");
					}
					else {
						for(Book b : searchYear) {
							System.out.println(b);
						}
					}
					
				} else if (search == 4) { // 4. 출판사로 책 찾기
					System.out.print("출판사를 입력하세요 : ");
					publisher = sc.nextLine();

					System.out.println("=========== 검색 결과 ===========");
					
					ArrayList<Book> searchPublisher = bc.searchBookByPublisher(publisher);
					
					if(searchPublisher.isEmpty()) {
						System.out.println("조회된 도서가 없습니다.");
					}
					else {
						for(Book b : searchPublisher) {
							System.out.println(b);
						}
					}
					
				} else if (search == 5) { // 5. 특정 가격 밑으로 책 찾기
					System.out.print("가격을 입력하세요 : ");
					price = sc.nextInt();
					sc.nextLine();
					
					System.out.println("=========== 검색 결과 ===========");
					
					ArrayList<Book> searchPrice = bc.searchBookByPrice(price);
					
					if(searchPrice.isEmpty()) {
						System.out.println("조회된 도서가 없습니다.");
					}
					else {
						for(Book b : searchPrice) {
							System.out.println(b);
						}
					}
					
				} else if (search == 6) {
					flag = true; // 6. 이전으로
				} else {
					System.out.println("잘못 입력하셨습니다.");
				}
				break;
				
			case 4:// 4. 전체책 가격 합계 및 평균 조회
				System.out.println("전체 책 가격 합계 : " + bc.getTotalPrice() + "원");
				System.out.println("전체 책 가격 평균 : " + bc.getAvgPrice() + "원");
				break;
				
			case 5: 
				System.out.println("프로그램을 종료합니다");
				return;
				
			default:
				break;
			}
		}
	}
}
