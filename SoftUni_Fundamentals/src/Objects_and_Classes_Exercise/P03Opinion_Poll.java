package Objects_and_Classes_Exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P03Opinion_Poll {

        private  String name;
        private int age;

        public P03Opinion_Poll (String name, int age) {

            this.name = name;
            this.age = age;
        }
        public String getName() {
            return this.name;
        }
        public int getAge() {
            return this.age;
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            List<P03Opinion_Poll> personList = new ArrayList<>();
            int n = Integer.parseInt(scanner.nextLine());
            for (int row = 1; row <= n ; row++) {
                String personalData = scanner.nextLine();
                String name = personalData.split(" ")[0];
                int age = Integer.parseInt(personalData.split(" ")[1]);
                if (age >30) {
                    P03Opinion_Poll person = new P03Opinion_Poll(name, age);
                    personList.add(person);
                }
            }
            for (P03Opinion_Poll person : personList) {
                System.out.println(person.getName() + " - " + person.getAge());
            }
        }
    }

