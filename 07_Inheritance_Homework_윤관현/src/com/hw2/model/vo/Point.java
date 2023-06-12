package com.hw2.model.vo;

public class Point {
	
	private int x;
	private int y;
	
	// 기본 생성자
	public Point() {}
	
	// 매개변수 생성자
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	// getter - setter
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	// x, y 좌표 값을 출력하는 메소드
	public void draw() {
		System.out.println("x : " + x);
		System.out.println("y : " + y);
	}

}
