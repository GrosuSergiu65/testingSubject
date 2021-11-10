package com.JUnit.testing.abilitaSpeciali.testingUtils.accumulatoDiRisultati;

import java.util.function.Predicate;

public class PercentValidator implements Predicate<Double> {

    @Override
    public boolean test(Double reactionResult) {
        try {
            if (reactionResult < 0) {
                return false;
            }
            double result = (reactionResult / 60) * 100;
            return result >= 0;
        } catch (NullPointerException e) {
            return false;
        }
    }
}
