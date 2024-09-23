package com.deloitte.lab3.ex1;

import java.util.Scanner;
import java.util.StringTokenizer;

class IntegerProcessor {
    
    public void processInput(String inputLine) {
        StringTokenizer tokenizer = new StringTokenizer(inputLine);
        
        int sum = 0;
        System.out.print("\nThe integers are: ");

        while (tokenizer.hasMoreTokens()) {
            String token = tokenizer.nextToken();  // Get the next token
            int number = Integer.parseInt(token);  // Convert token to integer
            System.out.print(number + " ");         // Display the integer
            sum += number;                          // Add to the sum
        }

        System.out.println("\nThe sum of all integers: " + sum);
    }
}

public class Lab3Ex1 {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a line of integers: ");
        String inputLine = scanner.nextLine();
        
        IntegerProcessor ip = new IntegerProcessor();
        
        ip.processInput(inputLine);

        scanner.close();
    }
}
