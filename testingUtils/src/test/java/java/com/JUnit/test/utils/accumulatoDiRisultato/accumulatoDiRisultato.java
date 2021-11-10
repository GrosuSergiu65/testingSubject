package java.com.JUnit.test.utils.accumulatoDiRisultato;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import testingUtils.accumulatoDiRisultati.AccumulatiValidation;

import static org.assertj.core.api.Assertions.assertThat;

public class accumulatoDiRisultato {
    private AccumulatiValidation accumulatiTest;

    @BeforeEach
    public void setUp() {
        accumulatiTest = new AccumulatiValidation();
    }

    @ParameterizedTest
    @Timeout(120)
    @DisplayName("Test time of method and result time must be positive integer || 0")
    @CsvSource({"15, TRUE", "0, TRUE", "150,true", "-15,false",
            " , false"})
    public void itShouldValidatePhoneNumber1(Integer resultReaction, String expected) {
        boolean isValid = accumulatiTest.test(resultReaction);
        assertThat(isValid).isEqualTo(Boolean.valueOf(expected));
    }
}
