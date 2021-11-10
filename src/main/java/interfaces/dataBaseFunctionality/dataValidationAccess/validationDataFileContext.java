package interfaces.dataBaseFunctionality.dataValidationAccess;

public interface validationDataFileContext {

    String ANSI_RED = "\u001B[31m";
    String ANSI_RESET = "\u001B[0m";

    boolean NameAndSurnameValidate();

    boolean TelefonoValidate();

    boolean AgeValidate();

    boolean EmailValidate();

    boolean ResultReactionValidate();

    boolean ResultQAValidate();

}
