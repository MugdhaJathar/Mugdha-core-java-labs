package com.deloitte.lab3.ex3;

import java.util.Scanner;

class StringAlterer {

    public static String alterString(String input) {
        
    	StringBuilder alteredString = new StringBuilder();

        for (char ch : input.toCharArray()) {
            
        	if (isConsonant(ch)) {
                alteredString.append((char) (ch + 1));
            } 
        	else {
                alteredString.append(ch);
            }
        }
        return alteredString.toString();
    }

    private static boolean isConsonant(char ch) {
        return Character.isLetter(ch) && !isVowel(ch);
    }

    private static boolean isVowel(char ch) {
        char lowerCh = Character.toLowerCase(ch);
        return lowerCh == 'a' || lowerCh == 'e' || lowerCh == 'i' || lowerCh == 'o' || lowerCh == 'u';
    }
}

public class Lab3Ex3 {
	
	public static void main(String[] args) {
        
		Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.next();

        scanner.close();

        String result = StringAlterer.alterString(input);
        System.out.println("Altered string: " + result);
    }
}
