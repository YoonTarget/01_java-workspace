package com.kh.chap01_beforeVSafter.before.model.vo;

public class SmartPhone {
	
	private String brand;			// 브랜드명
	private String pCode;			// 상품코드
	private String pName;			// 상품명
	private int price;				// 상품가격
	private String mobileAgency;	// 통신사
	
	// 기본생성자
	public SmartPhone() {}

	// 전체생성자
	public SmartPhone(String brand, String pCode, String pName, int price, String mobileAgency) {
		this.brand = brand;
		this.pCode = pCode;
		this.pName = pName;
		this.price = price;
		this.mobileAgency = mobileAgency;
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
	
	public String getMobileAgency() {
		return mobileAgency;
	}
	
	public void setMobileAgency(String mobileAgency) {
		this.mobileAgency = mobileAgency;
	}
	
	// information()
	public String information() {
		return brand + ", " + pCode + ", " + pName + ", " + price + ", "
				+ mobileAgency;
	}

}
