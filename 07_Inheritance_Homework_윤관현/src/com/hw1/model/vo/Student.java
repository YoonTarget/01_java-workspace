package com.hw1.model.vo;

public class Student extends Person {
	
	private int grade;		// 학년
	private String major;	// 전공
	
	// 기본 생성자
	public Student() {}
	
	// 매개변수 생성자
	public Student(String name, int age, double height, double weight,
			int grade, String major) {
		super(age, height, weight);
		super.name = name;
		this.grade = grade;
		this.major = major;
	}
	
	// getter - setter
	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}
	
	// toString
	@Override
	public String toString() {
		return  "이름 : " + name + super.toString() + ", 학년 : " + grade
				+ ", 전공 : " + major;
	}

}
