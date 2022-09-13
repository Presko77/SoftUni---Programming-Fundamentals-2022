package Final_Exam;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        String regex = "^([$%])(?<request>[A-Z][a-z]{2,})\\1: \\[(?<first>\\d+)\\]\\|\\[(?<second>\\d+)\\]\\|\\[(?<third>\\d+)\\]\\|$";
        Pattern pattern = Pattern.compile(regex);

        for (int i = 0; i < n; i++) {
            String input = scanner.nextLine();
            Matcher matcher = pattern.matcher(input);


            if (matcher.find()) {
                String request = matcher.group("request");
                int first = Integer.parseInt(matcher.group("first"));
                int second = Integer.parseInt(matcher.group("second"));
                int third = Integer.parseInt(matcher.group("third"));

                String str1 = Character.toString((char) first);
                String str2 = Character.toString((char) second);
                String str3 = Character.toString((char) third);


                System.out.printf("%s: %s%s%s%n",request ,str1,str2,str3);
            }else {
                System.out.println("Valid message not found!");
            }
        }

    }
}
