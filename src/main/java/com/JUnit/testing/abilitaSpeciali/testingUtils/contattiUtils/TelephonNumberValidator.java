package com.JUnit.testing.abilitaSpeciali.testingUtils.contattiUtils;

import java.util.function.Predicate;

public class TelephonNumberValidator implements Predicate<String> {

    @Override
    public boolean test(String phoneNumber) {
        try {

            Double.parseDouble(phoneNumber);
            if (((phoneNumber.startsWith("+373") || phoneNumber.startsWith("373")) && phoneNumber.length() <= 13 && phoneNumber.length() >= 12) ||
                    (phoneNumber.length() == 9 &&
                            (phoneNumber.startsWith("069") || phoneNumber.startsWith("067") ||
                            phoneNumber.startsWith("068") || phoneNumber.startsWith("060") ||
                            phoneNumber.startsWith("078") || phoneNumber.startsWith("079"))) ||
                    (phoneNumber.length() == 8 && (phoneNumber.startsWith("69") || phoneNumber.startsWith("67") ||
                            phoneNumber.startsWith("68") || phoneNumber.startsWith("60")))) {
                return true;
            }
        } catch (NumberFormatException | NullPointerException e) {
            return false;
        }

        return false;
    }
}
