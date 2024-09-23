package com.deloitte.lab2.ex4;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.Collections;

class ArrayModifier {

    public static int[] modifyArray(int[] arr) {
        
    	Set<Integer> uniqueElements = new LinkedHashSet<>();

        for (int num : arr) {
            uniqueElements.add(num);
        }

        Integer[] uniqueArray = uniqueElements.toArray(new Integer[0]);

        Arrays.sort(uniqueArray, Collections.reverseOrder());

        return Arrays.stream(uniqueArray).mapToInt(Integer::intValue).toArray();
    }
}

public class Lab2Ex4 {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        int[] array = new int[n];

        System.out.print("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        scanner.close();

        int[] result = ArrayModifier.modifyArray(array);
        System.out.println("\nArray after removing duplicates and sorting in descending order: " + Arrays.toString(result));
    }
}