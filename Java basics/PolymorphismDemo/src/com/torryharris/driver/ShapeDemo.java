package com.torryharris.driver;

import com.torryharris.model.Rectangle;
import com.torryharris.model.Shape;
import com.torryharris.model.Triangle;

public class ShapeDemo {

	public static void main(String[] args) {
		
		Triangle triangle = new Triangle(10, 20);
		System.out.println("Area of Triangle: "+triangle.getArea());
		triangle.display();
		
		Rectangle rectangle = new Rectangle(10, 20);
		System.out.println("Area of Rectangle :"+rectangle.getArea());
		System.out.println();
		
		Shape shape = new Triangle(10,10);
		System.out.println("Area of Triangle: "+shape.getArea());
		
		shape=new Rectangle(10,10);
		System.out.println("Area of Rectangle :"+shape.getArea());
		
	}

}
