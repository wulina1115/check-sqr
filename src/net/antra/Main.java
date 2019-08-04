package net.antra;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Main {

	public static void main(String[] args) {
		
		Shape square = new Square(10);
		Shape rectangle = new Rectangle(50, 20);
		Shape circle = new Circle(500);
			
		ArrayList<Double> al = new ArrayList<>();
		
		al.add(square.getArea());
		al.add(rectangle.getArea());
		al.add(circle.getArea());
		
		Collections.sort(al);
		
		System.out.println(al);
	}
	
}