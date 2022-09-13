package Basic_Syntax_Conditional_Statements_and_Loops_Exercise;

import java.util.Scanner;

public class P3_Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());
        String Class = scanner.nextLine();
        String day = scanner.nextLine();
        double moneyPerPerson = 0;
        if(Class.equals("Students") &&day.equals("Basic_Syntax_Conditional_Statements_and_Loops_Exercise")){
            moneyPerPerson = 8.45;
        }else if(Class.equals("Students")&&day.equals("Saturday")){
            moneyPerPerson = 9.80;
        }else if(Class.equals("Students")&&day.equals("Sunday")){
            moneyPerPerson = 10.46;
        }else if(Class.equals("Business")&&day.equals("Basic_Syntax_Conditional_Statements_and_Loops_Exercise")){
            moneyPerPerson = 10.90;
        }else if(Class.equals("Business")&&day.equals("Saturday")){
            moneyPerPerson = 15.60;
        }else if(Class.equals("Business")&&day.equals("Sunday")){
            moneyPerPerson = 16;
        }else if(Class.equals("Regular")&&day.equals("Basic_Syntax_Conditional_Statements_and_Loops_Exercise")){
            moneyPerPerson = 15;
        }else if(Class.equals("Regular") &&day.equals("Saturday")){
            moneyPerPerson = 20;
        }else if(Class.equals("Regular") &&day.equals("Sunday")){
            moneyPerPerson = 22.50;
        }
        if(Class.equals("Students")&&num>=30){
            moneyPerPerson = moneyPerPerson - moneyPerPerson*0.15;
        }else if(Class.equals("Business")&&num>=100){
            num-=10;
        }else if(Class.equals("Regular")&&(num>=10&&num<=20)){
            moneyPerPerson = moneyPerPerson - moneyPerPerson*0.05;
        }
        double finalPrice = num*moneyPerPerson;
        System.out.printf("Total price: %.2f",finalPrice);
    }
}



