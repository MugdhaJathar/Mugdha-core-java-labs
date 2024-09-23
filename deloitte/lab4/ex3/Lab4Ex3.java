package com.deloitte.lab4.ex3;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Scanner;

abstract class Item {
    private String id;
    private String title;
    private int copies;

    public Item(String id, String title, int copies) {
        this.id = id;
        this.title = title;
        this.copies = copies;
    }

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public int getCopies() {
        return copies;
    }

    public void setCopies(int copies) {
        this.copies = copies;
    }

    public boolean checkOut() {
        if (copies > 0) {
            copies--;
            return true;
        }
        return false;
    }

    public void checkIn() {
        copies++;
    }

    @Override
    public String toString() {
        return "\nID: " + id + ", \nTitle: " + title + ", \nCopies: " + copies;
    }

    public abstract void print();
}

abstract class WrittenItem extends Item {
    private String author;

    public WrittenItem(String id, String title, int copies, String author) {
        super(id, title, copies);
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public String toString() {
        return super.toString() + ", \nAuthor: " + author;
    }
}

class Book extends WrittenItem {

    public Book(String id, String title, int copies, String author) {
        super(id, title, copies, author);
    }

    @Override
    public void print() {
        System.out.println(this);
    }
}

class JournalPaper extends WrittenItem {
    private int yearPublished;

    public JournalPaper(String id, String title, int copies, String author, int yearPublished) {
        super(id, title, copies, author);
        this.yearPublished = yearPublished;
    }

    public int getYearPublished() {
        return yearPublished;
    }

    @Override
    public String toString() {
        return super.toString() + ", \nYear Published: " + yearPublished;
    }

    @Override
    public void print() {
        System.out.println(this);
    }
}

abstract class MediaItem extends Item {
    private int runtime;

    public MediaItem(String id, String title, int copies, int runtime) {
        super(id, title, copies);
        this.runtime = runtime;
    }

    public int getRuntime() {
        return runtime;
    }

    @Override
    public String toString() {
        return super.toString() + ", \nRuntime: " + runtime + " mins";
    }
}

class Video extends MediaItem {
    private String director;
    private String genre;
    private int yearReleased;

    public Video(String id, String title, int copies, int runtime, String director, String genre, int yearReleased) {
        super(id, title, copies, runtime);
        this.director = director;
        this.genre = genre;
        this.yearReleased = yearReleased;
    }

    @Override
    public String toString() {
        return super.toString() + 
        		", \nDirector: " + director + 
        		", \nGenre: " + genre + 
        		", \nYear Released: " + yearReleased;
    }

    @Override
    public void print() {
        System.out.println(this);
    }
}

class CD extends MediaItem {
    private String artist;
    private String genre;

    public CD(String id, String title, int copies, int runtime, String artist, String genre) {
        super(id, title, copies, runtime);
        this.artist = artist;
        this.genre = genre;
    }

    @Override
    public String toString() {
        return super.toString() + ", \nArtist: " + artist + ", \nGenre: " + genre;
    }

    @Override
    public void print() {
        System.out.println(this);
    }
}

public class Lab4Ex3 {
    public static void main(String[] args) throws InputMismatchException {
        Scanner scanner = new Scanner(System.in);
        List<Item> libraryItems = new ArrayList<>();

        try {
        System.out.print("Enter the number of items you want to add: ");
        int numItems = scanner.nextInt();

        for (int i = 0; i < numItems; i++) {
            System.out.print("Choose item type to add \n1 - Book \n2 - JournalPaper \n3 - Video \n4 - CD \nOption: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); 

            System.out.print("\nEnter ID: ");
            String id = scanner.nextLine();

            System.out.print("\nEnter Title: ");
            String title = scanner.nextLine();

            System.out.print("\nEnter number of copies: ");
            int copies = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1: // Book
                    System.out.print("\nEnter Author: ");
                    String author = scanner.nextLine();
                    libraryItems.add(new Book(id, title, copies, author));
                    break;

                case 2: // JournalPaper
                    System.out.print("\nEnter Author: ");
                    String journalAuthor = scanner.nextLine();
                    System.out.print("\nEnter Year Published: ");
                    int yearPublished = scanner.nextInt();
                    libraryItems.add(new JournalPaper(id, title, copies, journalAuthor, yearPublished));
                    break;

                case 3: // Video
                    System.out.print("\nEnter Runtime (in minutes): ");
                    int runtimeVideo = scanner.nextInt();
                    scanner.nextLine(); // Consume newline character

                    System.out.print("\nEnter Director: ");
                    String director = scanner.nextLine();

                    System.out.print("\nEnter Genre: ");
                    String genreVideo = scanner.nextLine();

                    System.out.print("\nEnter Year Released: ");
                    int yearReleased = scanner.nextInt();
                    libraryItems.add(new Video(id, title, copies, runtimeVideo, director, genreVideo, yearReleased));
                    break;

                case 4: // CD
                    System.out.print("\nEnter Runtime (in minutes): ");
                    int runtimeCD = scanner.nextInt();
                    scanner.nextLine(); // Consume newline character

                    System.out.print("\nEnter Artist: ");
                    String artist = scanner.nextLine();

                    System.out.print("\nEnter Genre: ");
                    String genreCD = scanner.nextLine();

                    libraryItems.add(new CD(id, title, copies, runtimeCD, artist, genreCD));
                    break;

                default:
                    System.out.println("Invalid choice.");
                    break;
            }
        }
        
//        // Display all items in the library
//        for (Item item : libraryItems) {
//            item.print();
//        }

        Item itemToCheckout = libraryItems.get(0);
        System.out.println("\nChecking out: " + itemToCheckout.getTitle());
        if (itemToCheckout.checkOut()) {
            System.out.println("Checkout successful. \nUpdated details: " + itemToCheckout);
        } else {
            System.out.println("No copies available for checkout.");
        }
        }
        catch(NoSuchElementException nsee ) {
        	System.out.println(nsee);
        }
        catch(IllegalStateException ise) {
        	System.out.println(ise);
        }
    }
}
