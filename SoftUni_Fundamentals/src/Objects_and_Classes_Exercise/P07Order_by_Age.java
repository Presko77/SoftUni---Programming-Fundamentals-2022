package Objects_and_Classes_Exercise;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class P07Order_by_Age {

    private String name;
    private String id;
    private int age;

    public P07Order_by_Age(String name, String id, int age) {
        this.name = name;
        this.id = id;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public int getAge() {
        return age;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<P07Order_by_Age> personList = new ArrayList<>();
        String personalData = scanner.nextLine();

        while (!personalData.equals("End")) {
            String name = personalData.split(" ")[0];
            String id = personalData.split(" ")[1];
            int age = Integer.parseInt(personalData.split(" ")[2]);

            P07Order_by_Age person = new P07Order_by_Age(name, id, age);
            personList.add(person);

            personalData = scanner.nextLine();
        }
        personList.sort(Comparator.comparing(P07Order_by_Age::getAge));
        for (P07Order_by_Age person: personList) {
            System.out.printf("%s with ID: %s is %d years old.%n", person.getName(), person.getId(),person.getAge());
        }
    }
}
