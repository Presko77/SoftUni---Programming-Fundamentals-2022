package Objects_and_Classes_Exercise;
import java.util.Random;
import java.util.Scanner;

public class P01Advertisement_Messages {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int messagesCount = Integer.parseInt(scanner.nextLine());

        String [] phrases = {"Excellent product.", "Such a great product.", "I always use that product.", "Best product of its category.", "Exceptional product.", "I can’t live without this product."};
        String [] events = {"Now I feel good.", "I have succeeded with this product.", "Makes miracles. I am happy of the results!", "I cannot believe but now I feel awesome.", "Try it yourself, I am very satisfied.", "I feel great!"};
        String[] authors = {"Diana", "Petya", "Stella", "Elena", "Katya", "Iva", "Annie", "Eva"};
        String[] cities =  {"Burgas", "Sofia", "Plovdiv", "Varna", "Ruse"};

        Random rnd = new Random();

        for (int i = 0; i < messagesCount; i++) {
            int rndPhraseNum = rnd.nextInt(phrases.length);
            int rndEvents = rnd.nextInt(events.length);
            int rndAuthor = rnd.nextInt(authors.length);
            int rndCities = rnd.nextInt(cities.length);

            System.out.println(String.join(" " ,phrases[rndPhraseNum] + " " + events[rndEvents] + " " + authors[rndAuthor] + " - " + cities[rndCities]));
        }
    }
}
