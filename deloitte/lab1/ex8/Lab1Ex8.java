package com.deloitte.lab1.ex8;

import java.util.Scanner;

class CheckNumber {

    public boolean checkNumber(int n) {
    	
    	return n > 0 && (n & (n - 1)) == 0;
    }
}

public class Lab1Ex8{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        
        int number = scanner.nextInt();
        
        CheckNumber cn = new CheckNumber();
        
        System.out.println("Is " + number + " a power of two? " + cn.checkNumber(number));
        
        scanner.close();
    }
}
