package Data_Types_and_Varibales_Exercise;

import java.util.Scanner;

public class P02Sum_Digits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        while (num>0) {
            int lastDigit = num%10;
            sum +=lastDigit;
            num = num /10;
        }
        System.out.println(sum);
    }
}
