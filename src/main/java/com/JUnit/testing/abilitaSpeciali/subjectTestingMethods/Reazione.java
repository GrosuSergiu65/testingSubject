package com.JUnit.testing.abilitaSpeciali.subjectTestingMethods;

import java.util.Random;
import java.util.Scanner;

public class Reazione implements interfaces.subjectTestingMethods.ReazioneContex {

    private static int pressCount = 0;
    private static boolean gameOver = false;

    private static Scanner scanner;

    @Override
    public void reazioneTest() throws InterruptedException {
        scanner = new Scanner(System.in);

        pressCount = 0;
        gameOver = false;
        System.out.println("\n =============================");
        System.out.print("Starting the Reazione test : " + ANSI_RED + "Red Light" + ANSI_RESET + " / " + ANSI_GREEN + "Green Light" + ANSI_RESET);
        System.out.println();
        System.out.println("When Green Light, Please press the Enter button continuously.");
        System.out.println("Stop pressing once you see" + ANSI_RED + " Red light" + ANSI_RESET);
        scanner.nextLine();

        Thread frontMan = new Thread(frontManObj::frontMan); //frontManObj is in the Interface
        Thread player = new Thread(playerObj::player); //layerObj find it in Interface

        frontMan.start();
        player.start();

        frontMan.join();
        player.join();

        testObj.test(pressCount);
    }

    @Override
    public void frontMan() {
        int timeRemain = TIME_LIMIT;
        Random random = new Random();
        do {

            int dollCountingTime = random.nextInt(Math.min(timeRemain, GREEN_LIGHT_MAX_TIME)) + THOUSAND;
            System.out.printf(ANSI_GREEN + "Green Light" + ANSI_RESET + " Time remain: %d seconds (current score %d ): %n", timeRemain / THOUSAND, pressCount);
            System.out.println();

            timeRemain -= dollCountingTime;

            sleep(dollCountingTime);

            System.out.println(ANSI_RED + "Red Light" + ANSI_RESET);

            int lastPressedInGreenLight = pressCount;
            int scanningForMovements = random.nextInt(TWOTHOUSAND) + BREATHER;
            sleep(scanningForMovements);
            timeRemain -= scanningForMovements;

            if (pressCount != lastPressedInGreenLight) {
                gameOver = true;
                pressCount = lastPressedInGreenLight;
                break;
            }
        } while (timeRemain >= 0);

        System.out.println("Your score is: " + pressCount);
        System.out.println("press enter to proceed");
        gameOver = true;
        scanner = new Scanner(System.in);
    }

    @Override
    public void player() {
        while (!gameOver) {
            scanner.nextLine();
            pressCount++;
        }
    }

    @Override
    public void sleep(int time) {
        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static int getPressCount() {
        return pressCount;
    }
}
