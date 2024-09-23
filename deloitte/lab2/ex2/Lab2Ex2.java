package com.deloitte.lab2.ex2;

import java.util.Arrays;
import java.util.Scanner;

class StringProcessor {
    
    public static String[] sortStrings(String[] arr) {
        
    	Arrays.sort(arr);

        int mid = arr.length / 2;
        if (arr.length % 2 != 0) {
            mid = (arr.length / 2) + 1;
        }

        for (int i = 0; i < arr.length; i++) {
            if (i < mid) {
                arr[i] = arr[i].toUpperCase();  
            } else {
                arr[i] = arr[i].toLowerCase();  
            }
        }
    
        return arr;
    }
}

public class Lab2Ex2 {
	
	public static void main(String[] args) {
		
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of strings: ");
        int n = scanner.nextInt();
        scanner.nextLine(); 
        
        String[] array = new String[n];

        System.out.println("Enter " + n + " strings:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.next();
        }

        scanner.close();
        
        String[] result = StringProcessor.sortStrings(array);
        System.out.println("Sorted and formatted array: " + Arrays.toString(result));
    }
}