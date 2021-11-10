package com.JUnit.test.utils.testValidation;

import com.JUnit.testing.abilitaSpeciali.testingUtils.questionGenerale.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

public class TestValidation {

    private TestQuestion1 test1;
    private TestQuestion2 test2;
    private TestQuestion3 test3;
    private TestQuestion4 test4;
    private TestQuestion5 test5;
    private TestQuestion6 test6;
    private TestQuestion7 test7;
    private TestQuestion8 test8;
    private TestQuestion9 test9;
    private TestQuestion10 test10;

    @BeforeEach
    public void setUp() {
        test1 = new TestQuestion1();
        test2 = new TestQuestion2();
        test3 = new TestQuestion3();
        test4 = new TestQuestion4();
        test5 = new TestQuestion5();
        test6 = new TestQuestion6();
        test7 = new TestQuestion7();
        test8 = new TestQuestion8();
        test9 = new TestQuestion9();
        test10 = new TestQuestion10();
    }

    @ParameterizedTest
    @DisplayName("First question has answer b or 1912")
    @CsvSource({"d, true", "1912, true", "c, false", "cb, false",
            "b1912, false", "1912b, false", "  ,false", "     d,true", "   1912  ,true", "  1912  ,true", " d d d d, true"})
    public void Question1Test(String answer, String expected) {
        boolean isValid = test1.test(answer);
        assertThat(isValid).isEqualTo(Boolean.valueOf(expected));
    }

    @ParameterizedTest
    @DisplayName("Second question has answer a or Samsung")
    @CsvSource({"a, true", "sAmSunG, true", "c, false", "cb, false",
            "aSamsung, false", "dacksdpokcwawc, false", "  ,false", "     Samsung,true", "   a  ,true", "  Samsung Samsung Samsung  ,false", " a a a a, true"})
    public void Question2Test(String answer, String expected) {
        boolean isValid = test2.test(answer);
        assertThat(isValid).isEqualTo(Boolean.valueOf(expected));
    }

    @ParameterizedTest
    @DisplayName("Third question has answer c or number in range BETWEEN 17501 AND 22499")
    @CsvSource({"c, true", "18000, true", "a, false", "cb, false",
            "c20000, false", "dacksdpokcwawc, false", "  ,false", "     c,true", "   21543  ,true", "  Samsung Samsung Samsung  ,false", " c cc c, true"})
    public void Question3Test(String answer, String expected) {
        boolean isValid = test3.test(answer);
        assertThat(isValid).isEqualTo(Boolean.valueOf(expected));
    }

    @ParameterizedTest
    @DisplayName("Fourth question has answer rezerv in it")
    @CsvSource({"rezerv, true", "18000, false", "rezer, false", "r3z3r, false",
            "roata, false", "fnu921rezerv94109fj, true", "  ,false", "     rezerv,true", "   -_-rezerv-_-  ,true", "  rezervă rezerva rezerv0asiM0  ,true", " c crezervc c, true"})
    public void Question4Test(String answer, String expected) {
        boolean isValid = test4.test(answer);
        assertThat(isValid).isEqualTo(Boolean.valueOf(expected));
    }

    @ParameterizedTest
    @DisplayName("Fifth question has answer 16 || sixteen")
    @CsvSource({"16, true", "sixteen, true", "15616, false", "s1xte3n, false",
            "1616, false", "sixteensixteensixteendada!, true", "  ,false", "     sixteen,true", "   -_-sixteen-_-  ,true", "  I think the answer is sixteen  ,true", " c 16 c, true"})
    public void Question5Test(String answer, String expected) {
        boolean isValid = test5.test(answer);
        assertThat(isValid).isEqualTo(Boolean.valueOf(expected));
    }

    @ParameterizedTest
    @DisplayName("Sixth question has answer 3")
    @CsvSource({"3.1, false", "   3.0   , true", "6.03, false", "33, false",
            "33333, false", "4324, false", "  ,false", "     3  ,true"})
    public void Question6Test(Double answer, String expected) {
        boolean isValid = test6.test(answer);
        assertThat(isValid).isEqualTo(Boolean.valueOf(expected));
    }

    @ParameterizedTest
    @DisplayName("Seventh question has answer 2")
    @CsvSource({"3, false", "   2   , true", "1, false", "12, false",
            "22222, false", "    -2   , false", "  , false", "98732,false"})
    public void Question7Test(Double answer, String expected) {
        boolean isValid = test7.test(answer);
        assertThat(isValid).isEqualTo(Boolean.valueOf(expected));
    }

    @ParameterizedTest
    @DisplayName("Eighth question has answer 42")
    @CsvSource({"4242, false", "   42   , true", "24, false", "423, false",
            "22222, false", "    -42   , false", "  , false", "98732,false"})
    public void Question8Test(Integer answer, String expected) {
        boolean isValid = test8.test(answer);
        assertThat(isValid).isEqualTo(Boolean.valueOf(expected));
    }

    @ParameterizedTest
    @DisplayName("Ninth question has answer 1100||1100.0")
    @CsvSource({"1200, false", "   1100   , true", "411004, false", "4314431, false",
            "22222, false", "    -1100   , false", "  , false", " 1100.1,false"})
    public void Question9Test(Double answer, String expected) {
        boolean isValid = test9.test(answer);
        assertThat(isValid).isEqualTo(Boolean.valueOf(expected));
    }

    @ParameterizedTest
    @DisplayName("Ninth question has answer 2")
    @CsvSource({"22, false", "   2   , true", "4444, false", "1231321, false",
            "22222, false", "    -2   , false", "  , false", " 1100,false"})
    public void Question10Test(Double answer, String expected) {
        boolean isValid = test10.test(answer);
        assertThat(isValid).isEqualTo(Boolean.valueOf(expected));
    }

}
