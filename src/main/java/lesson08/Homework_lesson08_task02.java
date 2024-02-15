package lesson08;

import java.util.Scanner;

public class Homework_lesson08_task02 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println(" Enter a number for the multiplikation table:" );
            int number = scanner.nextInt();
            System.out.println(" Multiplikation table for number " + number + ":");
            for (int a = 1; a <= 10; a++){
                int result = a * number;
                System.out.println ( a + " * " + number + " = " + ( a * number));
            }

            }




    }


