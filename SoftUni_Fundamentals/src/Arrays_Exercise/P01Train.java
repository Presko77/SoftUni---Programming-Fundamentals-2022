package Arrays_Exercise;
import java.util.Scanner;

public class P01Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int[] num = new int[n];


        int sum = 0;
        for (int i = 0; i < num.length; i++) {
            num[i] = Integer.parseInt(scanner.nextLine());
            sum = sum + num[i];



            System.out.print(num[i] + " ");


        }

        System.out.printf("%n%d",sum);
    }
}

