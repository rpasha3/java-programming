package day09_scanner_practice;

import java.util.Scanner;

public class TempConverter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("##### FAHRENHEIT TO CELSIUS CONVERTER #####");
        System.out.println("Enter degrees in Fahrenheit for conversion: ");
        double fahrenheit = scan.nextDouble();
        double celsius = (fahrenheit - 32) * 5 / 9;
        System.out.println("Temp in celsius: " + celsius);
    }
}
