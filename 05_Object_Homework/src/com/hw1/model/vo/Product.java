package com.hw1.model.vo;

public class Product {
	
	// 필드부
	// 접근제한자를 private으로 설정한다
	private String productId;		// 상품아이디
	private String productName;		// 상품명
	private String productArea;		// 생산지
	private int price;				// 가격
	private double tax;				// 부가세
	
	// 생성자부 (기본 + 전체)
	// 기본생성자를 생성한다
	public Product() {
		
	}
	
	// 매개변수를 5개 가진 생성자(전체생성자)를 생성한다
	public Product(String productId, String productName, String productArea, int price, double tax) {
		this.productId = productId;
		this.productName = productName;
		this.productArea = productArea;
		this.price = price;
		this.tax = tax;
	}
	
	// 필드 값을 한 번에 확인할 수 있는 information() 메소드를 생성한다
	public String information() {
		return productId + " " + productName + " " + productArea + " " 
	+ price + " " + tax;
				
	}
	
	// 메소드부
	// get - set => 한 세트로 작성
	// 각각의 필드에 해당하는 setter() 메소드를 생성한다
	public void setProductId(String productId) {
		this.productId = productId;
	}
	
	// 각각의 필드에 해당하는 getter() 메소드를 생성한다
	public String getProductId() {
		return productId;
	}
	
	public void setProductName(String productName) {
		this.productName = productName;
	}
	
	public String getProductName() {
		return productName;
	}
	
	public void setProductArea(String productArea) {
		this.productArea = productArea;
	}
	
	public String getProductArea() {
		return productArea;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public int getPrice() {
		return price;
	}
	
	public void setTax(double tax) {
		this.tax = tax;
	}
	
	public double getTax() {
		return tax;
	}

}
