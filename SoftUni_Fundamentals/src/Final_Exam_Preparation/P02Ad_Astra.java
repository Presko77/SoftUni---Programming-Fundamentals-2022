package Final_Exam_Preparation;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P02Ad_Astra {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        String regex = "(#|\\|){0,1}(?<item>([A-Z][a-z]+)|([A-Z][a-z]+ [A-Z][a-z]+))\\1(?<date>[0-9]{2}\\/[0-9]{2}\\/[0-9]{2})\\1(?<calories>[0-9]+)\\1";

        Pattern pattern = Pattern.compile(regex);

        Matcher matcher = pattern.matcher(input);

        int countCalories = 0;
        int days = 0;
        int roll = 0;
        List<String> idk = new ArrayList<>();
        while (matcher.find()) {

            roll++;
            String items = matcher.group("item");
            String date = matcher.group("date");
            int calories = Integer.parseInt(matcher.group("calories"));

            countCalories = countCalories + calories;

            days = 0;
            days = days + (countCalories / 2000);

            idk.add(items);
            idk.add(date);
            idk.add(String.valueOf(calories));
        }
        System.out.printf("You have food to last you for: %d days!%n", days);

        for (int i = 0; i <roll; i++) {
            System.out.printf("Item: %s, Best before: %s, Nutrition: %s%n", idk.get(0), idk.get(1), idk.get(2));
            if (!(idk.size() ==3)) {

                idk.remove(0);
                idk.remove(0);
                idk.remove(0);
            }
        }
    }
}
