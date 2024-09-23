package com.deloitte.lab3.ex8;

import java.util.Scanner;

class StringChecker {

    public static boolean isPositiveString(String input) {

    	if (input == null || input.isEmpty()) {
            return false;
        }

        for (int i = 1; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            char previousChar = input.charAt(i - 1);
            
            if (currentChar <= previousChar) {
                return false;
            }
        }
        return true; 
    }
}

public class Lab3Ex8 {
	
	public static void main(String[] args) {
        
		Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String input = scanner.next();
        
        scanner.close();
        
        boolean result = StringChecker.isPositiveString(input);
        
        if (result) {
            System.out.println(input + " is a positive string.");
        } else {
            System.out.println(input + " is not a positive string.");
        }
    }
}

