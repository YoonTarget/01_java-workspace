package com.hw2.model.vo;

public class Circle extends Point {

	private int radius;
	
	// 기본 생성자
	public Circle() {}
	
	// 매개변수 생성자
	public Circle(int x, int y, int radius) {
		super(x, y);
		this.radius = radius;
	}
	
	// getter - setter
	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	@Override // + 원의 면적, 둘레 값을 출력하는 메소드
	public void draw() {
		super.draw();
		System.out.printf("면적 : %.1f\n", Math.PI * radius * radius);
		System.out.printf("둘레 : %.1f\n", Math.PI * radius * 2);
	}
	
}
