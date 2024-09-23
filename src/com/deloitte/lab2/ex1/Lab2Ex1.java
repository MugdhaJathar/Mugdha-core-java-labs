package com.deloitte.lab2.ex1;

import java.util.Arrays;
import java.util.Scanner;

class ArrayProcessor {

    public static int getSecondSmallest(int[] arr) {
    	if (arr == null || arr.length < 2) {
            throw new IllegalArgumentException("Array must contain at least two elements");
        }
        
        Arrays.sort(arr);
        
        return arr[1];
    }
}

public class Lab2Ex1 {
    
	@SuppressWarnings("resource")
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        if (n < 2) {
            System.out.println("The array must have at least two elements.");
            return;
        }

        int[] array = new int[n];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        scanner.close();

        int secondSmallest = ArrayProcessor.getSecondSmallest(array);
        System.out.println("The second smallest element is: " + secondSmallest);
    }
}