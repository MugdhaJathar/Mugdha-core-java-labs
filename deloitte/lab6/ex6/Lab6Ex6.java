package com.deloitte.lab6.ex6;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

class VoterEligibilityUtils {

    public List<Integer> votersList(Map<Integer, LocalDate> dobMap) {
        List<Integer> eligibleVoters = new ArrayList<>();

        for (Map.Entry<Integer, LocalDate> entry : dobMap.entrySet()) {
            Integer id = entry.getKey();
            LocalDate dob = entry.getValue();

            int age = calculateAge(dob);

            if (age > 18) {
                eligibleVoters.add(id);
            }
        }

        return eligibleVoters; 
    }

    private int calculateAge(LocalDate dob) {
        LocalDate currentDate = LocalDate.now();
        return Period.between(dob, currentDate).getYears();
    }
}

public class Lab6Ex6 {
	
	public static void main(String[] args) {
        
		Scanner scanner = new Scanner(System.in);

        Map<Integer, LocalDate> dobMap = new HashMap<>();

        System.out.print("Enter the number of people: ");
        int numberOfPeople = scanner.nextInt();

        for (int i = 0; i < numberOfPeople; i++)
        {
            System.out.print("\nEnter ID for person " + (i + 1) + ": ");
            int id = scanner.nextInt();

            System.out.print("Enter Year of Birth for person " + (i + 1) + ": ");
            int year = scanner.nextInt();

            System.out.print("Enter Month of Birth for person " + (i + 1) + ": ");
            int month = scanner.nextInt();

            System.out.print("Enter Day of Birth for person " + (i + 1) + ": ");
            int day = scanner.nextInt();

            dobMap.put(id, LocalDate.of(year, month, day));
        }

        VoterEligibilityUtils voterEligibilityUtils = new VoterEligibilityUtils();
        List<Integer> eligibleVoters = voterEligibilityUtils.votersList(dobMap);

        System.out.print("\nEligible Voter IDs: " + eligibleVoters);

        scanner.close();
    }
}
