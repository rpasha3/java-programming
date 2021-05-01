package day36_methods_with_return;

public class Calculator {
    public static void main(String[] args) {
        System.out.println("Add = " + add(22, 15));
        System.out.println("Subtract = " + subtract(100,40));
        System.out.println("Multiply = " + multiply(10,4));
        System.out.println("Divide = " + divide(100,10));
    }
    public static double add(double num1, double num2) {
        double sum = num1+num2;
        return sum;
    }

    public static double subtract(double num1, double num2) {
        double sum = num1-num2;
        return sum;
    }

    public static double multiply(double num1, double num2) {
        double sum = num1*num2;
        return sum;
    }

    public static double divide(double num1, double num2) {
        double sum = num1/num2;
        return sum;
    }
}
