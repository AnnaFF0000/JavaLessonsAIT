package lesson08;

import java.util.Scanner;

public class Main02 {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         int sum = 0;
        System.out.println("Geben Sie Zahlen, um die Summe zu bekommen (0 für Stopp)");
         int n = scanner.nextInt();
         while (n != 0) {
             sum += n;
             n = scanner.nextInt();
         }
        System.out.println("Antwort: " + sum);
         }
    }

