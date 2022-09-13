package Basic_Syntax_Conditional_Statements_and_Loops_Exercise;

import java.util.Scanner;

public class P04_Print_and_Sum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int StartNum = Integer.parseInt(scanner.nextLine());
        int EndNum= Integer.parseInt(scanner.nextLine());
        int sum = 0;
        for (int i = StartNum; i <=EndNum ; i++) {
            System.out.print(i +" ");
            sum = sum +i;

        }
        System.out.printf("%nSum: %d",sum);
    }
}


