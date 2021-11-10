package interfaces.subjectTestingMethods;

public interface QuestionContext {

    String question1 = "În ce an s-a scufundat Titanicul în Oceanul Atlantic, la 15 aprilie, în călătoria sa de fată din Southampton?";
    String question2 = "Care este numele celei mai mari companii tehnologice din Coreea de Sud?";
    String question3 = "Câte respirații are corpul uman zilnic?";
    String question4 = "Ce roată nu se învârtește în timpul cotirii la dreapta?";
    String question5 = "Care este continuarea logică a șirului de numere 1, 2, 4, 8, …";
    String question6 = "3+3(3-3)3 = ??";
    String question7 = "Ești într-o cursă sportivă. Te afli pe locul 3. Întreci pe adversarul din locul 2. Pe ce loc ești?";
    String question8 = "6*7=??";
    String question9 = "Calculaţi în minte : 1000+20+30+20+20+10=??";
    String question10 = "Care este împărițot în cazul ecuației: 8 : 2 = 4";

    default void questionText(String question) {
        switch (question) {
            case "question1":
                System.out.println("First Question: " + question1);
                System.out.println("Alege litera cu răspunsul corect");
                System.out.println("Variante de răspuns:");
                System.out.println("a) 1920                                    b) 1914");
                System.out.println("c) 1884                                    d) 1912");
                break;
            case "question2":
                System.out.println("Second Question: " + question2);
                System.out.println("Alege litera cu răspunsul corect");
                System.out.println("Variante de răspuns:");
                System.out.println("a) Samsung                                    b) Apple");
                System.out.println("c) Nvidia                                     d) Anyohaseo Incorporated");
                break;
            case "question3":
                System.out.println("Third Question: " + question3);
                System.out.println("Alege litera cu răspunsul corect");
                System.out.println("Variante de răspuns: În jur de ...");
                System.out.println("a) 45000                                     b) 15000");
                System.out.println("c) 20000                                     d) 30000");
                break;
            case "question4":
                System.out.println("Fourth Question: " + question4);
                System.out.println("Introdu varianta ta de răspuns");
                break;
            case "question5":
                System.out.println("Fifth Question: " + question5);
                System.out.println("Introdu varianta ta de răspuns");
                break;
            case "question6":
                System.out.println("Sixth Question: " + question6);
                System.out.println("Introdu varianta ta de răspuns");
                break;
            case "question7":
                System.out.println("Seventh Question: " + question7);
                System.out.println("Introdu cifra cu locul poziției tale în cursă");
                break;
            case "question8":
                System.out.println("Eighth Question: " + question8);
                System.out.println("Introdu varianta ta de răspuns");
                break;
            case "question9":
                System.out.println("Ninth Question: " + question9);
                System.out.println("Introdu valoarea sumară a numerelor");
                break;
            case "question10":
                System.out.println("Ninth Question: " + question10);
                System.out.println("Introdu valoarea împărțitorului");
                break;
        }
    }
}
