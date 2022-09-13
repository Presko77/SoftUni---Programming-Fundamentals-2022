package Method_Lab;

import java.util.Scanner;

public class P01Sign_of_Integer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int num = Integer.parseInt(scanner.nextLine());
        printNumSign(num);

    }
    public static void printNumSign (int num) {

        if (num < 0) {
            System.out.printf("The number %d is negative.", num);
        } else if (num > 0 ) {

            System.out.printf("The number %d is positive.",num );
        }else {
            System.out.printf("The number %d is zero.",num );
        }

    }
}
