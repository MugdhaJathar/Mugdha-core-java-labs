package com.deloitte.lab1.ex5;

import java.util.Scanner;


class CalculateSum{
	
	public void calculateSum(int number) {
		int count = 0;
		int sum = 0;
		int num = 1;
		
		while(count < number) {
			if(num % 3 == 0 || num % 5 == 0) {
				sum += num;
				count++;
			}
			num++;
		}
		
		System.out.println("Sum of first "+number+" natural number: "+sum);		
	}
	
	
}
public class Lab1Ex5 {
	
	
	public static void main(String args[]) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		int number = scanner.nextInt();
		
		CalculateSum cs = new CalculateSum();
		cs.calculateSum(number);
		
		scanner.close();
	}
}
