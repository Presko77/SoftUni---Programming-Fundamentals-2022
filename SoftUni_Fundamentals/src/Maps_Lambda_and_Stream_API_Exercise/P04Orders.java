package Maps_Lambda_and_Stream_API_Exercise;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P04Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedHashMap<String, Double> orders = new LinkedHashMap<>();
        LinkedHashMap<String, Integer> rememberProducts = new LinkedHashMap<>();
        List<String> input = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());

        while (!input.contains("buy")) {

            String product = input.get(0);
            double price = Double.parseDouble(input.get(1));
            int quantity = Integer.parseInt(input.get(2));

            if(!orders.containsKey(product)) {
                orders.put(product, price * quantity);
                rememberProducts.put(product, quantity);
            }else {
            rememberProducts.put(product, rememberProducts.get(product) + quantity);
            orders.put(product, rememberProducts.get(product) * price);
        }

            input = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());
        }
        orders.forEach((key, value) ->
                System.out.printf("%s -> %.2f%n", key, value));

    }
}
