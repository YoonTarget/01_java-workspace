package com.kh.chap01_beforeVSafter.before.model.vo;

public class Desktop {
	
	private String brand;		// 브랜드명
	private String pCode;		// 상품코드
	private String pName;		// 상품명
	private int price;			// 상품가격
	private boolean allInOne;	// 일체여부
	
	// 기본생성자
	public Desktop() {}

	// 전체생성자
	public Desktop(String brand, String pCode, String pName, int price, boolean allInOne) {
		this.brand = brand;
		this.pCode = pCode;
		this.pName = pName;
		this.price = price;
		this.allInOne = allInOne;
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
	
	public boolean isAllInOne() {
		return allInOne;
	}
	
	public void setAllInOne(boolean allInOne) {
		this.allInOne = allInOne;
	}
	
	// information()
	public String information() {
		return brand + ", " + pCode + ", " + pName + ", " + price + ", "
				+ allInOne;
	}
	
}
