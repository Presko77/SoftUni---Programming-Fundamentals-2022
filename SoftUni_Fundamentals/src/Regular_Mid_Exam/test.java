package Regular_Mid_Exam;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> cards = Arrays.stream(scanner.nextLine().split(", ")).collect(Collectors.toList());
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            String[] input = scanner.nextLine().split(", ");
            String command = input[0];
            String cardName = input[1];
            switch (command) {
                case "Add":
                    if (cards.contains(cardName)){
                        System.out.println("Card is already in the deck");
                    }else {
                        cards.add(cardName);
                        System.out.println("Card successfully added");
                    }
                    break;
                case "Remove":
                    if (!cards.contains(cardName)){
                        System.out.println("Card not found");
                    }else {
                        cards.removeAll(List.of(cardName));
                        System.out.println("Card successfully added");
                    }
                    break;
                case "Remove At":
                    if (cards.size() <= Integer.parseInt(cardName)){
                        System.out.println("Index out of range");
                    }else {
                        cards.remove(Integer.parseInt(cardName));
                        System.out.println("Card successfully removed");
                    }
                    break;
                case "Insert":
                    int index = Integer.parseInt(input[1]);
                    String cardN = input[2];
                    if (cards.size() <= index){
                        System.out.println("Index out of range");
                    }else if (cards.contains(cardN)){
                        System.out.println("Card is already added");
                    }else {
                        cards.add(index,cardN);
                    }
                    break;
            }
        }

        for (int i = 0; i < cards.size()-1; i++) {
            System.out.print(cards.get(i) +", ");
        }
        System.out.print(cards.get(cards.size()-1));
    }
}