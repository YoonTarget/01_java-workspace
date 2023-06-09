package com.hw2.model.vo;

public class Rectangle extends Point {

	private int width;
	private int height;
	
	// 기본 생성자
	public Rectangle() {}
	
	// 매개변수 생성자
	public Rectangle(int x, int y, int width, int height) {
		super(x, y);
		this.width = width;
		this.height = height;
	}
	
	// getter - setter
	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	@Override // + 사각형의 면적, 둘레 값을 출력하는 메소드
	public void draw() {
		super.draw();
		System.out.println("면적 : " + width * height);
		System.out.println("둘레 : " + 2 * (width + height));
	}
	
}
