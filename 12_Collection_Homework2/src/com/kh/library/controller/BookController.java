package com.kh.library.controller;

import java.util.ArrayList;

import com.kh.library.model.vo.Book;
import com.kh.library.model.vo.Magazine;

//BookManager 인터페이스 구현
public class BookController implements BookManager {
	
	private ArrayList<Book> bList = new ArrayList<>();

	@Override
	public void addBook(Book nBook) {
		
		bList.add(nBook);
		
	}

	@Override
	public ArrayList<Book> getAllBook() {
		
		return bList;
		
	}

	@Override
	public Book searchBookBybNo(String bNo) {
		
		Book nBook = null;
		
		for(Book b : bList) {
			if(b.getbNo().equals(bNo)) {
				nBook = b;
			}
		}
		
		return nBook;
	}

	@Override
	public ArrayList<Book> searchBookByTitle(String title) {
		
		ArrayList<Book> searchTitle = new ArrayList<>();
		
		for(Book b : bList) {
			if(b.getTitle().contains(title)) {
				searchTitle.add(b);
			}
		}
		
		return searchTitle;
	}

	@Override
	public ArrayList<Book> onlySearchBook() {
		
		ArrayList<Book> book = new ArrayList<>();
		
		for(Book b : bList) {
			if(b instanceof Magazine == false) {
				book.add(b);
			}
		}
		
		return book;
	}

	@Override
	public ArrayList<Book> onlySearchMagazine() {
		
		ArrayList<Book> magazine = new ArrayList<>();
		
		for(Book b: bList) {
			if(b instanceof Magazine) {
				magazine.add(b);
			}
		}
		
		return magazine;
	}

	@Override
	public ArrayList<Book> magazineOfThisYearInfo(int year) {
		
		ArrayList<Book> searchYear = new ArrayList<>();
		
		ArrayList<Book> magazine = onlySearchMagazine();
		
		for(Book b : magazine) {
			Magazine m = (Magazine)b;
			if(m.getYear() == year) {
				searchYear.add(m);
			}
		}
		
		return searchYear;
	}

	@Override
	public ArrayList<Book> searchBookByPublisher(String publisher) {
		
		ArrayList<Book> searchPublisher = new ArrayList<>();
		
		for(Book b : bList) {
			if(b.getPublisher().contains(publisher)) {
				searchPublisher.add(b);
			}
		}
		
		return searchPublisher;
	}

	@Override
	public ArrayList<Book> searchBookByPrice(int price) {
		
		ArrayList<Book> searchPrice = new ArrayList<>();
		
		for(Book b : bList) {
			if(b.getPrice() < price) {
				searchPrice.add(b);
			}
		}
		
		return searchPrice;
	}

	@Override
	public int getTotalPrice() {
		
		int total = 0;
		for(Book b : bList) {
			total += b.getPrice();
		}
		
		return total;
	}

	@Override
	public int getAvgPrice() {
		
		int average = getTotalPrice() / bList.size();
		
		return average;
	}

}
