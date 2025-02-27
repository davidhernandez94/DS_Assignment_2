package org.example.employeemanagementsystem;

import java.util.Objects;

public class PartTimeEmployee extends Employee {
    private int hoursWorked;
    private double hourlyRate;

    public PartTimeEmployee(String name, double baseSalary) {
        super(name, baseSalary);
    }

    public PartTimeEmployee() {
        this("jaj", 17);
    }

    public double calculateSalary() {
        return hourlyRate * hoursWorked;
    }

    @Override
    public String toString() {
        return String.format("%s\n%-20s: %d\n%-20s: %f", super.toString(),
                "Hours Worked", hoursWorked, "Hourly Rate", hourlyRate);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        PartTimeEmployee that = (PartTimeEmployee) o;
        return hoursWorked == that.hoursWorked && Double.compare(hourlyRate, that.hourlyRate) == 0;
    }

    public int getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }
}
