package Final_Exam_Preparation;

import java.util.*;

public class P03Pirates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String sail = scanner.nextLine();
        Map<String, int[]> mapTown = new LinkedHashMap<>();

        while (!sail.equals("Sail")) {

            String[] town = sail.split("\\|\\|");
            mapTown.putIfAbsent(town[0], new int[2]);
            mapTown.get(town[0])[0] += Integer.parseInt(town[1]);
            mapTown.get(town[0])[1] += Integer.parseInt(town[2]);
            sail = scanner.nextLine();
        }
        String command = scanner.nextLine();
        while (!command.equals("End")) {
            if (command.contains("Plunder")) {
                String town = command.split("=>")[1];
                int people = Integer.parseInt(command.split("=>")[2]);
                int gold = Integer.parseInt(command.split("=>")[3]);


                System.out.printf("%s plundered! %d gold stolen, %d citizens killed.%n", town, gold, people);
                mapTown.get(town)[0] -= people;
                mapTown.get(town)[1] -= gold;
                if (mapTown.get(town)[0] == 0 || mapTown.get(town)[1] == 0) {
                    mapTown.remove(town);
                    System.out.printf("%s has been wiped off the map!%n", town);
                }


                } else if (command.contains("Prosper")) {
                    if (Integer.parseInt(command.split("=>")[2]) < 0) {
                        System.out.println("Gold added cannot be a negative number!");
                    } else {
                        mapTown.get(command.split("=>")[1])[1] += Integer.parseInt(command.split("=>")[2]);
                        System.out.printf("%d gold added to the city treasury. %s now has %d gold.%n",
                                Integer.parseInt(command.split("=>")[2]), command.split("=>")[1], mapTown.get(command.split("=>")[1])[1]);
                    }

                }
                command = scanner.nextLine();
            }
        if (mapTown.isEmpty()) {
            System.out.println("Ahoy, Captain! All targets have been plundered and destroyed!");
        } else {
            System.out.printf("Ahoy, Captain! There are %d wealthy settlements to go to:%n", mapTown.size());
            mapTown.forEach((key, value) -> System.out.printf("%s -> Population: %d citizens, Gold: %d kg%n",
                    key, value[0], value[1]));
        }

        }
    }

