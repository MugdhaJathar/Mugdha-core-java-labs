package com.deloitte.lab3.ex4;

import java.util.Scanner;

class NumberModifier {

    public static int modifyNumber(int number) {
        
    	String numberStr = String.valueOf(number);
        
    	StringBuffer modifiedNumber = new StringBuffer();

        for (int i = 0; i < numberStr.length() - 1; i++) {
            
        	int currentDigit = Character.getNumericValue(numberStr.charAt(i));
            
        	int nextDigit = Character.getNumericValue(numberStr.charAt(i + 1));
            
        	int difference = Math.abs(currentDigit - nextDigit);
            
        	modifiedNumber.append(difference);
        }
        modifiedNumber.append(numberStr.charAt(numberStr.length() - 1));

        return Integer.parseInt(modifiedNumber.toString());
    }
}

public class Lab3Ex4 {
	
	public static void main(String[] args) {
        
		Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        scanner.close();

        int modifiedNumber = NumberModifier.modifyNumber(number);
        System.out.println("Modified number: " + modifiedNumber);
    }
}

