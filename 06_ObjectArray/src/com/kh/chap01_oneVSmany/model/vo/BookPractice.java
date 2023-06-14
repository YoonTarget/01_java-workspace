package com.kh.chap01_oneVSmany.model.vo;

public class BookPractice {
	
	// 필드부
	// 도서명, 저자, 가격, 출판사
	private String title = "자바의 정석";
	private String author = "";
	private int price;
	private String publisher;
	
	// 생성자
	// 기본생성자
	public BookPractice() {
		
	}
	
	// 전체 매개변수 생성자
	public BookPractice(String title, String author, int price, String publisher) {
		this.title = title;
		this.author = author;
		this.price = price;
		this.publisher = publisher;
	}
	
	// 메소드부
	// getter - setter
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getAuthor() {
		return author;
	}
	
	public void setAuthor(String author) {
		this.author = author;
	}
	
	public int getPrice() {
		return price;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public String getPublisher() {
		return publisher;
	}
	
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	
	@Override
	public String toString() {
		return "BookPractice [title=" + title + ", author=" + author + ", price=" + price + ", publisher="
				+ publisher + "]";
	}

}
