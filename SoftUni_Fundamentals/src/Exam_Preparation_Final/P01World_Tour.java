package Exam_Preparation_Final;

import java.util.Scanner;

public class P01World_Tour {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String stops = scanner.nextLine();
        StringBuilder stopsBuilder = new StringBuilder(stops);

        String command = scanner.nextLine();
        while (!command.equals("Travel")) {

            if (command.contains("Add Stop")) {
                int index = Integer.parseInt(command.split(":")[1]);
                String stopName = command.split(":")[2];
                if (isValidIndex(index, stopsBuilder)) {
                    stopsBuilder.insert(index, stopName);
                }

            }else if (command.contains("Remove Stop")) {
                int startIndex = Integer.parseInt(command.split(":")[1]);
                int endIndex = Integer.parseInt(command.split(":")[2]);

                if (isValidIndex(startIndex, stopsBuilder) && isValidIndex(endIndex, stopsBuilder)) {
                    stopsBuilder.delete(startIndex, endIndex + 1);
                }

            }else if (command.contains("Switch")) {
                String old_Text =command.split(":")[1];
                String new_Text = command.split(":")[2];

                if (stopsBuilder.toString().contains(old_Text)) {
                    String updateText = stopsBuilder.toString().replace(old_Text, new_Text);
                    stopsBuilder = new StringBuilder(updateText);
                }
            }


            System.out.println(stopsBuilder);
            command = scanner.nextLine();
        }
        System.out.printf("Ready for world tour! Planned stops: %s", stopsBuilder);
    }
    public static boolean isValidIndex (int index, StringBuilder builder) {
        return  index >= 0 && index <= builder.length() -1;
    }
}
