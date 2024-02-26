package lesson_12;

public class Homework01 {
    public static double calculateArea (double length, double width) {
        return length * width;
    }
    public static double calculatePerimeter (double length, double width){
        return 2 * (length + width);
    }
        public static void main(String[] args) {
            double length = 10.5;
            double width = 12.5;
            double area = calculateArea( length, width );
            double perimeter = calculatePerimeter(length,width);

        System.out.println("Fläche des Vierecks bertägt " +  area + " Meter." );
        System.out.println("Umfang des Vierecks beträgt " + perimeter + " Meter");

    }
}
