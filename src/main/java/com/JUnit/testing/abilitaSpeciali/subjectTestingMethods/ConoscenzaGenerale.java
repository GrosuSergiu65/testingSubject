package com.JUnit.testing.abilitaSpeciali.subjectTestingMethods;

import com.JUnit.testing.abilitaSpeciali.testingUtils.questionGenerale.*;
import interfaces.subjectTestingMethods.QuestionContext;
import interfaces.subjectTestingMethods.testingGeneralQuestionKnowledge;

import java.util.Scanner;

import static interfaces.printers.styleMessage.introductionTestingKnowledgeMessage;

public class ConoscenzaGenerale implements testingGeneralQuestionKnowledge, QuestionContext {
    static int resultPoints = 0;

    @Override
    public void testingGeneralKnowledge() {
        Scanner answer = new Scanner(System.in);
        introductionTestingKnowledgeMessage();
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();

        TestQuestion1 qa1 = new TestQuestion1();
        questionText("question1");
        String answer1 = answer.nextLine();
        if (qa1.test(answer1)) {
            resultPoints += TENPOINT;
        }

        TestQuestion2 qa2 = new TestQuestion2();
        questionText("question2");
        String answer2 = answer.nextLine();
        if (qa2.test(answer2)) {
            resultPoints += TENPOINT;
        }

        TestQuestion3 qa3 = new TestQuestion3();
        questionText("question3");
        String answer3 = answer.nextLine();
        if (qa3.test(answer3)) {
            resultPoints += TENPOINT;
        }

        TestQuestion4 qa4 = new TestQuestion4();
        questionText("question4");
        String answer4 = answer.nextLine();
        if (qa4.test(answer4)) {
            resultPoints += TENPOINT;
        }

        TestQuestion5 qa5 = new TestQuestion5();
        questionText("question5");
        String answer5 = answer.nextLine();
        if (qa5.test(answer5)) {
            resultPoints += TENPOINT;
        }

        TestQuestion6 qa6 = new TestQuestion6();
        questionText("question6");
        double answer6 = answer.nextDouble();
        if (qa6.test(answer6)) {
            resultPoints += TENPOINT;
        }

        TestQuestion7 qa7 = new TestQuestion7();
        questionText("question7");
        double answer7 = answer.nextDouble();
        if (qa7.test(answer7)) {
            resultPoints += TENPOINT;
        }

        TestQuestion8 qa8 = new TestQuestion8();
        questionText("question8");
        int answer8 = answer.nextInt();
        if (qa8.test(answer8)) {
            resultPoints += TENPOINT;
        }

        TestQuestion9 qa9 = new TestQuestion9();
        questionText("question9");
        double answer9 = answer.nextDouble();
        if (qa9.test(answer9)) {
            resultPoints += TENPOINT;
        }

        TestQuestion10 qa10 = new TestQuestion10();
        questionText("question10");
        double answer10 = answer.nextDouble();
        if (qa10.test(answer10)) {
            resultPoints += TENPOINT;
        }
    }

    public static int getResultPoints() {
        return resultPoints;
    }
}
