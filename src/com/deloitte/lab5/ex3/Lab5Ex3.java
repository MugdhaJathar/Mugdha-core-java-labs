package com.deloitte.lab5.ex3;

import java.util.Scanner;

import com.cg.eis.exception.EmployeeException;

class Employee {
    private int id;
    private String name;
    private double salary;

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public void validateSalary() throws EmployeeException {
        if (this.salary < 3000) {
            throw new EmployeeException("Salary is below 3000. Salary must be at least 3000.");
        } else {
            System.out.println("Employee salary is valid.");
        }
    }

    @Override
    public String toString() {
        return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
    }
}

public class Lab5Ex3 {
	
	public static void main(String[] args) {
    
		Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Employee ID: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // To consume the newline

        System.out.print("Enter Employee Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter Employee Salary: ");
        double salary = scanner.nextDouble();

        Employee employee = new Employee(id, name, salary);

        try {
            employee.validateSalary();
            System.out.println(employee.toString());
        } 
        catch (EmployeeException e) {
            System.out.println(e.getMessage());
        }
        
        scanner.close();
    }
}