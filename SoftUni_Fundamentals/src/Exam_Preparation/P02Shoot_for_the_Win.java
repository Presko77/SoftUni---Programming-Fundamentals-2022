package Exam_Preparation;

import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class P02Shoot_for_the_Win {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int[] targets = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        String command = "";

        int counter = 0;

        while (!Objects.equals(command = scanner.nextLine(), "End"))
        {

            int indexTarget = Integer.parseInt(command);

            if (indexTarget >= 0 && indexTarget < targets.length)
            {
                for (int i = 0; i < targets.length; i++)
                {
                    int temp = targets[indexTarget];

                    if (targets[i] != -1 && i != indexTarget)
                    {
                        if(targets[i] > temp)
                        {
                            targets[i] -= temp;
                        }
                        else if (targets[i] <= temp)
                        {
                            targets[i] += temp;

                        }
                    }
                }
                targets[indexTarget] = -1;
                counter++;
            }
        }

        System.out.printf("Shot targets: %d -> %s",counter, Arrays.toString(targets).replaceAll("[\\[\\],]", ""));

    }
}
