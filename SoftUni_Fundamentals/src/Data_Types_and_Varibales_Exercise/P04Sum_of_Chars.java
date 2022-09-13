package Data_Types_and_Varibales_Exercise;

import java.util.Scanner;

public class P04Sum_of_Chars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int sum = 0; //ascii code
        for (int i = 0; i < n; i++) {
            char symbol = scanner.nextLine().charAt(0);
            int asciiCode = (int) symbol;
            sum = sum + asciiCode;

        }
        System.out.printf("The sum equals: %d",sum);
    }
}
