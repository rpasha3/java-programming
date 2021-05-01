package day37_methods_overloading;

public class MethodOverLoading {

    public static void main(String[] args) {
        System.out.println();
    }

    public static void sum(int num1, int num2) {
        System.out.println("sum(int num1, int num2)");
        System.out.println("Result = " + (num1 + num2));
    }

    public static void sum(int num1, int num2, int num3) {
        System.out.println("sum(int num1, int num2, int num3)");
        System.out.println("Result = " + (num1 + num2 + num3));
    }

    public static void sum(String str1, String str2) {
        System.out.println("sum(string, string)");
    }
}