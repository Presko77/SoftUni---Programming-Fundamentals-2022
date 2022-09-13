package Data_Types_and_Variables_Lab;

import java.util.Scanner;

public class P01Convert_Meters_to_Kilometers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int meters = Integer.parseInt(scanner.nextLine());
        double km = meters/1000.0;
        System.out.printf("%.2f",km);
    }
}
