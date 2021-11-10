package com.JUnit.testing.abilitaSpeciali.testingUtils.questionGenerale;

import org.junit.jupiter.api.extension.ParameterResolutionException;

import java.util.InputMismatchException;
import java.util.function.Predicate;

public class TestQuestion7 implements Predicate<Double> {
    @Override
    public boolean test(Double answer) {
        try {

            return answer == 2 ;
        } catch (NullPointerException | ParameterResolutionException | InputMismatchException e) {
            return false;
        }
    }
}
