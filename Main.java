package basi_java;

import java.util.ArrayList;

class Main {
    public static void main(String[] args) {
        // Create an ArrayList of integers
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        numbers.add(7);
        numbers.add(8);

        // Calculate the sum of even numbers
        int sumOfEvens = 0;
        for (int num : numbers) {
            if (num % 2 == 0) {
                sumOfEvens += num;
            }
        }

        // Display the sum of even numbers
        System.out.println("ArrayList of Integers: " + numbers);
        System.out.println("Sum of even numbers: " + sumOfEvens);
    }
}

//---------------------- OUTPUT -----------------------------
//ArrayList of Integers: [1, 2, 3, 4, 5, 6, 7, 8]
//Sum of even numbers: 20
