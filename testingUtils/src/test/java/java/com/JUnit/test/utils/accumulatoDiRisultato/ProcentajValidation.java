package java.com.JUnit.test.utils.accumulatoDiRisultato;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import testingUtils.accumulatoDiRisultati.PercentValidator;

import static org.assertj.core.api.Assertions.assertThat;

public class ProcentajValidation {
    private PercentValidator procentTest;

    @BeforeEach
    public void setUp() {
        procentTest = new PercentValidator();
    }

    @ParameterizedTest
    @DisplayName("Test take an int and convert it to % via formule of cuantification: (Result /60)*100")
    @CsvSource({"15, TRUE", "0, TRUE", "150,true", "-15,false",
            " , false", "32, true"})
    public void itVerifyIfNumberCanBeCountifiedInProccent(Double resultReaction, String expected) {
        boolean isValid = procentTest.test(resultReaction);
        assertThat(isValid).isEqualTo(Boolean.valueOf(expected));
    }
}
