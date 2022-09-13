package Text_Processing_Exercise;

import java.util.Scanner;

public class P07String_Explosion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StringBuilder text = new StringBuilder(scanner.nextLine());
        int strength = 0;
        for (int position = 0; position < text.length(); position++) {
            char currentSymbol = text.charAt(position);

            if (currentSymbol == '>') {
                int attackStrength = Integer.parseInt(text.charAt(position + 1) + "");
                strength += attackStrength;
            }else if (strength != '>' && strength >0) {
                text.deleteCharAt(position);
                strength--;
                position--;

            }
        }
        System.out.println(text);
    }
}
