package Data_Types_and_Varibales_Exercise;

import java.util.Scanner;

public class P10Poke_Mon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int pokePower = Integer.parseInt(scanner.nextLine());
        int distance = Integer.parseInt(scanner.nextLine());
        int exhaustionFactor = Integer.parseInt(scanner.nextLine());
        int startPower = pokePower;

        int count = 0;

        while (pokePower >= distance) {
            pokePower -=distance;
            count ++;
            if (pokePower==startPower*0.5) {
                if (exhaustionFactor>0) {
                    pokePower/= exhaustionFactor;
                }
            }
        }
        System.out.println(pokePower);
        System.out.println(count);
    }
}
