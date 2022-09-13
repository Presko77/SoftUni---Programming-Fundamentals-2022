package Regular_Mid_Exam;

import java.util.Arrays;
import java.util.Scanner;

public class P02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String [] representingVehicles = scanner.nextLine().split(">>");

        double tax = 0.00;
        double totalTax = 0;

        for (int i = 0; i < representingVehicles.length; i++) {
            String[] car = representingVehicles[i].split(" ");
            String command = car[0];
            int yearsCar = Integer.parseInt(car[1]);
            int kilometersCar = Integer.parseInt(car[2]);
            switch (command) {
                case "family" :

                    tax = 50 + (((kilometersCar/3000) * 12) - (yearsCar*5));
                    totalTax += tax;
                    System.out.printf("A family car will pay %.2f euros in taxes.%n",tax);
                    break;
                case  "heavyDuty" :
                    tax = 80 + (((kilometersCar/9000) * 14) - (yearsCar*8));
                    totalTax += tax;
                    System.out.printf("A heavyDuty car will pay %.2f euros in taxes.%n",tax);

                    break;
                case "sports" :
                    tax = 100 + (((kilometersCar/2000) * 18) - (yearsCar*9));
                    totalTax += tax;
                    System.out.printf("A sports car will pay %.2f euros in taxes.%n",tax);

                    break;
                default:
                    System.out.println("Invalid car type.");


            }

        }

        System.out.printf("The National Revenue Agency will collect %.2f euros in taxes.", totalTax);

    }
}
