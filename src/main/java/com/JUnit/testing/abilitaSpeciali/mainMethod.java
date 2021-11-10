package com.JUnit.testing.abilitaSpeciali;

import com.JUnit.testing.abilitaSpeciali.calculateResult.AccumuloDiRisultati;
import com.JUnit.testing.abilitaSpeciali.dataBaseFunctionality.ReadingDataFromFile;
import com.JUnit.testing.abilitaSpeciali.dataBaseFunctionality.WriteDataToDB;
import com.JUnit.testing.abilitaSpeciali.subjectTestingMethods.ConoscenzaGenerale;
import com.JUnit.testing.abilitaSpeciali.subjectTestingMethods.Reazione;
import interfaces.calculateResult.AccumuloDiRisultatInterface;
import interfaces.dataBaseFunctionality.WritingToDB;
import interfaces.subjectTestingMethods.ReazioneContex;
import interfaces.subjectTestingMethods.testingGeneralQuestionKnowledge;

import java.io.File;
import java.io.IOException;

import static interfaces.printers.styleMessage.helloMessage;
import static interfaces.printers.styleMessage.goodBuyMessage;

public class mainMethod {

    static ReazioneContex reactionTestStart = new Reazione();
    static AccumuloDiRisultatInterface actualDiResults = new AccumuloDiRisultati();
    static testingGeneralQuestionKnowledge testingSubjectKnowledge = new ConoscenzaGenerale();
    public static WritingToDB storingDataInDataBase = new WriteDataToDB();
    static ReadingDataFromFile subject = new ReadingDataFromFile();

    private static final String filePath = "F:\\1.txt";

    public static void main(String[] args) {

        try {
            File file = new File(filePath);
            if (file.getCanonicalFile().canExecute()) {
                subject.readData(filePath);
            } else {
                System.out.println("You have not introduce path to readable file. Your path: " + filePath);
                System.out.println("Program will start testing subject:");
                helloMessage();
                subject.readData();
                testingSubjectKnowledge.testingGeneralKnowledge();
                reactionTestStart.reazioneTest();
                actualDiResults.accumuloRisultati();
                goodBuyMessage();
                storingDataInDataBase.writeInDataBase();
            }
        } catch (InterruptedException | IOException interruptedException) {
            interruptedException.printStackTrace();
            System.out.println("We got some problem, i think you introduce inappropriate value in to the console" + interruptedException);
        }
    }
}
