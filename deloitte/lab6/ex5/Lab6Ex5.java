package com.deloitte.lab6.ex5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class SecondSmallest {
    
	public int getSecondSmallest(List<Integer> list) {
        
		Collections.sort(list);

        return list.get(1);
    }
}

public class Lab6Ex5 {
	
	public static void main(String[] args) {
        
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array:");
        int n = sc.nextInt();

        List<Integer> list = new ArrayList<>();

        System.out.print("\nEnter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }

        SecondSmallest secondSmallestFinder = new SecondSmallest();

        int secondSmallest = secondSmallestFinder.getSecondSmallest(list);

        System.out.print("\nThe second smallest element is: " + secondSmallest);

        sc.close();
    }
}
