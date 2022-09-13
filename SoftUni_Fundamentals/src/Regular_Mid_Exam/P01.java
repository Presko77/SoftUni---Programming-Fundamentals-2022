package Regular_Mid_Exam;

import java.util.Scanner;

public class P01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int cityCount = Integer.parseInt(scanner.nextLine());
        double totalPrice = 0;
        for (int i = 1; i <= cityCount; i++) {

            String nameCity = scanner.nextLine();
            double moneyWin = Double.parseDouble(scanner.nextLine());
            double moneyLose = Double.parseDouble(scanner.nextLine());

            if (i%3==0) {

                moneyLose = moneyLose + (moneyLose * 0.5);

            }

            if (i%5==0) {
                moneyWin = moneyWin - (moneyWin * 0.1);
            }
            double profit = moneyWin - moneyLose;
            totalPrice += profit;

            System.out.printf("In %s Burger Bus earned %.2f leva.%n", nameCity,profit);


        }
        System.out.printf("Burger Bus total profit: %.2f leva.%n",totalPrice);


    }
}
