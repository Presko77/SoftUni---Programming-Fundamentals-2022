package Final_Exam;

import java.util.Scanner;

public class P01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String command = scanner.nextLine();

        while (!command.equals("End")) {

            if (command.contains("Translate")) {
                String chr = command.split(" ")[1];
                String replacement = command.split(" ")[2];
                input = input.replace(chr, replacement);

                System.out.println(input);
            }else if (command.contains("Include")) {
                String substring = command.split(" ")[1];
                if (input.contains(substring)){
                    System.out.println("True");
                }else{
                    System.out.println("False");
                }

            }else if (command.contains("Start")){
                String substring = command.split(" ")[1];

               if (input.startsWith(substring)){
                    System.out.println("True");
                }else{
                   System.out.println("False");
               }

            }else if (command.contains("Lowercase")){

                input = input.toLowerCase();
                System.out.println(input);

            }else if (command.contains("FindIndex")) {
                String chr = command.split(" ")[1];

              int index = Integer.parseInt(String.valueOf(input.lastIndexOf(chr)));

                System.out.println(index);

            }else if (command.contains("Remove")){

                int startIndex = Integer.parseInt(command.split(" ")[1]);
                int count = Integer.parseInt(command.split(" ")[2]);

                String remove = input.substring(startIndex,count+startIndex);

                input = input.replace(remove, "");
                System.out.println(input);
            }

            command = scanner.nextLine();
        }

    }
}
