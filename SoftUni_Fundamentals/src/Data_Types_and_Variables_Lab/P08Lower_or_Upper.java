package Data_Types_and_Variables_Lab;

import java.util.Scanner;

public class P08Lower_or_Upper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char n = scanner.nextLine().charAt(0);

        if (n >= 'a' && n <= 'z') {
            System.out.println("lower-case");
        }else if (n>='A' && n<= 'Z'){
            System.out.println("upper-case");
        }

        }
    }

