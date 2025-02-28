package org.example.employeemanagementsystem;

import java.util.Objects;

public class FullTimeEmployee extends Employee implements BonusEligible {
    private int performanceRating;

    public FullTimeEmployee(String name, double baseSalary) {
        super(name, baseSalary);
    }

    public FullTimeEmployee() {
        this("jaj", 17);
    }

    /**
     * calculates salary based on base salary and bonus multiplier
     * @return double
     */
    public double calculateSalary() {
        return this.getBaseSalary() * this.calculateBonus(performanceRating);
    }

    /**
     * calculates bonus of employee based on performance
     * @param performanceRating int performance (1-10)
     * @return double bonus multiplier (+5% or +10%)
     */
    @Override
    public double calculateBonus(int performanceRating) {
        return performanceRating >= 8 ? 1.1 : 1.05;
    }

    @Override
    public String toString() {
        return String.format("%s\n%-20s: %d", super.toString(),
                "Performance Rating", performanceRating);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        FullTimeEmployee that = (FullTimeEmployee) o;
        return performanceRating == that.performanceRating;
    }

    public int getPerformanceRating() {
        return performanceRating;
    }

    public void setPerformanceRating(int performanceRating) {
        this.performanceRating = performanceRating;
    }
}
