package com.deloitte.lab6.ex7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class ArrayUtils {

    public int[] getSorted(int[] arr) {
        
    	List<Integer> reversedNumbers = new ArrayList<>();

        for (int num : arr) {
            int reversedNum = reverseNumber(num);
            reversedNumbers.add(reversedNum);
        }


        Collections.sort(reversedNumbers);

        int[] sortedArray = new int[reversedNumbers.size()];
        for (int i = 0; i < reversedNumbers.size(); i++) {
            sortedArray[i] = reversedNumbers.get(i);
        }

        return sortedArray;
    }

    private int reverseNumber(int num) {
        StringBuilder sb = new StringBuilder(String.valueOf(num));
        return Integer.parseInt(sb.reverse().toString());
    }
}

public class Lab6Ex67 {
	
	public static void main(String[] args) {
        
		Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int size = scanner.nextInt();

        int[] inputArray = new int[size];

        System.out.print("\nEnter the elements of the array:");
        for (int i = 0; i < size; i++) {
            inputArray[i] = scanner.nextInt();
        }

        ArrayUtils arrayUtils = new ArrayUtils();

        int[] sortedArray = arrayUtils.getSorted(inputArray);

        System.out.print("\nSorted array after reversing: ");
        for (int num : sortedArray) {
            System.out.print(num + " ");
        }

        scanner.close();
    }
}
