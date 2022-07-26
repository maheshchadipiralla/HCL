package com.FactoryPattern.DesignPattern;

import java.util.Scanner;

public class FactoryPatternDemo {

	public static void main(String[] args) {
		ShapeFactory shapeFactory = new ShapeFactory();
		Scanner sc = new Scanner(System.in);
		Shape shape1 = shapeFactory.getShape(sc.next());
		Shape shape2 = shapeFactory.getShape(sc.next());
		Shape shape3 = shapeFactory.getShape(sc.next());
		sc.close();
		shape1.draw();
		shape2.draw();
		shape3.draw();

	}

}
