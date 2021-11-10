package dataBaseFunctionality.dataValidation;

import testingUtils.accumulatoDiRisultati.PercentValidator;
import testingUtils.contattiUtils.Age;
import testingUtils.contattiUtils.Email;
import testingUtils.contattiUtils.NameAndSurname;
import testingUtils.contattiUtils.TelephonNumberValidator;
import interfaces.dataBaseFunctionality.dataValidationAccess.validationDataFileContext;

import static calculateResult.AccumuloDiRisultati.getResultQA;
import static calculateResult.AccumuloDiRisultati.getResultReact;
import static contatti.CollectSubjectInformation.*;

public class DataFromFileValidator implements validationDataFileContext {

    protected static NameAndSurname nameAndSurnameValidator = new NameAndSurname();
    protected static TelephonNumberValidator telephoneValidator = new TelephonNumberValidator();
    protected static Age ageValidator = new Age();
    protected static Email emailValidator = new Email();
    protected static PercentValidator reactionPercent = new PercentValidator();
    protected static PercentValidator questionPercent = new PercentValidator();

    @Override
    public boolean NameAndSurnameValidate() {
        if (!nameAndSurnameValidator.test(getNameAndsurname())) {
            System.out.println("You try to introduce inappropriate Name&Surname in DB : "
                    + ANSI_RED + getNameAndsurname() + ANSI_RESET);
            return false;
        }
        return true;
    }

    @Override
    public boolean TelefonoValidate() {
        if (!telephoneValidator.test(getTelefono())) {
            System.out.println("You try to introduce inappropriate PhoneNumber in DB : "
                    + ANSI_RED + getTelefono() + ANSI_RESET + " ,for this subject " + ANSI_RED + getNameAndsurname() + ANSI_RESET);
            return false;
        }
        return true;
    }

    @Override
    public boolean AgeValidate() {
        if (!ageValidator.test(getAge())) {
            System.out.println("You try to introduce inappropriate Age in DB : "
                    + ANSI_RED + getAge() + ANSI_RESET + " ,for this subject " + ANSI_RED + getNameAndsurname() + ANSI_RESET);
            return false;
        }
        return true;
    }

    @Override
    public boolean EmailValidate() {
        if (!emailValidator.test(getEmail())) {
            System.out.println("You try to introduce inappropriate Email in DB : "
                    + ANSI_RED + getEmail() + ANSI_RESET + " ,for this subject " + ANSI_RED + getNameAndsurname() + ANSI_RESET);
            return false;
        }
        return true;
    }

    @Override
    public boolean ResultReactionValidate() {
        if (!reactionPercent.test(getResultReact())) {
            System.out.println("You try to introduce inappropriate Reaction Result in DB : " + ANSI_RED
                    + getResultReact() + ANSI_RESET + " ,for this subject " + ANSI_RED + getNameAndsurname() + ANSI_RESET);
            return false;
        }
        return true;
    }

    @Override
    public boolean ResultQAValidate() {
        if (!questionPercent.test(getResultQA())) {
            System.out.println("You try to introduce inappropriate Question Reuslt in DB : "
                    + ANSI_RED + getResultQA() + ANSI_RESET + " ,for this subject " + ANSI_RED + getNameAndsurname() + ANSI_RESET);
            return false;
        }
        return true;
    }
}

