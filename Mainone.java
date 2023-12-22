package Inheritance;
class Vehicle {
	  String make;
	  String model;
	  int year;
	  int maximumSpeed;

	 // Constructor
	 public Vehicle(String make, String model, int year, int maximumSpeed) {
	     this.make = make;
	     this.model = model;
	     this.year = year;
	     this.maximumSpeed = maximumSpeed;
	 }

	 // Drive method
	 public void drive() {
	     System.out.println(make + " " + model + " is driving.");
	 }
	 public void display() {
	     System.out.println("Make: " + make);
	     System.out.println("Model: " + model);
	     System.out.println("Year: " + year);
	     System.out.println("Maximum Speed: " + maximumSpeed);
	 }
	}

	// Car subclass
	class Car1 extends Vehicle {

	 public Car1(String make, String model, int year, int maximumSpeed) {
	     super(make, model, year, maximumSpeed);
	 }

	 // Override the drive method for Car
	 @Override
	 public void drive() {
	     System.out.println(make + " " + model + " Car is driving.");
	 }
	}

	//Define the Bike subclass
	class Bike extends Vehicle {
	 // Constructor
	 public Bike(String make, String model, int year, int maximumSpeed) {
	     super(make, model, year, maximumSpeed);
	 }

	 // Override the drive method for Bike
	 @Override
	 public void drive() {
	     System.out.println(make + " " + model + " Bike is driving.");
	 }
	}


public class Mainone {
	 public static void main(String[] args)
	 {
	     // Instances a Car object
	     Car1 car = new Car1("German Automobile", "Mercedes-Benz", 2022, 239);
	     Bike bike = new Bike("Bullte","Royal Enfield Bullet 350" ,2023, 110);

	     // Print attributes of Bike and Chttps://www.carandbike.com/tata-cars/nexon-ev-maxar
	     System.out.println("Car Attributes:");
	     car.display();
	     System.out.println("\nBike Attributes:");
	     bike.display();

	     System.out.println("\nCalling drive method:");
	     car.drive();
	     bike.drive();
	     
	 }
	}




