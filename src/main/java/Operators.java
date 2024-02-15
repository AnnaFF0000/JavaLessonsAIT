public class Operators {

    public static void main(String[] args) {

        int numberOne = 10;
        int numberTwo = 10;

        //Оператор равенства ==
        boolean isEqual = (numberOne == numberTwo);
        System.out.println(isEqual);

        int numberThree = 50;
        int numberFour = 60;
        //Оператор неравенства !=
        System.out.println(numberThree != numberFour);

        //Оператор больше >
        System.out.println(numberThree > numberFour);

        //Оператор меньше <
        System.out.println(numberThree < numberFour);

        //Оператор больше или равно >=
        System.out.println(numberOne >= numberTwo);

        //Оператор меньше или равно <=
        System.out.println(numberOne <= numberTwo);

        String nameOne = "Mustermann";
        String nameTwo = "Mustermann";
        boolean isEqualNameOneNameTwo = nameOne.equals(nameTwo);
        System.out.println(isEqualNameOneNameTwo);



        /*
        AND &&
        false && false --> false
        false && true --> false
        true && false --> false
        true && true --> true
         */
        /*
        OR ||
        false || false --> false
        false || true --> true
        true || false --> true
        true || true --> true


         */
        int age = 29;
        int salary = 10000;
        boolean hasPass = true;

        boolean hasCredit;
        if (age >= 21 && salary > 2000 && hasPass == true) {
            System.out.println("Positiv");
            hasCredit = true;
        } else {
            System.out.println("Negativ");
            hasCredit = false;
        }
        System.out.println("Credit:" + hasCredit);

        //Bank 2
        if (age >= 21 || salary > 3000) {
            hasCredit = true;
        } else
            hasCredit = false;
        System.out.println("Credit2:" + hasCredit);


        double accountBalance = 2000000;
        boolean accountAktive = false;
        double amountToWithdrow = 6000;
        boolean transaktionSuccess = false;

        if (accountAktive && accountBalance >= amountToWithdrow || accountBalance >= 1000000) {
            accountBalance = accountBalance - amountToWithdrow;
            transaktionSuccess = true;

            System.out.println("Transaktion: " + transaktionSuccess + "Balance: " + accountBalance);
        } else {
            System.out.println("ERROR!!!" + transaktionSuccess);
        }

    }
}