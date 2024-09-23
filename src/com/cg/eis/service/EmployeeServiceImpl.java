package com.cg.eis.service;

import com.cg.eis.bean.Employee;

import java.util.Scanner;

public class EmployeeServiceImpl implements EmployeeService {
    private Scanner scanner = new Scanner(System.in);

    @Override
    public void getEmployeeDetails() {
        System.out.print("Enter employee ID: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.print("Enter employee name: ");
        String name = scanner.nextLine();
        System.out.print("Enter employee salary: ");
        double salary = scanner.nextDouble();
        scanner.nextLine(); // Consume newline
        System.out.print("Enter employee designation: ");
        String designation = scanner.nextLine();

        Employee employee = new Employee(id, name, salary, designation);
        displayEmployeeDetails(employee);
    }

    @Override
    public String findInsuranceScheme(Employee employee) {
        return employee.getInsuranceScheme();
    }

    @Override
    public void displayEmployeeDetails(Employee employee) {
        System.out.println("Employee Details:");
        System.out.println("ID: " + employee.getId());
        System.out.println("Name: " + employee.getName());
        System.out.println("Salary: " + employee.getSalary());
        System.out.println("Designation: " + employee.getDesignation());
        System.out.println("Insurance Scheme: " + findInsuranceScheme(employee));
    }
}
