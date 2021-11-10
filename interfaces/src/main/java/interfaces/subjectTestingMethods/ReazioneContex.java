package interfaces.subjectTestingMethods;

public interface ReazioneContex {

    int TIME_LIMIT = 1000 * 60;
    int BREATHER = 500;
    int GREEN_LIGHT_MAX_TIME = 4000;
    int THOUSAND = 1000;
    int TWOTHOUSAND = 2000;




    String ANSI_RED = "\u001B[31m";
    String ANSI_RESET = "\u001B[0m";
    String ANSI_GREEN = "\u001B[32m";

    void reazioneTest() throws InterruptedException;

    void frontMan();

    void player();

    void sleep(int time);
}
