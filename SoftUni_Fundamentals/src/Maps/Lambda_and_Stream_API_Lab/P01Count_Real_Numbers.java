package Maps.Lambda_and_Stream_API_Lab;

import java.util.*;
import java.util.stream.Collectors;

public class P01Count_Real_Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Double> numbersList = Arrays.stream(scanner.nextLine().split(" "))
                        .map(Double::parseDouble).collect(Collectors.toList());

        Map<Double, Integer> count = new TreeMap<>();

        for (double currentNum : numbersList) {
            Integer currentValue = count.get(currentNum);
            if (count.containsKey(currentNum)) {
                count.put(currentNum,currentValue+1);
            }else{
                count.put(currentNum,1);
            }
        }

        for (Map.Entry<Double, Integer> entry : count.entrySet()) {
            System.out.printf("%.0f -> %d%n",entry.getKey(),entry.getValue() );
            
        }

    }
}
