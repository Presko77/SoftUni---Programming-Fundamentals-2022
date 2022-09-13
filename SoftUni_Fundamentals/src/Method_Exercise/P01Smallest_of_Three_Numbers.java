package Method_Exercise;

import java.util.Scanner;

public class P01Smallest_of_Three_Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1Index = Integer.parseInt(scanner.nextLine());
        int num2Index = Integer.parseInt(scanner.nextLine());
        int num3Index = Integer.parseInt(scanner.nextLine());


        printSmallNum(num1Index,num2Index,num3Index);
    }
    public static void printSmallNum (int num1, int num2, int num3) {

         if (num1 <= num2 && num1 <= num3) {
             System.out.println(num1);

         }else if (num2 <=num1 && num2 <=num3) {
             System.out.println(num2);

         }else if (num3 <= num1 && num3 <= num2) {
            System.out.println(num3);

        }


    }
}
