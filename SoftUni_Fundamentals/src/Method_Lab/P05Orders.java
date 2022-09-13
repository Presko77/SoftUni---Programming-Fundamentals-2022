package Method_Lab;

import java.util.Scanner;

public class P05Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String productInput = scanner.nextLine();
        int nInput = Integer.parseInt(scanner.nextLine());


        switch (productInput) {
            case "coffee" :

                coffeePrint(nInput);
                break;
            case "water" :
                waterPrint(nInput);
                break;
            case "coke" :
                cokePrint(nInput);
                break;
            case "snacks" :
                snacksPrint(nInput);
                break;
        }

    }
    public static void  coffeePrint ( int n) {
        double result = 1.50 * n;
        System.out.printf("%.2f",result);
    }
    public static void  waterPrint ( int n) {
        double result = 1.00 * n;
        System.out.printf("%.2f",result);
    }
    public static void  cokePrint ( int n) {
        double result = 1.40 * n;
        System.out.printf("%.2f",result);
    }
    public static void  snacksPrint ( int n) {
        double result = 2.00 * n;
        System.out.printf("%.2f",result);
    }
}
