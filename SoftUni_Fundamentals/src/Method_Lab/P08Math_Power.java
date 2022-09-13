package Method_Lab;

import java.text.DecimalFormat;
import java.util.Scanner;

public class P08Math_Power {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double numInput = Double.parseDouble(scanner.nextLine());
        int powerInput = Integer.parseInt(scanner.nextLine());

        DecimalFormat df = new DecimalFormat("0.####");
        System.out.println(df.format(mathPower(numInput,powerInput)));

    }

    public static double mathPower (double num , int power) {
        double result = 1;

        for (int i = 1; i <= power ; i++) {
            result = result* num;

        }
        return result;
    }
}
