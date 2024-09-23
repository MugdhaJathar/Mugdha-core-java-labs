package com.deloitte.lab9.ex3;

import java.util.Scanner;
import java.util.function.BiPredicate;

class Authentication {
    
	private final String validUsername = "admin";
    private final String validPassword = "password123";

    public BiPredicate<String, String> getAuthenticator() {
        return (username, password) -> 
            validUsername.equals(username) && validPassword.equals(password);
    }
}

public class Lab9Ex3 {
	
	public static void main(String[] args) {
        
		Authentication auth = new Authentication();

        var authenticator = auth.getAuthenticator();

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter username: ");
        String username = scanner.nextLine();

        System.out.print("Enter password: ");
        String password = scanner.nextLine();

        boolean isAuthenticated = authenticator.test(username, password);

        if (isAuthenticated) {
            System.out.println("Authentication Successful!");
        } else {
            System.out.println("Invalid username or password.");
        }
        
        scanner.close();
    }
}
