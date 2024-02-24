package lesson11;

import java.util.Scanner;

public class Homework_11_Igor {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Gebe die Marke des Autos ein: ");
        String carBrand = scanner.next().trim();//obrezaet probely
        System.out.println(" Gebe das Herstellungsjahr ein");
        String countryOfOrigin;
        String carInfo;
        while (!scanner.hasNextInt()) {
            System.out.println("Fehler, gebe das Herstellungsjahr (4 Zahlen) ein");
            scanner.next();
        }
        while (!carBrand.equals("+") && !carBrand.equals("-")) {
        }
        int year = scanner.nextInt();
        switch (carBrand.toLowerCase()) {
            case "ford":
                countryOfOrigin = "USA";
                if (year < 1990) {
                    carInfo = "Ogromnye vnedorogniki, deshovyj bensin";
                } else {
                    carInfo = "Epoxa gibridov, KI im Auto";
                }
                break;
            case "volvo":
                countryOfOrigin = " Schweden";
                if (year > 2002) {
                    carInfo = "Vyxod modeli XC 90";
                } else {
                    carInfo = "Pokupali model S 60";
                }
                //carinfo = year > 2002 ? "Vyxod modeli XC 90": "Pokupali model S 60"; kann man auch so verkürzen (if else s.o)
                break;
            default:
                countryOfOrigin = "Nicht gefunden";
                carInfo = "Keine Info";
                System.out.println("Info nicht gefunden");
                break;
        }

        printCarData(countryOfOrigin, carInfo);
    }

    public static void printCarData(String country, String info) {
        System.out.println("Herstellungsland " + country);
        System.out.println("Zusätzliche Info " + info);
    }

}
