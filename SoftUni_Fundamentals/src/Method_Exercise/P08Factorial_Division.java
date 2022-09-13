package Method_Exercise;

import java.util.Scanner;

public class P08Factorial_Division {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number1 = Integer.parseInt(scanner.nextLine());
        int number2 = Integer.parseInt(scanner.nextLine());

        long fact1 = calculatingFactorial(number1);
        long fact2 = calculatingFactorial(number2);
        System.out.printf("%.2f", fact1 *1.0 / fact2);
    }

    public static long calculatingFactorial (int number) {

        long fact =1;
        for (int i = 1; i <=number ; i++) {
        fact = fact * i;
        }
        return fact;
    }
}
