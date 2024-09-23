package com.deloitte.lab2.ex3;

import java.util.Arrays;
import java.util.Scanner;

class ArrayProcessor {

    public static int reverseNumber(int num) {
        StringBuilder sb = new StringBuilder(String.valueOf(num));
        sb.reverse();
        return Integer.parseInt(sb.toString());
    }

    public static int[] getSorted(int[] arr) {
        int[] reversedArr = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            reversedArr[i] = reverseNumber(arr[i]);
        }

        Arrays.sort(reversedArr);
        return reversedArr;
    }

    public static void sortedArray(int[] arr) {
        Arrays.sort(arr);
        System.out.print("\nSorted array: " + Arrays.toString(arr));
    }

    public static void reversedSortedArray(int[] arr) {
        int size = arr.length;
        Integer[] revArr = new Integer[size];

        for (int i = 0; i < size; i++) {
            revArr[i] = arr[size - 1 - i];
        }

        System.out.print("\nReverse Sorted array: " + Arrays.toString(revArr));
    }
}

public class Lab2Ex3 {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        int[] array = new int[n];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        scanner.close();

        System.out.print("\nEntered array: " + Arrays.toString(array));

        ArrayProcessor.sortedArray(array);
        ArrayProcessor.reversedSortedArray(array);

        int[] sortedArray = ArrayProcessor.getSorted(array);
        System.out.print("\nSorted reversed array: " + Arrays.toString(sortedArray));
    }
}