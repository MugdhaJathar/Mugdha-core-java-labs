package com.deloitte.lab5.ex1;

import java.util.Scanner;

class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

class AgeValidator {
    public void validateAge(int age) throws InvalidAgeException {
        if (age <= 15) {
            throw new InvalidAgeException("Age must be above 15.");
        } else {
            System.out.println("Valid age: " + age);
        }
    }
}

public class Lab5Ex1 {
	
	public static void main(String[] args) {
        
		Scanner scanner = new Scanner(System.in);
        AgeValidator ageValidator = new AgeValidator();

        System.out.print("Enter age: ");
        int age = scanner.nextInt();

        try {
            ageValidator.validateAge(age);
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        }
        
        scanner.close();
    }
}
