package basi_java;

import java.util.Scanner;

public class IntegerHandlerConversion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        try {
            System.out.print("Please enter an integer: ");
            String userInput = scanner.nextLine();
            
            if (userInput != null && !userInput.isEmpty()) {
                int convertedValue = Integer.parseInt(userInput);
                System.out.println("Converted integer: " + convertedValue);
            } else {
                System.out.println("Input is empty or null. Please enter a valid integer.");
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid input format. Please enter a valid integer.");
        } catch (NullPointerException e) {
            System.out.println("Input is null. Please enter a valid integer.");
        } finally {
            scanner.close();
        }
    }
}

//---------- OUTPUT --------------
//Please enter an integer: 76723
//Converted integer: 76723
