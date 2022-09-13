package Data_Types_and_Variables_Lab;

import java.util.Scanner;

public class P09Centuries_to_Minutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        byte vek = Byte.parseByte(scanner.nextLine());
        int years = vek *100;
        double days = years*365.2422;
        double hours = days*24;
        double minutes = hours*60;
        System.out.printf("%d centuries = %d years = %.0f days = %.0f hours = %.0f minutes", vek , years,days,hours,minutes);
    }
}
