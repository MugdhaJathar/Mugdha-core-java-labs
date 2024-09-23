package com.deloitte.lab9.ex5;

import java.util.Scanner;

class FactorialCalculator {

    public long calculateFactorial(int num) {
        if (num == 0 || num == 1) {
            return 1;
        }
        long fact = 1;
        for (int i = 2; i <= num; i++) {
            fact *= i;
        }
        return fact;
    }
}

@FunctionalInterface
interface FactorialFunctionalInterface {
    long calculate(int num);
}

public class Lab9Ex5 {
	
	public static void main(String[] args) {
        
		FactorialCalculator calculator = new FactorialCalculator();

        FactorialFunctionalInterface factorialRef = calculator::calculateFactorial;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to calculate factorial:");
        int num = sc.nextInt();

        long result = factorialRef.calculate(num);

        System.out.println("Factorial of " + num + " is: " + result);

        sc.close();
    }
}
