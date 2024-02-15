package lesson07;

import java.util.Scanner;

public class homework_lesson07 {

    // task #1
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How old are you? ");
        int age = scanner.nextInt();
        if (age >= 0 && age <= 10) {
            System.out.println("you are a child.");
        } else if (age >= 11 && age <= 19) {
            System.out.println("you are a teen ");
        } else if (age >= 20 && age <= 59) {
            System.out.println("you are adult");
        } else {
            System.out.println("you are old");
        }

     // task #2
        Scanner scanner1 = new Scanner (System.in);
        System.out.println("Test JAVA ");
        System.out.println("Answer the questions: ");
        System.out.println("1. Is Java a object-oriented programming language? ");
        String answer1 = scanner1.next();

        System.out.println("2. What is the boolean keyword in Java? ");
        System.out.println(" a. The boolean keyword is a data type that can only take the values true or false ");
        System.out.println(" b. The boolean keyword doesn`t exist ");
        System.out.println(" c. The boolean keywort is a data type that represents the decimal numbers ");
        String answer2 = scanner1.next();

        System.out.println("3. How many primitive data types are in Java?");
        String answer3 = scanner.next();

        int score = 0;
        if (answer1.equals("jes")){
            score++;
        }
        if (answer2.equals("a")){
            score++;
        }
        if (answer3.equals("8")){
            score++;
        }

        if(score >=2){
            System.out.println("Great!");
        } else{
            System.out.println(" You need more practice. ");
        }
        scanner.close();
    }
}