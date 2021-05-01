package day18_conditions_practice_strings_intro;

import java.util.Scanner;

public class ScoreRangeTest {
    public static void main(String[] args) {
        System.out.println("Enter numerical number for grade:");
        Scanner scan = new Scanner(System.in);
        int score = scan.nextInt();

        if (score <=59) {
            System.out.println("Grade : F");
        } else if (score <= 69 && score >= 60) {
            System.out.println("Grade : D");
        } else if (score <= 79 && score >= 70) {
            System.out.println("Grade : C");
        } else if (score <= 89 && score >= 80) {
            System.out.println("Grade : B");
        } else if (score <= 100 && score >= 90) {
            System.out.println("Grade : A");
        } else {
            System.out.println("Invalid Score");
        }
    }
}
