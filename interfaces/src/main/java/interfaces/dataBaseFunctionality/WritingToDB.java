package interfaces.dataBaseFunctionality;

public interface WritingToDB {

    String ANSI_CYAN = "\u001B[36m";
    String ANSI_RESET = "\u001B[0m";

    void writeInDataBase();
}
