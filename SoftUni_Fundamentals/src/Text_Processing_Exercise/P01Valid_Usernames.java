package Text_Processing_Exercise;

import java.util.Scanner;

public class P01Valid_Usernames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(", ");

       for (String username : input) {
           if (validateUsername(username)) {
               System.out.println(username);
           }

       }
    }
    public static boolean validateUsername (String username) {
        if (username.length()<3 || username.length()>16) {
            return false;
        }
        for (char symbol : username.toCharArray()) {
            if (!Character.isLetterOrDigit(symbol) && symbol != '_' && symbol != '-') {
                return false;
            }
        }
        return true;
    }
}
