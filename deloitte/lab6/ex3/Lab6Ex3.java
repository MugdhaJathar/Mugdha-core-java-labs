package com.deloitte.lab6.ex3;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class SquareDemo {

    public static Map<Integer, Integer> getSquares(int[] numbers) {
    
    	Map<Integer, Integer> squareMap = new HashMap<>();

        for (int num : numbers) {
            squareMap.put(num, num * num);
        }

        return squareMap;
    }
}

public class Lab6Ex3 {
	
	public static void main(String[] args) {
    
		Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of elements:");
        int size = scanner.nextInt();

        int[] numbers = new int[size];

        System.out.println("Enter the numbers:");
        for (int i = 0; i < size; i++) {
            numbers[i] = scanner.nextInt();
        }

        Map<Integer, Integer> result = SquareDemo.getSquares(numbers);

        System.out.println("Numbers and their squares: " + result);
    
        scanner.close();
	}
}
