package day36_methods_with_return;

public class Calculations {
    public static void main(String[] args) {
        System.out.println("Add 22+15 = " + Calculator.add(22, 15));
        System.out.println("Subtract 100-40 = " + Calculator.subtract(100,40));
        System.out.println("Multiply 10*4 = " + Calculator.multiply(10,4));
        System.out.println("Divide 100/10 = " + Calculator.divide(100,10));

        double d1 = 434.3;
        double d2 = 321.5;
        double result = Calculator.subtract(d1, d2);
        System.out.println("result = " + result);
    }
}
