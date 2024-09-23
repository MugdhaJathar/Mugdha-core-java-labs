package com.deloitte.lab3.ex5;

import java.util.Scanner;

class TextAnalyzer {

    public static int countCharacters(String text) {
        return text.length(); // Total number of characters
    }

    public static int countWords(String text) {
        String[] words = text.trim().split("\\s+"); // Split by whitespace
        return words.length; // Total number of words
    }

    public static int countLines(String text) {
        Scanner scanner = new Scanner(text);
        int lines = 0;
        while (scanner.hasNextLine()) {
            scanner.nextLine();
            lines++;
        }
        scanner.close();
        return lines; 
    }
}

public class LabEx5 {
	
	public static void main(String[] args) {
        
		Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter text (end with a line containing only a dot):");
        StringBuilder inputText = new StringBuilder();
        
        String line;
        while (!(line = scanner.nextLine()).equals(".")) {
            inputText.append(line).append("\n"); 
        }

        scanner.close();
        
        String text = inputText.toString();
        int characterCount = TextAnalyzer.countCharacters(text);
        int wordCount = TextAnalyzer.countWords(text);
        int lineCount = TextAnalyzer.countLines(text);
        
        System.out.println("Number of characters: " + characterCount);
        System.out.println("Number of words: " + wordCount);
        System.out.println("Number of lines: " + lineCount);
    }
}
