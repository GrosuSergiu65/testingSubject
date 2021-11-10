package com.JUnit.testing.abilitaSpeciali.calculateResult;

import com.JUnit.testing.abilitaSpeciali.calculateResult.resultCases.QuestionResultText;
import com.JUnit.testing.abilitaSpeciali.calculateResult.resultCases.ReactionResultText;
import com.JUnit.testing.abilitaSpeciali.contatti.CollectSubjectInformation;
import com.JUnit.testing.abilitaSpeciali.subjectTestingMethods.ConoscenzaGenerale;
import com.JUnit.testing.abilitaSpeciali.subjectTestingMethods.Reazione;
import com.JUnit.testing.abilitaSpeciali.testingUtils.accumulatoDiRisultati.PercentValidator;
import interfaces.calculateResult.AccumuloDiRisultatInterface;
import interfaces.calculateResult.QuestionResultValidationInterface;
import interfaces.calculateResult.ReactionResultValidationInterface;


import java.text.DecimalFormat;

public class AccumuloDiRisultati extends CollectSubjectInformation implements AccumuloDiRisultatInterface {

    private static double resultReact;
    private static double resultQA;

    static QuestionResultValidationInterface reactionTestObj = new QuestionResultText();
    static ReactionResultValidationInterface questionTestObj = new ReactionResultText();

    @Override
    public void accumuloRisultati() {
        DecimalFormat numberFormat = new DecimalFormat("#.00");

        System.out.println("***********************************************");
        System.out.println("Mr/Mrs: " + CollectSubjectInformation.getNameAndsurname());
        System.out.print("Age: " + CollectSubjectInformation.getAge());
        System.out.print("       Phone: " + CollectSubjectInformation.getTelefono());
        System.out.println("       Email: " + CollectSubjectInformation.getEmail());
        System.out.println("***********************************************");

        System.out.println("===================================================");
        double resultReaction = Reazione.getPressCount();
        PercentValidator reactionPercent = new PercentValidator();
        if (!reactionPercent.test(resultReaction)) {
            throw new IllegalStateException("Reaction result " + numberFormat.format(resultReaction) +
                    " is not valid! Please contact us via: weDontCareAboutYourProblem@haveGood.day");
        }

        resultReact = ((resultReaction / SIXTEENSECONDS) * PERCENT_HUNDRED);
        System.out.println("Your result on Reaction test is: " + numberFormat.format(resultReact) + "%");
        if ((int) (Math.round(resultReact / TEN) * TEN) >= PERCENT_HUNDRED) {
            resultReact = PERCENT_HUNDRED;
        }
        reactionTestObj.switchReactionResult((int) resultReact);
        System.out.println("===================================================");
        
        double resultQuestion = ConoscenzaGenerale.getResultPoints();
        PercentValidator questionPercent = new PercentValidator();
        if (!questionPercent.test(resultQuestion)) {
            throw new IllegalStateException("Question result " + numberFormat.format(questionPercent) +
                    " is not valid! Please contact us via: weDontCareAboutYourProblem@haveGood.day");
        }

        resultQA = (resultQuestion / TEN) * TEN;
        System.out.println("Your result on Question is: " + numberFormat.format(resultQA) + "%");
        questionTestObj.switchQuestionResult((int) resultQA);
    }

    public static double getResultReact() {
        return resultReact;
    }

    public static void setResultReact(double resultReact) {
        AccumuloDiRisultati.resultReact = resultReact;
    }

    public static double getResultQA() {
        return resultQA;
    }

    public static void setResultQA(double resultQA) {
        AccumuloDiRisultati.resultQA = resultQA;
    }
}
