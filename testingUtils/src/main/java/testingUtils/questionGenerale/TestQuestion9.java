package testingUtils.questionGenerale;

import java.util.function.Predicate;

public class TestQuestion9 implements Predicate<Double> {

    @Override
    public boolean test(Double answer) {
        try {
            return answer == 1100 || answer == 1100.0;
        } catch (NullPointerException e) {
            return false;
        }
    }
}
