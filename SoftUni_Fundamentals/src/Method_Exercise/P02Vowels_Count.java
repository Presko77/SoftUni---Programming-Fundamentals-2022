package Method_Exercise;

import java.util.Scanner;

public class P02Vowels_Count {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine().toLowerCase();

        //a,e,i,o,u
        printVowelsCounts(input);
    }
    public static void printVowelsCounts (String text) {
        int count = 0; //гласни букви

        for (char symbol : text.toCharArray()) {
            if (symbol=='a' || symbol=='e' || symbol=='i' || symbol=='o' || symbol=='u') {
                count++;
            }
        }
        System.out.println(count);
    }
}
