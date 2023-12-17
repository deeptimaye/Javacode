package basi_java;

import java.util.Scanner;

public class ArraySumAndAverage {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Array size
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        // Input: Array elements
        int[] array = new int[size];
        System.out.println("Enter the elements of the array:");

        for (int i = 0; i < size; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        // Calculate sum and average
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        double average = (double) sum / size;

        // Output
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);

        scanner.close();
    }

}
