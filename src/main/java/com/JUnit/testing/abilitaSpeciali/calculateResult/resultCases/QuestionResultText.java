package com.JUnit.testing.abilitaSpeciali.calculateResult.resultCases;
import interfaces.calculateResult.QuestionResultValidationInterface;
public class QuestionResultText implements QuestionResultValidationInterface{

    @Override
    public void switchReactionResult(double resultQA) {
        if (resultQA <= TEN) {
            System.out.println("You are very carefull person ^_^");
        } else if (resultQA > TEN && resultQA <= THIRTY) {
            System.out.println("Good result, you are in top 50% of all players.");
        } else if (resultQA > THIRTY && resultQA <= FORTYFIVE) {
            System.out.println("Ai o reație grozavă! Wow, bravo maestre!!");
        } else if (resultQA > FORTYFIVE && resultQA <= SIXTY) {
            System.out.println("Ești în top printre persoane rezistente. Ești foarte acurat la acționi și reacțiuni");
        } else if (resultQA > SIXTY) {
            System.out.println("Tu te-ai antrenat din copilărie. Ți-ai antrenat partea prefrontală a creierul" +
                    " să execute grele motorii funcții în coordinare cu vederea, unical șlefuit în planul cognitivității individuale");
        }
    }
}
