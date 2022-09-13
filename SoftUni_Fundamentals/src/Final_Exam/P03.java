package Final_Exam;

import java.util.*;

public class P03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        Map<String ,String> mapHero = new LinkedHashMap<>();
        List<String> values = new ArrayList<>();

        while (!input.equals("End")){
            if (input.contains("Enroll")){
                String name = input.split(" ")[1];

                if (!mapHero.containsKey(name)){
                    mapHero.put(name,"");
                }else{
                    System.out.printf("%s is already enrolled.%n", name);
                }


            }else if (input.contains("Learn")) {
                String heroName = input.split(" ")[1];
                String spellName = input.split(" ")[2];
                if (mapHero.containsValue(spellName)){
                    System.out.printf("%s has already learnt %s.%n",heroName,spellName);
                }
                if (mapHero.containsKey(heroName)){
                    mapHero.put(heroName, spellName);
                    if (!values.contains(spellName)) {
                        values.add(spellName);
                    }
                }else{
                    System.out.printf("%s doesn't exist.%n",heroName);
                }

            }else if (input.contains("Unlearn")){
                String heroName = input.split(" ")[1];
                String spellName = input.split(" ")[2];

                if (!mapHero.containsValue(spellName) && mapHero.containsKey(heroName)){
                    System.out.printf("%s doesn't know %s.%n",heroName,spellName);
                }
                if (mapHero.containsKey(heroName)){
                    mapHero.replace(heroName,spellName,"");
                    values.remove(spellName);
                }else{
                    System.out.printf("%s doesn't exist.%n",heroName);
                }

            }
            input = scanner.nextLine();
        }
        System.out.println("Heroes:");
        mapHero.forEach((key, value) -> System.out.printf("== %s: %s%n", key, values));
    }
}
