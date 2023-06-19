package com.hw2.run;

import java.util.ArrayList;

import com.hw2.model.vo.Circle;
import com.hw2.model.vo.Point;
import com.hw2.model.vo.Rectangle;

public class ArrayListAndPolymorphismRun {

	public static void main(String[] args) {
		
		ArrayList<Point> list = new ArrayList<>();
		
		list.add(new Circle(1, 2, 3));
		list.add(new Circle(3, 3, 4));
		list.add(new Rectangle(-1, -2, 5, 2));
		list.add(new Rectangle(-2, 5, 2, 8));
		
		for(Point p : list) {
			p.draw();
		}
		
	}

}
