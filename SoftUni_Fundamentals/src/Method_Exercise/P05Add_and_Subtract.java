package Method_Exercise;

import java.util.Scanner;

public class P05Add_and_Subtract {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNum = Integer.parseInt(scanner.nextLine());
        int secondNum = Integer.parseInt(scanner.nextLine());
        int thirdNum = Integer.parseInt(scanner.nextLine());

        System.out.println(sum(firstNum, secondNum, thirdNum));

    }

    public static int sum(int N1, int N2, int N3) {
        int resultSum = N1 + N2;

        return resultSum - N3;
    }
}

