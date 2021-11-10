package com.JUnit.testing.abilitaSpeciali.testingUtils.questionGenerale;


import java.util.function.Predicate;

public class TestQuestion8 implements Predicate<Integer> {
    @Override
    public boolean test(Integer answer) {
        try {
            return answer == 42;
        } catch (NullPointerException e) {
            return false;
        }
    }
}
