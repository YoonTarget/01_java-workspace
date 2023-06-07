package com.kh.chap03_class.run;

import com.kh.chap03_class.model.vo.Person;
import com.kh.chap03_class.model.vo.Product;

public class ClassRun {

	public static void main(String[] args) {
		
		Product shoes = new Product();
		shoes.setpName("Air Jordan");
		shoes.setPrice(200000);
		shoes.setBrand("Nike");
		
		System.out.println("=== 상품 1 ===");
		System.out.println("제품명 : " + shoes.getpName());
		System.out.println("가격 : " + shoes.getPrice() + "원");
		System.out.println("브랜드 : " + shoes.getBrand());
		System.out.println();
		
		Product cap = new Product();
		cap.setpName("Orange Cap");
		cap.setPrice(100000);
		cap.setBrand("Polo");
		
		System.out.println("=== 상품 2 ===");
		System.out.println("제품명 : " + cap.getpName());
		System.out.println("가격 : " + cap.getPrice() + "원");
		System.out.println("브랜드 : " + cap.getBrand());
		System.out.println();
		
		Product shirt = new Product();
		shirt.setpName("Sweat Shirt");
		shirt.setPrice(50000);
		shirt.setBrand("Covernat");
		
		System.out.println("=== 상품 3 ===");
		System.out.println("제품명 : " + shirt.getpName());
		System.out.println("가격 : " + shirt.getPrice() + "원");
		System.out.println("브랜드 : " + shirt.getBrand());
		
		System.out.println("=== 메소드 만들고 난 후 ===");
		System.out.println(shoes.information());
		System.out.println(cap.information());
		
		Person p = new Person();
		
		System.out.println(p.getId());
		System.out.println(p.getAge());
		System.out.println(p.getGender());
		
		// 생성 후에 필드에 담긴 값을 곧바로 알아보면
		// JVM이 초기화(값 세팅)까지 진행해줬음!!
		
		p.setId("user01");
		p.setPwd("pwd01");
		p.setName("윤관현");
		p.setAge(29);
		p.setGender('M');
		p.setPhone("010-1234-5678");
		p.setEmail("asd123@gmail.com");
		
		System.out.println("=== 값 대입 후 ===");
		System.out.println(p.getId());
		System.out.println(p.getPwd());
		System.out.println(p.getName());
		System.out.println(p.getAge());
		System.out.println(p.getGender());
		System.out.println(p.getPhone());
		System.out.println(p.getEmail());
		
		System.out.println("=== 메소드 작성 후 ===");
		System.out.println(p.information());
		
	}

}
