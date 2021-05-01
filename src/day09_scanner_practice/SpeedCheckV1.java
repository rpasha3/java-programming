package day09_scanner_practice;

public class SpeedCheckV1 {
    public static void main(String[] args) {
        double speedLimit = 55;
        double currentSpeed = 75;
        double overTheLimit = currentSpeed - speedLimit;

        System.out.println("You are driving " + overTheLimit +" mph over the limit. Slow down!");
    }
}
