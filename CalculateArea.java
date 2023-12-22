package Inheritance;


class Shape {
	 // Method to get the area will be overridden by subclasses
	 public double getArea() {
	     return 0.0;
	 }
	}

	//Subclass Circle
	class Circle extends Shape {
	 private int radius;

	 // Constructor for Circle
	 public Circle(int radius) {
	     this.radius = radius;
	 }

	 // Override getArea method for Circle
	 @Override
	 public double getArea() {
	     return Math.PI * radius * radius;
	 }
	}

	//Subclass Square
	class Square extends Shape {
	 private int length;

	 // Constructor for Square
	 public Square(int length) {
	     this.length = length;
	 }

	 // Override getArea method for Square
	 @Override
	 public double getArea() {
	     return length * length;
	 }
	}

	//Subclass Rectangle
	class Rectangle extends Shape {
	 private int width;
	 private int height;

	 // Constructor for Rectangle
	 public Rectangle(int width, int height) {
	     this.width = width;
	     this.height = height;
	 }

	 // Override getArea method for Rectangle
	 @Override
	 public double getArea() {
	     return width * height;
	 }
	}

	public class CalculateArea {
	 public static void main(String[] args) {
	     // Instantiate objects of different shapes
	     Circle circle = new Circle(3);
	     Square square = new Square(2);
	     Rectangle rectangle = new Rectangle(2, 3);

	     // Calculate and print the area of each shape
	     System.out.println("Area of Circle: " + circle.getArea());
	     System.out.println("Area of Square: " + square.getArea());
	     System.out.println("Area of Rectangle: " + rectangle.getArea());
	 }
	}





