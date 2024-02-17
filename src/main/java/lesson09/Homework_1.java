package lesson09;

import static java.lang.Math.*;
import java.util.Scanner;

public class Homework_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int randomNumber;

        boolean continueGame = true;
        do {
            randomNumber = (int) (Math.random() * 100) + 1;
            int attempts = 0;
            System.out.println(randomNumber);

            while (continueGame) {
                System.out.println("Gebe eine Zahl zwischen 1 und 100 ein: ");
                int number = scanner.nextInt();
                int i = attempts++;


                if (number == randomNumber) {
                    System.out.println("Glückwunsch! Du hast die Zahl " + randomNumber + " beim " + attempts + ". Versuch erraten!");
                    System.out.println("Möchtest du das Spiel nochmal spielen: y/n ? ");
                    String answer;
                    answer = scanner.next();
                    if (answer.equalsIgnoreCase("n")) {
                        System.out.println("Danke fürs Spielen. Ende. ");
                        continueGame = false;
                        scanner.close();
                        continue;
                    }
                } else {
                    continueGame = true;
                    randomNumber = (int) (Math.random() * 100) + 1;
                    System.out.println(randomNumber);
                    int a = attempts++;
                }


                if (number > randomNumber) {

                    System.out.println("Falsch! Deine Zahl ist größer als die gesuchte Zahl! Versuche noch einmal. Gebe eine Zahl ein:  ");
                    int number1 = scanner.nextInt();
                } else {
                    System.out.println("Falsch! Deine Zahl ist kleiner als die gesuchte Zahl! Versuche noch einmal. Gebe eine Zahl ein: ");
                    int number1 = scanner.nextInt();
                }
            }
        }

    }
}






