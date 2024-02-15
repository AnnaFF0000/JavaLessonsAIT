package lesson04;

public class Task02 {
    /* objavite peremennuju dlja temperatury v gradusax Farengejta

     */

    public static void main(String[] args) {
        double tempFar = 100;
        double tempCel = ((tempFar - 32) * 5) / 9;
        System.out.println(tempCel);
        System.out.println("Far." + tempFar);
        System.out.println("Cels." + tempCel);

    }
}
