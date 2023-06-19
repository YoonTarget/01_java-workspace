package com.hw1.run;

import java.util.ArrayList;
import java.util.Scanner;

import com.hw1.model.vo.Employee;
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
		
		ArrayList<Person> list2 = new ArrayList<>();
		
		Scanner sc = new Scanner(System.in);
		
		int count = 0;
		while(count < 3) {
			
//			if(count == 3) {
//				System.out.println(count + "명의 사원 정보가 모두 기록되었습니다.");
//				break;
//			}
			
			System.out.println(count + 1 + "번째 사원의 정보를 입력해 주세요.");
			
			System.out.print("이름 : ");
			String name = sc.nextLine();
			
			System.out.print("나이 : ");
			int age = sc.nextInt();
			
			System.out.print("신장 : ");
			double height = sc.nextDouble();
			
			System.out.print("몸무게 : ");
			double weight = sc.nextDouble();
			
			System.out.print("급여 : ");
			int salary = sc.nextInt();
			
			sc.nextLine();
			
			System.out.print("부서 : ");
			String dept = sc.nextLine();
			
			list2.add(new Employee(name, age, height, weight, salary, dept));
			
			count++;
			
		}
		
		for(Person p : list2) {
			System.out.println(p);
		}
		
		sc.close();
		
	}

}
