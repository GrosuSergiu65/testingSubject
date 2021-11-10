package com.JUnit.testing.abilitaSpeciali.testingUtils.questionGenerale;

import java.util.Locale;
import java.util.function.Predicate;

public class TestQuestion3 implements Predicate<String> {

    @Override
    public boolean test(String answer) {
        try {
            answer = answer.toLowerCase(Locale.ROOT).replaceAll("\\s+", "");
            String result = "";

            int isTheSameLetter = 0;

            if (answer.length() > 1) {
                for (int i = 0; i < answer.length() - 1; i++) {
                    if (answer.charAt(i) == 'c' && answer.charAt(i + 1) == 'c') {
                        continue;
                    }
                    isTheSameLetter++;
                }
            }
            if (answer.length() > 0) {
                if (isTheSameLetter == 0) {
                    result += answer.charAt(0);
                }
            }

            if (answer.equals("c") || result.equals("c") ||
                    (Double.parseDouble(answer) > 17500 && Double.parseDouble(answer) < 22500)) {
                return true;
            }

        } catch (NullPointerException | NumberFormatException e) {
            return false;
        }
        return false;
    }
}
