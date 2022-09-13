package Method_Exercise;

import java.util.Scanner;

public class P03Characters_in_Range {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char firstChar = scanner.next().charAt(0);
        char secondChar = scanner.next().charAt(0);
        printASCII(firstChar,secondChar);

    }

    public static void printASCII(char startCode, char endCode) {

        if (startCode < endCode) {
            for (int code = startCode + 1; code < endCode; code++) {
                char symbol = (char) code;
                System.out.print(symbol + " ");
            }
        }else if (startCode > endCode) {
            for (int code = endCode +1; code < startCode; code++) {
                char symbol = (char) code;
                System.out.print(symbol + " ");
            }
        }
    }
}
