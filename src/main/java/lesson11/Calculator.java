package lesson11;

public class Calculator {

        private static String operation = "+";
        private static double numberOne = 10;
        private static double numberTwo = 30;
        public static void main(String[] args) {
            double result;
            switch (operation){
                case  "+":
                    result = sumNumber(numberOne, numberTwo);
                    break;
                default:
                    System.out.println("Falsche Operation");
                    result = 0;
            }
            System.out.println(result);
    }
    private static double sumNumber (double firstNumber, double secondNumber) {
            double result = firstNumber + secondNumber;
            return  result;


    }
}
