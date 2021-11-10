package com.JUnit.testing.abilitaSpeciali.testingUtils.questionGenerale;

import java.util.function.Predicate;

public class TestQuestion4 implements Predicate<String> {
    @Override
    public boolean test(String answer) {
        try {
            return answer.toLowerCase().contains("rezerv");
        } catch (NullPointerException e) {
            return false;
        }
    }
}
