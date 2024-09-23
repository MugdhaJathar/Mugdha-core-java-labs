package com.deloitte.lab3.ex9;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

class DateDurationCalculator {

    public static void calculateDuration(String inputDate) {

    	DateTimeFormatter inputFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        DateTimeFormatter outputFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        
        LocalDate startDate = LocalDate.parse(inputDate, inputFormatter);
        LocalDate currentDate = LocalDate.now();

        long years = ChronoUnit.YEARS.between(startDate, currentDate);
        long months = ChronoUnit.MONTHS.between(startDate, currentDate) % 12; 
        long days = ChronoUnit.DAYS.between(startDate.plusYears(years).plusMonths(months), currentDate);

        System.out.printf("Duration from %s to %s: %d years, %d months, and %d days.%n",
                          startDate.format(outputFormatter), currentDate.format(outputFormatter), years, months, days);
    }
}

public class Lab3Ex9 {
	
	public static void main(String[] args) {
        
		Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a date (dd-MM-yyyy): ");
        String inputDate = scanner.nextLine();
        
        scanner.close();
        
        DateDurationCalculator.calculateDuration(inputDate);
    }
}
