package Text_Processing_Exercise;

import java.math.BigInteger;
import java.util.Scanner;

public class P05Multiply_Big_Number {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        BigInteger a = new BigInteger(scanner.nextLine());
        BigInteger b = new BigInteger(scanner.nextLine());

        System.out.println(a.multiply(b));
    }
}
