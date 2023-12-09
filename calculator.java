package constructor;

public class calculator {

		    // Method to add two integers
		    public int add(int num1, int num2) {
		        return num1 + num2;
		    }

		    // Method to add three integers
		    public int add(int num1, int num2, int num3) {
		        return num1 + num2 + num3;
		    }

		    // Method to add two doubles
		    public double add(double num1, double num2) {
		        return num1 + num2;
		    }

		    public static void main(String args[]) {
		        calculator calc = new calculator();

		        int result1 = calc.add(52, 32);
		        System.out.println("Sum of two numbers: " + result1);

		        int result2 = calc.add(25, 42, 43);
		        System.out.println("Sum of three numbers: " + result2);

		        double result3 = calc.add(5.2, 1.4);
		        System.out.println("Sum of two doubles: " + result3);
		    }
		}
