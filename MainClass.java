package basi_java;

class Vehicle {
	// Base class Vehicle
	 void start() {
	        System.out.println("Vehicle started.");
	    }
	}

	// Subclass Car
	class Car extends Vehicle {
	    @Override
	    void start() {
	        System.out.println("Car started.");
	    }
	}

	// Subclass Motorcycle
	class Motorcycle extends Vehicle {
	    @Override
	    void start() {
	        System.out.println("Motorcycle started.");
	    }
	}

	// Garage class
	class Garage {
	    void serviceVehicle(Vehicle vehicle) {
	        vehicle.start();
	        System.out.println("Vehicle serviced.");
	    }
	}

	// Main class
	public class MainClass  {
	    public static void main(String[] args) {
	        // Create instances of Car and Motorcycle
	        Car car = new Car();
	        Motorcycle motorcycle = new Motorcycle();

	        // Create an instance of the Garage class
	        Garage garage = new Garage();

	        // Call serviceVehicle() method with instances of Car and Motorcycle
	        garage.serviceVehicle(car);
	        // Output: Car started. Vehicle serviced.

	        garage.serviceVehicle(motorcycle);
	        // Output: Motorcycle started. Vehicle serviced.
	    }
}
