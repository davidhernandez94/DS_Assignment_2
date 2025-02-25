package org.example;

public interface BonusEligible {
    default double calculateBonus(int performanceRating) {
        return performanceRating >= 8 ? 1.1 : 1.05;

    }
}
