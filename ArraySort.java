package basi_java;

import java.util.Arrays;

public class ArraySort {
	public static void main(String[] args) {
        // Input: Array elements
        int[] array = {8, 4, 7, 9, 7, 1};

        // Sorting using Arrays.sort()
        Arrays.sort(array);

        // Output
        System.out.println("Sorted Array: " + Arrays.toString(array));
    }
}

