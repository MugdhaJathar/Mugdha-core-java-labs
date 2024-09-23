package com.deloitte.lab1.ex2;

import java.util.Scanner;

public class Lab1Ex2 {
	
	public static void main(String args[]) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter a color for light: ");
		String color = scanner.next();
		
		
		switch(color){
			case "red"  : 
				System.out.println("Stop");
				break;
			
			case "yellow" : 
				System.out.println("Ready");
				break;
				
			case "green" : 
				System.out.println("Go");
				break;
				
			default : 
				System.out.println("You entered wrong color try again!");
				break;
		}
		
		scanner.close();
	}
}
