package Final_Exam_Preparation;


import java.util.Scanner;

public class P01Password_Reset {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String password = scanner.nextLine();
        String[] command = scanner.nextLine().split(" ");
        String copyText = "";

        while (!command[0].equals("Done")) {
            switch (command[0]) {
                case "TakeOdd" :
                    for (int i = 0; i < password.length(); i++) {
                        if (i%2!=0) {
                            copyText += password.charAt(i);
                        }
                    }
                        password = copyText;
                        copyText = "";
                        System.out.println(password);

                    break;

                case "Cut" :
                   int index = Integer.parseInt(command[1]);
                   int length = index + Integer.parseInt(command[2]);

                    password = new StringBuilder(password)
                            .delete(index, length).toString();

                    System.out.println(password);
                    break;
                case "Substitute" :
                    String substring = command[1];
                    String substitute = command[2];

                    if (password.contains(substring)) {
                        password = password.replace(substring, substitute);
                        System.out.println(password);
                    } else {
                        System.out.println("Nothing to replace!");
                    }
                    break;
            }

            command = scanner.nextLine().split(" ");
        }
        System.out.printf("Your password is: %s",password);
    }
}
