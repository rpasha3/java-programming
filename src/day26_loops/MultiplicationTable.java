package day26_loops;

import java.util.*;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number for multiplication table");
        int number = scan.nextInt();
        if (number < 1 || number > 10) {
            System.out.println("ERROR: invalid input");
            return;
        }

        for(int i = 1; i <= 10; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }
    }
}
