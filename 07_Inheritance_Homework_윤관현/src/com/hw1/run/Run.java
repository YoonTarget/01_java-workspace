package com.hw1.run;

import java.util.Scanner;

import com.hw1.model.vo.Employee;
import com.hw1.model.vo.Student;

public class Run {

	public static void main(String[] args) {
		// 3명의 학생 정보를 기록할 수 있게 객체 배열 할당 (Student[])
		Student[] s = new Student[3];
		
		// 위의 사용 데이터 참고하여 3명의 학생 정보 초기화
		s[0] = new Student("홍길동", 20, 178.2, 70, 1, "정보시스템공학과");
		
		s[1] = new Student("김말똥", 21, 187.3, 80, 2, "경영학과");
		
		s[2] = new Student("강개순", 23, 167, 45, 4, "정보통신공학과");
		
		// 위의 학생 정보 모두 출력
		for(int i = 0; i < s.length; i++) {
			System.out.println(s[i]);
		}
		
		System.out.println("==============================================================================");
		
		// 최대 10명의 사원 정보를 기록할 수 있게 배열을 할당 (Employee[])
		Employee[] e = new Employee[10];
		
		// 사원들의 정보를 키보드로 계속 입력 받고 → while(true) 무한 반복문을 통해
		// 입력받은 정보들을 가지고 매개변수 생성자를 이용하여 객체 배열에 객체 생성
		Scanner sc = new Scanner(System.in);
		
		int count = 0;
		
		while(true) {
			System.out.println((count + 1) + "번째 사원의 정보를 입력해 주세요.");
			
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
			
			e[count] = new Employee(name, age, height, weight, salary, dept);
			
			// 한명씩 추가 될때마다 카운트함
			count++;
			
			// 10명의 정보가 모두 입력됐다면 입력을 종료
			if(count == e.length) {
				System.out.println(count + "명의 사원 정보가 모두 기록되었습니다.");
				break;
			}
			
			boolean flag = true;
			
			while(true) {
				// 계속 추가할 것인지 물어보고, 대소문자 상관없이 y이면 계속 객체 추가
				System.out.print("더 입력하시겠습니까? : ");
				char answer = sc.nextLine().charAt(0);
				
				if(answer == 'Y' || answer == 'y') {
					break;
				}
				// ‘n’일 경우 더 이상 그만 입력 받도록 …
				else if(answer == 'N' || answer == 'n') {
					System.out.println(count + "명의 사원 정보를 출력합니다.");
					flag = false;
					break;
				}
				else {
					System.out.println("다시 입력해 주세요.");
				}
			}
			if(flag == false) {
				break;
			}
		}
		
		// 배열에 담긴 사원들의 정보를 모두 출력
		for(int i = 0; i < count; i++) {
			System.out.println(e[i]);
		}
		
		sc.close();

	}

}
