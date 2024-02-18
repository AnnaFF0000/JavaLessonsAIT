package lesson09;

import static java.lang.Math.*;

import java.util.Scanner;

public class Homework_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int randomNumber;
        boolean newGame = false;
        String Answer;

        do {
            randomNumber = (int) (Math.random() * 100) + 1;
            System.out.println(randomNumber);
            int attempts = 1;
            int number;


            System.out.println(" Rate die Zahl. Gebe eine Zahl zwischen 1 und 100 ein. Du hast dabei 5 Versuche: ");
            number = scanner.nextInt();

            do {

                if (number == randomNumber) {
                    System.out.println("Glückwunsch! Du hast die Zahl " + randomNumber + " beim " + attempts + ". Versuch erraten!");
                    break;
                } else if (number > randomNumber) {
                    System.out.println("Schade! Deine Zahl ist größer als die gesuchte Zahl! Du hast noch " + (5-attempts) + " Versuche. Gebe eine Zahl ein:  ");
                } else {
                    System.out.println("Schade! Deine Zahl ist kleiner als die gesuchte Zahl! Du hast noch " + (5-attempts) + " Gebe eine Zahl ein: ");
                }
                number = scanner.nextInt();
                attempts++;

            } while (attempts < 5);
            System.out.println("Möchtest du das Spiel nochmal spielen: y/n ? ");
            Answer = scanner.next();
            if (Answer.equalsIgnoreCase("y")) {
                newGame = true;
            }else newGame = false;
        } while (newGame);
        System.out.println("Danke fürs Spielen. Ende. ");
        scanner.close();
    }
}












































