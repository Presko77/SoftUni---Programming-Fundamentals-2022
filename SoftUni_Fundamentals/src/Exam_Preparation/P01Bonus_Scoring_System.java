package Exam_Preparation;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class P01Bonus_Scoring_System {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int NumberOfStudents = Integer.parseInt(scanner.nextLine());
        int CountOfTheLectores = Integer.parseInt(scanner.nextLine());
        int BonusPoints = Integer.parseInt(scanner.nextLine());
        Map<Integer,Double> Bonuses = new HashMap<>();
        Bonuses.put(0, 0.00);
        for(int i=1; i<=NumberOfStudents; i++) {
            int AttendceOfStudents = Integer.parseInt(scanner.nextLine());
            double TotalBonus = (double)AttendceOfStudents / CountOfTheLectores * (5 + BonusPoints);
            Bonuses.put(AttendceOfStudents, TotalBonus);
        }
        Map.Entry<Integer, Double> Max = Bonuses.entrySet().stream()
                .max((a,b)->a.getValue().compareTo(b.getValue()))
                .get();

        System.out.printf("Max Bonus: %.0f.\nThe student has attended %s lectures.",Math.ceil(Max.getValue()),Max.getKey());
    }
}

