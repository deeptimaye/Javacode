package basi_java;


//Abstract class Shape
abstract class MainShape {
//Abstract method to calculate area
public abstract double calculateArea();
}

//Subclass Circle
class circle extends MainShape {
//Fields
private double radius;

//Constructor
public void Circle(double radius) {
 this.radius = radius;
}

//Override calculateArea() for Circle
@Override
public double calculateArea() {
 return Math.PI * radius * radius;
}
}

//Subclass Rectangle
class rectangle extends MainShape {
//Fields
private double width;
private double height;

//Constructor
public void Rectangle(double width, double height) {
 this.width = width;
 this.height = height;
}

//Override calculateArea() for Rectangle
@Override
public double calculateArea() {
 return width * height;
}
}

//Main class
public class MainShape {
public static void main(String[] args) {
 // Create Circle object
 Circle circle = new Circle(5);
 System.out.println("Area of Circle: " + circle.calculateArea());

 // Create Rectangle object
 Rectangle rectangle = new Rectangle(4, 6);
 System.out.println("Area of Rectangle: " + rectangle.calculateArea());
}
}


