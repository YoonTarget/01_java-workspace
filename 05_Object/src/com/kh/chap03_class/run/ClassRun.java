package com.kh.chap03_class.run;

import com.kh.chap03_class.model.vo.Product;

public class ClassRun {

	public static void main(String[] args) {
		
		Product shoes = new Product();
		shoes.setPName("Air Jordan");
		shoes.setPrice(200000);
		shoes.setBrand("Nike");
		
		System.out.println("=== 상품 1 ===");
		System.out.println("제품명 : " + shoes.getPName());
		System.out.println("가격 : " + shoes.getPrice() + "원");
		System.out.println("브랜드 : " + shoes.getBrand());
		System.out.println();
		
		Product cap = new Product();
		cap.setPName("Orange Cap");
		cap.setPrice(100000);
		cap.setBrand("Polo");
		
		System.out.println("=== 상품 2 ===");
		System.out.println("제품명 : " + cap.getPName());
		System.out.println("가격 : " + cap.getPrice() + "원");
		System.out.println("브랜드 : " + cap.getBrand());
		System.out.println();
		
		Product shirt = new Product();
		shirt.setPName("Sweat Shirt");
		shirt.setPrice(50000);
		shirt.setBrand("Covernat");
		
		System.out.println("=== 상품 3 ===");
		System.out.println("제품명 : " + shirt.getPName());
		System.out.println("가격 : " + shirt.getPrice() + "원");
		System.out.println("브랜드 : " + shirt.getBrand());

	}

}
