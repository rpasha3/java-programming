package day09_scanner_practice;

import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter length in inches: ");
        double length = scan.nextDouble();
        System.out.println("Enter width in inches: ");
        double width = scan.nextDouble();
        double perimeter = 2 * (length * width);
        double area = width * length;

        System.out.println("The perimeter is : " + perimeter + "in");
        System.out.println("The area is : " + area + "in");

    }
}
