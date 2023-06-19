package com.hw1.run;

import java.util.ArrayList;

import com.hw1.model.vo.Product;

public class ArrayListRun {

	public static void main(String[] args) {
		
		ArrayList<Product> list = new ArrayList<>();
		
		list.add(new Product("ssgnote9", "갤럭시노트9", "경기도 수원", 960000, 10.0));
		list.add(new Product("lgxnote5", "LG스마트폰5", "경기도 평택", 780000, 0.7));
		list.add(new Product("ktsnote3", "KT스마트폰3", "서울시 강남", 250000, 0.3));
		
		for(Product p : list) {
			System.out.println(p.information());
		}
		
		System.out.println("===============================================");
		
		int price = 1200000;
		double tax = 0.05;
				
		for(Product p : list) {
			p.setPrice(price);
			p.setTax(tax);
			System.out.println(p.information());
		}

		System.out.println("===============================================");
		
		for(Product p : list) {
			p.setPrice((int)(p.getPrice() + (p.getPrice() * p.getTax())));
			System.out.println("상품명 : " + p.getProductName());
			System.out.println("부가세 포함 가격 : " + p.getPrice() + "원");
		}
		
	}

}
