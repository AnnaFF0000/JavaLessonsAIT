package lesson08;

import java.util.Scanner;

public class Homework_lesson08_task03 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println( "Enter a number:" );
            int number1 =  scanner.nextInt();
            int sum = 0;
            for (int a = 1; a <= number1; a++){
                sum += a;
            }
            System.out.println(" Sum of all numbers up to " +  number1  + " is " +  sum);
        }
    }

