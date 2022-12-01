package com.FactoryPattern.DesignPattern;


public class FactoryPatternDemo {

	public static void main(String[] args) {
		ShapeFactory shapeFactory = new ShapeFactory();
		Shape shape1 = shapeFactory.getShape("circle");
		Shape shape2 = shapeFactory.getShape("rectangle");
		Shape shape3 = shapeFactory.getShape("triangle");
		shape1.draw();
		shape2.draw();
		shape3.draw();

	}

}
