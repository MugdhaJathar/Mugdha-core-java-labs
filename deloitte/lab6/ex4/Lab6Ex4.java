package com.deloitte.lab6.ex4;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class MedalDemo {

    public static Map<String, String> getStudents(HashMap<String, Integer> studentMarks) {
        
    	Map<String, String> medalMap = new HashMap<>();

        for (Map.Entry<String, Integer> entry : studentMarks.entrySet()) {
            String regNumber = entry.getKey();  // Student registration number
            int marks = entry.getValue();       // Student marks

            if (marks >= 90) {
                medalMap.put(regNumber, "Gold");
            } else if (marks >= 80 && marks < 90) {
                medalMap.put(regNumber, "Silver");
            } else if (marks >= 70 && marks < 80) {
                medalMap.put(regNumber, "Bronze");
            }
        }

        return medalMap;
    }
}

public class Lab6Ex4 {
	
	public static void main(String[] args) {
        
		Scanner scanner = new Scanner(System.in);

        HashMap<String, Integer> studentMarks = new HashMap<>();

        System.out.print("Enter the number of students:");
        int numberOfStudents = scanner.nextInt();

        for (int i = 0; i < numberOfStudents; i++) {
            System.out.print("\nEnter registration number for student " + (i + 1) + ":");
            String regNumber = scanner.next();

            System.out.print("\nEnter marks for student " + (i + 1) + ":");
            int marks = scanner.nextInt();

            studentMarks.put(regNumber, marks);
        }

        Map<String, String> medalMap = MedalDemo.getStudents(studentMarks);

        System.out.println("Students eligible for medals: " + medalMap);
    
        scanner.close();
	}
}
