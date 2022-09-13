package Final_Exam_Preparation;

import java.util.Scanner;
import java.util.regex.Pattern;

public class P01Secret_Chat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String message = scanner.nextLine();
        String command = scanner.nextLine();

        while (!command.equals("Reveal")) {

            if (command.contains("InsertSpace")) {
                int index = Integer.parseInt(command.split(":\\|:")[1]);
                message = String.valueOf(new StringBuilder(message).replace(index, index, " "));
                System.out.println(message);
            }else if (command.contains("Reverse")) {
                String substring = command.split(":\\|:")[1];
                    if (message.contains(substring)) {
                        StringBuilder reversText = new StringBuilder();
                        for (int i = 0; i < substring.length(); i++) {  //обръщам дъмата наобратно
                            char ch = substring.charAt(i);
                            reversText.insert(0, ch);
                        }
                            message = message.replaceFirst(Pattern.quote(substring), "")+ reversText; //replaceFirst - заместваме само първо съвпадение
                        System.out.println(message);
                    } else {
                        System.out.println("error");
                    }


            }else if (command.contains("ChangeAll")) {
                String substring = command.split(":\\|:")[1];
                String replacement = command.split(":\\|:")[2];

                message = message.replace(substring, replacement);
                System.out.println(message);
            }
            command = scanner.nextLine();
        }
        System.out.printf("You have a new text message: %s", message);
    }
}
