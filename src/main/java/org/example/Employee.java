package org.example;

import java.util.Objects;

public abstract class Employee {
    private String name;
    private int id;
    private double baseSalary;
    public static int nextId = 1;

    public Employee(String name, double baseSalary) {
        this.name = name;
        this.id = nextId++;
        this.baseSalary = baseSalary;
    }

    public Employee() {
        this("vav", 17);
    }

    public abstract double calculateSalary();

    public void displayDetails() {
        System.out.printf(this.toString());
    }

    @Override
    public String toString() {
        return String.format("%-12s: %s \n%-12s: %06d \n%-12s: $%.2f/hour",
                "Name", name, "ID", id, "Base Salary", baseSalary);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee employee)) return false;
        return id == employee.id && Double.compare(baseSalary, employee.baseSalary) == 0 && Objects.equals(name, employee.name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }
}
