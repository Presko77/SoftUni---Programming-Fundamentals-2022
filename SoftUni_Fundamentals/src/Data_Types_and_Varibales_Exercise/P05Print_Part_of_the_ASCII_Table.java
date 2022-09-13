package Data_Types_and_Varibales_Exercise;

import java.util.Scanner;

public class P05Print_Part_of_the_ASCII_Table {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int startCode = Integer.parseInt(scanner.nextLine());
        int endCode = Integer.parseInt(scanner.nextLine());

        for (int code = startCode; code <= endCode ; code++) {
            char symbol = (char) code;
            System.out.print(symbol+ " ");

        }

    }
}
