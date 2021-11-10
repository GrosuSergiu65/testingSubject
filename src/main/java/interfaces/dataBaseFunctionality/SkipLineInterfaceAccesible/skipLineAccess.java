package interfaces.dataBaseFunctionality.SkipLineInterfaceAccesible;

import java.util.Scanner;

public interface skipLineAccess {
    static void skipLines(Scanner scan, int startWithLine) {
        for (int i = 0; i < startWithLine; i++) {
            if (scan.hasNextLine()) scan.nextLine();
        }
    }
}
