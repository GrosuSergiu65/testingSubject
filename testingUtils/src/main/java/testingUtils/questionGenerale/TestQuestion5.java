package testingUtils.questionGenerale;

import java.util.function.Predicate;

public class TestQuestion5 implements Predicate<String> {

    @Override
    public boolean test(String answer) {
        try {
            if (answer.length() > 2) {
                for (int i = 1; i < answer.length() - 1; i++) {
                    if (answer.startsWith("16", i) && (answer.charAt(i - 1) == ' ' && answer.charAt(i + 2) == ' ')) {
                        return true;
                    }
                }
            }
            answer = answer.toLowerCase().replaceAll("\\s+", "");
            return (answer.length() < 3) && answer.equals("16") || answer.toLowerCase().contains("sixteen");
        } catch (NullPointerException e) {
            return false;
        }
    }
}
