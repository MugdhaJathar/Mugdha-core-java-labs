package com.deloitte.lab1.ex1;

import java.util.Scanner;

public class Lab1Ex1 {
	
	public static int sumOfCubes(int n) {
		int sum = 0;
		
		while(n != 0) {
			int digit = n % 10;
			sum += digit * digit * digit;
			n /= 10;
		}
		return sum;
	}
	
	public static void main(String args[]) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		int number = scanner.nextInt();
		
		System.out.println("Sum of the cube of digits in given number: "+sumOfCubes(number));
		
		scanner.close();
	}
}
