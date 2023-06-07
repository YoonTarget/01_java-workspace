package com.hw1.model.vo;

public class Product {
	
	// 접근제한자를 private으로 설정한다
	private String productId;
	private String productName;
	private String productArea;
	private int price;
	private double tax;
	
	// 기본생성자를 생성한다
	public Product() {
		
	}
	
	// 매개변수를 5개 가진 생성자를 생성한다
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
