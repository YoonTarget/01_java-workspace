package com.hw1.model.vo;

public class Person {
	
	protected String name;	// 이름
	private int age;		// 나이
	private double height;	// 신장
	private double weight;	// 몸무게
	
	// 기본 생성자
	public Person() {}
	
	// 매개변수 생성자
	public Person(int age, double height, double weight) {
		this.age = age;
		this.height = height;
		this.weight = weight;
	}
	
	// getter - setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	// toString
	@Override
	public String toString() {
		return ", 나이 : " + age + ", 신장 : " + height + ", 몸무게 : " + weight;
	}

}
