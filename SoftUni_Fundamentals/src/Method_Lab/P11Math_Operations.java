package Method_Lab;

import java.util.Scanner;

public class P11Math_Operations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double N1 = Double.parseDouble(scanner.nextLine());
        String operator = scanner.nextLine();
        double N2 = Double.parseDouble(scanner.nextLine());


        calculate(N1,operator,N2);

    }
    private static double calculate (double N1, String operator, double N2) {
        double result = 0;
        switch (operator) {
            case "+" :
                result = N1 + N2;
                System.out.printf("%.0f",result);
                break;
            case "-" :
                result = N1 - N2;
                System.out.printf("%.0f",result);
                break;
            case "*" :
                result = N1 * N2;
                System.out.printf("%.0f",result);
                break;
            case "/" :
                result = N1 / N2;
                System.out.printf("%.0f",result);
                break;


        }
        return result;
    }
}


