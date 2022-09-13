package Objects_and_Classes_Exercise;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class P05Students {

    private String name;
    private String lastName;
    private double grade;

    public P05Students (String name, String lastName, double grade) {
        this.name=name;
        this.lastName = lastName;
        this.grade = grade;
    }
    public double getGrade () {
        return this.grade;
    }
    @Override
    public String toString () {
        return String.format("%s %s: %.2f", this.name, this.lastName, this.grade);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        List<P05Students> studentList = new ArrayList<>();
        for (int row = 1; row <=n; row++) {
            String personalData = scanner.nextLine();
            String firstName = personalData.split(" ")[0];
            String lastName = personalData.split(" ")[1];
            double grade = Double.parseDouble(personalData.split(" ")[2]);

            P05Students student = new P05Students(firstName,lastName,grade);
            studentList.add(student);
        }
        studentList.sort(Comparator.comparingDouble(P05Students :: getGrade).reversed());

        for (P05Students student : studentList) {
            System.out.println(student.toString());
        }
    }
}
