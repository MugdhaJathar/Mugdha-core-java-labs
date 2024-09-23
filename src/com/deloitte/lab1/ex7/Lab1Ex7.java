package com.deloitte.lab1.ex7;

import java.util.Scanner;

class CheckNumber {

    public boolean checkNumber(int number) {
        
    	String numStr = Integer.toString(number);

        for (int i = 0; i < numStr.length() - 1; i++) {
            if (numStr.charAt(i) > numStr.charAt(i + 1)) {
                return false;
            }
        }
        return true;
    }
}

public class Lab1Ex7{
	
	public static void main(String args[]) {
	    	
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a number: ");
		
		int number = scanner.nextInt();
	    
		CheckNumber c = new CheckNumber();
	        
	    System.out.println("Is " + number + " an increasing number? " +c.checkNumber(number));
	    
	    scanner.close();
	    }
    }

