package com.deloitte.lab6.ex1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

class HashMapDemo {

    public static List<Integer> getValues(HashMap<String, Integer> map) {
        
    	Collection<Integer> values = map.values();

        List<Integer> sortedValues = new ArrayList<>(values);

        Collections.sort(sortedValues);

        return sortedValues;
    }
}

public class Lab6Ex1 {
	
	public static void main(String[] args) {
        
		Scanner scanner = new Scanner(System.in);
        HashMap<String, Integer> map = new HashMap<>();

        System.out.print("Enter the number of entries in the map: ");
        int numEntries = scanner.nextInt();
        scanner.nextLine();  
        
        for (int i = 0; i < numEntries; i++) {
            System.out.print("\nEnter the key for entry" + (i + 1) + " : ");
            String key = scanner.nextLine();

            System.out.print("Enter the value for entry" + (i + 1) + " : ");
            int value = scanner.nextInt();
            scanner.nextLine();  
            
            map.put(key, value);
        }

        List<Integer> sortedValues = HashMapDemo.getValues(map);

        System.out.print("\nSorted values: " + sortedValues);
    
        scanner.close();
	}
}

