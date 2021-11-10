package testingUtils.questionGenerale;

import java.util.function.Predicate;

public class TestQuestion10 implements Predicate<Double> {

    @Override
    public boolean test(Double integer) {
        try {
            return integer == 2;
        } catch (NullPointerException e) {
            return false;
        }
    }
}
