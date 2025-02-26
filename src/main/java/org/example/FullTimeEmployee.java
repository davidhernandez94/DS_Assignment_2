package org.example;

public class FullTimeEmployee extends Employee implements BonusEligible {
    private int performanceRating;

    public FullTimeEmployee(String name, double baseSalary) {
        super(name, baseSalary);
    }

    @Override
    public double calculateBonus(int performanceRating) {
        return performanceRating >= 8 ? 1.1 : 1.05;
    }

    public FullTimeEmployee() {
        this("jaj", 17);
    }

    public double calculateSalary() {
        return this.getBaseSalary() * this.calculateBonus(performanceRating);
    }
}
