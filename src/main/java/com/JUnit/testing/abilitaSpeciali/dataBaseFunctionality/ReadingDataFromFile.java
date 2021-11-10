package com.JUnit.testing.abilitaSpeciali.dataBaseFunctionality;

import com.JUnit.testing.abilitaSpeciali.contatti.CollectSubjectInformation;
import com.JUnit.testing.abilitaSpeciali.dataBaseFunctionality.dataValidation.DataFromFileValidator;
import com.JUnit.testing.abilitaSpeciali.mainMethod;
import interfaces.contattiSubject.OutputInformationAboutSubject;
import interfaces.dataBaseFunctionality.ReadingContextFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import static com.JUnit.testing.abilitaSpeciali.calculateResult.AccumuloDiRisultati.*;
import static com.JUnit.testing.abilitaSpeciali.contatti.CollectSubjectInformation.setNameAndSurname;
import static interfaces.dataBaseFunctionality.SkipLineInterfaceAccesible.skipLineAccess.skipLines;

public class ReadingDataFromFile extends DataFromFileValidator implements ReadingContextFile {

    @Override
    public void readData(String filePath) {

        try (Scanner input = new Scanner(new File(filePath))) {
            skipLines(input, 1);

            while (input.hasNextLine()) {
                String line = input.nextLine();
                String subjectName = "";

                //LineBased processing
                try (Scanner data = new Scanner(line)) {

                    while (!data.hasNextInt()) {
                        setNameAndSurname(subjectName += data.next() + " ");
                    }

                    setNameAndSurname(subjectName.trim());
                    if (!NameAndSurnameValidate()) {
                        supplierNames1.add(getNameAndsurname());
                        continue;
                    }

                    //get age
                    if (data.hasNextInt()) {
                        setAge(data.next());
                        if (!AgeValidate()) {
                            supplierNames1.add(getNameAndsurname());
                            continue;
                        }
                    }

                    //get phoneNumber
                    if (data.hasNextInt()) {
                        setTelefono(data.next());
                        if (!TelefonoValidate()) {
                            supplierNames1.add(getNameAndsurname());
                            continue;
                        }
                    }

                    //get email
                    if (data.hasNext()) {
                        setEmail(data.next());
                        if (!EmailValidate()) {
                            supplierNames1.add(getNameAndsurname());
                            continue;
                        }
                    }

                    //get ReactionResult
                    if (data.hasNextDouble()) {
                        setResultReact(data.nextDouble());
                        if (!ResultReactionValidate()) {
                            supplierNames1.add(getNameAndsurname());
                            continue;
                        }
                    }

                    //get QuestionResult
                    if (data.hasNextDouble()) {
                        setResultQA(data.nextDouble());
                        if (!ResultQAValidate()) {
                            supplierNames1.add(getNameAndsurname());
                            continue;
                        }
                    }
                    mainMethod.storingDataInDataBase.writeInDataBase();
                }
            }
            System.out.println("*****************************************************************************************************************************");
            System.out.println("We got  problem to add these subjects. Please review data, if data is set right please contact us on: Antumbra@penumbra.umbra");
            System.out.println(supplierNames1);
            System.out.println("*****************************************************************************************************************************");

        } catch (FileNotFoundException e) {
            System.out.println("Problem is on the ReadingDataFromFile.class"+e);
        }

    }

    @Override
    public void readData() {
        OutputInformationAboutSubject collectInformationSubject = new CollectSubjectInformation();
        collectInformationSubject.registerNewUser();
    }
}
