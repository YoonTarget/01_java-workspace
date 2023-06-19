package com.hw1.run;

import java.util.ArrayList;

import com.hw1.model.vo.Employee;

public class ArrayListRun {

	public static void main(String[] args) {
		
		ArrayList<Employee> list = new ArrayList<>();
		
		list.add(new Employee());
		list.add(new Employee(1, "홍길동", 19, 'M', "010-2222-3333", "서울 잠실"));
		list.add(new Employee(2, "강말순", "교육부", "강사", 20, 'F', 1000000, 0.01, "010-1111-2222", "서울 마곡"));
		
		for(Employee e : list) {
			System.out.println(e.information());
		}
		
		System.out.println("===============================================================================");
		
		Employee e0 = list.get(0);
		
		e0.setEmpName("김말똥");
		e0.setDept("영업부");
		e0.setJob("팀장");
		e0.setAge(30);
		e0.setGender('M');
		e0.setSalary(3000000);
		e0.setBonusPoint(0.2);
		e0.setPhone("010-5555-9999");
		e0.setAddress("전라도 광주");
		
		Employee e1 = list.get(1);
		
		e1.setDept("기획부");
		e1.setJob("부장");
		e1.setSalary(4000000);
		e1.setBonusPoint(0.3);
		
		for(Employee e : list) {
			System.out.println(e.information());
		}
		
		System.out.println("===============================================================================");

		int total = 0;
		for(Employee e : list) {
			e.setSalary((int)((e.getSalary() + (e.getSalary() * e.getBonusPoint())) * 12));
			System.out.println(e.getEmpName() + "의 연봉 : " + e.getSalary() + "원");
			total += e.getSalary();
		}
		
		System.out.println("===============================================================================");
		
		System.out.println("직원들의 연봉 평균 : " + (total / list.size() + "원"));
		
	}

}
