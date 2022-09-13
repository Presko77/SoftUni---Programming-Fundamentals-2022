package Objects_and_Classes_Exercise;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P04Articles_2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        while (!(n == 0)) {
            List<String> text = Arrays.stream(scanner.nextLine().split(", ")).collect(Collectors.toList());
            String titles = text.get(0);
            String content = text.get(1);
            String author = text.get(2);

            System.out.println(String.join(" ",titles + " - " + content + ": " + author));
            n -= 1;
        }
    }
}
