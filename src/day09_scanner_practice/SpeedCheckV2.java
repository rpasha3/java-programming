package day09_scanner_practice;
import java.util.Scanner;

public class SpeedCheckV2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your current speed...");
        double currentSpeed = scan.nextDouble();
        double speedLimit = 55;
        double speedOverLimit = currentSpeed - speedLimit;

        System.out.println("The speed limit is " + speedLimit + " mph");
        System.out.println("Your current speed is " + currentSpeed + " mph");
        System.out.println("You are " + speedOverLimit + " mph over the limit. Slow down!");
    }
}
