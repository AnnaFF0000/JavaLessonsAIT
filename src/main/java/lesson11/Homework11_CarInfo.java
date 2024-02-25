package lesson11;
import java.util.Scanner;

public class Homework11_CarInfo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Geben Sie die Automarke ein:");
        String brand = scanner.next().toLowerCase();
        System.out.println("Geben Sie das Herstellungsjahr des Autos ein:");
        String yearString = scanner.next();
        boolean isNumeric = true;
        int year;
        if (isNumeric) {
            year = Integer.valueOf(yearString).intValue();
        } else {
            System.out.println("Fehler: Das Herstellungsjahr muss eine Zahl sein.");
            return;
        }
        String country;
        String carInfo;
        switch (brand) {
            case "ford":
                country = "USA";
                if (year < 1990) {
                    carInfo = "Beliebte Modelle vor 1990: Mustang, Escort.";
                } else {
                   carInfo  = "Beliebte Modelle nach 1990: Focus, Fiesta.";
                }
                break;

            case "audi":
                country = "Deutschland";
                if (year < 1990) {
                    carInfo = "Beliebte Modelle vor 1990: Audi 80, Audi 100.";
                } else {
                    carInfo = "Beliebte Modelle nach 1990: Audi A4, Audi A6.";
                }
                break;
            case "toyota":
                country = "Japan";
                if (year < 1990) {
                    carInfo = "Beliebte Modelle vor 1990: Corolla, Camry.";
                } else {
                    carInfo = "Beliebte Modelle nach 1990: Camry, Corolla.";
                }
                break;
            default:
                System.out.println("Die Automarke wurde nicht gefunden.");
                return;
        }

        System.out.println("Herstellungsland: " + country);
        System.out.println("Informationen über die Marke " + brand + " im Jahr " + year + ":");
        System.out.println(carInfo);

    }
}

