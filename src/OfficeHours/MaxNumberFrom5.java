package OfficeHours;

import java.util.Scanner;

public class MaxNumberFrom5 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number");
        int first = scan.nextInt();
        int max = first;
        int min = first;

        for(int i = 0; i < 5; i++) {
            System.out.println("Enter a number");
            int number = scan.nextInt();

            if(number > max) {
                max = number;
            }
            if(number < min) {
                min = number;
            }
        }
        System.out.println("Max number = " + max);
        System.out.println("min = " + min);
    }
}

