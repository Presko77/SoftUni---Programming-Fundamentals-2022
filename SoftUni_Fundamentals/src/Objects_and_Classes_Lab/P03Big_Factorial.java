package Objects_and_Classes_Lab;

import java.math.BigInteger;
import java.util.Scanner;

public class P03Big_Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        BigInteger fact =new BigInteger(String.valueOf(1));
        for (int i = 1; i <=n ; i++) {
            fact = fact.multiply(BigInteger.valueOf(i));
        }

        System.out.println(fact);
    }
}
