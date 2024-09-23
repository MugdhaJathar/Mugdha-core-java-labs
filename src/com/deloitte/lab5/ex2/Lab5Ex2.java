package com.deloitte.lab5.ex2;

import java.util.Scanner;

class InvalidNameException extends Exception {
    public InvalidNameException(String message) {
        super(message);
    }
}

class NameValidator {
    public void validateName(String firstName, String lastName) throws InvalidNameException {
        if (firstName == null || firstName.isEmpty() || firstName.isBlank()) {
            throw new InvalidNameException("First name cannot be blank.");
        } 
        else if(lastName == null || lastName.isEmpty() || lastName.isBlank()) {
            System.out.println("First name cannot be blank.");
        }
        else {
        	System.out.print("Name: "+firstName+" "+lastName);
        }
    }
}

public class Lab5Ex2 {
	
	public static void main(String[] args) {
        
		Scanner scanner = new Scanner(System.in);
        NameValidator nameValidator = new NameValidator();

        System.out.print("Enter First name: ");
        String firstName = scanner.nextLine();
        
        System.out.print("Enter Last name: ");
        String lastName = scanner.nextLine();
        
        try {
            nameValidator.validateName(firstName, lastName);
        } catch (InvalidNameException e) {
            System.out.println(e.getMessage());
        }
        
        scanner.close();
    }
}
