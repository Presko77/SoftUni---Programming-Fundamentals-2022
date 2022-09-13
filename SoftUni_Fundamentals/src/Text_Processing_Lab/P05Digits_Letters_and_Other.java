package Text_Processing_Lab;

import java.util.Scanner;

public class P05Digits_Letters_and_Other {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text =scanner.nextLine();

        StringBuilder digitsStr = new StringBuilder();
        StringBuilder letterStr = new StringBuilder();
        StringBuilder otherStr = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            char symbol = text.charAt(i);

            if (Character.isDigit(symbol)) {
                digitsStr.append(symbol);
            }else if (Character.isLetter(symbol)) {
                letterStr.append(symbol);
            }else{
                otherStr.append(symbol);
            }
        }

        System.out.println(digitsStr);
        System.out.println(letterStr);
        System.out.println(otherStr);
    }
}
