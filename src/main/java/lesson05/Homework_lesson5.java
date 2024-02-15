package lesson05;

public class Homework_lesson5 {

        //Task #1
    public static void main(String[] args) {
        int a = 71;
        int b = 67;

        if (a > b) {
            System.out.println("a больше b");
        } if (a < b) {
            System.out.println("a меньшe b");
        } if (a == b) {
            System.out.println("a равно b");
        }

        //Task #2
        int x = 5;
        int y = 7;
        int z = 9;
        boolean isInRange = (y > x) && (y < z);
        System.out.println(isInRange);

        //Task #3

        int minAge = 16;
        int maxAge = 75;
        int age = 18;
        boolean hasDrivingLicence = (age >= minAge) && (age <= maxAge);
        System.out.println(hasDrivingLicence);

        //Task #4

        int score = 100;
        if (score >= 90){
            System.out.println("Oтлично");
        }if (score>= 70 && score <= 89){
            System.out.println("Хорошо");
        }if (score >= 50 && score <=69){
            System.out.println("Удовлетворительно");
        }if  (score <= 49){
            System.out.println("Неудовлетворительно");
        }
    }
}












