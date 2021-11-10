package interfaces.printers;

import java.util.Scanner;

public interface styleMessage {

    static void helloMessage() {
        System.out.println("=======================================================");
        System.out.println("Hello MR/MRS and Welcome");
        System.out.println("I got for you 3 section of testing");
        System.out.println("You where selected to try your special skills");
        System.out.println("1 your bio. 2 Q/A section. 3 Reaction");
        System.out.println("=======================================================");
        System.out.println("Pressing enter you confirt that you have 18+");
        System.out.println("We don't give a stick about your IQ or EQ");
        System.out.println("Press enter when you are ready to start");
        Scanner start = new Scanner(System.in);
        start.hasNextLine();
    }

    static void goodBuyMessage() {
        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
        System.out.println("Thank you for using our test. Have a great day and take with you a part of love");
        final int N = 2;

        for (int i = 0; i < N; i++) {
            for (int j = 0; j <= 4 * N; j++) {
                double d1 = Math.sqrt(Math.pow(i - N, 2) + Math.pow(j - N, 2));
                double d2 = Math.sqrt(Math.pow(i - N, 2) + Math.pow(j - 3 * N, 2));

                if (d1 < N + 0.5 || d2 < N + 0.5) {
                    System.out.print('*');
                } else {
                    System.out.print(' ');
                }
            }
            System.out.print(System.lineSeparator());
        }

        for (int i = 1; i < 2 * N; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(' ');
            }

            for (int j = 0; j < 4 * N + 1 - 2 * i; j++) {
                System.out.print('*');
            }

            System.out.print(System.lineSeparator());
        }
        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
    }

    static void introductionNameAndSurnameMessage() {
        System.out.println("1. Your name/surname must not have number");
        System.out.println("2. Your name/surname is more than 3 letters");
        System.out.println("3. Example of valid data: Grosu Sergiu");
        System.out.println("Enter name and surname:");
    }

    static void introductionPhoneNumberMessage() {
        System.out.println("1. Your number must be in Moldovean region");
        System.out.println("Enter telephone number:");
    }

    static void introductionAgeMessage() {
        System.out.println("Enter age:");
    }

    static void introductionEmailMessage() {
        System.out.println("Enter Email:");
    }

    static void introductionTestingKnowledgeMessage() {
        System.out.println("Know we gonna test your general knowledge, be ready and good luck.");
        System.out.println("You have 3 minutes to answer 10 question.");
        System.out.println("To proceed press Enter");
    }
}
