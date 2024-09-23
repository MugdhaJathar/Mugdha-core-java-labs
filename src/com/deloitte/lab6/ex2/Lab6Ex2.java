package com.deloitte.lab6.ex2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class CharCounterDemo {

	public static Map<Character, Integer> countChars(char[] arr) {
        
		Map<Character, Integer> charCountMap = new HashMap<>();

        for (char c : arr) {
            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
        }

        return charCountMap;
    }
}

public class Lab6Ex2 {
	
	public static void main(String[] args) {
        
		Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of characters: ");
        int size = scanner.nextInt();
        char[] arr = new char[size];

        System.out.print("\nEnter the characters one by one: ");

        for (int i = 0; i < size; i++) {
            arr[i] = scanner.next().charAt(0);
        }

        Map<Character, Integer> result = CharCounterDemo.countChars(arr);

        System.out.print("\nCharacter frequencies: " + result);
    
        scanner.close();
	}
}