package Maps.Lambda_and_Stream_API_Lab;

import java.util.Arrays;
import java.util.Scanner;

public class P04Word_Filter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] words = Arrays
                .stream(scanner.nextLine()
                        .split(" "))
                        .filter(j -> j.length() % 2 == 0)
                        .toArray(String[]::new);

        System.out.println(String.join(System.lineSeparator(),words));
    }
}
