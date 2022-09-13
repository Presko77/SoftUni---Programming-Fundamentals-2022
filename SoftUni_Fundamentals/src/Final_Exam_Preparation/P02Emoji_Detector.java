package Final_Exam_Preparation;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class P02Emoji_Detector {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // дава ми 70/100

        String input = scanner.nextLine();
        int count = 1;
        int emojis = 0;
        String regex = ("(\\*\\*|::)(?<emoji>[A-Z][a-z]{2,})\\1");
        String regexNum = "[0-9]";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        Pattern patternNum = Pattern.compile(regexNum);
        Matcher matcherNum = patternNum.matcher(input);

        while (matcherNum.find()) {
            int num = 0;
            num = num + Integer.parseInt(matcherNum.group());

            count = count *num;
        }
        System.out.printf("Cool threshold: %d%n", count);


        int coolEmojis = 0;
        List<String> cool = new ArrayList<>();
        while (matcher.find()) {
            emojis++;
           String emoji = matcher.group("emoji");

            List<Character> characters = emoji.chars().mapToObj(e->(char)e).collect(Collectors.toList());
            for (int i = 0; i < emoji.length(); i++) {
                char chr = characters.get(0);
                characters.remove(0);

                int asciiValue = chr;

                coolEmojis = coolEmojis + asciiValue;
                if (coolEmojis>=count) {
                    if (!cool.contains(matcher.group()))
                    cool.add(matcher.group());
                }
            }
            coolEmojis = 0;
        }
        System.out.printf("%d emojis found in the text. The cool ones are:%n", emojis);
        for (String n: cool
        ) {
            System.out.printf("%s%n",n);
        }
    }
}


