package com.deloitte.lab9.ex4;

import java.util.Scanner;

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person [Name=" + name + ", Age=" + age + "]";
    }
}

@FunctionalInterface
interface PersonFactory {
    Person create(String name, int age);
}

public class Lab9Ex4 {
	public static void main(String[] args) {
        
		Scanner sc = new Scanner(System.in);

        PersonFactory personFactory = Person::new;

        System.out.println("Enter the name of the first person:");
        String name1 = sc.nextLine();
        System.out.println("Enter the age of the first person:");
        int age1 = sc.nextInt();
        sc.nextLine(); // Consume the newline

        Person person1 = personFactory.create(name1, age1);

        System.out.println("Enter the name of the second person:");
        String name2 = sc.nextLine();
        System.out.println("Enter the age of the second person:");
        int age2 = sc.nextInt();

        Person person2 = personFactory.create(name2, age2);

        System.out.println("\nDetails of the first person:");
        System.out.println(person1);

        System.out.println("\nDetails of the second person:");
        System.out.println(person2);

        sc.close();
    }
}