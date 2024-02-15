package lesson08;

import java.util.Scanner;

public class Main03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        do {
            System.out.println("Geben Sie eine natürliche Zahl ");
            n = scanner.nextInt();
        }while (n <= 0);

        System.out.println("Danke");
    }
}
