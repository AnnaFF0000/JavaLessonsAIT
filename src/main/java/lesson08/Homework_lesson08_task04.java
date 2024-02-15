package lesson08;

import java.util.Scanner;

public class Homework_lesson08_task04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Enter a number: ");
        int number = scanner.nextInt();
        int sum = 0;

        for (; number != 0; number /=10){
        sum += number %10;
        }
        System.out.println(" Sum of all digits of the number: " + sum);
    }
}
