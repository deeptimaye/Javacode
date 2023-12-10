package constructor;

public class aeroplane {

		    private String make;
		    private String model;
		    private short year;
		    private int price;

		    // Parameterized constructor
		    public aeroplane(String make, String model, short year, int price) {
		        this.make = make;
		        this.model = model;
		        this.year = year;
		        this.price = price;
		    }

		    // Getter methods
		    public String getMake() {
		        return make;
		    }

		    public String getModel() {
		        return model;
		    }

		    public short getYear() {
		        return year;
		    }

		    public int getPrice() {
		        return price;
		    }

		    // Method to display aeroplane details
		    public void display() {
		        System.out.println("Make: " + getMake());
		        System.out.println("Model: " + getModel());
		        System.out.println("Year: " + getYear());
		        System.out.println("Price: " + getPrice());
		    }

		    public static void main(String[] args) {
		        aeroplane obj = new aeroplane("Air India", "Punch", (short) 8, 2400000);
		        obj.display();
		    }
		}
		
	


