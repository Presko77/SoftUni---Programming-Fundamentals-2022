package Final_Exam_Preparation;

import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class P01The_Imitation_Game {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String message = scanner.nextLine();
        String command = scanner.nextLine();

        while (!command.equals("Decode")) {

            if (command.contains("Move")) {
                int index = Integer.parseInt(command.split("\\|")[1]);

             String firstPart = message.substring(0,index); //substring взема от думата от (начален индекс, до краен)
                String secondPart = message.substring(index);
                message = secondPart.concat(firstPart);// съединява дъмата в обратен ред


            }else if (command.contains("Insert")) {
                int index = Integer.parseInt(command.split("\\|")[1]);
                String value = command.split("\\|")[2];

                message = String.valueOf(new StringBuilder(message).replace(index, index, value));

            }else if (command.contains("ChangeAll")) {
                String substring = command.split("\\|")[1];
                String replacement = command.split("\\|")[2];

                    message = message.replace(substring, replacement);
            }
            command = scanner.nextLine();
        }
        System.out.printf("The decrypted message is: %s", message);
    }
}
