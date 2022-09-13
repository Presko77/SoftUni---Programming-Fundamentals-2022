package Method_Lab;

import java.util.Scanner;

public class P06Calculate_Rectangle_Area {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double weightInput = Double.parseDouble(scanner.nextLine());
        double lengthInput = Double.parseDouble(scanner.nextLine());
        double area = calculateRectangleArea(weightInput, lengthInput);

        System.out.printf("%.0f",area);
    }
    public static double calculateRectangleArea (double weight, double length) {
        double area = weight * length;
        return area;
    }
}
