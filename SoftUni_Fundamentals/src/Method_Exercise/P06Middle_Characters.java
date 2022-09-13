package Method_Exercise;

import java.util.Scanner;

public class P06Middle_Characters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String textInput = scanner.nextLine();
        printMiddleCharacters(textInput);

    }
    public static void printMiddleCharacters (String text) {
        //нечетна
        if (text.length()%2==1) {
            int indexOfMiddleCharacter = text.length()/2;
            System.out.println(text.charAt(indexOfMiddleCharacter));
        }
        //четна
        else {
            int indexFirstMiddleCharacter = text.length()/2-1;
            int indexSecondMiddleCharacter = text.length()/2;

            System.out.println(text.charAt(indexFirstMiddleCharacter)+"" +text.charAt(indexSecondMiddleCharacter));
        }
    }
}
