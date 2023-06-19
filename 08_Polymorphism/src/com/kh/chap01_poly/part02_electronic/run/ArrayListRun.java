package com.kh.chap01_poly.part02_electronic.run;

import java.util.ArrayList;

import com.kh.chap01_poly.part02_electronic.model.vo.Desktop;
import com.kh.chap01_poly.part02_electronic.model.vo.Electronic;
import com.kh.chap01_poly.part02_electronic.model.vo.NoteBook;
import com.kh.chap01_poly.part02_electronic.model.vo.Tablet;

public class ArrayListRun {

	public static void main(String[] args) {
		
		ArrayList<Electronic> list = new ArrayList<>();
		
		list.add(new Desktop("삼성", "데땁", 1200000, "gtx1070"));
		list.add(new NoteBook("엘지", "그램", 2000000, 4));
		list.add(new Tablet("애플", "아이패드", 800000, false));
		
//		Electronic e = list.get(0);
//		NoteBook n = (NoteBook)list.get(1);
//		list.get(2);
//		
//		System.out.println(e);
//		System.out.println(n);
//		System.out.println(list.get(2));
		
		for(Electronic e : list) {
			System.out.println(e);
		}
		
		ArrayList<Desktop> list2 = new ArrayList<>();
		
		list2.add(new Desktop("LG", "LED TV", 2000000, "good"));
		
		Electronic d = list2.get(0);
		
		System.out.println(d);

	}

}
