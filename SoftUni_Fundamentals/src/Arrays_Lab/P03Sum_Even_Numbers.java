package Arrays_Lab;

import java.util.Arrays;
import java.util.Scanner;

public class P03Sum_Even_Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String lineInput = scanner.nextLine();
        int[] numArr = Arrays
                .stream(lineInput.split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int sum =0;
        for (int i = 0; i < numArr.length; i++) {
            int currentNum = numArr[i];
            if (currentNum%2==0) {
                sum +=currentNum;

            }

        }
        System.out.println(sum);
    }
}
