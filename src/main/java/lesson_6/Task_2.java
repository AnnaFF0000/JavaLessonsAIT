package lesson_6;
import  java.util.Scanner;

public class Task_2 {
    static Scanner scanner = new Scanner( System.in);

    public static void main(String[] args) {
        System.out.println(" vvedite chislo : ");
        int number = getScanner().nextInt();
        System.out.println("Vy vveli " + number);
        getScanner().close();
    }

    public static Scanner getScanner() {
        return scanner;
    }

    public void setScanner(Scanner scanner) {
        this.scanner = scanner;
    }
}
