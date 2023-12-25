package basi_java;

//InputMismatchException that might occur if the user enters a non-integer value.

//*/

import java.util.InputMismatchException;
import java.util.Scanner;

public class IntegerInputHandler {
  public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      
      try {
          System.out.print("Please enter an integer: ");
//          taking the user input as a integer
          int userInput = scanner.nextInt();
          System.out.println("You entered: " + userInput);
      } catch (InputMismatchException e) {
          System.out.println("Invalid input. Please enter a valid integer.");
      } finally {
          scanner.close();
      }
  }
}

//-------------- OUTPUT --------------
//Please enter an integer: 8232
//You entered: 8232

