package Text_Processing_Lab;

import java.util.Scanner;

public class P01Reverse_Strings {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();
        while (!command.equals("end")) {
            String reversed = "";
            for (int i = command.length() -1; i >= 0 ; i--) {
                char symbol = command.charAt(i);
                reversed = reversed + symbol;
            }
            System.out.printf("%s = %s%n", command, reversed);
            command= scanner.nextLine();
        }

    }
}
