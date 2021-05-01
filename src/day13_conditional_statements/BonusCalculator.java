package day13_conditional_statements;

public class BonusCalculator {
    public static void main(String[] args) {
        int bonus;
        double salesAmount = 5000;
        if (salesAmount <= 1000) {
            bonus = 50; //conditional value assignment
            System.out.println("Good job, you qualified for bonus of $"+bonus);
        } else {
            bonus = 100;
            System.out.println("Great job, you are qualified for full bonus of $"+bonus);
        }
        System.out.println("Your total bonus is $" + bonus);
    }
}
