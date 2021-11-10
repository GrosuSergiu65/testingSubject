package com.JUnit.testing.abilitaSpeciali.testingUtils.contattiUtils;

import java.util.function.Predicate;

public class Age implements Predicate<String> {

    @Override
    public boolean test(String ageTest) {
        try {
            String result = "";
            for (int i = 0; i < ageTest.length(); i++) {
                if (!(ageTest.charAt(i) == '0')) {
                    result = ageTest.substring(i);
                    break;
                }
            }
            int age = Integer.parseInt(result);
            if (age <= 116 && age >= 18) {
                return true;
            }

        } catch (NumberFormatException | NullPointerException e) {
            return false;
        }
        return false;
    }
}

