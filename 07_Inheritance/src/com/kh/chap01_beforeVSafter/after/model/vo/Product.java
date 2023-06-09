package com.kh.chap01_beforeVSafter.after.model.vo;

public class Product {
	
	// 세 클래스 모두 공통적으로 가지고 있는 요소들 (필드, 메소드) 만을 기술
	
	private String brand;		// 브랜드명
	private String pCode;		// 상품코드
	private String pName;		// 상품명
	private int price;			// 상품가격
	
	// 기본생성자
	public Product() {}
	
	// 전체생성자
	public Product(String brand, String pCode, String pName, int price) {
		this.brand = brand;
		this.pCode = pCode;
		this.pName = pName;
		this.price = price;
	}

	
	// getter - setter
	public String getBrand() {
		return brand;
	}
	
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	public String getpCode() {
		return pCode;
	}
	
	public void setpCode(String pCode) {
		this.pCode = pCode;
	}
	
	public String getpName() {
		return pName;
	}
	
	public void setpName(String pName) {
		this.pName = pName;
	}
	
	public int getPrice() {
		return price;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	// information
	public String information() {
		return "brand : " + brand + ", pCode : " + pCode + ", pName : " + pName + ", price : " + price;
	}
	
}
