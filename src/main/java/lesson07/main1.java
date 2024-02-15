package lesson07;

import java.util.Scanner;

public class main1 {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Wie heißen Sie?");
        String name = scanner.nextLine();
        System.out.println(" Ihr Geburstag: ");
        int day = scanner.nextInt();
        System.out.println(" Ihr Geburtsmonat: ");
        int month = scanner.nextInt();
        System.out.println(" Ihr Geburstsjahr: ");
        int year = scanner.nextInt();

        double result = Math.sin(name.length() + day * month + year);
        if (result < 0.15) {
            System.out.println("У вас очень плохая удача");
        } else if (result < 0.25) {
            System.out.println("У вас будет невеселая жизнь");
        } else if (result < 0.5) {
            System.out.println("У вас будет серая и скучная жизнь");
        }  else if (result < 0.7) {
            System.out.println("У вас будет хорошая жизнь");
        } else if (result < 0.95) {
            System.out.println("У вас будет радостная жизнь");
        } else {
            System.out.println("У вас будет шикарная и богатая жизнь");
        }



    }
}


