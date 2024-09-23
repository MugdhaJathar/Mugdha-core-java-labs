package com.deloitte.lab9.ex2;

import java.util.Scanner;
import java.util.function.Function;

class StringFormatter {
    
	public Function<String, String> getFormatter() {
        return str -> String.join(" ", str.split(""));
    }
}

public class Lab9Ex2 {
	
	public static void main(String[] args) {
        
		StringFormatter formatter = new StringFormatter();

        var formatFunction = formatter.getFormatter();

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        String formattedString = formatFunction.apply(input);

        System.out.println("Formatted String: " + formattedString);
        
        scanner.close();
	}
}
