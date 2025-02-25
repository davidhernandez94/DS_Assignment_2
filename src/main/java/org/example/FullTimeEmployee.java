package org.example;

public class FullTimeEmployee extends Employee implements BonusEligible {
    public FullTimeEmployee(String name, double baseSalary) {
        super(name, baseSalary);
    }

    public FullTimeEmployee() {
        this("jaj", 17);
    }

    @Override
    public double calculateSalary(int performanceRating) {
        return this.getBaseSalary() * this.calculateBonus(performanceRating);
    }
}
