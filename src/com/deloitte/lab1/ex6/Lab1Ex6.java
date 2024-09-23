package com.deloitte.lab1.ex6;

import java.util.Scanner;

class CalculateDifference {

    public int calculateDifference(int n) {
        
        int sumOfSquares = 0;
        int sum = 0;
        
        for (int i = 1; i <= n; i++) {
            sumOfSquares += i * i;
            sum += i;
        }
        
        int squareOfSum = sum * sum;
        return sumOfSquares - squareOfSum;
    }
}

public class Lab1Ex6{
    
    public static void main(String[] args) {
    	
    	Scanner scanner = new Scanner(System.in);

		System.out.print("Enter a number: ");
		int number = scanner.nextInt();
        
		CalculateDifference cd = new CalculateDifference();
        
        int difference = cd.calculateDifference(number);
        
        System.out.println("The difference is: " + difference);
    
        scanner.close();
    }
}
