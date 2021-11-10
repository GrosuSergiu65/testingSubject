package dataBaseFunctionality;

import interfaces.dataBaseFunctionality.WritingToDB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import static calculateResult.AccumuloDiRisultati.getResultQA;
import static calculateResult.AccumuloDiRisultati.getResultReact;
import static contatti.CollectSubjectInformation.*;


public class WriteDataToDB implements WritingToDB {

    static Connection connection;
    static Statement statement;
    static boolean resultSet;

    @Override
    public void writeInDataBase() {
        try
        {
            String query = ( "INSERT INTO public.\"Subjects\" " +
                    "values ('"+getNameAndsurname()+"','"+getAge()+"','"+getTelefono()+"','"+getEmail()+"','"+getResultReact()+"','"+getResultQA()+"') ;" );

            Class.forName("org.postgresql.Driver");

            connection = DriverManager.getConnection ("jdbc:postgresql://localhost:5432/PsychologicalTest","postgres","Aduvareda291995");
            connection.isValid(1);
            statement = connection.createStatement();
            resultSet = statement.execute(query);


            System.out.println("***"+getNameAndsurname() + " = is added to Data Base!***");
            connection.isValid(1);
            statement.close();
            connection.close();

        } catch ( SQLException | ClassNotFoundException e) {
            System.out.println(ANSI_CYAN+"Subject is already set in the Data Base. You can't add duplicate subject"+ANSI_RESET);
        }
    }
}
