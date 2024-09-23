package com.cg.eis.bean;

public class Employee {
    private int id;
    private String name;
    private double salary;
    private String designation;
    private String insuranceScheme;

    // Constructor
    public Employee(int id, String name, double salary, String designation) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.designation = designation;
        this.insuranceScheme = determineInsuranceScheme();
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public String getDesignation() {
        return designation;
    }

    public String getInsuranceScheme() {
        return insuranceScheme;
    }

    // Method to determine insurance scheme based on salary and designation
    private String determineInsuranceScheme() {
        if (salary < 30000) {
            return "No Scheme";
        } else if (salary < 50000) {
            return "Scheme A";
        } else {
            return "Scheme B";
        }
    }
}
