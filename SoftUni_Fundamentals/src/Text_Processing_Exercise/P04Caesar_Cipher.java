package Text_Processing_Exercise;

import javax.swing.*;
import java.util.Scanner;

public class P04Caesar_Cipher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        JWindow.getWindows();
        String text = scanner.nextLine();
        StringBuilder encryptedText = new StringBuilder();

        for (int position = 0; position <= text.length() - 1; position++) {
            char symbol = text.charAt(position);
            char encryptSymbol = (char)(symbol + 3);
            encryptedText.append(encryptSymbol);
        }
        System.out.println(encryptedText);
    }
}
