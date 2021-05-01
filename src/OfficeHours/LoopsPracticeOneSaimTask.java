package OfficeHours;

import java.util.*;

public class LoopsPracticeOneSaimTask {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i, evenSum = 0, number = 0;

        System.out.println("Enter any number");
        number = scan.nextInt();

        for(i = 0; i <= number; i++) {
            }
        if(i % 2 == 0) {
            evenSum = evenSum + i;
        }
        System.out.println("Sum of even numbers up to 100: " + number + " = " + evenSum);
    }
}
