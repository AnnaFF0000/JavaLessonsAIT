package lesson_6;

import java.util.Locale;
import java.util.Scanner;

public class homework_lesson_6 {

    // Task #1 Summe von zwei Zahlen

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Gebe die erste Zahl ein: ");
        double num1 = scanner.nextDouble();

        System.out.println("Gebe die zweite Zahl ein: ");
        double num2 = scanner.nextDouble();
        double sum = num1 + num2;
        System.out.println("Die Summe beträgt: " + sum);


        // Task #2 Check: gerade/ ungerade Zahlen

        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Gebe eine Ganzzahl ein: ");
        int nummer = scanner.nextInt();

        if (nummer % 2 == 0) {
            System.out.println(nummer + " : diese Zahl ist gerade.");

        } else {
            System.out.println(nummer + " : diese Zahl ist ungerade.");
        }


        // Task #3: Notendurchschnitt

        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Gebe die erste Note ein");
        int note1 = scanner.nextInt();
        System.out.println("Gebe die zweite Note ein");
        int note2 = scanner.nextInt();
        System.out.println("Gebe die dritte Note ein");
        int note3 = scanner.nextInt();
        System.out.println("Gebe die vierte Note ein");
        int note4 = scanner.nextInt();
        System.out.println("Gebe die fünfte Note ein");
        int note5 = scanner.nextInt();

        double notendurchschnitt = ((note1 + note2 + note3 + note4 + note5) / 5);
        System.out.println("Deine Durchschnittsnote ist: " + notendurchschnitt);

        //Task #4:
        Scanner scanner3 = new Scanner(System.in);
        System.out.println("Gebe die Warenkategorie ein (Elektronik oder Kleidung): ");
        String kategorie = scanner.next();
        System.out.println("Gebe Deine Region ein (A oder B): ");
        String region = scanner.next();
        double steuerWare;
        double steuerRegion;

        if (kategorie.equals("Elektronik")) {
            steuerWare = 0.1;
        } else {
            steuerWare = 0.05;
        }
        if (region.equals("A")) {
            steuerRegion = 0.02;
        } else {
            steuerRegion = 0;
        }

        double steuerGesamt = steuerWare + steuerRegion;
        System.out.println("Deine Gesamtsteuer: " + steuerGesamt + "%");


        // Task #5

        Scanner scanner4 = new Scanner(System.in);
        System.out.println("Geben Sie die Urzeit ein. Die Stunde:  ");
        int stunden = scanner4.nextInt();
        System.out.println("Geben Sie die Urzeit ein. Minuten: ");
        int minuten = scanner4.nextInt();
        if ((stunden >= 8 && stunden <= 12) && (minuten >= 00 && minuten <= 45)) {
            System.out.println("Unterricht");
        }
         else if ((stunden >= 8 && stunden <= 11) && (minuten >= 46 && minuten <= 59)) {
            System.out.println("Pause");
        }
        else if (stunden == 13 && (minuten >= 00 && minuten <= 30)) {
            System.out.println("Mittagspause");
        }
        else if ((stunden == 12) && (minuten >= 46) && (minuten <= 59) || (stunden == 13 && minuten >= 31)||
                (stunden >= 14 && minuten >= 00)|| (stunden <= 07 && minuten >= 00 && minuten <=59 )){
            System.out.println("Freizeit");
        }
    }
}


