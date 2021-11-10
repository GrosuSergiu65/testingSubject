package calculateResult.resultCases;

import interfaces.calculateResult.ReactionResultValidationInterface;

public class ReactionResultText implements ReactionResultValidationInterface {

    @Override
    public void switchQuestionResult(int resultReact) {

        switch ((int) (Math.round(resultReact / TEN) * TEN)) {
            case 0:
                System.out.println("Dacă prostii ar zbura, ar fi întunecos");
                break;
            case 10:
                System.out.println("Ok, am văzut și rezultate mai bune");
                break;
            case 20:
                System.out.println("Not pass");
                break;
            case 30:
                System.out.println("Hai mai sigur, nu e deloc rau");
                break;
            case 40:
                System.out.println("Ghinion");
                break;
            case 50:
                System.out.println("Ai nota trecătoare.. la școală, nu aici! Mai ai de a te pregăti");
                break;
            case 60:
                System.out.println("Zolotaia Seredina, bEneee");
                break;
            case 70:
                System.out.println("Nu e rău, ai nimeri în auditoriu de 70%. ");
                break;
            case 80:
                System.out.println("Asta e destul de nice.. te-ai gândit să depui documente la HArward?");
                break;
            case 90:
                System.out.println("În general e posibilil așa rezultat. Ești probabil un geniu, nu pierdi timp pe astfel de teste");
                break;
            case 100:
                System.out.println("YOU ARE GOD");
                break;
        }
    }
}

