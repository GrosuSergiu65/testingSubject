package contatti;

import testingUtils.contattiUtils.Age;
import testingUtils.contattiUtils.Email;
import testingUtils.contattiUtils.NameAndSurname;
import testingUtils.contattiUtils.TelephonNumberValidator;
import interfaces.contattiSubject.OutputInformationAboutSubject;
import static interfaces.printers.styleMessage.introductionNameAndSurnameMessage;
import static interfaces.printers.styleMessage.introductionPhoneNumberMessage;
import static interfaces.printers.styleMessage.introductionAgeMessage;
import static interfaces.printers.styleMessage.introductionEmailMessage;

import java.util.Scanner;

public class CollectSubjectInformation implements OutputInformationAboutSubject {

    static String nameAndsurname;
    static String telefono;
    static String age;
    static String email;

    @Override
    public void registerNewUser() {
        Scanner scanString = new Scanner(System.in);

        NameAndSurname nameAndSurnameValidator = new NameAndSurname();
        do {
            introductionNameAndSurnameMessage();
            nameAndsurname = scanString.nextLine();
        } while (!nameAndSurnameValidator.test(nameAndsurname));

        TelephonNumberValidator telephoneValidator = new TelephonNumberValidator();
        do {
            introductionPhoneNumberMessage();
            telefono = scanString.nextLine();
        } while (!telephoneValidator.test(telefono));

        Age ageValidator = new Age();
        do {
            introductionAgeMessage();
            age = scanString.nextLine();
        } while (!ageValidator.test(age));

        Email emailValidator = new Email();
        introductionEmailMessage();
        email = scanString.nextLine();
        if (!emailValidator.test(email)) {
            throw new IllegalStateException("Email " + email + " is not valid!");
        }
    }

    public static String getNameAndsurname() {
        return nameAndsurname;
    }

    public static String getTelefono() {
        return telefono;
    }

    public static String getAge() {
        return age;
    }

    public static String getEmail() {
        return email;
    }

    public static void setNameAndSurname(String nameAndsurname) {
        CollectSubjectInformation.nameAndsurname = nameAndsurname;
    }

    public static void setTelefono(String telefono) {
        CollectSubjectInformation.telefono = telefono;
    }

    public static void setAge(String age) {
        CollectSubjectInformation.age = age;
    }

    public static void setEmail(String email) {
        CollectSubjectInformation.email = email;
    }
}
