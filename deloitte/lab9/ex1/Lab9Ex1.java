package com.deloitte.lab9.ex1;

import java.util.Scanner;
import java.util.function.BiFunction;

class PowerCalculator {
    
	public BiFunction<Double, Double, Double> getPowerFunction() {
        return (x, y) -> Math.pow(x, y);
    }
}

public class Lab9Ex1 {
	
	public static void main(String[] args) {
        
		PowerCalculator powerCalculator = new PowerCalculator();

        var powerFunction = powerCalculator.getPowerFunction();

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the base number (x): ");
        double x = scanner.nextDouble();

        System.out.print("Enter the exponent (y): ");
        double y = scanner.nextDouble();

        double result = powerFunction.apply(x, y);

        System.out.println("\n"+x + " raised to the power of " + y + " : " + result);
    }
}
