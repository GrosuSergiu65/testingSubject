package com.JUnit.testing.abilitaSpeciali.testingUtils.questionGenerale;

import org.junit.jupiter.api.extension.ParameterResolutionException;

import java.util.function.Predicate;

public class TestQuestion6 implements Predicate<Double> {

    @Override
    public boolean test(Double answer) {
        try {

            return answer == 3 || answer == 3.0;
        } catch (NullPointerException | ParameterResolutionException e) {
            return false;
        }
    }
}
