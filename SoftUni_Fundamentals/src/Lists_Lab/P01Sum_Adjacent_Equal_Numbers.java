package Lists_Lab;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P01Sum_Adjacent_Equal_Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Double> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Double::parseDouble).collect(Collectors.toList());

        for (int i = 0; i < numbers.size() - 1; i++) {
            double firstEl = numbers.get(i);
            double secondEl = numbers.get(i+1);
            if (firstEl == secondEl) {
                numbers.set(i, numbers.get(i) + numbers.get(i+1));
                numbers.remove(i+1);
                i = -1;
            }
        }
        System.out.println(joinElementsByDelimiter(numbers," "));
    }

    public  static String joinElementsByDelimiter(List<Double> list, String delimiter) {

        String result = "";
        for ( Double num : list) {
            DecimalFormat df = new DecimalFormat("0.#");

            String numFormat = df.format(num) + delimiter;
            result +=numFormat;
        }
        return  result;
    }
}
