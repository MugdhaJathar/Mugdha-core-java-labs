package com.deloitte.lab1.ex3;

import java.util.Scanner;

public class Lab1Ex3 {

	public static void fibonacciNonRecursive(int n) {
		
		int firstTerm = 0;
		int secondTerm = 1;
		
		for(int i = 1; i <= n; ++i) {
			System.out.print(firstTerm+" ");
			
			int nextTerm = firstTerm + secondTerm;
			
			firstTerm = secondTerm;
			
			secondTerm = nextTerm;
		}
	}
	
	public static int[] fibonacciRecursive(int n) {
		
		int[] series = new int[n];
		
		int firstTerm = 0;
		int secondTerm = 1;
		
		for (int i=0; i<n; i++) {
			series[i] = firstTerm;
			
			int	nextTerm = firstTerm + secondTerm;
			
			firstTerm = secondTerm;
			
			secondTerm = nextTerm;
		}
		return series;
	}
	
	public static void main(String args[]) {
		
		Scanner scanner =new Scanner(System.in);
		
		System.out.print("Enter a number till which Fibonacci series will get printed: ");
		int number = scanner.nextInt();
		
		System.out.print("\nFibonacci series till "+number+" using non-recursive approach : ");
		fibonacciNonRecursive(number);
		
		int[] fibonacciSeries = fibonacciRecursive(number);
		System.out.print("\nFibonacci series till "+number+" using recursive approach : ");
		for (int n : fibonacciSeries) {
			System.out.print(n+" ");
		}
		
		scanner.close();
	}
}
