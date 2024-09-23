package com.deloitte.lab3.ex2;

import java.util.Scanner;

 class GetImage {

    public String getImage(String input) {
    	
    	StringBuffer stringBuffer = new StringBuffer(input);
        
        String mirrorImage = stringBuffer.reverse().toString();
        
        return input + "|" + mirrorImage;
    }
}

public class Lab3Ex2 {
	
	public static void main(String[] args) {
        
		Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();
        
        GetImage gi = new GetImage();
        
        String result = gi.getImage(inputString);
        
        System.out.println("Mirrored String: " + result);
        
        scanner.close();
    }
}
