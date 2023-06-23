package com.kh.scoreOutput.school;

import java.util.ArrayList;
//import utils.Define;

public class Subject {
	
	private String subjectName;	 // 과목 이름
	private int subjectId;		 // 과목 고유 번호
	private int gradeType;		 // 학점 평가 정책
	
	private ArrayList<Student> studentList = new ArrayList<>();
	
	public Subject() {}

	public Subject(String subjectName, int subjectId) {
		super();
		this.subjectName = subjectName;
		this.subjectId = subjectId;
		//this.gradeType = Define.AB_TYPE;
	}

	public String getSubjectName() {
		return subjectName;
	}

	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}

	public int getSubjectId() {
		return subjectId;
	}

	public void setSubjectId(int subjectId) {
		this.subjectId = subjectId;
	}

	public int getGradeType() {
		return gradeType;
	}

	public void setGradeType(int gradeType) {
		this.gradeType = gradeType;
	}

	public ArrayList<Student> getStudentList() {
		return studentList;
	}

	public void setStudentList(ArrayList<Student> studentList) {
		this.studentList = studentList;
	}
	
	public void register(Student student) {
		studentList.add(student);
	}
	
}
