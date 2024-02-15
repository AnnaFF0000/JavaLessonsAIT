package lesson08;

import java.util.Scanner;

public class Main01 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double number = scanner.nextDouble();
        System.out.println(number % 2 == 0 ? "Gerade" : "Ungerade");
        System.out.println(number % 1 == 0 ? "Ganzzahl" : "Bruchzahl");

        System.out.println(number > 0
                ? "Polojitelnoe" : (number < 0? "Otrizatelnoe" : "Null"));

        System.out.println(number % 1 == 0 && number >= 0 && number <= 9 ? "Ziffer" : "Zahl");

    }
}
