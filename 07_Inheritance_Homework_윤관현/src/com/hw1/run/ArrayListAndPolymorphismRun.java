package com.hw1.run;

import java.util.ArrayList;

import com.hw1.model.vo.Person;
import com.hw1.model.vo.Student;

public class ArrayListAndPolymorphismRun {

	public static void main(String[] args) {
		
		ArrayList<Person> list = new ArrayList<>();
		
		list.add(new Student("홍길동", 20, 178.2, 70, 1, "정보시스템공학과"));
		list.add(new Student("김말똥", 21, 187.3, 80, 2, "경영학과"));
		list.add(new Student("강개순", 23, 167, 45, 4, "정보통신공학과"));

		for(Person p : list) {
			System.out.println(p);
		}
		
		System.out.println("===========================================================================");
		
		list.add(new Student("강개순", 23, 167, 45, 4, "정보통신공학과"));
		
	}

}
