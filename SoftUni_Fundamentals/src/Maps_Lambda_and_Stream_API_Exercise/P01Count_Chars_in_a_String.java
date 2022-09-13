package Maps_Lambda_and_Stream_API_Exercise;

import java.util.*;

public class P01Count_Chars_in_a_String {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String texts = scanner.nextLine();
        Map<Character, Integer> symbolsCount = new LinkedHashMap<>();
        for (char symbol : texts.toCharArray()) {
            if (symbol ==' ') {
                continue;
            }
            if (!symbolsCount.containsKey(symbol)) {
                symbolsCount.put(symbol, 1);
            }else {
                int currentCount = symbolsCount.get(symbol);
                symbolsCount.put(symbol,currentCount+1);
            }
        }
        for (Map.Entry<Character, Integer> entry : symbolsCount.entrySet()) {
            System.out.println(entry.getKey()+" -> "+ entry.getValue());
        }
    }
    }

