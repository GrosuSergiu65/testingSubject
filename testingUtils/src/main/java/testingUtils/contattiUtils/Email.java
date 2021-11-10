package testingUtils.contattiUtils;

import java.util.function.Predicate;

public class Email implements Predicate<String> {
    @Override
    public boolean test(String email) {
        return email.length() >= 9 && email.substring(4).contains("@") &&
                email.substring(5).contains(".") &&
                (!email.substring(email.length() - 5).contains("@") &&
                        (!email.substring(email.length() - 4).matches(".*\\d.*")));
    }
}
