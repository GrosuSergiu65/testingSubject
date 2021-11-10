package com.JUnit.testing.abilitaSpeciali.testingUtils.contattiUtils;

import java.util.function.Predicate;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NameAndSurname implements Predicate<String> {
    @Override
    public boolean test(String nameAndSurname) {
        String result = nameAndSurname.replaceFirst("^\\s*", "");
        String regx = "^[\\p{L} .'-]+$";

        if (result.length() >= 3 && result.contains(" ")) {
            Pattern pattern = Pattern.compile(regx, Pattern.CASE_INSENSITIVE);
            Matcher matcher = pattern.matcher(result);
            return matcher.find();
        }
        return false;
    }
}
