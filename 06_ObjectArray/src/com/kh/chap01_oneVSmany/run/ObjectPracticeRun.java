package com.kh.chap01_oneVSmany.run;

import java.util.Scanner;

import com.kh.chap01_oneVSmany.model.vo.BookPractice;

public class ObjectPracticeRun {

	public static void main(String[] args) {
		
		BookPractice book = new BookPractice();
		System.out.println(book);
		
		BookPractice[] books = new BookPractice[3];
		books[0] = new BookPractice();
		books[1] = new BookPractice(null, null, 0, null);
		
		Scanner sc = new Scanner(System.in);
		
		String title = sc.nextLine();
		String author = sc.nextLine();
		int price = sc.nextInt();
		sc.nextLine();
		String publisher = sc.nextLine();
		
		books[2] = new BookPractice(title, author, price, publisher);
		
		for(BookPractice arr : books) {
			System.out.println(arr);
		}
		
		sc.close();

	}

}
