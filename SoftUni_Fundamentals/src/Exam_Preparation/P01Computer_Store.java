package Exam_Preparation;

import java.util.Scanner;

public record P01Computer_Store() {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double totalSum = 0;
        String inputLine = scanner.nextLine();

        while (!inputLine.equals("special") && !inputLine.equals("regular")) {
            double currentAmount = Double.parseDouble(inputLine);

            if (currentAmount < 0) {
                System.out.println("Invalid order!");
                inputLine = scanner.nextLine();
                continue;
            }
            totalSum += currentAmount;
            inputLine = scanner.nextLine();

        }
        if (totalSum == 0) {
            System.out.println("Invalid order!");
        } else {

            System.out.println("Congratulations you've just bought a new computer!");
            System.out.printf("Price without taxes: %.2f$%n", totalSum);
            double taxes = totalSum * 0.20;
            System.out.printf("Taxes: %.2f$%n", taxes);
            System.out.println("-----------");
            double sumWithTaxes = totalSum + taxes;
            if (inputLine.equals("special")) {
                sumWithTaxes = sumWithTaxes * 0.90;

            }
            System.out.printf("Total price: %.2f$%n", sumWithTaxes);

        }
    }
}
