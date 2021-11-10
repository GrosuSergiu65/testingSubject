package testingUtils.accumulatoDiRisultati;

import java.util.function.Predicate;

public class AccumulatiValidation implements Predicate<Integer> {

    @Override
    public boolean test(Integer reactionResult) {
        try {
            return reactionResult >= 0;
        } catch (NullPointerException e) {
            return false;
        }
    }
}
