package lesson09;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println( "Enter a number:" );
        int number = scanner.nextInt();
        if (number >0) {
            int min = number;
            int max = number;
            while (number >= 0) {

                if (number > max) {
                    max = number;
                } else if (number < min && number > 0) {
                    min = number;
                }
                System.out.println("Enter a number; ");
                number = scanner.nextInt();
            }
            System.out.println("Min = " + min);
            System.out.println("Max = " + max);
        }
            System.out.println("Finished");
            }
    }

