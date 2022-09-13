package Exam_Preparation;

import java.util.Scanner;

public class P02MuOnline {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String [] roomsArr = scanner.nextLine().split("\\|");


        int healthInit = 100;
        int bitcoinInit = 0;
        boolean isDead = false;
        for (int i = 0; i < roomsArr.length; i++) {

            String [] room = roomsArr[i].split(" ");
            String command = room[0];
            int num = Integer.parseInt(room[1]);

            switch (command) {
                case "potion" :
                    int diffHealth = 100 - healthInit;
                    healthInit = healthInit + num;
                    if (healthInit>100) {
                        num = diffHealth;
                        healthInit=100;
                    }
                    System.out.printf("You healed for %d hp.%n", num);
                    System.out.printf("Current health: %d hp.%n", healthInit);
                    break;
                case "chest" :
                    System.out.printf("You found %d bitcoins.%n",num);
                    bitcoinInit += num;
                    break;
                default:
                    healthInit = healthInit - num;
                    if (healthInit<=0) {
                        isDead = true;
                        System.out.printf("You died! Killed by %s.%n", command);
                        System.out.printf("Best room: %d%n", i+1);

                    }else{
                        System.out.printf("You slayed %s.%n", command);
                    }
                    break;
            }
            if (isDead) {
                break;
            }
        }
        if (!isDead) {
            System.out.println("You've made it!");
            System.out.printf("Bitcoins: %d%n", bitcoinInit);
            System.out.printf("Health: %d%n",healthInit);
        }
    }
}
