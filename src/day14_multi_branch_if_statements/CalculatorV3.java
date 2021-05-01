package day14_multi_branch_if_statements;

import java.util.Scanner;

public class CalculatorV3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter value of num1");
        double num1, num2, result;
        num1 = scan.nextDouble();
        System.out.println("Enter value of num2");
        num2 = scan.nextDouble();
        System.out.println("Enter your operation: + - * / %");
        String operator = scan.next();
        if (operator.equals("%")) {
            result = num1 % num2;
            System.out.println("Result of " + num1 + "%" + num2 + "= " + result);
        } else if (operator.equals("-")) {
            result = num1 - num2;
            System.out.println("Result of " + num1 + "-" + num2 + "= " + result);
        } else if (operator.equals("+")) {
            result = num1 + num2;
            System.out.println("Result of " + num1 + "+" + num2 + "= " + result);

        } else if (operator.equals("*")) {
            result = num1 * num2;
            System.out.println("Result of " + num1 + "*" + num2 + "= " + result);
        } else if (operator.equals("/")) {
            result = num1 / num2;
            System.out.println("Result of " + num1 + "/" + num2 + "= 2" + result);
        } else {
            System.out.println("You entered variables or math operators in a wrong way, try again.");
        }
    }
}
