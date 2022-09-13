package Exam_Preparation;

import java.util.Scanner;

public class P01Counter_Strike {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int initialEnergy = Integer.parseInt(scanner.nextLine());
        String command = scanner.nextLine();
        int winCount = 0;


        while (!command.equals("End of battle")) {
            int distance = Integer.parseInt(command);
            if (initialEnergy<distance) {
                System.out.printf("Not enough energy! Game ends with %d won battles and %d energy",winCount,initialEnergy);
                return;
            }
            initialEnergy = initialEnergy - distance;
            winCount ++;
            if (winCount%3==0) {
                initialEnergy = initialEnergy + winCount;
            }
            command = scanner.nextLine();
        }
        System.out.printf("Won battles: %d. Energy left: %d",winCount, initialEnergy);
    }
}
