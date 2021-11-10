package com.JUnit.test.utils.contattiValidation;

import com.JUnit.testing.abilitaSpeciali.testingUtils.contattiUtils.Age;
import com.JUnit.testing.abilitaSpeciali.testingUtils.contattiUtils.Email;
import com.JUnit.testing.abilitaSpeciali.testingUtils.contattiUtils.NameAndSurname;
import com.google.i18n.phonenumbers.PhoneNumberUtil;
import com.google.i18n.phonenumbers.Phonenumber;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import com.JUnit.testing.abilitaSpeciali.testingUtils.contattiUtils.TelephonNumberValidator;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

public class contattiTestQuestions {

    private TelephonNumberValidator underTest;
    private Age ageTest;
    private NameAndSurname nameAndSurname;
    private Email email;

    @BeforeEach
    public void setUp() {
        underTest = new TelephonNumberValidator();
        ageTest = new Age();
        nameAndSurname = new NameAndSurname();
        email = new Email();
    }

    @ParameterizedTest
    @DisplayName("Test telephone number")
    @CsvSource({"069083535, TRUE", "69013648, TRUE", "224,false", "14241431341341,false",
            "+373069083535, true", "+624324234244, false", "+373, false", "phonuNumber, false",
            "+373phone3535,false", "69phone5, false", "         ,false", "07935, false"})
    public void itShouldValidatePhoneNumber1(String phoneNumber, String expected) {
        boolean isValid = underTest.test(phoneNumber);
        assertThat(isValid).isEqualTo(Boolean.valueOf(expected));
    }

    @ParameterizedTest
    @DisplayName("Test age validation")
    @CsvSource({"0, false", "10, false", "18, true", "45, true", "68, true",
            "130, false", "1a3, false", "a2, false", " , false", "0018, true", "00s003, false"})
    public void itShouldValidateAge(String age, String expected) {
        boolean isValid = ageTest.test(age);
        assertThat(isValid).isEqualTo(Boolean.valueOf(expected));
    }

    @ParameterizedTest
    @DisplayName("Test Name and Surname validation")
    @CsvSource({"Grosu Sergiu, true", "10 104, false", "Gr0su S3ergiu, false", "(RoSu Sergiu, false",
            "Grosu S)ergiu, false", "Gr\\,nsu Sergiu, false", "GrosuSergiu, false", "     Grosu Sergiu  , true",
            "Гросу Сергей      , true", "Гр0су С3ргей, false", "regx Work Fine I like It, true", "This    ,false", " Th , false"})
    public void itShouldValidateNameAndSurname(String name, String expected) {
        boolean isValid = nameAndSurname.test(name);
        assertThat(isValid).isEqualTo(Boolean.valueOf(expected));
    }

    @ParameterizedTest
    @DisplayName("Test email validation")
    @CsvSource({"sergiu.com, false", "grosu@sergiu.com, true", "grosu@internet.ru, true", "grosu@bk.ru, true",
            "grosu@inbox.ru, true", "grosu@list.ru, true", "gr0su@tib-uqa.c0m, false", "gr0su@tib-uqa.com, true",
            "grosuinboxu@.ru, false", "grosuinbox.ru@, false", "@inbox@.ru, false"})
    public void itShouldValidateEmail(String mail, String expected) {
        boolean isValid = email.test(mail);
        assertThat(isValid).isEqualTo(Boolean.valueOf(expected));
    }


    @Test
    @DisplayName("Should fail when length is bigger than 13")
    public void itShouldValidatePhoneNumberWhenIncorrect() {
        String phoneNumber = "000069083535";
        boolean isValid = underTest.test(phoneNumber);
        assertThat(isValid).isFalse();
    }

    @Test
    @DisplayName("Should fail when length is less than 12")
    public void itShouldValidatePhoneNumberWhenNumberIsNotFull() {
        String phoneNumber = "373000";
        boolean isValid = underTest.test(phoneNumber);
        assertThat(isValid).isFalse();
    }

    @Test
    @DisplayName("Test phoneNumber using google validator")
    public void itShouldValidatePhoneNumber() {
        String phoneNumber = "069083535";

        Phonenumber.PhoneNumber number = new Phonenumber.PhoneNumber();
        PhoneNumberUtil phoneNumberUtil = PhoneNumberUtil.getInstance();
        number.setCountryCode(373);

        number.setNationalNumber(Long.parseLong(phoneNumber));
        Assertions.assertTrue(phoneNumberUtil.isPossibleNumberForType(number, PhoneNumberUtil.PhoneNumberType.FIXED_LINE));
    }


}
