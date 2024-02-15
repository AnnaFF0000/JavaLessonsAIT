package lesson08;

import java.util.Scanner;

public class Homework_lesson08_task01 {

        public static void main(String[] args){
            //task #1;
            System.out.println("Even numbers from 01 to 20: ");
            int num;

            for (num = 2; num <= 20; num += 2) {
                if (num % 2 == 0) {
                    System.out.println(num);
                }
            }
        }
}



